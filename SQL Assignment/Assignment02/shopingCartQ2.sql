select customer.name,orders.order_date,product.name,product.price,line.quantity 
from customer
inner join orders
on customer.id=orders.customerid
inner join line
on line.orderid=orders.id
inner join product
on line.productid=product.id
order by orders.order_date;