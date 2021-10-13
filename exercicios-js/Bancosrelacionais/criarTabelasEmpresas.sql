create Table if not exists empresas(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome Varchar(255) NOT NULL,
    cnpj int UNSIGNED,
    PRIMARY KEY(id),
    unique Key(cnpj)
);

-- Cidades_empresas

create table if not exists empresas_unidades(
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY(empresa_id , cidade_id)
);