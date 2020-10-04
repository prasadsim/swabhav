SELECT customer.NAME, orders.order_date, SUM( line.quantity * product.price) AS checkoutCost
FROM customer JOIN orders
ON customer.id=orders.customerid
JOIN line 
ON orders.id=line.orderid
JOIN product 
ON line.productid=product.id
WHERE customer.NAME='prasad';
