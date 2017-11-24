USE `eval`;

-- Removes all rows from all tables !!! --
DELETE FROM `trainee`;
DELETE FROM `coursetopic`;
DELETE FROM `traineecoursetopic`;
DELETE FROM `course`;
DELETE FROM `instructor`;
DELETE FROM `instructorcourse`;
DELETE FROM `questiontype`;
DELETE FROM `answertype`;
DELETE FROM `question`;
DELETE FROM `answer`;


-- Populates all tables --
INSERT INTO `trainee`
(`id`,
`firstname`,
`name`,
`email`,
`phone`,
`company`,
`jobrole`)
VALUES
 (1, "Tom", "Claes", "Tom@Claes.be", "+32494987654", "QNH", "Trainee")
,(2, "Piet", "Hein", "Piet@Hein.be", "+316654321", "QNH", "Account manager")
;

INSERT INTO `coursetopic`
(`id`, `name`)
VALUES
 (1, "None")
,(2, "Adobe")
,(3, "Business Intelligence")
,(4, "General Programming")
,(5, "ITIL and Project Management")
,(6, "Java")
,(7, "SAP")
,(8, "Methodology")
,(9, "Microsoft CRM")
,(10, "Microsoft")
,(11, "Oracle")
,(12, "Testing")
,(13, "Unix/Linux")
,(14, "Web Design")
,(15, "XML")
,(16, "Mobile Apps")
;

INSERT INTO `traineecoursetopic`
(`id`, `traineeid`, `coursetopicid`)
VALUES
 (1, 1, 1)
,(2, 1, 2)
,(3, 1, 3)
,(4, 1, 4)
,(5, 1, 5)
,(6, 1, 6)
,(7, 1, 7)
,(8, 1, 8)
,(9, 1, 9)
,(10, 1, 10)
,(11, 1, 11)
,(12, 1, 12)
,(13, 1, 13)
,(14, 1, 14)
,(15, 1, 15)
;

INSERT INTO `course`
(`id`, `course`)
VALUES
 (1, "Java")
,(2, "Html")
;

INSERT INTO `instructor`
(`id`, `firstname`, `name`)
VALUES
 (1, "Kenneth", "Van Gijsel")
,(2, "Noël", "Vaes")
;

INSERT INTO `instructorcourse`
(`id`, `instructorid`, `courseid`)
VALUES
 (1, 1, 1)
,(2, 2, 1)
;

INSERT INTO `questiontype`
(`id`, `type`)
VALUES
 (1, "HEADER")
,(2, "FOOTER")
,(3, "GENERAL")
,(4, "CLASSROOM")
,(5, "INSTRUCTOR")
,(6, "TRAINING CONTENT")
 ;
 
INSERT INTO `answertype`
(`id`, `type`)
VALUES
 (1, "NUM") -- values 1, 2, 3, 4, 5
,(2, "YESNO") -- values Y, N
,(3, "OPEN") -- values VARCHAR 200
;

INSERT INTO `question`
(`id`, `question`, `questiontypeid`, `answertypeid`)
VALUES
 (1, "What was your main objective for completing this training ?", 1, 3)
,(2, "Knowledge and skills gained", 3, 1)
,(3, "Impact on jb effectiveness", 3, 1)
,(4, "Impact on career potential", 3, 1)
,(5, "Was the room adequately equipped ?", 4, 2)
,(6, "Were there enough breaks ?", 4, 2)
,(7, "Knowledge of the subject", 5, 1)
,(8, "Response to questions", 5, 1)
,(9, "Presentation skills", 5, 1)
,(10, "Ability to provide real world examples", 5, 1)
,(11, "Ability to cover all the stated objectives", 5, 1)
,(12, "Overall Impression", 5, 1)
,(13, "Logically organised course", 6, 1)
,(14, "Clarity of content", 6, 1)
,(15, "Quality of coursware", 6, 1)
,(16, "Was the amount of material presented apporpriate for the length of the course ?", 6, 2)
,(17, "Do you have any suggestions or comments ?", 2, 3)
;

INSERT INTO `answer`
(`id`,
`questionTypeId`,
`answerTypeId`,
`instructorId`,
`CourseId`,
`traineeId`,
`answer`,
`date`)
VALUES
 (1, 1, 1, 1, 1, 1, "Learning Java as a complete beginner.",current_timestamp())
,(2, 3, 1, 1, 1, 1, "1",current_timestamp())
,(3, 3, 1, 1, 1, 1, "1",current_timestamp())
,(4, 3, 1, 1, 1, 1, "1",current_timestamp())
,(5, 4, 1, 1, 1, 1, "N",current_timestamp())
,(6, 4, 1, 1, 1, 1, "Y",current_timestamp())
,(7, 5, 1, 1, 1, 1, "4",current_timestamp())
,(8, 5, 1, 1, 1, 1, "5",current_timestamp())
,(9, 5, 1, 1, 1, 1, "4",current_timestamp())
,(10, 5, 1, 1, 1, 1, "3",current_timestamp())
,(11, 5, 1, 1, 1, 1, "5",current_timestamp())
,(12, 5, 1, 1, 1, 1, "1",current_timestamp())
,(13, 6, 1, 1, 1, 1, "2",current_timestamp())
,(14, 6, 1, 1, 1, 1, "1",current_timestamp())
,(15, 6, 1, 1, 1, 1, "4",current_timestamp())
,(16, 6, 1, 1, 1, 1, "Y",current_timestamp())
,(17, 2, 1, 1, 1, 1, "There was too much content for too short a period.",current_timestamp())
;