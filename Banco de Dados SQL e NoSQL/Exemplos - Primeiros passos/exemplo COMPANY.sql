CREATE TABLE employees (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone_number VARCHAR(20),
  hire_date DATE,
  job_id INT,
  salary DECIMAL(10,2),
  manager_id INT,
  department_id INT
);

CREATE TABLE departments (
  department_id INT PRIMARY KEY,
  department_name VARCHAR(50),
  manager_id INT,
  location_id INT
);

CREATE TABLE jobs (
  job_id INT PRIMARY KEY,
  job_title VARCHAR(50),
  min_salary DECIMAL(10,2),
  max_salary DECIMAL(10,2)
);

CREATE TABLE management (
  manager_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone_number VARCHAR(20),
  hire_date DATE,
  job_id INT,
  department_id INT
);

