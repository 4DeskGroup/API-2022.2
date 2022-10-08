SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema api_trackcash
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema api_trackcash
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `api_trackcash` ;
USE `api_trackcash` ;

-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Usuario` (
  id_User INT NOT NULL AUTO_INCREMENT,
  Usuario VARCHAR(45) NOT NULL UNIQUE,
  Nome_Usuario VARCHAR(40) NULL,
  Sobrenome_Usuario VARCHAR(40) NULL,
  Email_Usuario VARCHAR(50) NOT NULL,
  Senha_Usuario VARCHAR(30) NOT NULL,
  Status_Usuario boolean NOT NULL,
  Perfil_Usuario INT NOT NULL,
  PRIMARY KEY (`id_User`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Config`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Config` (
  id_Config INT NOT NULL AUTO_INCREMENT,
  Empresa_Config VARCHAR(45) NOT NULL UNIQUE,
  Plataforma_Config VARCHAR(45) NOT NULL,
  Autenticacao_Config VARCHAR(15) NOT NULL,
  Usuario_Configurou INT NOT NULL,
  PRIMARY KEY (`id_Config`),
  INDEX `fk_Usuario_Config_idx` (Usuario_Configurou ASC),
  CONSTRAINT `fk_Usuario_Config`
    FOREIGN KEY (Usuario_Configurou)
    REFERENCES `api_trackcash`.`tbl_Usuario` (id_User)
    ON DELETE NO ACTION
    ON UPDATE Cascade)
ENGINE = InnoDB;

SELECT * FROM tbl_Config;
-- -----------------------------------------------------
-- Table `api_trackcash`.`tbl_Canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `api_trackcash`.`tbl_Canal` (
  id_Canal INT NOT NULL AUTO_INCREMENT,
  Contaid_Canal VARCHAR(45) NULL,
  Token_Canal VARCHAR(90) NULL,
  Login_Canal VARCHAR(45) NULL,
  Senha_Canal VARCHAR(30) NULL,
  Usuario_pertencente INT NOT NULL,
  Config_pertencente INT NOT NULL,
  PRIMARY KEY (id_Canal),
  INDEX `fk_Usuario_Canal_idx` (Usuario_pertencente ASC),
  INDEX `fk_Config_Canal_idx` (Config_pertencente ASC),
  CONSTRAINT `fk_Usuario_Canal`
    FOREIGN KEY (Usuario_pertencente)
    REFERENCES `api_trackcash`.`tbl_Usuario` (`id_User`)
    ON DELETE cascade
    ON UPDATE cascade,
  CONSTRAINT `fk_Config_Canal`
    FOREIGN KEY (Config_pertencente)
    REFERENCES `api_trackcash`.`tbl_Config` (id_Config)
    ON DELETE cascade
    ON UPDATE cascade)
ENGINE = InnoDB;

SELECT * FROM tbl_Canal;

insert into tbl_Usuario values(default, "master", null, null, "master@fatec", "master123", true, "0");

insert into tbl_Usuario values(default, "admin", null, null, "admin@fatec", "admin123", true, "1");

insert into tbl_Usuario values(default, "4Desk", null, null, "4Desk@fatec", "123", true, "2");

SELECT * FROM tbl_Usuario;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;