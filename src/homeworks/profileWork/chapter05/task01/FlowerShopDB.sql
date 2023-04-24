DROP TABLE clients CASCADE;
DROP TABLE flowers CASCADE;
DROP TABLE orders CASCADE;

CREATE TABLE IF NOT EXISTS flowers
(
    f_id    SERIAL PRIMARY KEY,
    f_name  VARCHAR(100) UNIQUE CHECK ( f_name <> '') NOT NULL,
    f_price INTEGER                                   NOT NULL
);

CREATE TABLE IF NOT EXISTS clients
(
    c_id    SERIAL PRIMARY KEY,
    c_name  VARCHAR(50)        NOT NULL,
    c_phone VARCHAR(30) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS orders
(
    o_id        SERIAL PRIMARY KEY,
    o_client_id INTEGER REFERENCES clients (c_id)                   NOT NULL,
    o_flower_id INTEGER REFERENCES flowers (f_id)                   NOT NULL,
    o_amount    INTEGER CHECK ( o_amount >= 1 AND o_amount <= 1000) NOT NULL,
    o_date      TIMESTAMP DEFAULT (NOW())
);

