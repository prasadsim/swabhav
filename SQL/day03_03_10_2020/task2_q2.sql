SELECT countries.COUNTRY_NAME AS country FROM countries LEFT JOIN locations
ON countries.COUNTRY_ID=locations.COUNTRY_ID
WHERE locations.LOCATION_ID IS null