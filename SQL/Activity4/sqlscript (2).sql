REM   Script: Session 02
REM   Activity4


CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)


delete table salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

SELECT * FROM salesman;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 


    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 


    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 


    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 


SELECT 1 FROM DUAL;

SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES(5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM salesman;

SELECT salesman_id, salesman_city from salesman;

SELECT *  from salesman where salesman_city='Paris';

SELECT salesman_id, commission from salesman where salesman_name='Paul Adam';

SELECT * from salesman where salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman set grade=100;

SELECT * FROM salesman;

