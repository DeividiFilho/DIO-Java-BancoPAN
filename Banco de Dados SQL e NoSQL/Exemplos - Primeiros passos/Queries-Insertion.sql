SELECT coluna1, coluna2, ...
FROM tabela1
WHERE condição
GROUP BY coluna1, coluna2, ...
HAVING condição
ORDER BY coluna1, coluna2, ...

INSERT INTO tabela (coluna1, coluna2, ...)
VALUES (valor1, valor2, ...);

SELECT nome, sobrenome, salario
FROM funcionarios
WHERE salario > 5000;

INSERT INTO funcionarios_salarios_altos (nome, sobrenome, salario)
SELECT nome, sobrenome, salario
FROM funcionarios
WHERE salario > 5000;
