SELECT regions.region_name AS region FROM regions LEFT JOIN countries 
ON regions.region_id=countries.REGION_ID
WHERE countries.COUNTRY_ID IS null;