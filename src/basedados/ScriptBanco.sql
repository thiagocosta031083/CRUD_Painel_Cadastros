--Apaga a base de dados se ela existir
DROP DATABASE IF EXISTS 'learn_java';

--Criar a base de dados
CREATE DATABASE learn_java;

--Criar tabelas
CREATE TABLE bairro(
id_bairro INT auto_increment PRIMARY KEY,
logradouro VARCHAR(45)
);

INSERT INTO bairro(logradouro) VALUE ("Asa sul"),("Lago sul"),("Asa norte"),("Lago norte");

CREATE TABLE cliente(
id_cliente INT auto_increment PRIMARY KEY,
nome_cliente VARCHAR(45)
);

INSERT INTO cliente(nome_cliente) VALUE ("Leo"),("Ze"),("Maria"),("Oto");

CREATE TABLE fornecedor(
id_fornecedor INT auto_increment PRIMARY KEY,
fornecedor VARCHAR(45)
);

INSERT INTO fornecedor(fornecedor) VALUE ("Brasdura"),("Contbras"),("Maria"),("Oto");

CREATE TABLE funcionario(
id_funcionario INT auto_increment PRIMARY KEY,
nome_funcionario VARCHAR(45),
funcao VARCHAR(45)
);

INSERT INTO funcionario(nome_funcionario,funcao) VALUE ("Ciborg","vendedor"),("Mateiro","supervisor"),("Rico","diretor"),("Americo","gerente");