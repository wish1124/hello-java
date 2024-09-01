/*DELETE FROM employees
where emp_no = 20001;

INSERT INTO employees (emp_no, birth_date, first_name, last_name, gender, hire_date)
value(20001,'1992-08-15','Michael','Jordan','M','2202-05-02');

UPDATE employees
SET emp_no = 10002
WHERE  first_name = 'Smith';

SELECT emp_no, first_name, last_name
FROM employees
WHERE hire_date >= '1990-01-01';*/

/*SELECT emp_no, dept_no
FROM dept_emp
WHERE from_date <= '2005-12-31' AND to_date >= '2000-01-01';

SELECT dept_no, COUNT(emp_no) AS employee_count
FROM dept_emp
GROUP BY dept_no;

SELECT gender, COUNT(emp_no) AS employee_count
FROM employees
GROUP BY gender;


/*SELECT COUNT(*) AS total_employees
FROM employees;*/








