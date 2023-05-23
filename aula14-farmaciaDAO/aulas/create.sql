drop table if exists medicamento; create table medicamento (
    id int auto_increment primary key,
    nome varchar(255),
    laboratorio varchar(255),
    quantidade int, preco double
);