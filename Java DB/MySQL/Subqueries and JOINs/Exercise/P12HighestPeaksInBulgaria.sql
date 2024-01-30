USE geography;

SELECT 
    c.country_code, m.mountain_range, p.peak_name, p.elevation
FROM
    countries c
        JOIN
    mountains_countries mc ON c.country_code = mc.country_code
        JOIN
    mountains m ON mc.mountain_id = m.id
        JOIN
    peaks p ON m.id = p.mountain_id
WHERE
    p.elevation > 2835
        AND c.country_code = 'BG'
ORDER BY p.elevation DESC;