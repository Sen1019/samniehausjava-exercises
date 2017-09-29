BEGIN TRANSACTION;

CREATE TABLE department (
        department_id serial,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_department_id PRIMARY KEY(department_id)
);

CREATE TABLE employee (
        employee_number serial,
        job_title varchar(255),
        last_name varchar(255) NOT NULL,
        first_name varchar(255) NOT NULL,
        gender varchar(255),
        birthday date,
        hire_date date NOT NULL,
        department_id int NOT NULL,
        CONSTRAINT pk_employee_number PRIMARY KEY (employee_number),
        CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(department_id)
);

CREATE TABLE project (
        project_number serial,
        name varchar(255) NOT NULL,
        start_date date NOT NULL,
        CONSTRAINT pk_project_number PRIMARY KEY (project_number)
);

CREATE TABLE project_employee(
        project_number int,
        employee_number int,
        CONSTRAINT pk_project_employee PRIMARY KEY (project_number, employee_number),
        CONSTRAINT fk_project_number FOREIGN KEY (project_number) REFERENCES project(project_number),
        CONSTRAINT fk_employee_number FOREIGN KEY (employee_number) REFERENCES employee(employee_number)
);


--INSERT DEPARTMENTS
INSERT INTO department (name) VALUES ('Bibbity');
INSERT INTO department (name) VALUES ('Bobbity');
INSERT INTO department (name) VALUES ('Boo');

--INSERT EMPLOYEES
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Aa','A','M','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Bb','B','F','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Cc','C','M','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Dd','D','F','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Ee','E','M','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Ff','F','F','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Gg','G','M','1990-12-25','2000-12-10',1);
INSERT INTO employee (last_name, first_name, gender, birthday, hire_date, department_id) VALUES ('Hh','H','F','1990-12-25','2000-12-10',1);

--INSERT PROJECT
INSERT INTO project (name, start_date) VALUES ('Project A', '2000-12-10');
INSERT INTO project (name, start_date) VALUES ('Project B', '2000-12-10');
INSERT INTO project (name, start_date) VALUES ('Project C', '2000-12-10');
INSERT INTO project (name, start_date) VALUES ('Project D', '2000-12-10');
INSERT INTO project (name, start_date) VALUES ('Project E', '2000-12-10');

--INSERT PROJECT_EMPLOYEE
INSERT INTO project_employee (project_number, employee_number) VALUES (1,1);
INSERT INTO project_employee (project_number, employee_number) VALUES (2,2);
INSERT INTO project_employee (project_number, employee_number) VALUES (3,3);
INSERT INTO project_employee (project_number, employee_number) VALUES (4,4);
INSERT INTO project_employee (project_number, employee_number) VALUES (5,5);
INSERT INTO project_employee (project_number, employee_number) VALUES (1,6);
INSERT INTO project_employee (project_number, employee_number) VALUES (2,7);
INSERT INTO project_employee (project_number, employee_number) VALUES (3,8);
INSERT INTO project_employee (project_number, employee_number) VALUES (4,1);


COMMIT;  