SET search_path TO Emissora;

 /* #Projeto Emissora SBD
#
#Nomes: Jessiane Gomes
#		José Victor Pereira
#		Laíz Silveira
#
#Inserts das tabelas
*/

/*
#	TABLE Emissora 
#	CodEmi varchar (5) primary key,  
#	Nome varchar(20) not null,
#	Endereco varchar (100) not null
>>> Nome emissora: Canal de Comunicacao Aberto _ CCA 
*/ 
INSERT INTO Emissora VALUES ('1010', 'CCA' ,'Endereco Rua:Piaui 877  Bairro: Umuarama Uberlandia MG cep: 38.405-317' );


 /*TABLE Departamentos
	CodEmi  varchar(5),
	CodDep  varchar(5) primary key,
	NomeDep varchar (20),
	InfoDep varchar(100), 
*/
INSERT INTO Departamentos VALUES('1010', 'Dep01', 'Noticias', 'Reunir informacoes e as relatam no ar.');
INSERT INTO Departamentos VALUES('1010', 'Dep02', 'Producao', 'Garantir que as informacoes fiquem no ar.');
INSERT INTO Departamentos VALUES('1010', 'Dep03', 'Vendas', 'Vender o espaco publicitario para sustentar a programacao.');
INSERT INTO Departamentos VALUES('1010', 'Dep04', 'Engenharia', 'Manter e melhorar a estrutura e equipamentos.');
INSERT INTO Departamentos VALUES('1010', 'Dep05', 'Negocios', 'Admistrtacao dos negocios em geral.');
INSERT INTO Departamentos VALUES('1010', 'Dep06', 'Transmissao', 'Transmitir as informacoes e o entretenimento aos clientes.');
INSERT INTO Departamentos VALUES('1010', 'Dep07', 'Programacao', 'Agendamento admistrtivos de horarios e o que sera transmitido.');
INSERT INTO Departamentos VALUES('1010', 'Dep08', 'Controle de qualidade', 'Verificar os processos, seus andamentos e se estao de acordo com os pre-requisitos estabelecidos.');
INSERT INTO Departamentos VALUES('1010', 'Dep09', 'Recursos Humanos', 'Gerenciamento dos recursos humanos.');
INSERT INTO Departamentos VALUES('1010', 'Dep10', 'Estacao de tv', 'Criar ou comprar direito de transmissao dos seus programas em geral.');

/*	TABLE Projetos
	CodDep  varchar(5),
	CodProj varchar (5) primary key,
	Nome varchar(20) not null,
	InfoProj varchar (100) not null,
	Data date not null, 
*/
INSERT INTO Projetos VALUES ( 'Dep09',	'1',	'Rede Nova',	'Descrições e explicação da nova rede disponével para transmissão da emissora.', 	'03-07-1999');
INSERT INTO Projetos VALUES ( 'Dep04',	'2',	'Estudo Analogico',		'Descrição passo a passo como a transmissão analógica.', 	'12-06-2000');
INSERT INTO Projetos VALUES ( 'Dep03',	'3',	'Junto do Cliente', 	'Descrição das mudanças da empresa para com os clientes.', 	'06-07-2002');
INSERT INTO Projetos VALUES ( 'Dep04',	'4',	'Estudo Digital', 	'Descrição dos estudos e reprodução do canal digital.', 	'22-10-2005');
INSERT INTO Projetos VALUES ( 'Dep08',	'5', 	'Economia de Energia', 	'Propostas de distribuições de serviço com menos gastos de energia.', 	'01-03-2006');
INSERT INTO Projetos VALUES ( 'Dep06', 	'6',	'Gerenciamento de canais',	'Descrição dos novos gerenciamento e distribuições dos canais.', 	'27-06-2010');
INSERT INTO Projetos VALUES ( 'Dep10',	'7',	'TV a cabo inteligente',	'Prpostas das novidades e melhorias nos canais oferecidos pela emissora.', 	'05-09-2012');
INSERT INTO Projetos VALUES ( 'Dep03',	'8', 	'Atendimento + eficiente', 	'Descrição das novidades nos atendimentos, via internet ou não.', 	'03-07-2013');
INSERT INTO Projetos VALUES ( 'Dep02',	'9',	'Nova plataforma autoatendimento', 	'Descrição das plataformas de serviços disponíveis', 	'07-09-2014');
INSERT INTO Projetos VALUES ( 'Dep05', 	'10',	'Nova visão emissora', 'Descrção das novas tecnologias que serão implementadas pela emissora nos proximos 2 anos.', 	'02-11-2015');

/*	TABLE Funcionario
	CodEmi varchar(5),
	CodFunc smallint primary key,   
	Nome varchar(20) not null,
	Endereco varchar (100) not null,
	Telefones varchar(20), 
	Salario FLOAT DEFAULT 600, 
*/
INSERT INTO Funcionario VALUES ( '1010',	1,  'Joaquim Neto', 	'Emdereço: Rua Ituiutaba 436B, Bairro: Ns. Aparecida, Uberlandia MG Cep38.400-614', 	'03432081282', 	2000.00);	
INSERT INTO Funcionario VALUES ( '1010',	2,  'Maycon Silveira Lima', 	'Endereço: Rua Feliciano Moraes 245, Bairro: Ns. Aparecida, Uberlandia, MG Cep38.400-684', 	'03432891282',	1000.00);	
INSERT INTO Funcionario VALUES ( '1010',	3,  'Antonio Maciel Lemos', 	'Endereço: Rua Goncalves Dias 315, Bairro: Tabajaras, Uberlandia MG Cep38.400-288', 	'03432091272', 2500.00);	
INSERT INTO Funcionario VALUES ( '1010',	4,	'Joaquim Pereira Filho', 	'Endereço: Av. Jose Andraus Gassani 5685, Bairro: Distrito Industrial, Uberlandia MG Cep38.402-324',	'03432981283', 	2500.00);	
INSERT INTO Funcionario VALUES ( '1010',	5,  'Bruna Souza Rodrigues', 	'Endereço: Av. Firmamento 220, Bairro: Dom Almir, Uberlandia MG Cep38.407-027', 	'03432122922', 	2500.00);	
INSERT INTO Funcionario VALUES ( '1010', 	6,  'Caio Machado Caetano', 	'Endereço: Av. Salomao Abraao 1591, Bairro: Santa Monica, Uberlandia MG Cep38.408-160', 	 '03432091282', 	1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	7,  'Natalia Caetano Rodrigues', 	'Endereço: Rua Jose Carrijo 400, Bairro: Santa Monica, Uberlandia MG 38.408-238', 	'03432091283', 1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	8,  'Gabriel Gomes Neto', 	'Endereço: Rua Atilio Valentini 1278 Apto. 102, Bairro: Santa Monica, Uberlandia MG Ceep38.405-214', 	'03432289321', 	1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	9,  'Helvio Busmayer Franco', 	'Endereço: Rua Porongaba 721, Bairro: Lagoinha, Uberlandia MG Cep38.408-522', 	'03432873231', 	1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	10,  'Pablo Murilo Souza', 	'Endereço: Rua Barao de Ouro Preto 512, Bairro: Pampulha, Uberlandia MG Cep38.408-642', '03432127823', 	1500.00);	

INSERT INTO Funcionario VALUES ( '1010',	11,  'Anna Silveira Fontes', 	'Endereço: Rua das Ipomeias 55, Bairro: Cidade Jardim, Uberlandia MG Cep38.412-180', 	'03432327891', 	1830.00);	
INSERT INTO Funcionario VALUES ( '1010',	12,  'Marcos Moraes Lima', 	'Endereço: Rua das Acacias 514, Bairro: Cidade Jardim, Uberlandia MG Cep38.412-130', 	'03432563289', 	1830.00);	
INSERT INTO Funcionario VALUES ( '1010',	13,  'Jhonnas Paulo Barbosa', 	'Endereço: Rua Campos Sales 642, Bairro: Tubalina, Uberlandia MG Cep38.412-045', 	'03432192813', 	1830.00);	
INSERT INTO Funcionario VALUES ( '1010',	14,  'Lucas Lopes Ramos', 	'Endereço: Rua das Perobas 254, Bairro: Jaragua, Uberlandia MG Cep38.413-045', 	'03432817642', 	1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	16,  'Luiz Rocha Pinto', 	'Endereço: Rua Hercio Martins Gomide 156, Bairro: Jardim Patricia, Uberlandia MG Cep38.414-170', 	'03432923123', 	1500.00);	
INSERT INTO Funcionario VALUES ( '1010',	17,  'Gabriely Silva Melo', 	'Endereço: Rua Antonio Merola 77, Bairro: Luizote de Freitas, Uberlandia MG Cep38.413-398', 	'03432221232', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	18,  'Isabela Almeida Carvalho', 	'Endereço: Rua do Feirante 728, Bairro: Planalto, Uberlandia MG Cep38.413-153', 	'03499212873', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	19,  'Alice Sousa Ribeiro', 	'Endereço: Rua Matheus Vaz 1023, Bairro: Luizote de Freitas, Uberlandia MG Cep38.414-308', 	'03491238723', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	20,  'Rafaela Oliveira Sousa', 	'Endereço: Av. Ipe 387, Bairro: Jaragua, Uberlandia MG Cep38.413-015', 	'03492637162', 	1300.00);	

INSERT INTO Funcionario VALUES ( '1010',	 21, 	'Estevan Martins Souza',	'Endereço: Rua Diamante 392, Bairro: Jardim Patricia, Uberlandia MG Cep38.414-150',	'03432482714',	1720.00);	
INSERT INTO Funcionario VALUES ( '1010',	 22, 	'Otavio Rocha Melo',	'Endereço: Rua do Radio 543, Bairro: Dona Zulmira, Uberlandia MG Cep38.414-028',	'03432294821',	1720.00);	
INSERT INTO Funcionario VALUES ( '1010',	 23, 	'Marcelo Ribeiro Castro',	'Endereço: Rua Djanir Grama 236, Bairro: Luizote de Freitas, Uberlandia MG Cep38.414-312',	'03488712432',	2000.00);	
INSERT INTO Funcionario VALUES ( '1010',	 24, 	'Livia Alves Cardoso',	'Endereço: Rua Iguacu 1414, Bairro:  Umuarama, Uberlandia MG Cep38.405-326', 	'03488122324',	2100.00);	
INSERT INTO Funcionario VALUES ( '1010',	 25, 	'Raissa Ferreira Goncalves',	'Endereço: Rua Rio Grande do Norte 350 Apto 301, Bairro: Umuarama, Uberlandia MG Cep38.402-016',	'03496983213', 	2200.00);	
INSERT INTO Funcionario VALUES ( '1010',	 26, 	'Mateus Rodrigues Rocha',	'Endereço: Rua da Pitanga 224, Bairro: Pacaembu, Uberlandia MG Cep38.401-526',	'03498982132', 	1720.00);	
INSERT INTO Funcionario VALUES ( '1010',	 27, 	'Igor Ferreira Azevedo',	'Endereço: Rua Manuel Beckman  451, Bairro: Gramado	, Uberlandia MG Cep38.402-186',	'03432432124', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	 28, 	'Romeu Cunha Barros',	'Endereço: Rua Monteiro Lobato  687, Bairro: Minas Gerais, Uberlandia MG Cep38.402-178',	'03432498372', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	 29, 	'Joaquim Busmayer Franco',	'Endereço: Rua Miguel Barcha 113, Bairro: Marta Helena, Uberlandia MG Cep38.402-052',	'03432124389', 	1300.00);	
INSERT INTO Funcionario VALUES ( '1010',	 30, 	'Fernando Junqueira Barbosa',	'Endereço: Rua Ceara 800, Bairro: Custodio Pereira, Uberlandia MG Cep38.405-240',	'03432191918', 	1720.00);	
INSERT INTO Funcionario VALUES ( '1010',	 15,    'José Costa de Rezende',        'Endereço: Rua Atílio Valentini, Bairro: Santa Mônica, Uberlândia MG Cep38.408-214',    '03499699990',  2000.00);                

/*
TABLE Tecnicos 
#	CodFunc smallint,
#	Areas varchar(20) not null,
#	CodAutorizacao varchar(15),                 
#	CONSTRAINT Tecnicos_fk FOREIGN KEY (CodFunc)
#	REFERENCES Funcionario(CodFunc),
#	CONSTRAINT Tecnicos_pk PRIMARY KEY (CodFunc)
*/
INSERT INTO Tecnicos VALUES ( 1, 'Gestao Estrategica de Negocios', 'a001');
INSERT INTO Tecnicos VALUES ( 2, 'Logistica Empresarial', 'b001');
INSERT INTO Tecnicos VALUES ( 3, 'Seguranca do Trabalho', 'a010');
INSERT INTO Tecnicos VALUES ( 4, 'Redes e Telecomunicacoes', 'c001');
INSERT INTO Tecnicos VALUES ( 5, 'Redes e Telecomunicacoes', 'b010');
INSERT INTO Tecnicos VALUES ( 6, 'Marketing e Negocios', 'c010');
INSERT INTO Tecnicos VALUES ( 7, 'Marketing e Negocios', 'a100');
INSERT INTO Tecnicos VALUES ( 8, 'Redes e Telecomunicacoes', 'b100');
INSERT INTO Tecnicos VALUES ( 9, 'Transmissão', 'c100');
INSERT INTO Tecnicos VALUES (10, 'transmissão', 'a110');


/*
TABLE Produtores_Diretores 
#	CodFunc smallint,
#	Areas varchar(20) not null,
*/
INSERT INTO Produtores_Diretores VALUES (11, 'Redes e Telecomunicacoes');
INSERT INTO Produtores_Diretores VALUES (12, 'Marketing e Negocios');
INSERT INTO Produtores_Diretores VALUES (13, 'Marketing');
INSERT INTO Produtores_Diretores VALUES (14, 'Divulgação Noticias');      
INSERT INTO Produtores_Diretores VALUES (15, 'Seguranca do Trabalho');
INSERT INTO Produtores_Diretores VALUES (16, 'Marketing e NegociosNao possui');
INSERT INTO Produtores_Diretores VALUES (17, 'Transmissão');
INSERT INTO Produtores_Diretores VALUES (18, 'Marketing');
INSERT INTO Produtores_Diretores VALUES (19, 'Transmissão');
INSERT INTO Produtores_Diretores VALUES (20, 'Divulgação Noticias');				


/* TABLE Gestores_Administrativos 
#	CodFunc smallint,	
#	Setor varchar(20) not null,
*/
INSERT INTO GestoresAdministrativos VALUES (21, 'Redes e Seguranca');
INSERT INTO GestoresAdministrativos VALUES (22, 'Recursos Humanos');
INSERT INTO GestoresAdministrativos VALUES (23, 'Gestao de Tecnologia de Informacao');
INSERT INTO GestoresAdministrativos VALUES (24, 'Banco de Dados');
INSERT INTO GestoresAdministrativos VALUES (25, 'Redes e Seguranca');
INSERT INTO GestoresAdministrativos VALUES (26, 'Banco de Dados');
INSERT INTO GestoresAdministrativos VALUES (27, 'Divulgação News');
INSERT INTO GestoresAdministrativos VALUES (28, 'Publicidade e propaganda');
INSERT INTO GestoresAdministrativos VALUES (29, 'Publicidade e propaganda');
INSERT INTO GestoresAdministrativos VALUES (30, 'Banco de Dados');


/* TABLE Dependentes 
#	CodFunc smallint,
# 	Nome varchar(20) not null,
#	Sexo varchar (1) not null, 
#	DataNascimento date,   				
*/
INSERT INTO Dependentes VALUES(1 , 'Maria Clara Neves',	        'F',    '24-03-2004');
INSERT INTO Dependentes VALUES(2 , 'Gabriel Rosa da Silva',	'M',	'10-08-2000');
INSERT INTO Dependentes VALUES(3 , 'Nicholas Garcia Sousa',	'M',	'07-09-2009');
INSERT INTO Dependentes VALUES(4 , 'Matheus Gomes Rezende',	'M',	'31-07-1999');
INSERT INTO Dependentes VALUES(5 , 'Kauanne Goncalves Peres',	'F',	'22-11-2005');
INSERT INTO Dependentes VALUES(6 , 'Eduardo Jaco Pereira',	'M', 	'05-12-2002');
INSERT INTO Dependentes VALUES(7 , 'Caio Eduardo Cunha'	,       'M', '26-02-2007');
INSERT INTO Dependentes VALUES(8 , 'Marianne Eduarda Martins',	'F',	'26-02-2013');
INSERT INTO Dependentes VALUES(9 , 'Deborah Cristina Araujo',	'F',	'24-03-2004');
INSERT INTO Dependentes VALUES(10, 'Joao Pedro Neto',	'M', 	'02-02-2015');


/* TABLE Trabalham	
	CodDep varchar(5) not null,
	CodFunc smallint,
*/
INSERT INTO Trabalham VALUES('Dep01', 1);
INSERT INTO Trabalham VALUES('Dep02' ,2);
INSERT INTO Trabalham VALUES('Dep03' ,3);
INSERT INTO Trabalham VALUES('Dep04' ,4);
INSERT INTO Trabalham VALUES('Dep05' ,5);
INSERT INTO Trabalham VALUES('Dep06' ,6);
INSERT INTO Trabalham VALUES('Dep07' ,7);
INSERT INTO Trabalham VALUES('Dep08' ,8);
INSERT INTO Trabalham VALUES('Dep09' ,9);
INSERT INTO Trabalham VALUES('Dep10',10);

INSERT INTO Trabalham VALUES('Dep10',11);
INSERT INTO Trabalham VALUES('Dep09' ,12);
INSERT INTO Trabalham VALUES('Dep08' ,13);
INSERT INTO Trabalham VALUES('Dep07' ,14);
INSERT INTO Trabalham VALUES('Dep06' ,15);
INSERT INTO Trabalham VALUES('Dep05' ,16);
INSERT INTO Trabalham VALUES('Dep04' ,17);
INSERT INTO Trabalham VALUES('Dep03' ,18);
INSERT INTO Trabalham VALUES('Dep02' ,19);
INSERT INTO Trabalham VALUES('Dep01' ,20);

INSERT INTO Trabalham VALUES('Dep01' ,21);
INSERT INTO Trabalham VALUES('Dep02' ,22);
INSERT INTO Trabalham VALUES('Dep03' ,23);
INSERT INTO Trabalham VALUES('Dep04' ,24);
INSERT INTO Trabalham VALUES('Dep05' ,25);
INSERT INTO Trabalham VALUES('Dep06' ,26);
INSERT INTO Trabalham VALUES('Dep07' ,27);
INSERT INTO Trabalham VALUES('Dep08' ,28);
INSERT INTO Trabalham VALUES('Dep09' ,29);
INSERT INTO Trabalham VALUES('Dep10' ,30);


/*  TABLE ServicosCanalTV 
#	CodEmi varchar(5),
#	NumCanal smallint,
#	NomeCanal varchar(20),
#	InfoCanal varchar(20),	
*/
INSERT INTO ServicosCanalTV VALUES ( '1010',	1,	'Tv Escola',	'Informativo, educativo');
INSERT INTO ServicosCanalTV VALUES ( '1010',	2,	'SBT', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	3,	'Tv Brasil', 	'Informacoes variadas sobre o Brasil');
INSERT INTO ServicosCanalTV VALUES ( '1010',	4,	'Rede Tv', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	5,	'Polishop Tv', 	'Marketing e vendas');
INSERT INTO ServicosCanalTV VALUES ( '1010',	6,	'Canal Boi', 	'Negoscios agropecuarios');
INSERT INTO ServicosCanalTV VALUES ( '1010',	7,	'Rit Tv', 'Evangelistico');
INSERT INTO ServicosCanalTV VALUES ( '1010',	8,	'Globo', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	9,	'Band Tv', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	10,	'Record', 	'Variados e entretenimento');

INSERT INTO ServicosCanalTV VALUES ( '1010',	11, 'Band Triangulo', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	12, 'Rede Vida', 	'Catolicista');
INSERT INTO ServicosCanalTV VALUES ( '1010',	13, 'Vitoriosa SBT', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	14, 'Paranaiba Record', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	15, 'Integraçao Globo', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	16, 'Tv Camara', 	'Camara dos veriadores');   
INSERT INTO ServicosCanalTV VALUES ( '1010',	17, 'Rede Minas', 	'Entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	18, 'Rede Tv', 	'Variados e entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	19, 'Record News', 	'Noticiario');
INSERT INTO ServicosCanalTV VALUES ( '1010',	20, 'Globo NewS', 	'Noticiario');

INSERT INTO ServicosCanalTV VALUES ( '1010',	21, '24Kitchen', 	'Culinaria');
INSERT INTO ServicosCanalTV VALUES ( '1010',	22, 'A&E', 	'Entretenimento e filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	23, 'Animal Planet', 	'Natureza e animais');
INSERT INTO ServicosCanalTV VALUES ( '1010',	24, 'Boomerang',	'Teen');
INSERT INTO ServicosCanalTV VALUES ( '1010',	25, 'Cartoon Network',	'Infantil');
INSERT INTO ServicosCanalTV VALUES ( '1010',	26, 'Cinemax', 	'Filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	27, 'Discovery HD',	'Discovery channel hd entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	28, 'Discovery Home & Health',	'Entretenimento, bem estar, beleza e casa');
INSERT INTO ServicosCanalTV VALUES ( '1010',	29, 'Discovery Kids',	'Infantil');
INSERT INTO ServicosCanalTV VALUES ( '1010',	30, 'Discovery Travel & Living',	'Entretenimento, esportes, culinaria ');
INSERT INTO ServicosCanalTV VALUES ( '1010',	31, 'Discovery Turbo',	'Entretenimento automóveis');
INSERT INTO ServicosCanalTV VALUES ( '1010',	32, 'Disney Channel',	'Teen');
INSERT INTO ServicosCanalTV VALUES ( '1010',	33, 'ESPN',	'Esportivo internacional');
INSERT INTO ServicosCanalTV VALUES ( '1010',	34, 'Esporte Iterativo',	'Esportivo nacional');
INSERT INTO ServicosCanalTV VALUES ( '1010',	35, 'CNN',	'Noticiario');
INSERT INTO ServicosCanalTV VALUES ( '1010',	36, 'Fashion Tv',	'Moda');
INSERT INTO ServicosCanalTV VALUES ( '1010',	37,	'FX',	'Entretenimento e filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	38,	'Megapix',	'Entretenimento e filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	39, 'Nickelodeon',	'Teen');
INSERT INTO ServicosCanalTV VALUES ( '1010',	40,	'Sony Entertainment Television', 	'Entretenimento');
INSERT INTO ServicosCanalTV VALUES ( '1010',	41, 'Studio Universal',	'Filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	42, 'Telecine Action',	'Filmes _açao');
INSERT INTO ServicosCanalTV VALUES ( '1010',	43,	'Telecine Cult',	'Filmes _classicos, tematicos e raros');
INSERT INTO ServicosCanalTV VALUES ( '1010',	44,	'Telecine Fun', 	'Filmes _romance, comedia e animaçoes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	45,	'Telecine Pipoca', 	'Filmes _todos dublados');
INSERT INTO ServicosCanalTV VALUES ( '1010',	46, 'Telecine Premium', 	'Filmes _lançamentos ou sucessos');
INSERT INTO ServicosCanalTV VALUES ( '1010',	47, 'Telecine Touch', 	'Filmes _emoçao');
INSERT INTO ServicosCanalTV VALUES ( '1010',	48,	'VH1', 	'Entretenimento e musica');
INSERT INTO ServicosCanalTV VALUES ( '1010',	49,	'Warner Chanel', 	'Entretenimento e filmes');
INSERT INTO ServicosCanalTV VALUES ( '1010',	50,	'Woohoo', 	'Viajens');


/*	TABLE CanalAnalogico 
#	NumCanal varchar(5),
#	Frequencia smallint,			
#	CONSTRAINT CanalA_fk1 FOREIGN KEY (NumCanal)
#	REFERENCES ServicosCanalTV(NumCanal),
#  CONSTRAINT CanalAnalogicopk PRIMARY KEY (NumCanal)
*/
INSERT INTO CanalAnalogico VALUES (	1, 1380 );
INSERT INTO CanalAnalogico VALUES ( 2, 1416 );
INSERT INTO CanalAnalogico VALUES (	3, 1400 );
INSERT INTO CanalAnalogico VALUES ( 4, 1360 );
INSERT INTO CanalAnalogico VALUES (	5, 1300 );
INSERT INTO CanalAnalogico VALUES ( 6, 1280 );
INSERT INTO CanalAnalogico VALUES (	7, 1140 );
INSERT INTO CanalAnalogico VALUES ( 8, 1430 );
INSERT INTO CanalAnalogico VALUES (	9, 1340 );
INSERT INTO CanalAnalogico VALUES (	10, 1296 );

/* TABLE CanalDigital 
#	NumCanal varchar(5),
#	CONSTRAINT CanalA_fk FOREIGN KEY (NumCanal)
#	REFERENCES ServicosCanalTv(NumCanal),
#  CONSTRAINT CanalA_pk PRIMARY KEY (NumCanal)
*/
INSERT INTO CanalDigital  VALUES ( 11);
INSERT INTO CanalDigital  VALUES ( 12);
INSERT INTO CanalDigital  VALUES ( 13);
INSERT INTO CanalDigital  VALUES ( 14);
INSERT INTO CanalDigital  VALUES ( 15);
INSERT INTO CanalDigital  VALUES ( 16);
INSERT INTO CanalDigital  VALUES ( 17);
INSERT INTO CanalDigital  VALUES ( 18);
INSERT INTO CanalDigital  VALUES ( 19);
INSERT INTO CanalDigital  VALUES ( 20);

/* TABLE CanalAssinatura 
#	NumCanal varchar(5),
*/ 

INSERT INTO CanalAssinatura VALUES ( 21);
INSERT INTO CanalAssinatura VALUES ( 22);
INSERT INTO CanalAssinatura VALUES ( 23);
INSERT INTO CanalAssinatura VALUES ( 24);
INSERT INTO CanalAssinatura VALUES ( 25);
INSERT INTO CanalAssinatura VALUES ( 26);
INSERT INTO CanalAssinatura VALUES ( 27);
INSERT INTO CanalAssinatura VALUES ( 28);
INSERT INTO CanalAssinatura VALUES ( 29);
INSERT INTO CanalAssinatura VALUES ( 30);
INSERT INTO CanalAssinatura VALUES ( 31);
INSERT INTO CanalAssinatura VALUES ( 32);
INSERT INTO CanalAssinatura VALUES ( 33);
INSERT INTO CanalAssinatura VALUES ( 34);
INSERT INTO CanalAssinatura VALUES ( 35);
INSERT INTO CanalAssinatura VALUES ( 36);
INSERT INTO CanalAssinatura VALUES ( 37);
INSERT INTO CanalAssinatura VALUES ( 38);
INSERT INTO CanalAssinatura VALUES ( 39);
INSERT INTO CanalAssinatura VALUES ( 40);
INSERT INTO CanalAssinatura VALUES ( 41);
INSERT INTO CanalAssinatura VALUES ( 42);
INSERT INTO CanalAssinatura VALUES ( 43);
INSERT INTO CanalAssinatura VALUES ( 44);
INSERT INTO CanalAssinatura VALUES ( 45);
INSERT INTO CanalAssinatura VALUES ( 46);
INSERT INTO CanalAssinatura VALUES ( 47);
INSERT INTO CanalAssinatura VALUES ( 48);
INSERT INTO CanalAssinatura VALUES ( 49);
INSERT INTO CanalAssinatura VALUES ( 50);


/*	TABLE Cliente 
#	CodEmi varchar(5),
#	CodCli varchar(5),
#	NomeCli varchar(20) not null,
#	Endereco varchar(100),
#	Telefones varchar(20),
*/
INSERT INTO Cliente VALUES ( '1010',	'C005', 	'Guilherme', 	'Endereço: Rua Ceara 344, Bairro: Custodio Pereira, Uberlandia MG Cep38.405-240', 	'03493335353');
INSERT INTO Cliente VALUES ( '1010',	'C002', 	'Joao', 	'Endereço: Rua Piaui 877, Bairro: Umuarama, Uberlandia MG Cep38.405-317', 	'03496320342' );
INSERT INTO Cliente VALUES ( '1010',	'C003', 	'Maria', 	'Endereço: Rua da Amora 312, Bairro: Pacaembu, Uberlandia MG Cep38.401-532', 	'03432225479' );
INSERT INTO Cliente VALUES ( '1010',	'C004', 	'Leticia', 	'Endereço: Rua da Bandeira 760, Bairro: Tibery, Uberlandia MG Cep38.405-174', 	'03488425464' );
INSERT INTO Cliente VALUES ( '1010',	'C001', 	'Jessica', 	'Endereço: Rua Carneiro 150, Bairro: Bom Jesus, Uberlandia MG Cep38.400-627', 	'03491929394' );
INSERT INTO Cliente VALUES ( '1010',	'C006', 	'Silvio', 	'Endereço: Rua Pedro Quirino da Silva 1951 Apto 203, Bairro: Umuarama Uberlandia MG Cep38.405-323', 	'03492347575' );
INSERT INTO Cliente VALUES ( '1010',	'C007', 	'Geraldo', 	'Endereço: Rua Manoel Ascenco Batista 1246, Bairro: Santa Monica, Uberlandia MG Cep38.402-292', 	'03432119082' );
INSERT INTO Cliente VALUES ( '1010',	'C008', 	'Mariano', 	'Endereço: Rua Primavera 47, Bairro: Sao Joao, Araguari MG Cep38.443-056', 		'03491649082' );
INSERT INTO Cliente VALUES ( '1010',	'C009', 	'Jaqueline', 	'Endereço: Rua Tupaciguara 490, Bairro: Miranda, Araguari MG Cep38.444-254', 	'03432645263' );
INSERT INTO Cliente VALUES ( '1010',	'C0010', 	'Aderbaldo', 	'Endereço: Rua Dr. Ciro Palmerston 179 Apto 102, Bairro: Santo Antonio, Araguari MG Cep38.443-010', 	'03499920823' );
INSERT INTO Cliente VALUES ( '1010',	'C0011', 	'Silva Criz', 	'Endereço: Av. Jose Andraus Gassani 5464, Bairro: Distrito Industrial, Uberlandia MG Cep38.402-324', 	'03432188200' );
INSERT INTO Cliente VALUES ( '1010',	'C0012', 	'Lemon Heavy', 	'Endereço: Rua Vigario Dantas 75, Bairro; Centro, Uberlandia MG Cep38.400-202',	 '03432320222' );
INSERT INTO Cliente VALUES ( '1010',	'C0013', 	'Narteens', 	'Endereço: Rua Jatai 1150, Bairro: Aparecida, Uberlandia MG Cep38.400-679', 	'03432105479' );
INSERT INTO Cliente VALUES ( '1010',	'C0014', 	'Alimentos Pizzaicos', 	'Endereço: Rua Geraldo Moreira e Silva 364, Bairro: Distrito Industrial, Uberlandia MG Cep38.405-000', 	'03432304455' );
INSERT INTO Cliente VALUES ( '1010',	'C0015', 	'Tecidos Cheirosos', 	'Endereço: Rua Ignez Favato 257, Bairro: Distrito Industrial, Uberlandia MG Cep38.402-340', 	'03432116921' );


/*	
TABLE Assinam
	CodCli varchar(5),
	NumCanal  smallint,
	DuracaoContrato varchar(10),
*/
INSERT INTO Assinam VALUES('C001', 21, '6 meses');
INSERT INTO Assinam VALUES('C001', 22, '6 meses');
INSERT INTO Assinam VALUES('C001', 23, '1 ano');
INSERT INTO Assinam VALUES('C002', 24, '1 ano');
INSERT INTO Assinam VALUES('C002', 42, '6 meses');
INSERT INTO Assinam VALUES('C002', 47, '6 meses');
INSERT INTO Assinam VALUES('C002', 48, '6 meses');
INSERT INTO Assinam VALUES('C002', 49, '6 meses');
INSERT INTO Assinam VALUES('C003', 24, '1 ano');
INSERT INTO Assinam VALUES('C003', 26, '1 ano');
INSERT INTO Assinam VALUES('C003', 25, '1 ano');
INSERT INTO Assinam VALUES('C004', 33, '6 meses');
INSERT INTO Assinam VALUES('C004', 34, '6 meses');
INSERT INTO Assinam VALUES('C004', 35, '6 meses');
INSERT INTO Assinam VALUES('C005', 49, '5 meses');
INSERT INTO Assinam VALUES('C005', 50, '5 meses');
INSERT INTO Assinam VALUES('C005', 22, '5 meses');
INSERT INTO Assinam VALUES('C006', 27, '2 anos');
INSERT INTO Assinam VALUES('C006', 28, '2 anos');
INSERT INTO Assinam VALUES('C006', 29, '2 anos');
INSERT INTO Assinam VALUES('C006', 30, '2 anos');
INSERT INTO Assinam VALUES('C007', 21, '6 meses');
INSERT INTO Assinam VALUES('C007', 36, '6 meses');
INSERT INTO Assinam VALUES('C008', 40, '4 meses');
INSERT INTO Assinam VALUES('C008', 39, '4 meses');
INSERT INTO Assinam VALUES('C009', 26, '2 meses');
INSERT INTO Assinam VALUES('C009', 32, '2 meses');
INSERT INTO Assinam VALUES('C009', 33, '2 meses');
INSERT INTO Assinam VALUES('C0010', 34, '1 ano e 2 meses');
INSERT INTO Assinam VALUES('C0010', 35, '1 ano e 2 meses');
INSERT INTO Assinam VALUES('C0010', 37, '1 ano e 2 meses');


