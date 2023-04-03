CREATE DATABASE vendas_loja;

USE vendas_loja;

CREATE TABLE produtos (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50),
  descricao TEXT,
  preco DECIMAL(10, 2),
  PRIMARY KEY (id)
);

CREATE TABLE clientes (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50),
  email VARCHAR(50),
  telefone VARCHAR(15),
  PRIMARY KEY (id)
);

CREATE TABLE vendas (
  id INT NOT NULL AUTO_INCREMENT,
  id_produto INT NOT NULL,
  id_cliente INT NOT NULL,
  data_compra DATETIME,
  quantidade INT,
  PRIMARY KEY (id),
  FOREIGN KEY (id_produto) REFERENCES produtos(id),
  FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);


INSERT INTO loja.produtos (nome, descricao, preco) VALUES
    ('Camiseta', 'Camiseta branca de algodão', 29.99),
    ('Calça jeans', 'Calça jeans azul', 59.99),
    ('Tênis', 'Tênis preto para corrida', 89.99);


INSERT INTO loja.clientes (nome, email, telefone) VALUES
    ('João da Silva', 'joao.silva@gmail.com', '11 99999-9999'),
    ('Maria Souza', 'maria.souza@hotmail.com', '21 88888-8888'),
    ('Pedro Rocha', 'pedro.rocha@yahoo.com', '31 77777-7777');
    
    
    INSERT INTO loja.pedidos (cliente_id, data, total) VALUES
    (1, '2022-03-01', 119.98),
    (2, '2022-03-02', 29.99),
    (3, '2022-03-03', 89.99);
    
    
    INSERT INTO loja.itens_pedido (pedido_id, produto_id, quantidade) VALUES
    (1, 1, 2),
    (1, 2, 1),
    (2, 1, 1),
    (3, 3, 1);
