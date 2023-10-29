CREATE TABLE request_entity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    number INT DEFAULT 10000 CHECK (number >= 10000),
    price DOUBLE,
    status INT
);

INSERT INTO request_entity(number, price, status) VALUES (105460, 90.99, 0);
INSERT INTO request_entity(number, price, status) VALUES (100502, 50.00, 1);
INSERT INTO request_entity(number, price, status) VALUES (109994, 49.04, 2);
INSERT INTO request_entity(number, price, status) VALUES (100897, 2.99, 3);
INSERT INTO request_entity(number, price, status) VALUES (109994, 49.04, 3);