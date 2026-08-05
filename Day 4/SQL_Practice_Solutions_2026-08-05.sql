-- SQL Practice Solutions
-- Date: 2026-08-05

-- 1. Calculate Special Bonus
SELECT employee_id,
       CASE
           WHEN employee_id % 2 = 1
                AND name NOT LIKE 'M%'
           THEN salary
           ELSE 0
       END AS bonus
FROM Employees
ORDER BY employee_id;

--------------------------------------------------

-- 2. Invalid Tweets
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;

--------------------------------------------------

-- 3. Find Customer Referee
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;

--------------------------------------------------

-- 4. Recyclable and Low Fat Products
SELECT product_id
FROM Products
WHERE low_fats = 'Y'
  AND recyclable = 'Y';
