create table USER
(
    nome      VARCHAR,
    matricula INTEGER PRIMARY KEY AUTO_INCREMENT,
    cpf       INTEGER,
    rg        INTEGER,
    endereco  VARCHAR,
    curso     VARCHAR
);


insert into USER (nome, cpf, rg, endereco, curso)
values ('Amanda', 14457, 55689, 'Rua Joaquim Borba Filho', 'Sistemas Para Internet');