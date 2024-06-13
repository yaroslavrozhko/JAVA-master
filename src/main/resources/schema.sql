CREATE DATABASE IF NOT EXISTS masterclass_platform;

USE masterclass_platform;

CREATE TABLE IF NOT EXISTS users (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role ENUM('USER', 'ORGANIZER') NOT NULL
    );

CREATE TABLE IF NOT EXISTS masterclasses (
                                             id INT AUTO_INCREMENT PRIMARY KEY,
                                             title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    date DATETIME NOT NULL,
    location VARCHAR(255) NOT NULL,
    is_online BOOLEAN NOT NULL,
    organizer_id INT,
    FOREIGN KEY (organizer_id) REFERENCES users(id)
    );
