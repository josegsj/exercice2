Create table vote
 
(
    id int primary key,
    vote boolean
);

Create table session
 
(
    id int primary key,
    date timestamp
);

Create table ruling
 
(
    id int primary key,
    name varchar(100)
);

Create table associate
 
(
    id int primary key,
    cpf varchar(20)
);