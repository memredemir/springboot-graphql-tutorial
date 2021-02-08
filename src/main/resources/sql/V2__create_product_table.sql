create table if not exists product
(
    id binary(16) not null,
    title TEXT not null,
    description TEXT null,
    price DECIMAL not null,
    seller_id binary(16) not null,
    constraint product_pk
        primary key (id),
    constraint seller___fk
        foreign key (seller_id) references seller (id)
);