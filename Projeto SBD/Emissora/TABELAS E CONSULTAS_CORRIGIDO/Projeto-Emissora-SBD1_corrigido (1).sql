/*#Projeto Emissora SBD
#
#Nomes: Jessiane Gomes
#		José Victor Pereira
#		Laíz Silveira
#
#Criação do esquema e das tabelas
#*/

DROP SCHEMA IF EXISTS RAGLA CASCADE;
CREATE SCHEMA Emissora;
SET search_path TO Emissora;

/*#Obs.: usei um padrão de "tipo de dados" e tamanho dos vetores tmb
#Tabelas entidades[] :*/

CREATE TABLE Emissora(
	CodEmi varchar(10) primary key,

	Nome varchar(40) not null,
	Endereco varchar (200) not null
);

/*emissora eh dividida em departamentos  ----------------------------apagar depois */

CREATE TABLE Departamentos(
	CodEmi  varchar(10),
	CodDep  varchar(10) primary key,

	NomeDep varchar (40) not null,
	InfoDep varchar(200) not null,

	CONSTRAINT Projetos_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi)

);

/*1 departamento é responsável por n proetos   ----------------------------------------*/

CREATE TABLE Projetos(
	CodDep  varchar(10),
	CodProj varchar (10) primary key,

	Nome varchar(40) not null,
	InfoProj varchar (200) not null,
	Data date not null,

	CONSTRAINT Projetos_fk FOREIGN KEY (CodDep)
	REFERENCES Departamentos(CodDep)

);

/*1 emissora contrata n funcionarios   ------------------------------------------------------  */

CREATE TABLE Funcionario(
	CodEmi varchar(10),
	CodFunc smallint primary key,    /*#troquei para um smallint*/

	Nome varchar(40) not null,
	Endereco varchar (200) not null,
	Telefones varchar(40),
	Salario FLOAT DEFAULT 600,        /*#adicionei este campo*/

	CONSTRAINT Emissoraffk FOREIGN KEY(CodEmi)
	REFERENCES Emissora(CodEmi)
);

CREATE TABLE Tecnicos (
	CodFunc smallint,

	Areas varchar(40) not null,
	CodAutorizacao varchar(15),     /*#alterie para CadAutorização*/

	CONSTRAINT Tecnicos_fk FOREIGN KEY (CodFunc)
	REFERENCES Funcionario(CodFunc),
	CONSTRAINT Tecnicos_pk PRIMARY KEY (CodFunc)
);

CREATE TABLE Produtores_Diretores (
	CodFunc smallint,
	Areas varchar(40) not null,

	CONSTRAINT Produtores_Diretores_fk FOREIGN KEY (CodFunc)
	REFERENCES Funcionario(CodFunc),
	CONSTRAINT Produtores_Diretores_pk PRIMARY KEY (CodFunc)
);

CREATE TABLE GestoresAdministrativos (
	CodFunc smallint,

	Setor varchar(40) not null,

	CONSTRAINT GestoreasAdministrativos_fk FOREIGN KEY (CodFunc)
	REFERENCES Funcionario(CodFunc),
	CONSTRAINT GestoreasAdministrativo_pk PRIMARY KEY (CodFunc)
);

CREATE TABLE Dependentes (
	CodFunc smallint,

	Nome varchar(40) not null,
	Sexo varchar (2) not null,
	DataNascimento date,     /*#tirei idade e o relacao*/

	CONSTRAINT Dependentes_fk FOREIGN KEY (CodFunc)
	REFERENCES Funcionario(CodFunc),
	CONSTRAINT Dependentes_pk PRIMARY KEY (CodFunc,Nome)
);


CREATE TABLE Trabalham(

	CodDep varchar(10) not null,
	CodFunc smallint not null,

	CONSTRAINT Trabalham_fk1 FOREIGN KEY(CodDep)
	REFERENCES Departamentos(CodDep),

	CONSTRAINT Trabalham_fk FOREIGN KEY(CodFunc)
	REFERENCES Funcionario(CodFunc),

	CONSTRAINT RealizadosPK PRIMARY KEY(CodFunc,CodDep)


);


CREATE TABLE ServicosCanalTV (
	CodEmi varchar(10),

	NumCanal smallint,
	NomeCanal varchar(40),
	InfoCanal varchar(40),


	CONSTRAINT ServicosCanalTV_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi),

	CONSTRAINT ServicosCanalTV_pk PRIMARY KEY (NumCanal)
);



CREATE TABLE CanalAnalogico (
	NumCanal smallint,
	Frequencia smallint,    /*#add frequencia    baseado em:    http://www.te1.com.br/2010/07/canais-parabolica-banda-c*/

	CONSTRAINT CanalA_fk1 FOREIGN KEY (NumCanal)
	REFERENCES ServicosCanalTV(NumCanal),
   CONSTRAINT CanalAnalogicopk PRIMARY KEY (NumCanal)
);


CREATE TABLE CanalDigital (
	NumCanal smallint,

	CONSTRAINT CanalA_fk FOREIGN KEY (NumCanal)
	REFERENCES ServicosCanalTv(NumCanal),
   CONSTRAINT CanalA_pk PRIMARY KEY (NumCanal)
);


CREATE TABLE CanalAssinatura (   /*#alterei o nome*/
		NumCanal smallint,

	CONSTRAINT CanalA_fk FOREIGN KEY (NumCanal)
	REFERENCES ServicosCanalTv(NumCanal),
   CONSTRAINT CanalAcabo_pk PRIMARY KEY (NumCanal)
);



CREATE TABLE Cliente (        /* # tabela cliente -----------------------------------------------------------------------*/
	CodEmi varchar(10),
	CodCli varchar(10),

	NomeCli varchar(40) not null,
	Endereco varchar(200) not null,
	Telefones varchar(40) not null,



	CONSTRAINT Clientes_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi),
	CONSTRAINT Clientes_pk PRIMARY KEY (CodCli)
);




/*#saber o valor dos canais q eles assinam ... podem assinar mais de um canal... como saber o valor total depois?*/

CREATE TABLE Assinam(
	CodCli varchar(10),
	NumCanal  smallint,

	DuracaoContrato varchar(20),

	CONSTRAINT Assinam_fk1 FOREIGN KEY(NumCanal)
	REFERENCES ServicosCanalTV(NumCanal),

	CONSTRAINT Assinam_fk2 FOREIGN KEY(CodCli)
	REFERENCES Cliente(CodCli),

	CONSTRAINT Assinam_pk3 PRIMARY KEY(CodCli,NumCanal)

);
