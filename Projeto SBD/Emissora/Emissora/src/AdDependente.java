import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;


public class AdDependente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Sexo;
	private JTextField DataNascimento;
	private JTextField CodigoFunc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdDependente frame = new AdDependente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void fechar(){
		this.setVisible(false);
	}

	/**
	 * Create the frame.
	 */
	public AdDependente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Dependente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(122, 11, 187, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 55, 46, 14);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setBounds(61, 52, 332, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo: ");
		lblNewLabel_1.setBounds(10, 78, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Sexo = new JTextField();
		Sexo.setBounds(61, 75, 36, 20);
		contentPane.add(Sexo);
		Sexo.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(132, 78, 109, 14);
		contentPane.add(lblDataDeNascimento);
		
		DataNascimento = new JTextField();
		DataNascimento.setBounds(241, 75, 152, 20);
		contentPane.add(DataNascimento);
		DataNascimento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo Funcionario:");
		lblNewLabel_2.setBounds(10, 103, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		CodigoFunc = new JTextField();
		CodigoFunc.setBounds(111, 100, 281, 20);
		contentPane.add(CodigoFunc);
		CodigoFunc.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dependente d = new Dependente();
				
				d.setNome(Nome.getText());
				d.setSexo(Sexo.getText());
				
				SimpleDateFormat a = new SimpleDateFormat("DD-MM-YYYY");
				 try {
			            Date date = a.parse(DataNascimento.getText());
			            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			            d.setDataNascimento(sqlDate); 
			           // System.out.println(DataNascimento.getText());
			        } catch (ParseException e4) {
			            e4.printStackTrace();
			        }
		         				
				d.setCodFunc(Integer.parseInt(CodigoFunc.getText()));
				
				
				DependenteDB dbd = new DependenteDB();
				try {
					dbd.insereDependente(d);;
					JOptionPane.showMessageDialog(null, "Dependente Inserido Com sucesso!!!");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}	
				
			}
		});
		btnFinalizar.setBounds(335, 218, 89, 23);
		contentPane.add(btnFinalizar);
		
		JButton btnVoltar = new JButton("Voltar");
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CadastroFunc frame = new CadastroFunc();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
	
		
		
		
		btnVoltar.setBounds(10, 218, 89, 23);
		contentPane.add(btnVoltar);
		
	}
}
