/*
 * CREATE TABLE Departamentos(
	CodEmi  varchar(10),
	CodDep  varchar(10) primary key,

	NomeDep varchar (40) not null,
	InfoDep varchar(200) not null,

	CONSTRAINT Projetos_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi)

);
 */

public class Departamentos {
	private String CodEmi;
	private String CodDep;
	private String NomeDep;
	private String InfoDep;
	
	public Departamentos(){
		
	}
	
	public Departamentos(String CodE, String CodD,String Nome, String Info){
		
		this.CodEmi = CodE;
		this.CodDep = CodD;
		this.NomeDep = Nome;
		this.InfoDep = Info;
		
	}
	public String getCodDep() {
		return CodDep;
	}
	public void setCodDep(String codDep) {
		CodDep = codDep;
	}
	public String getCodEmi() {
		return CodEmi;
	}
	public void setCodEmi(String codEmi) {
		CodEmi = codEmi;
	}
	public String getNomeDep() {
		return NomeDep;
	}
	public void setNomeDep(String nomeDep) {
		NomeDep = nomeDep;
	}
	public String getInfoDep() {
		return InfoDep;
	}
	public void setInfoDep(String infoDep) {
		InfoDep = infoDep;
	}

}
