SELECT customer.NAME, orders.order_date, product.NAME, product.price, line.quantity, line.quantity * product.price AS cost
FROM customer JOIN orders
ON customer.id=orders.customerid
JOIN line 
ON orders.id=line.orderid
JOIN product 
ON line.productid=product.id
WHERE customer.NAME='prasad';
