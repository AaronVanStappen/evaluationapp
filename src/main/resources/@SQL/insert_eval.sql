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
`date`,
`phone`,
`company`,
`jobrole`)
VALUES
 (1, "Tom", "Claes", "Tom@Claes.be", current_timestamp(), "+32494987654", "QNH", "Trainee")
,(2, "Piet", "Hein", "Piet@Hein.be", current_timestamp(), "+316654321", "QNH", "Account manager")
;

INSERT INTO `coursetopic`
(`id`, `name`)
VALUES
 (1, "Adobe")
,(2, "Business Intelligence")
,(3, "General Programming")
,(4, "ITIL and Project Management")
,(5, "Java")
,(6, "SAP")
,(7, "Methodology")
,(8, "Microsoft CRM")
,(9, "Microsoft")
,(10, "Oracle")
,(11, "Testing")
,(12, "Unix/Linux")
,(13, "Web Design")
,(14, "XML")
,(15, "Mobile Apps")
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
 (1, "OPEN HEADER")
,(2, "OPEN FOOTER")
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
`instructorCourseId`,
`traineeId`,
`answer`)
VALUES
 (1, 1, 3, 1, 1, "Learning Java as a complete beginner.")
,(2, 3, 1, 1, 1, "1")
,(3, 3, 1, 1, 1, "1")
,(4, 3, 1, 1, 1, "1")
,(5, 4, 2, 1, 1, "N")
,(6, 4, 2, 1, 1, "Y")
,(7, 5, 1, 1, 1, "4")
,(8, 5, 1, 1, 1, "5")
,(9, 5, 1, 1, 1, "4")
,(10, 5, 1, 1, 1, "3")
,(11, 5, 1, 1, 1, "5")
,(12, 5, 1, 1, 1, "1")
,(13, 6, 1, 1, 1, "2")
,(14, 6, 1, 1, 1, "1")
,(15, 6, 1, 1, 1, "4")
,(16, 6, 2, 1, 1, "Y")
,(17, 2, 3, 1, 1, "There was too much content for too short a period.")
;