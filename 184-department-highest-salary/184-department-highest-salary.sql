select d.Name as Department, e.Name as Employee, e.Salary
from Employee as e
    join Department as d
    on e.DepartmentId = d.Id
    join (
        select max(Salary) as Salary, DepartmentId
        from Employee
        group by DepartmentId
    ) as mx
    on e.Salary = mx.Salary and e.DepartmentId = mx.DepartmentId
;