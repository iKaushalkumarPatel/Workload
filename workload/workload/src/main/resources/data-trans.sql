DROP TABLE IF EXISTS Orders;

CREATE TABLE Orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  description VARCHAR(250), 
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