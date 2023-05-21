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