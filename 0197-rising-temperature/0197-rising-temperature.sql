SELECT w2.Id  FROM Weather w1,Weather w2 
WHERE w2.recordDate= DATE_ADD(w1.recordDate, INTERVAL 1 DAY) 
AND w2.temperature > w1.temperature;