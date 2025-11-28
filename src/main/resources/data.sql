CREATE TABLE field_of_study_type (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(255) UNIQUE NOT NULL
);


INSERT INTO field_of_study_type (name)
VALUES ('Informatyka'),
       ('Grafika')
