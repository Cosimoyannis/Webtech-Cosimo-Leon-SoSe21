create table if not exists product
(

    id int not null
        constraint product
            primary key,
    name varchar(255) not null,
    price varchar(255) not null
);

alter table product owner to qnqppidiuuffam;