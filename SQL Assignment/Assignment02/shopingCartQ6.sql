SELECT customer.NAME, line.quantity
FROM customer JOIN orders
ON customer.id=orders.customerid
JOIN line 
ON orders.id=line.orderid
JOIN product 
ON line.productid=product.id
WHERE product.NAME='earphone';
