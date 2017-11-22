-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema eval
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `eval` DEFAULT CHARACTER SET utf8 ;

USE `eval`;

-- -----------------------------------------------------
-- Table `eval`.`trainee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `trainee` ;

CREATE TABLE IF NOT EXISTS `trainee` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `email` VARCHAR(90) NOT NULL,
  `date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `phone` VARCHAR(15) NULL DEFAULT NULL,
  `company` VARCHAR(45) NOT NULL,
  `jobrole` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`questiontype`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `questiontype` ;

CREATE TABLE IF NOT EXISTS `questiontype` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`instructor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `instructor` ;

CREATE TABLE IF NOT EXISTS `instructor` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`course`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `course` ;

CREATE TABLE IF NOT EXISTS `course` (
  `id` BIGINT(20) NOT NULL,
  `course` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`instructorcourse`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `instructorcourse` ;

CREATE TABLE IF NOT EXISTS `instructorcourse` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `instructorid` BIGINT(20) NOT NULL,
  `courseid` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`, `instructorid`, `courseid`),
  INDEX `fk_instructorcourse_instructor1_idx` (`instructorid` ASC),
  INDEX `fk_instructorcourse_course1_idx` (`courseid` ASC),
  CONSTRAINT `fk_instructorcourse_instructor1`
    FOREIGN KEY (`instructorid`)
    REFERENCES `instructor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_instructorcourse_course1`
    FOREIGN KEY (`courseid`)
    REFERENCES `course` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`answertype`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `answertype` ;

CREATE TABLE IF NOT EXISTS `answertype` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `type` CHAR(5) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`answer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `answer` ;

CREATE TABLE IF NOT EXISTS `answer` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `answer` VARCHAR(200) NOT NULL,
  `traineeid` BIGINT(20) NOT NULL,
  `questiontypeid` INT(11) NOT NULL,
  `instructorcourseid` BIGINT(20) NOT NULL,
  `answertypeid` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `traineeid`, `questiontypeid`, `instructorcourseid`, `answertypeid`),
  INDEX `fk_answer_trainee1_idx` (`traineeid` ASC),
  INDEX `fk_answer_questiontype1_idx` (`questiontypeid` ASC),
  INDEX `fk_answer_instructorcourse1_idx` (`instructorcourseid` ASC),
  INDEX `fk_answer_answertype1_idx` (`answertypeid` ASC),
  CONSTRAINT `fk_answer_trainee1`
    FOREIGN KEY (`traineeid`)
    REFERENCES `trainee` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_answer_questiontype1`
    FOREIGN KEY (`questiontypeid`)
    REFERENCES `questiontype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_answer_instructorcourse1`
    FOREIGN KEY (`instructorcourseid`)
    REFERENCES `instructorcourse` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_answer_answertype1`
    FOREIGN KEY (`answertypeid`)
    REFERENCES `answertype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`coursetopic`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `coursetopic` ;

CREATE TABLE IF NOT EXISTS `coursetopic` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`question`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `question` ;

CREATE TABLE IF NOT EXISTS `question` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(120) NOT NULL,
  `questiontypeid` INT(11) NOT NULL,
  `answertypeid` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `questiontypeid`, `answertypeid`),
  INDEX `fk_question_questiontype1_idx` (`questiontypeid` ASC),
  INDEX `fk_question_answertype1_idx` (`answertypeid` ASC),
  CONSTRAINT `fk_question_questiontype1`
    FOREIGN KEY (`questiontypeid`)
    REFERENCES `questiontype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_question_answertype1`
    FOREIGN KEY (`answertypeid`)
    REFERENCES `answertype` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `eval`.`traineecoursetopic`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `traineecoursetopic` ;

CREATE TABLE IF NOT EXISTS `traineecoursetopic` (
  `id` BIGINT(20) NOT NULL,
  `traineeid` BIGINT(20) NOT NULL,
  `coursetopicid` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `traineeid`, `coursetopicid`),
  INDEX `fk_traineecoursetopic_trainee_idx` (`traineeid` ASC),
  INDEX `fk_traineecoursetopic_coursetopic1_idx` (`coursetopicid` ASC),
  CONSTRAINT `fk_traineecoursetopic_trainee`
    FOREIGN KEY (`traineeid`)
    REFERENCES `trainee` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_traineecoursetopic_coursetopic1`
    FOREIGN KEY (`coursetopicid`)
    REFERENCES `coursetopic` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;