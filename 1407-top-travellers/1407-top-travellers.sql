#todo
select u.name, (select IFNULL(sum(r.distance),0) from rides r where u.id = r.user_id) as travelled_distance from users u
order by travelled_distance desc, name asc