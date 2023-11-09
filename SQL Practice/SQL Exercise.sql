SELECT * FROM Employee;

SELECT * FROM Employee ORDER BY salary DESC  LIMIT 1;

SELECT * FROM Employee ORDER BY salary DESC  LIMIT 2 OFFSET 1;

SELECT lastname, firstname, title, max(Salary)  FROM Employee GROUP BY Title ;