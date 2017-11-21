-- DROP TABLE `spring`.`trainee`;

CREATE TABLE `spring`.`trainee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `email` VARCHAR(90) NOT NULL,
  `date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `phone` VARCHAR(15) NULL,
  `company` VARCHAR(45) NOT NULL,
  `jobrole` VARCHAR(30) NULL,
  PRIMARY KEY (`id`));