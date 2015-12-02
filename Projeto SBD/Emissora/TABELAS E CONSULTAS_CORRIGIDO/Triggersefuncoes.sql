/*
Trigger que atualiza o salario do funcionario após 
inserir um novo dependente, de acordo com a idade 
desse dependente. Se for menor que 12 anos o 
aumento é de R$ 200,00,
menor que 18 o aumento é de R$ 150,00.
Se não for nenhum dos casos o aumento é somente de R$ 100,00
*/


CREATE OR REPLACE FUNCTION Atualiza_salarioDep()
	RETURNS trigger AS $$
	DECLARE idade double precision;

	BEGIN
		SELECT EXTRACT(year FROM age(new.DataNascimento)) INTO
		idade;
	IF (idade < 12) THEN
	
		UPDATE Funcionario SET Salario = Salario + 200
		WHERE CodFunc = new.CodFunc;

	ELSEIF (idade < 18 ) THEN

		UPDATE Funcionario SET Salario = Salario + 150
		WHERE CodFunc = new.CodFunc;
	ELSE
		UPDATE Funcionario SET Salario = Salario + 100
		WHERE CodFunc = new.CodFunc;
	END IF;
	RETURN NULL;
	END $$ language 'plpgsql';

CREATE TRIGGER after_insert_dependentes
	AFTER INSERT ON DEPENDENTES
	FOR EACH ROW
	EXECUTE PROCEDURE Atualiza_salarioDep();

	/*Funcao que é usada para ajuste do salario e bonificacoes
	dada a todos os funcionarios
	*/
 CREATE OR REPLACE FUNCTION FUNC_ATUALIZA_SALARIO
  (IN PERC FLOAT)
  RETURNS VOID AS $$
  BEGIN
	UPDATE Funcionario
	SET Salario = salario + (salario * PERC / 100);
	
  END $$ LANGUAGE 'plpgsql';


