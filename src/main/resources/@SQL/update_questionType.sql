USE eval;

UPDATE questiontype
SET type = "HEADER"
WHERE id = 1;

UPDATE questiontype
SET type = "FOOTER"
WHERE id = 2;