-- DROP TABLE `spring`.`question`;

CREATE TABLE `spring`.`question` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(120) NOT NULL,
  `questionTypeId` INT NOT NULL,
  `answerTypeId` INT NOT NULL,
  PRIMARY KEY (`id`));
