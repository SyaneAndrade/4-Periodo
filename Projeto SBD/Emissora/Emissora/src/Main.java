import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	private static Scanner a;

	public static void main(String[] arg) throws ClassNotFoundException, SQLException{
		
		FuncionarioDB fdb = new FuncionarioDB();
		List<Funcionario>  flist = new  ArrayList<Funcionario>();
		a = new Scanner(System.in);
		int aux;
		System.out.println("Entre com o valor desejado: Funcionario \n1) Todos \n2)Tecnicos \n3)Produtores \n4)Gestores  ");
		aux = a.nextInt();
		switch(aux){
		case 1:
			flist = fdb.listarFuncionario();
			break;
		case 2:
			flist = fdb.listarFuncionarioT();
			break;
		case 3:
			flist = fdb.listarFuncionarioP();
			break;
		case 4:
			flist = fdb.listarFuncionarioG();
			break;
		default:
			System.out.println("Entrada invalida!!!");
			break;
		}
		flist = fdb.listarFuncionario();
		
		for(Funcionario f: flist){
			
			System.out.println(f.getCodEmi() + " " + f.getCodFunc() + " " + f.getNome() + f.getEndereco() + " "+ f.getTelefone()+ " "+f.getSalario());
		}
		
	}
}

