CREATE TABLE customer1 (id INT, NAME VARCHAR(10), balance DOUBLE)

INSERT INTO customer1 VALUES(2,'prasad',2000);

UPDATE merchant SET balance=100000 WHERE id=1;

CREATE TABLE merchant (id INT, NAME VARCHAR(10), balance DOUBLE)

INSERT INTO merchant VALUES(2,'reliance',200000)


UPDATE merchant SET balance=balance+100 WHERE id=1;

SELECT * FROM merchant