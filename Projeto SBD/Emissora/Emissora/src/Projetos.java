import java.sql.Date;

/*
 * CREATE TABLE Projetos(
	CodDep  varchar(10),
	CodProj varchar (10) primary key,

	Nome varchar(40) not null,
	InfoProj varchar (200) not null,
	Data date not null,

	CONSTRAINT Projetos_fk FOREIGN KEY (CodDep)
	REFERENCES Departamentos(CodDep)

);

 */

public class Projetos {

	private String CodDep;
	private String CodProj;
	private String Nome;
	private String InfoProj;
	private Date Data;
	
	public Projetos(){
		
	}
	
	public Projetos(String CodD, String CodP, String Nome, String Info, Date Data){
		
		this.CodDep = CodD;
		this.CodProj = CodP;
		this.Nome = Nome;
		this.InfoProj = Info;
		this.Data = Data;
		
	}
	
	public String getCodDep() {
		return CodDep;
	}
	public void setCodDep(String codDep) {
		CodDep = codDep;
	}
	public String getCodProj() {
		return CodProj;
	}
	public void setCodProj(String codProj) {
		CodProj = codProj;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getInfoProj() {
		return InfoProj;
	}
	public void setInfoProj(String infoProj) {
		InfoProj = infoProj;
	}
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	
}
