INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (1, 'Bianca Silva', '12345678900', 'bianca@exemplo.com', '11987654321');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (2, 'Carlos Santos', '10987654321', 'carlos@exemplo.com', '21987654322');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (3, 'Mariana Oliveira', '10203040506', 'mariana@exemplo.com', '31987654323');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (4, 'Ricardo Almeida', '23456789012', 'ricardo@exemplo.com', '41987654324');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (5, 'Patrícia Costa', '34567890123', 'patricia@exemplo.com', '51987654325');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (6, 'Juliana Lima', '45678901234', 'juliana@exemplo.com', '61987654326');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (7, 'André Martins', '56789012345', 'andre@exemplo.com', '71987654327');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (8, 'Fernanda Rocha', '67890123456', 'fernanda@exemplo.com', '81987654328');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (9, 'Lucas Ferreira', '78901234567', 'lucas@exemplo.com', '91987654329');
INSERT INTO cliente (codigo, nome, cpf, email, telefone) VALUES (10, 'Sofia Mendes', '89012345678', 'sofia@exemplo.com', '02987654330');

INSERT INTO produto (codigo, nome) VALUES (101, 'Camiseta Preta');
INSERT INTO produto (codigo, nome) VALUES (102, 'Camiseta Branca');
INSERT INTO produto (codigo, nome) VALUES (103, 'Jaqueta de Couro');
INSERT INTO produto (codigo, nome) VALUES (104, 'Calça Jeans');
INSERT INTO produto (codigo, nome) VALUES (105, 'Tênis Esportivo');
INSERT INTO produto (codigo, nome) VALUES (106, 'Boné Estampado');
INSERT INTO produto (codigo, nome) VALUES (107, 'Mochila de Lona');
INSERT INTO produto (codigo, nome) VALUES (108, 'Óculos de Sol');
INSERT INTO produto (codigo, nome) VALUES (109, 'Cinto de Couro');
INSERT INTO produto (codigo, nome) VALUES (110, 'Meias Diversas');

INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Tech Solutions LTDA', 'TechSol', '12345678000190', 'contato@techsol.com', '11987654321');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Distribuidora Oliveira SA', 'DistriOliveira', '23456789000180', 'vendas@distrioliveira.com', '21987654322');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Alimentos e Bebidas Brasil LTDA', 'AliBrasil', '34567890000170', 'atendimento@alibrasil.com', '31987654323');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Eletrônicos Modernos LTDA', 'EletrônicosMod', '45678901000160', 'suporte@eletronicosmod.com', '41987654324');
INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES ('Papelaria Central ME', 'PapelCentral', '56789012000150', 'papelaria@central.com', '51987654325');

INSERT INTO pedido (CLIENTE_CODIGO, FORNECEDOR_CODIGO, NOME, DATA_DE_INCLUSAO, DATA_DE_ALTERACAO) VALUES (1, 1, 'Pedido de Laptop Gamer', TIMESTAMP '2024-11-01 10:00:00', TIMESTAMP '2024-11-01 10:00:00');
INSERT INTO pedido (CLIENTE_CODIGO, FORNECEDOR_CODIGO, NOME, DATA_DE_INCLUSAO, DATA_DE_ALTERACAO) VALUES (1, 2, 'Pedido de Smartphone', TIMESTAMP '2024-11-01 11:00:00', TIMESTAMP '2024-11-01 11:00:00');
INSERT INTO pedido (CLIENTE_CODIGO, FORNECEDOR_CODIGO, NOME, DATA_DE_INCLUSAO, DATA_DE_ALTERACAO) VALUES (2, 1, 'Pedido de Teclado', TIMESTAMP '2024-11-02 09:00:00', TIMESTAMP '2024-11-02 09:00:00');
INSERT INTO pedido (CLIENTE_CODIGO, FORNECEDOR_CODIGO, NOME, DATA_DE_INCLUSAO, DATA_DE_ALTERACAO) VALUES (3, 3, 'Pedido de Mouse', TIMESTAMP '2024-11-02 14:30:00', TIMESTAMP '2024-11-02 14:30:00');
INSERT INTO pedido (CLIENTE_CODIGO, FORNECEDOR_CODIGO, NOME, DATA_DE_INCLUSAO, DATA_DE_ALTERACAO) VALUES (2, 2, 'Pedido de Monitor', TIMESTAMP '2024-11-03 08:15:00', TIMESTAMP '2024-11-03 08:15:00');