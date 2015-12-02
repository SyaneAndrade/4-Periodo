import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDB {

	//Inserir Funcionario no Banco;
	
	public void insereFuncionario(Funcionario objFuncionario) throws ClassNotFoundException, SQLException {
		//INSERT INTO Funcionario VALUES ( '1010',	1,  'Joaquim Neto', 	'Emdere�o: Rua Ituiutaba 436B, Bairro: Ns. Aparecida, Uberlandia MG Cep38.400-614', 	'03432081282', 	2000.00);	
		String sql = "Insert into Funcionario values(?,?,?,?,?,?)";
		
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ps.setString(1, objFuncionario.getCodEmi());
		ps.setLong(2, objFuncionario.getCodFunc());
		ps.setString(3, objFuncionario.getNome());
		ps.setString(4,objFuncionario.getEndereco());
		ps.setString(5, objFuncionario.getTelefone());
		ps.setFloat(6, objFuncionario.getSalario());
		
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}

	public void removeFuncionario(Funcionario objFuncionario) throws ClassNotFoundException, SQLException{
	
		String sql = "DELETE FROM Funcionario WHERE CodFunc id = ?;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ps.setInt(1,objFuncionario.getCodFunc());
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}
	
	public void alterarFuncionario(Funcionario objFuncionario) throws ClassNotFoundException, SQLException{
		
		String sql = "UPDATE Funcionario SET Endereco = ?, Telefone = ? WHERE codFunc = ?;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ps.setString(1, objFuncionario.getEndereco());
		ps.setString(2, objFuncionario.getTelefone());
		ps.execute();
		ps.close();
		Conexao.connection().close();
	}
	
	public List<Funcionario> listarFuncionario() throws ClassNotFoundException, SQLException{
		
		List<Funcionario> lstFuncionario = new ArrayList<Funcionario>();
		String sql =  "SELECT * FROM Funcionario;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Funcionario objFuncionario = new Funcionario();
			
			objFuncionario.setCodEmi(rs.getString("CodEmi"));
			objFuncionario.setCodFunc(rs.getInt("CodFunc"));
			objFuncionario.setNome(rs.getString("Nome"));
			objFuncionario.setEndereco(rs.getString("Endereco"));
			objFuncionario.setTelefone(rs.getString("Telefones"));
			objFuncionario.setSalario(rs.getFloat("Salario"));
			
			lstFuncionario.add(objFuncionario);		
		}
		ps.close();
		Conexao.connection().close();
		return lstFuncionario;
	}
	
	public List<Funcionario> listarFuncionarioT() throws ClassNotFoundException, SQLException{
		
		List<Funcionario> lstFuncionario = new ArrayList<Funcionario>();
		String sql = "SELECT * FROM Funcionario F, Tecnicos T WHERE F.CodFunc = T.CodFunc;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Funcionario objFuncionario = new Funcionario();
			
			objFuncionario.setCodEmi(rs.getString("CodEmi"));
			objFuncionario.setCodFunc(rs.getInt("CodFunc"));
			objFuncionario.setNome(rs.getString("Nome"));
			objFuncionario.setEndereco(rs.getString("Endereco"));
			objFuncionario.setTelefone(rs.getString("Telefones"));
			
			lstFuncionario.add(objFuncionario);		
		}
		ps.close();
		Conexao.connection().close();
		return lstFuncionario;
	}
	
	public List<Funcionario> listarFuncionarioP() throws ClassNotFoundException, SQLException{
		
		List<Funcionario> lstFuncionario = new ArrayList<Funcionario>();
		String sql = "SELECT * FROM Funcionario F, Produtores_Diretores P WHERE F.CodFunc = P.CodFunc;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Funcionario objFuncionario = new Funcionario();
			
			objFuncionario.setCodEmi(rs.getString("CodEmi"));
			objFuncionario.setCodFunc(rs.getInt("CodFunc"));
			objFuncionario.setNome(rs.getString("Nome"));
			objFuncionario.setEndereco(rs.getString("Endereco"));
			objFuncionario.setTelefone(rs.getString("Telefone"));
			
			lstFuncionario.add(objFuncionario);		
		}
		ps.close();
		Conexao.connection().close();
		return lstFuncionario;
	}
	
	public List<Funcionario> listarFuncionarioG() throws ClassNotFoundException, SQLException{
		
		List<Funcionario> lstFuncionario = new ArrayList<Funcionario>();
		String sql = "SELECT * FROM FUNCIONARIO F,GESTORESADMINISTRATIVOS G WHERE F.CODFUNC = G.CODFUNC;";
		PreparedStatement ps = Conexao.connection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			
			Funcionario objFuncionario = new Funcionario();
			
			objFuncionario.setCodEmi(rs.getString("CodEmi"));
			objFuncionario.setCodFunc(rs.getInt("CodFunc"));
			objFuncionario.setNome(rs.getString("Nome"));
			objFuncionario.setEndereco(rs.getString("Endereco"));
			objFuncionario.setTelefone(rs.getString("Telefone"));
			
			lstFuncionario.add(objFuncionario);		
		}
		ps.close();
		Conexao.connection().close();
		return lstFuncionario;
	}
	
}
