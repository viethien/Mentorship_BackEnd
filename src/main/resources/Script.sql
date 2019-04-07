CREATE DATABASE Mentorversity;

USE Mentorversity;

DROP TABLE ENROLL;
DROP TABLE MENTOR;
DROP TABLE STUDENT;
DROP TABLE UNIVERSITY;
DROP TABLE HIGHSCHOOL;
DROP TABLE TITLE;

CREATE TABLE UNIVERSITY (
	university_id INT AUTO_INCREMENT PRIMARY KEY,
    university_name VARCHAR(100),
    university_address VARCHAR(100)
);

CREATE TABLE TITLE(
	title_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50)
);

CREATE TABLE  MENTOR (
	mentor_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    title_id INT,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100),
    university_id INT,
    description TEXT,
    website VARCHAR(100),
    visible BIT,
    active BIT,
    FOREIGN KEY(title_id) REFERENCES TITLE(title_id),
    FOREIGN KEY(university_id) REFERENCES UNIVERSITY(university_id)
);

CREATE TABLE HIGHSCHOOL (
	highschool_id INT AUTO_INCREMENT PRIMARY KEY,
    highschool_name VARCHAR(100),
    highschool_address VARCHAR(100)
);

CREATE TABLE STUDENT(
	student_id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100),
    highschool_id INT,
    active BIT DEFAULT 0,
    FOREIGN KEY(highschool_id) REFERENCES HIGHSCHOOL(highschool_id)
);

CREATE TABLE ENROLL(
	enroll_id INT AUTO_INCREMENT PRIMARY KEY,
    mentor_id INT,
    student_id INT,
    description VARCHAR(100) ,
    FOREIGN KEY(mentor_id) REFERENCES MENTOR(mentor_id),
    FOREIGN KEY(student_id) REFERENCES STUDENT(student_id)
);