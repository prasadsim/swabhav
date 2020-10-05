CREATE TABLE logOfDMLOperations(operation VARCHAR(10), COUNT INT)
INSERT INTO logofdmloperations VALUES ('insert',0),('update',0),('delete',0)

DROP TABLE logOfDMLOperations

CREATE TRIGGER triggerOnCountOfInsertOperationOnStudent
AFTER INSERT
ON student
FOR EACH ROW UPDATE logofdmloperations set logOfDMLOperations.count=logOfDMLOperations.count+1 WHERE logofdmloperations.operation='insert';

DROP TRIGGER triggerOnCountOfInsertOperationOnStudent

INSERT INTO student VALUES(1011,'rahul','mahim',8.45,'biom',11101)
	

CREATE TRIGGER triggerOnCountOfUpdateOperationOnStudent
AFTER update
ON student
FOR EACH ROW UPDATE logofdmloperations set logOfDMLOperations.count=logOfDMLOperations.count+1 WHERE logofdmloperations.operation='update';


DROP TRIGGER triggerOnCountOfUpdateOperationOnStudent

UPDATE student SET student.name='jay007' WHERE student.name='jay'


CREATE TRIGGER triggerOnCountOfDeleteOperationOnStudent
AFTER delete
ON student
FOR EACH ROW UPDATE logofdmloperations set logOfDMLOperations.count=logOfDMLOperations.count+1 WHERE logofdmloperations.operation='delete';

DELETE FROM student WHERE student.NAME='jay007'

SELECT * FROM logofdmloperations
