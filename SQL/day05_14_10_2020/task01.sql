/*person table*/

CREATE TABLE person(id INT, NAME VARCHAR(10), age INT, gender VARCHAR(1))

INSERT INTO person VALUES(6,'abc',20,'f');

SELECT * FROM person WHERE IF(phone IS NULL , 'empty',phone)