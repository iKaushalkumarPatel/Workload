DROP TABLE IF EXISTS EMPLOYEE;
 
CREATE TABLE EMPLOYEE(
employeeId LONG AUTO_INCREMENT  PRIMARY KEY,
firstName varchar(15) NOT NULL,
lastName varchar(15) NOT NULL,
email varchar(45) NOT NULL,
contact varchar(10) NOT NULL
);

DROP TABLE IF EXISTS STATION;
 
CREATE TABLE STATION(
stationCode LONG AUTO_INCREMENT  PRIMARY KEY,
stationName varchar(15) NOT NULL,
);