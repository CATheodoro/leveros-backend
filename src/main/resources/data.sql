CREATE TABLE request_entity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    number INT DEFAULT 100000 CHECK (number >= 100000),
    price DOUBLE,
    status INT
);

INSERT INTO request_entity(number, price, status) VALUES (105460, 90.99, 0);
INSERT INTO request_entity(number, price, status) VALUES (100502, 50.00, 1);
INSERT INTO request_entity(number, price, status) VALUES (109994, 49.04, 2);
INSERT INTO request_entity(number, price, status) VALUES (100897, 2.99, 3);
INSERT INTO request_entity(number, price, status) VALUES (109994, 49.04, 3);
INSERT INTO request_entity(number, price, status) VALUES (305460, 90.99, 0);
INSERT INTO request_entity(number, price, status) VALUES (400542, 350.00, 1);
INSERT INTO request_entity(number, price, status) VALUES (309994, 249.04, 2);
INSERT INTO request_entity(number, price, status) VALUES (255555, 12.99, 3);
INSERT INTO request_entity(number, price, status) VALUES (989111, 1049.04, 3);
INSERT INTO request_entity(number, price, status) VALUES (912345, 1000.00, 0);