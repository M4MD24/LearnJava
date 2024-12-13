CREATE TABLE IF NOT EXISTS table_example
(
    id         INTEGER PRIMARY KEY,
    name       TEXT NOT NULL,
    username   TEXT NOT NULL UNIQUE,
    age        INTEGER,
    job        TEXT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO table_example (name, username, age, job)
VALUES ('Ahmed', 'Ahmed', 30, 'Software Engineer'),
       ('Omar', 'Omar', 27, 'Web Developer'),
       ('Youssef', 'Youssef', 24, 'Data Analyst'),
       ('Abdullah', 'Abdullah', 32, 'Cyber Security Specialist'),
       ('Hassan', 'Hassan', 29, 'AI Engineer'),
       ('Salem', 'Salem', 26, 'Native Android Developer'),
       ('Bilal', 'Bilal', 28, 'Database Administrator'),
       ('Amr', 'Amr', 25, 'Frontend Developer'),
       ('Mahmoud', 'Mahmoud', 23, 'Backend Developer'),
       ('Fahd', 'Fahd', 33, 'DevOps Engineer'),
       ('Tarek', 'Tarek', 31, 'MERN Stack Developer'),
       ('Ibrahim', 'Ibrahim', 34, 'Network Engineer'),
       ('Hussain', 'Hussain', 27, 'Mobile Developer'),
       ('Ali', 'Ali', 22, 'UI/UX Designer'),
       ('Ayman', 'Ayman', 28, 'Cloud Architect'),
       ('Zaid', 'Zaid', 24, 'Machine Learning Engineer'),
       ('Ismail', 'Ismail', 26, 'Data Scientist'),
       ('Khaled', 'Khaled', 29, 'Blockchain Developer'),
       ('Sami', 'Sami', 25, 'Game Developer'),
       ('Mustafa', 'Mustafa', 32, 'IT Consultant'),
       ('Nader', 'Nader', 30, 'System Administrator'),
       ('Mohamed', 'Mohamed', null, 'Native Android Developer');

SELECT *
FROM table_example