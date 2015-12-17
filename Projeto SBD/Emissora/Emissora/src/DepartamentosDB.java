import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartamentosDB {
	
	public void insereDepartamentos(Departamentos objDepartamentos) throws ClassNotFoundException, SQLException {
		//INSERT INTO Departamentos VALUES('1010', 'Dep01', 'Noticias', 'Reunir informacoes e as relatam no ar.');	
		String sql = "Insert into Departamentos values(?,?,?,?)";
		
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		
		ps.setString(1, objDepartamentos.getCodEmi());
		ps.setString(2, objDepartamentos.getCodDep());
		ps.setString(3, objDepartamentos.getNomeDep());
		ps.setString(4,objDepartamentos.getInfoDep());
		
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}
	
	public List<Departamentos> listarDepartamentos() throws ClassNotFoundException, SQLException{
		
		List<Departamentos> lstDepartamentos = new ArrayList<Departamentos>();
		String sql =  "SELECT * FROM Departamentos;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Departamentos objDepartamentos = new Departamentos();
			
			objDepartamentos.setCodEmi(rs.getString("CodEmi"));
			objDepartamentos.setCodDep(rs.getString("CodDep"));
			objDepartamentos.setNomeDep(rs.getString("NomeDep"));
			objDepartamentos.setInfoDep(rs.getString("InfoDep"));
			
			lstDepartamentos.add(objDepartamentos);		
		}
		ps.close();
		Conexao.connection().close();
		return lstDepartamentos;
	}
	
	public List<Departamentos> listarDepartamentosNome(String nome) throws ClassNotFoundException, SQLException{
		
		List<Departamentos> lstDepartamentos = new ArrayList<Departamentos>();
		String sql =  "SELECT * FROM Departamentos WHERE nomedep LIKE '%"+nome+"%';";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Departamentos objDepartamentos = new Departamentos();
			
			objDepartamentos.setCodEmi(rs.getString("CodEmi"));
			objDepartamentos.setCodDep(rs.getString("CodDep"));
			objDepartamentos.setNomeDep(rs.getString("NomeDep"));
			objDepartamentos.setInfoDep(rs.getString("InfoDep"));
			
			lstDepartamentos.add(objDepartamentos);		
		}
		ps.close();
		Conexao.connection().close();
		return lstDepartamentos;
	}
	
	
}
