import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] arg) throws ClassNotFoundException, SQLException{
		
		FuncionarioDB fdb = new FuncionarioDB();
		List<Funcionario>  flist = new  ArrayList<Funcionario>();
		flist = fdb.listarFuncionario();
		
		for(Funcionario f: flist){
			
			System.out.println(f.getCodEmi() + " " + f.getCodFunc() + " " + f.getNome() + f.getEndereco() + " "+ f.getTelefone()+ " "+f.getSalario());
		}
		
	}
}

