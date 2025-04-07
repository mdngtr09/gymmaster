
CREATE DATABASE IF NOT EXISTS GymMaster;
USE GymMaster;

DROP TABLE IF EXISTS registro_atividade;
DROP TABLE IF EXISTS desempenho;
DROP TABLE IF EXISTS exercicios;


CREATE TABLE exercicios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE registro_atividade (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_exercicio VARCHAR(100) NOT NULL,
    series INT NOT NULL,
    repeticoes INT NOT NULL,
    carga DECIMAL(5,2) NOT NULL,
    data DATE NOT NULL
);
ALTER TABLE registro_atividade MODIFY carga VARCHAR(10);
ALTER TABLE registro_atividade MODIFY series VARCHAR(10);
ALTER TABLE registro_atividade MODIFY data VARCHAR(10);

CREATE TABLE desempenho (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_exercicio VARCHAR(100) NOT NULL,
    serie INT NOT NULL,
    repeticoes INT,
    carga DECIMAL(5,2),
    data_registro DATE NOT NULL
);
