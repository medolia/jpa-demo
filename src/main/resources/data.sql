DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name  VARCHAR(250) NOT NULL,
    career     VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS t_user;

CREATE TABLE t_user
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(250) NOT NULL,
    id_card       VARCHAR(250) NOT NULL,
    date_of_birth datetime    NOT NULL
);

INSERT INTO billionaires (first_name, last_name, career)
VALUES ('Aliko', 'Dangote', 'Billionaire Industrialist'),
       ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
       ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');

INSERT INTO t_user (name, id_card, date_of_birth)
VALUES ('curry', 'sliljwji29123', now()),
       ('med', 'lsjaoi291223', '2012-07-09 06:54:33');



