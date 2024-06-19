-- 코드를 입력하세요
SELECT PRODUCT_CODE, sum(sales_amount*price) as SALES
from product as p, offline_sale as os 
where p.product_id = os.product_id
group by product_code
order by sum(sales_amount*price) DESC, PRODUCT_CODE ASC;