create database BOOTCAMP_EXERCISE1;

use BOOTCAMP_EXERCISE1; 

create table regions (
	region_id int primary key,
    region_name varchar(25)
);
insert into regions values (1, 'EUROPE');
insert into regions values (2, 'AMERICA');
insert into regions values (3, 'ASIA');
-- drop table regions;
-- select * from regions;

create table countries (
	country_id char(2) primary key,
    country_name varchar(40),
    region_id int,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);
insert into countries values ('KR', 'South Korea', 3);
insert into countries values ('JP', 'Japan', 3);
insert into countries values ('DE', 'Germany', 1);
insert into countries values ('IT', 'Italy', 1);
insert into countries values ('UK', 'United Kingdom', 1);
insert into countries values ('US', 'United State', 2);
-- drop table countries;
-- select * from countries;

create table locations (
	location_id int primary key,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id varchar(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);
insert into locations values (1000, '1297 Via Cola di Rie', '989', 'Roma', null, 'IT');
insert into locations values (1100, '93091 Calle della Te', '10934', 'Venice', null, 'IT');
insert into locations values (1200, '1111 Berlin', '1111', 'Berlin', 'little Ber', 'DE');
insert into locations values (1300, '2222 Munich', '2222', 'Munich', 'little Mun', 'DE');
insert into locations values (1400, '3333 London', '3333', 'London', 'Greater Lon', 'UK');
insert into locations values (1400, '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas ', 'US');
insert into locations values (1500, '2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo', 'JP');
insert into locations values (1600, '4444 Seoul', '4444', 'Seoul', 'Seoul', 'KR');
-- delete from locations where location_id = 1200;
-- update locations set location_id = 1200 where location_id = 1300;
-- update locations set location_id = 1300 where location_id = 1400;
-- drop table locations;
-- select * from locations;

create table departments (
	department_id int primary key,
    department_name varchar(30),
    manager_id int,
    location_id int,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);
insert into departments values (10, 'Administration', 200, 1000);
insert into departments values (20, 'Marketing', 201, 1200);
insert into departments values (30, 'Purchasing', 202, 1300);
insert into departments values (40, 'Finance', 203, 1400);
insert into departments values (50, 'Sales', 204, 1500);
-- drop table departments;
-- select * from departments;

create table employees (
	employee_id int primary key,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(20),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    salary numeric(10,2),
    commission_pct numeric(10,2),
    manager_id int,
    department_id int,
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);
insert into employees values(100, 'Steven', 'King', 'SKING', '515-1234567', STR_TO_DATE('1987-06-17', '%Y-%m-%d'), 'ST_CLERK', 24000.00, 0.00, 109, 10);
insert into employees values(101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', STR_TO_DATE('1987-06-18', '%Y-%m-%d'), 'MK_REP', 17000.00, 0.00, 103, 20);
insert into employees values(102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', STR_TO_DATE('1987-06-19', '%Y-%m-%d'), 'IT_PROG', 17000.00, 0.00, 108, 30);
insert into employees values(103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567', STR_TO_DATE('1987-06-20', '%Y-%m-%d'), 'MK_REP', 9000.00, 0.00, 105, 20);
insert into employees values(104, 'Tom', 'SanSan', 'TOMSANA', '123-456789', STR_TO_DATE('2000-10-20', '%Y-%m-%d'), 'JR_SALES', 8000.00, 0.00, 105, 50);
-- drop table employees;
-- select * from employees;

create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary numeric(10,2),
    max_salary numeric(10,2)
);
insert into jobs values ('ST_CLERK', 'Sr. Clerk', 10000, 20000);
insert into jobs values ('MK_REP', 'Marketing Representative', 30000, 40000);
insert into jobs values ('IT_PROG', 'IT Programmer', 50000, 60000);
insert into jobs values ('JR_SALES', 'Jr. SALES', 5000, 9000);
-- drop table jobs;
-- select * from jobs;

create table job_history (
	employee_id int,
    start_date date,
    end_date date,
    job_id varchar(10),
    department_id int,
    primary key (employee_id, start_date),
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id)
);
insert into job_history values (102, STR_TO_DATE('1993-01-13', '%Y-%m-%d'), STR_TO_DATE('1998-07-24', '%Y-%m-%d'), 'IT_PROG', 20);
insert into job_history values (101, STR_TO_DATE('1989-09-21', '%Y-%m-%d'), STR_TO_DATE('1993-10-27', '%Y-%m-%d'), 'MK_REP', 10);
insert into job_history values (101, STR_TO_DATE('1993-10-28', '%Y-%m-%d'), STR_TO_DATE('1997-03-15', '%Y-%m-%d'), 'MK_REP', 30);
insert into job_history values (100, STR_TO_DATE('1996-02-17', '%Y-%m-%d'), STR_TO_DATE('1999-12-19', '%Y-%m-%d'), 'ST_CLERK', 30);
insert into job_history values (103, STR_TO_DATE('1998-03-24', '%Y-%m-%d'), STR_TO_DATE('1999-12-31', '%Y-%m-%d'), 'MK_REP', 20);
-- drop table job_history;
-- select * from job_history;

-- 3. Write a query to find the location_id, street_address, city, state_province, country_name of locations
select loc.location_id, loc.street_address, loc.city, loc.state_province, ctry.country_name
from locations loc
left outer join countries ctry
-- inner join countries ctry
on loc.country_id = ctry.country_id;

-- 4. Write a query to find the first_name, last name, department ID of all the employees.
select distinct emp.first_name, emp.last_name, emp.department_id
from employees emp;

-- 5. Write a query to find the first_name, last_name, job_id, department ID of the employees who works in Japan.
select emp.first_name, emp.last_name, emp.job_id, emp.department_id
from employees emp
left join departments dept on dept.department_id = emp.department_id
left join locations loc on loc.location_id = dept.location_id
where loc.country_id = 'JP';

-- 6. Write a query to find the employee id, last_name along with their manager_id and last_name.
select emp.employee_id, emp.last_name, emp.manager_id, emp1.last_name
from employees emp
left join employees emp1
on emp.manager_id = emp1.employee_id;

-- 7. Write a query to find the first_name, last_name and hire date of the employees who was hired after employee 'Lex De Haan'.
select emp.first_name, emp.last_name, emp.hire_date
from employees emp
where emp.hire_date > (select emp1.hire_date
						from employees emp1
						where emp1.first_name = 'Lex' and emp1.last_name = 'De Haan');

-- 8. Write a query to get the department name and number of employees of each the department.
select dept.department_name, count(emp.employee_id) as num_of_employees
from departments dept
left join employees emp
on dept.department_id = emp.department_id
group by dept.department_name;

-- 9. Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department ID 30.
select emp.employee_id, jbs.job_title, datediff(jbs_hist.end_date, jbs_hist.start_date) as num_of_days
from employees emp
left join jobs jbs on emp.job_id = jbs.job_id
left join job_history jbs_hist on emp.employee_id = jbs_hist.employee_id
where emp.department_id = 30;

-- 10. Write a query to display all department name, manager name, city and country name.
select dept.department_name, emp1.first_name, emp1.last_name, loc.city, ctry.country_name
from employees emp
left join departments dept on emp.department_id =  dept.department_id
left join employees emp1 on emp.manager_id = emp1.employee_id
left join locations loc on dept.location_id = loc.location_id
left join countries ctry on loc.country_id = ctry.country_id;

/** select dept.department_name, emp1.first_name, emp1.last_name, loc.city, ctry.country_name
from departments dept
left join employees emp on emp.department_id =  dept.department_id
left join employees emp1 on emp.manager_id = emp1.employee_id
left join locations loc on dept.location_id = loc.location_id
left join countries ctry on loc.country_id = ctry.country_id; **/

-- 11. Write a query to display the average salary of each department.
select dept.department_name, avg(emp.salary) as avg_salary_by_dept
from departments dept
left join employees emp on dept.department_id = emp.department_id
group by dept.department_name;

-- 12. Now, we try to perform normalization on table 'jobs'. 
    --  a. How do you re-design the table 'jobs'? and adding table 'job_grades'?

