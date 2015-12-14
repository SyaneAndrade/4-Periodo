/*
 * 
CREATE TABLE ServicosCanalTV (
	CodEmi varchar(10),

	NumCanal smallint,
	NomeCanal varchar(40),
	InfoCanal varchar(40),


	CONSTRAINT ServicosCanalTV_fk FOREIGN KEY (CodEmi)
	REFERENCES Emissora(CodEmi),

	CONSTRAINT ServicosCanalTV_pk PRIMARY KEY (NumCanal)
);

 */
public class ServicosCanalTV {
	private String CodEmi;
	private int NumCanal;
	private String NomeCanal;
	private String InfoCanal;
	
	public ServicosCanalTV(){
		
	}
	
	public ServicosCanalTV(String CodEmi, int NumCanal, String NomeCanal, String InfoCanal){
		this.CodEmi = CodEmi;
		this.NumCanal = NumCanal;
		this.NomeCanal = NomeCanal;
		this.InfoCanal = InfoCanal;
	}
	
	public String getCodEmi() {
		return CodEmi;
	}
	public void setCodEmi(String codEmi) {
		CodEmi = codEmi;
	}
	public int getNumCanal() {
		return NumCanal;
	}
	public void setNumCanal(int numCanal) {
		NumCanal = numCanal;
	}
	public String getNomeCanal() {
		return NomeCanal;
	}
	public void setNomeCanal(String nomeCanal) {
		NomeCanal = nomeCanal;
	}
	public String getInfoCanal() {
		return InfoCanal;
	}
	public void setInfoCanal(String infoCanal) {
		InfoCanal = infoCanal;
	}
}
