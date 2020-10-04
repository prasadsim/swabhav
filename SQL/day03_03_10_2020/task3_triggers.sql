CREATE TABLE triggerDemo (
	NAME VARCHAR(56),
	marks int
)

INSERT INTO triggerdemo VALUES ('prasad',45),('vinit',55),('jay',54)

SELECT * FROM triggerdemo1

CREATE TRIGGER sampleTrigger
BEFORE INSERT 
ON triggerdemo
FOR EACH ROW SET NEW.marks=NEW.marks+10;


INSERT INTO triggerdemo VALUES ('pawan',55)

CREATE TABLE triggerdemo1(marks int)

CREATE TRIGGER sampleTrigger1
AFTER INSERT
ON triggerdemo
FOR EACH ROW 
insert INTO triggerdemo1 VALUES(NEW.marks=NEW.marks+50)


INSERT INTO triggerdemo VALUES ('mutuz',35)


CREATE TABLE triggerdemo2(marks INT)

CREATE TRIGGER sampleTrigger2
AFTER INSERT
ON triggerdemo
FOR EACH ROW swabhav
INSERT INTO triggerdemo2 VALUES (NEW.marks=NEW.marks+1000)

DROP TRIGGER sampleTrigger1

