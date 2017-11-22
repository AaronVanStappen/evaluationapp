USE `eval`;

SELECT b.question
     , a.type as questionType
     , c.type as answerType
  FROM questiontype a 
  JOIN question b   ON a.id = b.questiontypeid
  JOIN answertype c ON c.id = b.answertypeid
ORDER BY FIELD (a.id, 1, 3, 4, 5, 6, 2)
              , c.id
              , b.question 
;