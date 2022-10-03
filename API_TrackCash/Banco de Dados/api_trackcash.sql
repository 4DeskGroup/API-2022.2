SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema api_trackcash
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS api_trackcash;
USE `api_trackcash` ;

-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Usuario`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Usuario`(
    id_User INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Usuario VARCHAR(45) NOT NULL,
    Nome_Usuario VARCHAR(40),
    Sobrenome_Usuario VARCHAR(40),
    Email_Usuario VARCHAR(50) NOT NULL,
    Senha_Usuario VARCHAR(30) NOT NULL,
    Status_Usuario BOOLEAN NOT NULL,
    Perfil_Usuario INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Usuario;

-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Canal`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Canal` (
    id_Canal INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Token_Canal VARCHAR(90),
    Login_Canal VARCHAR(45),
    Senha_Canal VARCHAR(30),
    fk_tbl_Usuario_id_User INT NOT NULL,
    fk_tbl_Config_id_Config INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Canal;

-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Config`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Config` (
    id_Config INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Empresa_Config VARCHAR(45) NOT NULL,
    Plataforma_Config VARCHAR(45) NOT NULL,
    Autenticacao_Config VARCHAR(15) NOT NULL,
    fk_tbl_Usuario_id_User INT NOT NULL
)default charset = utf8;

SELECT * FROM tbl_Canal;

insert into tbl_Usuario values(default, "master", null, null, "master@fatec", "master123", true, "0");

insert into tbl_Usuario values(default, "admin", null, null, "admin@fatec", "admin123", true, "1");

insert into tbl_Usuario values(default, "4Desk", null, null, "4Desk@fatec", "123", true, "2");

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
