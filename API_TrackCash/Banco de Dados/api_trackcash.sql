CREATE SCHEMA IF NOT EXISTS `api_trackcash`;
USE `api_trackcash` ;

CREATE TABLE IF NOT EXISTS `api_trackcash`.`cadastro_canal` (
  `can_id` INT NOT NULL AUTO_INCREMENT,
  `can_empresa` VARCHAR(45) NULL,
  `can_plataforma` VARCHAR(45) NULL,
  `can_autentificacao` VARCHAR(45) NULL,
  PRIMARY KEY (`can_id`))
ENGINE = InnoDB;

SELECT * FROM cadastro_canal;

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

create table if not exists usuarios(
   id int primary key auto_increment not null,
   nome varchar(40),
   usuario varchar(30) not null unique,
   `email` varchar(50) not null,
   `senha` varchar(20) not null,
   atividade boolean not null,
   tpAcesso int not null
)default charset = utf8;

insert into usuarios values(default, null, "master", "master@fatec", "master123", true, "0");

insert into usuarios values(default, null, "admin", "admin@fatec", "admin123", true, "1");

insert into usuarios values(default, null, "4Desk", "4Desk@fatec", "123", true, "2");
