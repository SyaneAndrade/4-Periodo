import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmissoraDB {
	
	public List<Emissora> listarEmissora() throws ClassNotFoundException, SQLException{
			
			List<Emissora> lstEmissora = new ArrayList<Emissora>();
			String sql =  "SELECT * FROM Emissora;";
			PreparedStatement ps = Conexao.connection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				
				Emissora objEmissora = new Emissora();
				
				objEmissora.setCodEmi(rs.getString("CodEmi"));
				objEmissora.setNome(rs.getString("Nome"));
				objEmissora.setEndereco(rs.getString("Endereco"));
				
				lstEmissora.add(objEmissora);
					
			}
			ps.close();
			Conexao.connection().close();
			return lstEmissora;
		}

}
