# Write your MySQL query statement below
select pd.product_name, sk.year, sk.price from Sales sk inner join Product pd on pd.product_id=sk.product_id