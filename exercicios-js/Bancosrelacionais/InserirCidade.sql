select * from estados where id = 21

INSERT INTO CIDADES (nome , area , estado_id)
Values('Campinas' , 795 , 21)

INSERT INTO Cidades(nome , area , estado_id)
Values('Niteroi',133.9,15)

INSERT INTO CIDADES(nome,area,estado_id)
values('Caruaru' , 920.6 ,(select id from estados where sigla ='PE'))

INSERT INTO cidades (nome , area , estado_id)
values("Juazeiro do Norte" , 248.2 , (select id from estados where sigla = "CE"))

select * from cidades

delete from cidades
where id >= 6