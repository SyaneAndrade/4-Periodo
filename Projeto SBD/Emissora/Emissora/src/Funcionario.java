/*
CREATE TABLE Funcionario(
	CodEmi varchar(10),
	CodFunc smallint primary key,    #troquei para um smallint

	Nome varchar(40) not null,
	Endereco varchar (200) not null,
	Telefones varchar(40),
	Salario FLOAT DEFAULT 600,        #adicionei este campo

	CONSTRAINT Emissoraffk FOREIGN KEY(CodEmi)
	REFERENCES Emissora(CodEmi)
);
*/

public class Funcionario {
	
	private String CodEmi;
	private int CodFunc;
	
	private String Nome;
	private String Endereco;
	private String Telefone;
	private float Salario;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String Emi, int Cod, String Nome, String Endereco, String Telefone, float Sal){
		
		this.CodEmi = Emi;
		this.CodFunc = Cod;
		this.Nome = Nome;
		this.setEndereco(Endereco);
		this.Telefone = Telefone;
		this.Salario = Sal;
	}

	
	public String getCodEmi() {
		return CodEmi;
	}

	public void setCodEmi(String codEmi) {
		CodEmi = codEmi;
	}

	public int getCodFunc() {
		return CodFunc;
	}

	public void setCodFunc(int codFunc) {
		CodFunc = codFunc;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
}
