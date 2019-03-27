CREATE DATABASE array_db;

USE array_db;

CREATE TABLE array (numbers int(11));

INSERT INTO array (numbers) VALUES (1),(2),(3),(4);

SELECT * FROM array;

SELECT * FROM array WHERE numbers=1;

DROP TABLE array;

DROP DATABASE array_db;