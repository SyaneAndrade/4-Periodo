/*
 * CREATE TABLE Cliente (         # tabela cliente -----------------------------------------------------------------------
	CodEmi varchar(10),
	CodCli varchar(10),

	NomeCli varchar(40) not null,
	Endereco varchar(200) not null,
	Telefones varchar(40) not null,



	CONSTRAINT Clientes_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi),
	CONSTRAINT Clientes_pk PRIMARY KEY (CodCli)
);
 */
public class Cliente {
	
	private String CodEmi;
	private String CodCli;
	private String NomeCli;
	private String Endereco;
	private String Telefones;
	
	public Cliente(){
		
	}
	
	public Cliente(String CodE, String CodC, String Nome, String Endereco, String Tel){
		this.setCodEmi(CodE);
		this.setCodCli(CodC);
		this.setNomeCli(Nome);
		this.setEndereco(Endereco);
		this.setTelefones(Tel);
	}

	public String getCodEmi() {
		return CodEmi;
	}

	public void setCodEmi(String codEmi) {
		CodEmi = codEmi;
	}

	public String getCodCli() {
		return CodCli;
	}

	public void setCodCli(String codCli) {
		CodCli = codCli;
	}

	public String getNomeCli() {
		return NomeCli;
	}

	public void setNomeCli(String nomeCli) {
		NomeCli = nomeCli;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTelefones() {
		return Telefones;
	}

	public void setTelefones(String telefones) {
		Telefones = telefones;
	}

}
