CREATE TABLE product (
  id int NOT NULL PRIMARY KEY IDENTITY(1,1),
  name varchar(250) NOT NULL,
  price decimal(10,1) NOT NULL,
  quantity int NOT NULL,
  category_name varchar(250) NOT NULL
) 

--
-- Dumping data for table `product`
--

INSERT INTO product (name, price, quantity, category_name) VALUES
( 'fashion 4', '1.00', 3, 'Category 1'),
( 'fashion 3', '1.00', 3, 'Category 1'),
( 'fashion 2', '1.00', 3, 'Category 1'),
( 'fashion 1', '1.00', 3, 'Category 2'),
( 'computer 3', '1.00', 3, 'Category 2'),
( 'computer 2', '1.00', 3, 'Category 3'),
( 'computer 1', '1.00', 3, 'Category 3'),
( 'mobile 1', '20.00', 7, 'Category 3');

SELECT name, price, quantity, category_name AS categoryName FROM product