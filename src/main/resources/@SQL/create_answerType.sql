use `eval`;
-- DROP TABLE `answertype`;

CREATE TABLE `answertype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` char(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
