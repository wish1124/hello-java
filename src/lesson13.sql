SELECT dept_name, COUNT(emp_no)
FROM departments
         INNER JOIN dept_emp
                    ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_no
HAVING COUNT(emp_no) <= 22000;

# employees <-> titles
# employees <-> salaries

SELECT titles.title, MAX(salary) AS highest_salary
FROM employees
         JOIN titles
              ON employees.emp_no = titles.emp_no
         JOIN salaries
              ON employees.emp_no = salaries.emp_no
GROUP BY title
HAVING MAX(salary) IS NOT NULL;

# departments <-> dept_emp <-> salaries
# 급여 평균이 60,000 이상인 부서들을 출력하라.
SELECT departments.dept_name
FROM departments
JOIN dept_emp
ON departments.dept_no = dept_emp.dept_no
JOIN salaries
ON dept_emp.emp_no = salaries.emp_no
GROUP BY dept_name
HAVING AVG(salary) >= 60000;
 # 부서명,부서 ,직원, 부서id 직원.부서id 그룹바이 부서명 평균 직원급여