-- DROP TABLE `eval`.`question`;

CREATE TABLE `eval`.`question` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(120) NOT NULL,
  `questionTypeId` INT NOT NULL,
  `answerTypeId` INT NOT NULL,
  PRIMARY KEY (`id`));
