DROP TABLE IF EXISTS Orders;

CREATE TABLE Orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  description VARCHAR(250), 
  customer_id INT,
  created_at TIMESTAMP  
); 
DROP TABLE IF EXISTS Products;
CREATE TABLE Products (
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  productCode VARCHAR(50) DEFAULT NULL,
  productDescription VARCHAR(100) DEFAULT NULL,
   topping1 BOOLEAN,
   topping2 BOOLEAN,
   topping3 BOOLEAN,
   price DOUBLE
); 
DROP TABLE IF EXISTS OrderItems;
CREATE TABLE OrderItems (
  id INT AUTO_INCREMENT  PRIMARY KEY, 
  order_id INT,
  product_id INT,
); 
DROP TABLE IF EXISTS Customers;
CREATE TABLE Customers (
  id INT AUTO_INCREMENT  PRIMARY KEY, 
  firstName VARCHAR(150),
  lastName VARCHAR(150),
  email VARCHAR(150),
  phone VARCHAR(15)
);  
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE(
employeeId LONG AUTO_INCREMENT  PRIMARY KEY,
firstName varchar(15) NOT NULL,
lastName varchar(15) NOT NULL,
email varchar(45) NOT NULL,
phone varchar(10) NOT NULL
);
 
CREATE TABLE STATION(
stationCode LONG AUTO_INCREMENT  PRIMARY KEY,
stationName varchar(15) NOT NULL,
); 
INSERT INTO
    EMPLOYEE (employeeId, firstName, lastName, email, contact)
VALUES
      ('1', 'Kaushal', 'Patel', 'ab@xyz.com', '4894173448'),
      ('2', 'Bhargav', 'Koppula', 'cd@xyz.com', '2125176793'),
      ('3', 'Srikanth', 'Konda', 'ef@xyz.com', '3654177857');
     
INSERT INTO
    Station (stationCode, stationName)
        private Long StationCode;
    private String StationName;
VALUES
      ('101', 'VegPizza'),
      ('102', 'NonVegPizza'),
      ('103', 'Sandwitch');   