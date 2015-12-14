import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDB {

	public void insereCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
		
		//INSERT INTO Cliente VALUES ( '1010',	'C005', 	'Guilherme', 	'Endereço: Rua Ceara 344, Bairro: Custodio Pereira, Uberlandia MG Cep38.405-240', 	'03493335353');
	
		String sql = "Insert into Cliente values(?,?,?,?,?)";
		
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		
		ps.setString(1, objCliente.getCodEmi());
		ps.setString(2, objCliente.getCodCli());
		ps.setString(3, objCliente.getNomeCli());
		ps.setString(4,objCliente.getEndereco());
		ps.setString(5,objCliente.getTelefones());
		
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}
	
	public List<Cliente> listarCliente() throws ClassNotFoundException, SQLException{
		
		List<Cliente> lstCliente = new ArrayList<Cliente>();
		String sql =  "SELECT * FROM Cliente;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Cliente objCliente = new Cliente();
			
			objCliente.setCodEmi(rs.getString("CodEmi"));
			objCliente.setCodCli(rs.getString("CodCli"));
			objCliente.setNomeCli(rs.getString("NomeCli"));
			objCliente.setEndereco(rs.getString("Endereco"));
			objCliente.setTelefones(rs.getString("Telefones"));
			
			lstCliente.add(objCliente);		
		}
		ps.close();
		Conexao.connection().close();
		return lstCliente;
	}
}
