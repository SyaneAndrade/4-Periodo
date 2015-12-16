import java.sql.Date;

/*
  CREATE TABLE Dependentes (
	CodFunc smallint,

	Nome varchar(40) not null,
	Sexo varchar (2) not null,
	DataNascimento date,     #tirei idade e o relacao

	CONSTRAINT Dependentes_fk FOREIGN KEY (CodFunc)
	REFERENCES Funcionario(CodFunc),
	CONSTRAINT Dependentes_pk PRIMARY KEY (CodFunc,Nome)
);
 */
public class Dependente {
	
	private int CodFunc;
	
	private String Nome;
	private String Sexo;
	private Date DataNascimento;
	
	public Dependente(){
		
	}
	
	public Dependente(String Nome, String Sexo, Date Nasc, int Cod){
		
		this.Nome = Nome;
		this.Sexo = Sexo;
		this.DataNascimento = Nasc;
		this.CodFunc = Cod;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Date date) {
		DataNascimento = date;
	}

	public int getCodFunc() {
		return CodFunc;
	}

	public void setCodFunc(int codFunc) {
		CodFunc = codFunc;
	}

}
