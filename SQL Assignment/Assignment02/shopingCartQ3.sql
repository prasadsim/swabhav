SELECT orders.id, product.NAME, product.price, line.quantity 
FROM orders JOIN line
ON orders.id=line.orderid
JOIN product
ON product.id=line.productid
WHERE orders.id=102;