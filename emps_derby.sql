CREATE TABLE emp(id INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY
    (START WITH 1, INCREMENT BY 1), name VARCHAR(255), salary DOUBLE);

INSERT INTO emp(name, salary) VALUES('Sonu', 10.5);
INSERT INTO emp(name, salary) VALUES('Monu', 15.6);
INSERT INTO emp(name, salary) VALUES('Tonu', 12.2);
INSERT INTO emp(name, salary) VALUES('Ponu', 20.8);
INSERT INTO emp(name, salary) VALUES('Gonu', 22.4);

