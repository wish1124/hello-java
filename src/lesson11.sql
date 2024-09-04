/*SELECT e.emp_no, e.first_name, e.last_name, s.salary
FROM employees e
INNER JOIN salaries s ON e.emp_no = s.emp_no;


SELECT e.emp_no, e.first_name, e.last_name, d.dept_no
FROM employees e
LEFT JOIN dept_emp d ON e.emp_no = d.emp_no;


SELECT d.dept_no, COUNT(d.emp_no) AS employee_count
FROM dept_emp d
GROUP BY d.dept_no;


SELECT emp_no, first_name, last_name
FROM employees
ORDER BY last_name ASC, first_name ASC;


SELECT d.dept_no, AVG(s.salary) AS avg_salary
FROM employees e
INNER JOIN salaries s ON e.emp_no = s.emp_no
INNER JOIN dept_emp d ON e.emp_no = d.emp_no
GROUP BY d.dept_no;


SELECT d.dept_name, m.emp_no, e.first_name, e.last_name
FROM departments d
INNER JOIN dept_manager m ON d.dept_no = m.dept_no
INNER JOIN employees e ON m.emp_no = e.emp_no
ORDER BY d.dept_name ASC;

SELECT e.gender, AVG(s.salary) AS avg_salary
FROM employees e
INNER JOIN salaries s ON e.emp_no = s.emp_no
GROUP BY e.gender
ORDER BY avg_salary DESC;
*/
