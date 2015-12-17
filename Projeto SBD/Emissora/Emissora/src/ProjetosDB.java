import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProjetosDB {
	
	public void insereProjetos(Projetos objProjetos) throws ClassNotFoundException, SQLException {
		//INSERT INTO Projetos VALUES ( 'Dep09',	'1',	'Rede Nova',	'Descrições e explicação da nova rede disponével para transmissão da emissora.', 	'03-07-1999');	
		String sql = "Insert into Projetos values(?,?,?,?,?)";
		
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		
		ps.setString(1,objProjetos.getCodDep());
		ps.setString(2,objProjetos.getCodProj());
		ps.setString(3, objProjetos.getNome());
		ps.setString(4,objProjetos.getInfoProj());
		ps.setDate(4, objProjetos.getData());
		
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}
	
	public List<Projetos> listarProjetos() throws ClassNotFoundException, SQLException{
		
		List<Projetos> lstProjetos = new ArrayList<Projetos>();
		String sql =  "SELECT * FROM Projetos;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Projetos objProjetos = new Projetos();
			
			objProjetos.setCodDep(rs.getString("CodDep"));
			objProjetos.setCodProj(rs.getString("CodProj"));
			objProjetos.setNome(rs.getString("Nome"));
			objProjetos.setInfoProj(rs.getString("InfoProj"));
			objProjetos.setData(rs.getDate("Data"));
			
			lstProjetos.add(objProjetos);		
		}
		ps.close();
		Conexao.connection().close();
		return lstProjetos;
	}
	

	public List<Projetos> listarProjetosNome(String nome) throws ClassNotFoundException, SQLException{
		
		List<Projetos> lstProjetos = new ArrayList<Projetos>();
		String sql =  "SELECT * FROM Projetos Where Nome LIKE '%"+nome+"%';";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Projetos objProjetos = new Projetos();
			
			objProjetos.setCodDep(rs.getString("CodDep"));
			objProjetos.setCodProj(rs.getString("CodProj"));
			objProjetos.setNome(rs.getString("Nome"));
			objProjetos.setInfoProj(rs.getString("InfoProj"));
			objProjetos.setData(rs.getDate("Data"));
			
			lstProjetos.add(objProjetos);		
		}
		ps.close();
		Conexao.connection().close();
		return lstProjetos;
	}
}
