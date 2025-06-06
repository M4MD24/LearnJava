CREATE TABLE IF NOT EXISTS table_example
(
    ID          INT,
    FIRST_NAME  VARCHAR(50),
    SECOND_NAME VARCHAR(50),
    AGE         INT,
    JOB         VARCHAR(50),
    BIRTH_DAY   DATE
);
Truncate table table_example;
INSERT INTO table_example (ID, FIRST_NAME, SECOND_NAME, AGE, BIRTH_DAY, JOB)
VALUES (1, 'Ahmed', 'Ali', 30, '1415-07-20', 'Software Engineer'),
       (2, 'Omar', 'Hassan', 27, '1418-05-15', 'Web Developer'),
       (3, 'Youssef', 'Ismail', 24, '1421-03-10', 'Data Analyst'),
       (4, 'Abdullah', 'Khaled', 32, '1413-09-25', 'Cyber Security Specialist'),
       (5, 'Hassan', 'Mahmoud', 29, '1416-11-18', 'AI Engineer'),
       (6, 'Salem', 'Ibrahim', 26, '1419-04-07', 'Native Android Developer'),
       (7, 'Bilal', 'Mustafa', 28, '1417-08-13', 'Database Administrator'),
       (8, 'Amr', 'Abdelrahman', 25, '1420-01-02', 'Frontend Developer'),
       (9, 'Mahmoud', 'Saeed', 23, '1422-06-24', 'Backend Developer'),
       (10, 'Fahd', 'Tariq', 33, '1412-12-05', 'DevOps Engineer'),
       (11, 'Tarek', 'Ezzat', 31, '1414-10-17', 'MERN Stack Developer'),
       (12, 'Ibrahim', 'Mansour', 34, '1411-02-09', 'Network Engineer'),
       (13, 'Hussain', 'Nabil', 27, '1418-11-01', 'Mobile Developer'),
       (14, 'Ali', 'Maged', 22, '1424-01-12', 'UI/UX Designer'),
       (15, 'Ayman', 'Rashad', 28, '1417-05-27', 'Cloud Architect'),
       (16, 'Zaid', 'Shadi', 24, '1421-10-03', 'Machine Learning Engineer'),
       (17, 'Ismail', 'Adel', 26, '1419-06-19', 'Data Scientist'),
       (18, 'Khaled', 'Anwar', 29, '1416-01-30', 'Blockchain Developer'),
       (19, 'Sami', 'Fares', 25, '1420-07-23', 'Game Developer'),
       (20, 'Mustafa', 'Gamal', 32, '1413-03-14', 'IT Consultant'),
       (21, 'Nader', 'Fathy', 30, '1415-09-07', 'System Administrator'),
       (22, 'Mohamed', 'Sadawy', null, '1424-04-08', 'Native Android Developer');