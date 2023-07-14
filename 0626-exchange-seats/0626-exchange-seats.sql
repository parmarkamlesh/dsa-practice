select IF(id < (select max(id) from seat), IF(mod(id,2) = 1, id + 1, id - 1), 
IF(mod(id,2) = 1, id, id - 1)) as id, student
from seat
order by id