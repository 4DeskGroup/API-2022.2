-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema api_trackcash
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `api_trackcash`;
USE `api_trackcash` ;

-- -----------------------------------------------------
-- Table `api_trackcash`.`cadastro_canal`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `api_trackcash`.`cadastro_canal` (
  `can_id` INT NOT NULL AUTO_INCREMENT,
  `can_empresa` VARCHAR(45) NULL,
  `can_plataforma` VARCHAR(45) NULL,
  `can_autentificacao` VARCHAR(45) NULL,
  PRIMARY KEY (`can_id`))
ENGINE = InnoDB;

SELECT * FROM cadastro_canal;

-- -----------------------------------------------------
-- Table `Canal`.`Canais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `api_trackcash`.`canais` (
  `idCanais` INT NOT NULL AUTO_INCREMENT,
  `empresa` VARCHAR(45) NULL,
  `contaid` VARCHAR(45) NULL,
  `plataforma` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `token` VARCHAR(90) NULL,
  PRIMARY KEY (`idCanais`))
ENGINE = InnoDB;

SELECT * FROM canais;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;