# Write your MySQL query statement below
select emp.name,bns.bonus from Employee as emp left join Bonus as bns on bns.empId=emp.empId where bns.bonus<1000 or bns.bonus is null

# SELECT
#     Employee.name, Bonus.bonus
# FROM
#     Employee
#         LEFT JOIN
#     Bonus ON Employee.empid = Bonus.empid
# WHERE
#     bonus < 1000 OR bonus IS NULL
# ;