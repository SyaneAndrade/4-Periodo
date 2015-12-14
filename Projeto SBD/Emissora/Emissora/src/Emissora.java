/*
 * CREATE TABLE Emissora(
	CodEmi varchar(10) primary key,

	Nome varchar(40) not null,
	Endereco varchar (200) not null
);
 */
public class Emissora {
	private String CodEmi;
	private String Nome;
	private String Endereco;
	
	public Emissora(){
		
	}
	
	public Emissora(String Cod, String Nome, String Endereco){
		this.CodEmi = Cod;
		this.Nome = Nome;
		this.Endereco = Endereco;
	}
	public String getCodEmi() {
		return CodEmi;
	}
	public void setCodEmi(String codEmi) {
		CodEmi = codEmi;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
}
