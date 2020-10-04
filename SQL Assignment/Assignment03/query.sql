/*query2*/

DELIMITER //
CREATE PROCEDURE increment_salary()
BEGIN
update emp as emp01,  (select DEPTNO from emp  where ENAME= "smith" ) as emp02 
set emp01.SAL = SAL * 110/100 where emp01.DEPTNO = emp02.DEPTNO;
END //

DELIMITER ;

CALL increment_salary();

SELECT * FROM emp

/*query3*/

DELIMITER //

CREATE FUNCTION toUpperCase(txt VARCHAR(45)) RETURNS VARCHAR(45) DETERMINISTIC
BEGIN
 RETURN UPPER(txt);
END 

// DELIMITER ;

SELECT customer.NAME,toUpperCase(customer.NAME) FROM customer;

/*query4*/

DROP FUNCTION changeDateFormat;

DELIMITER $$

CREATE FUNCTION changeDateFormat(inputDate DATE) RETURNS VARCHAR(45) DETERMINISTIC 
BEGIN
	RETURN DATE_FORMAT(inputDate,	"%d %M %y");	
END

$$ DELIMITER ;

SELECT orders.order_date, changeDateFormat(orders.order_date) FROM orders

	