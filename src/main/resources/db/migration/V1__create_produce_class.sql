CREATE TABLE produce (
    id SERIAL PRIMARY KEY,
    plu VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    commodity VARCHAR(255) NOT NULL,
    variety VARCHAR(255) NOT NUll,
    size VARCHAR(255) NOT NULL,
    measurements_na VARCHAR(255),
    measurements_global VARCHAR(255),
    restrictions_notes VARCHAR(255),
    botanical_name VARCHAR(255),
    aka VARCHAR(255),
    notes VARCHAR(255),
    revision_date VARCHAR(255),
    date_added VARCHAR(255),
    gpc VARCHAR(255),
    image VARCHAR(255),
    image_source VARCHAR(255)
);