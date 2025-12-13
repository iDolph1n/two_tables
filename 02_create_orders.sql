CREATE TABLE ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    customer_id  INT          NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    amount       INT          NOT NULL,
    CONSTRAINT fk_orders_customers
        FOREIGN KEY (customer_id)
            REFERENCES CUSTOMERS (id)
);
