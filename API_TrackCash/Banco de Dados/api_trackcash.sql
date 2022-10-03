CREATE SCHEMA IF NOT EXISTS api_trackcash;
USE `api_trackcash` ;

CREATE TABLE IF NOT EXISTS api_trackcash.tbl_Usuario(
    id_User INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Nome VARCHAR(40),
    Sobrenome VARCHAR(40),
    Usuario VARCHAR(45) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(30) NOT NULL,
    atividade BOOLEAN NOT NULL,
    perfil INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Usuario;

CREATE TABLE IF NOT EXISTS api.trackcash.tbl_Canal (
    id_Canal INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Token VARCHAR(90),
    Login VARCHAR(45),
    Senha VARCHAR(30),
    fk_tbl_Usuario_id_User INT NOT NULL,
    fk_tbl_Config_id_Config INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Canal;

CREATE TABLE IF NOT EXISTS api_trackcash.tbl_Config (
    id_Config INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Empresa VARCHAR(45) NOT NULL,
    Plataforma VARCHAR(45) NOT NULL,
    Autenticacao VARCHAR(15) NOT NULL,
    fk_tbl_Usuario_id_User INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Canal;

insert into tbl_Usuario values(default, default, "master", "master@fatec", "master123", true, "0");

insert into tbl_Usuario values(default, default, "admin", "admin@fatec", "admin123", true, "1");

insert into tbl_Usuario values(default, default, "4Desk", "4Desk@fatec", "123", true, "2");
