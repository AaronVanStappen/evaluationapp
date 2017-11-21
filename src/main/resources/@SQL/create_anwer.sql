-- DROP TABLE `spring`.`answer`;

CREATE TABLE `spring`.`answer` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `questionTypeId` INT NOT NULL,
  `anserTypeId` INT NOT NULL,
  `instructorCourseId` BIGINT NOT NULL,
  `traineeId` BIGINT NOT NULL,
  `answer` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`));
