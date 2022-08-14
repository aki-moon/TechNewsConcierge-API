CREATE TABLE article (
    id INT NOT NULL PRIMARY KEY,
    publishDate DATE NOT NULL,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    link VARCHAR(255) NOT NULL
);