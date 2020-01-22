use demo1;
SELECT * FROM employees;
DELETE FROM employees WHERE id=1; /*deleting the employyee where id */
SELECT first_name FROM employees; /* getting only first name */

SELECT * FROM employees
WHERE department='HR' AND salary<500000;

SELECT * FROM employees
WHERE department='HR' OR department='Legal' AND salary<500000;

SELECT * FROM employees
ORDER BY salary DESC;

SELECT * FROM employees
ORDER BY last_name, first_name;

INSERT INTO employees (last_name, first_name, email, department)
VALUES ('vikash', 'kumar', 'vikash@gmail.com', 'Designer');


INSERT INTO employees(last_name, first_name, email, department, salary )
 VALUES ('vicky', 'kumar', 'vicky@gmail.com', 'Designer',4564563);


UPDATE employees
SET salary = 500000
WHERE 'email' = 'vikash@gmail.com';


























