INSERT INTO empresas
(nome,cnpj)

values
('Bradesco', 3544151532324),
('vale' , 211321851655),
('Ciela', 13211635468764)

--Alter Table empresas Modify cnpj VARCHAR(25);

desc empresas;
desc prefeitos;

select * from empresas;
select * from cidades;



Insert INTO empresas_unidades
(empresa_id , cidade_id , sede) values (14,14,1) , (14,15,0) , (15,14,0),(15,15,1)