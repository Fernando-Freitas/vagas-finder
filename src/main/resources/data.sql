DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT PRIMARY KEY,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL,
  EMAIL VARCHAR(250) NOT NULL
);

INSERT INTO users (ID, FIRST_NAME, LAST_NAME, EMAIL) VALUES
  (1, 'first', 'last 1', 'abc1@gmail.com'),
  (2, 'sec', 'last 2', 'abc2@gmail.com'),
  (3, 'trd', 'last 3', 'abc3@gmail.com');