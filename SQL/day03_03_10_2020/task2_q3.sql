SELECT regions.region_name AS region,countries.COUNTRY_NAME AS country, locations.STATE_PROVINCE AS state 
FROM regions LEFT JOIN countries
ON regions.region_id=countries.REGION_ID
LEFT JOIN locations 
ON countries.COUNTRY_ID=locations.COUNTRY_ID
