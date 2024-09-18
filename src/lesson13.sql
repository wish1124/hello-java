/*SELECT department_name
FROM departments
GROUP BY department_name
HAVING COUNT(employee_id) <= 22000;

SELECT job_title, MAX(salary) AS highest_salary
FROM employees
GROUP BY job_title
HAVING MAX(salary) IS NOT NULL;

SELECT department_name
FROM departments
GROUP BY department_name
HAVING AVG(salary) >= 60000;
 */