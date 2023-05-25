drop table if exists paciente; create table paciente (
    id int auto_increment primary key,
    nome varchar(255) not null,
    sobrenome varchar(255) not null,
    rg varchar(20) not null,
    dataCadastro varchar(20) not null,
    idEndereco int not null
);

drop table if exists endereco; create table endereco (
    id int auto_increment primary key,
    rua varchar(255) not null,
    numero varchar(255) not null,
    cidade varchar(255) not null,
    bairro varchar(255) not null
);
