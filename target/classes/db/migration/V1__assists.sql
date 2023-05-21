CREATE TABLE assistance (
                             id BIGINT AUTO_INCREMENT NOT NULL,
                             name VARCHAR(100) NOT NULL,
                             `description` VARCHAR(300) NOT NULL,
                             CONSTRAINT pk_assistances PRIMARY KEY (id)
);

INSERT INTO assistance (name, description) VALUES ('Troca de aparelho', 'Troca de aparelho decodificador de sinal');
INSERT INTO assistance (name, description) VALUES ('Troca de cabo interno', 'Troca de cabo interno');
INSERT INTO assistance (name, description) VALUES ('Troca de fiação interna', 'Substituição de fiação interna da residência');
INSERT INTO assistance (name, description) VALUES ('Manutenção em fogão', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistance (name, description) VALUES ('Manutenção em geladeira', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistance (name, description) VALUES ('Manutenção em máquina de lavar', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistance (name, description) VALUES ('Instalação de ar condicionado', 'Instalação de um novo sistema de ar condicionado');
INSERT INTO assistance (name, description) VALUES ('Troca de torneira', 'Substituição de uma torneira danificada');
INSERT INTO assistance (name, description) VALUES ('Limpeza de caixa de agua', 'Remoção de sujeira e desinfecção da caixa de agua');
INSERT INTO assistance (name, description) VALUES ('Desentupimento de encanamento', 'Remoção de obstruções no encanamento');
INSERT INTO assistance (name, description) VALUES ('Instalação de antena', 'Instalação de uma antena de TV');
INSERT INTO assistance (name, description) VALUES ('Reparo em computador', 'Conserto de um computador com defeito');
INSERT INTO assistance (name, description) VALUES ('Manutenção em impressora', 'Reparo em uma impressora com problemas');
INSERT INTO assistance (name, description) VALUES ('Instalação de câmeras de segurança', 'Instalação de um sistema de vigilância');
INSERT INTO assistance (name, description) VALUES ('Reparo em telefone celular', 'Conserto de um telefone celular danificado');
INSERT INTO assistance (name, description) VALUES ('Troca de lâmpadas', 'Substituição de lâmpadas queimadas');