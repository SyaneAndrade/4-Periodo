//import java.awt.BorderLayout;
//import java.util.Calendar;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
//import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class CadastroFunc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Endereco;
	private JTextField Telefone;
	private JTextField Codigo;
	private JTextField Salario;
	private JTextField Emissora;
	
	public void fechar(){
		
		this.setVisible(false);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFunc frame = new CadastroFunc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFunc() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroCliente = new JLabel("Cadastro Funcionario");
		lblCadastroCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroCliente.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCadastroCliente.setBounds(153, 11, 148, 23);
		contentPane.add(lblCadastroCliente);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 43, 37, 14);
		contentPane.add(lblNewLabel);
		
		Nome = new JTextField();
		Nome.setBounds(72, 40, 340, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Endereco: ");
		lblDataNascimento.setBounds(10, 68, 52, 14);
		contentPane.add(lblDataNascimento);
		
		Endereco = new JTextField();
		Endereco.setBounds(72, 65, 340, 20);
		contentPane.add(Endereco);
		Endereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 93, 52, 14);
		contentPane.add(lblTelefone);
		
		Telefone = new JTextField();
		Telefone.setBounds(72, 90, 178, 20);
		contentPane.add(Telefone);
		Telefone.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(281, 93, 52, 14);
		contentPane.add(lblCodigo);
	
		Codigo = new JTextField();
		Codigo.setBounds(343, 90, 69, 20);
		contentPane.add(Codigo);
		Codigo.setColumns(10);
		Codigo.getText();

		JLabel lblNewLabel_1 = new JLabel("Salario:");
		lblNewLabel_1.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Salario = new JTextField();
		Salario.setBounds(72, 115, 86, 20);
		contentPane.add(Salario);
		Salario.setColumns(10);
		
		JLabel lblCnpj = new JLabel("Emissora:");
		lblCnpj.setBounds(218, 118, 63, 14);
		contentPane.add(lblCnpj);
		
		Emissora = new JTextField();
		Emissora.setBounds(284, 115, 128, 20);
		contentPane.add(Emissora);
		Emissora.setColumns(10);
		Emissora.setText("1010");
		
		JButton btnDependente = new JButton("Dependente");
		btnDependente.setBounds(0, 218, 118, 23);
		contentPane.add(btnDependente);
		
		btnDependente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eu.setVisible(false);
				fechar();
			}
		});
		
		btnDependente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					AdDependente frame = new AdDependente();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
	
		
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario f = new Funcionario();
				
				f.setNome(Nome.getText());
				f.setEndereco(Endereco.getText());
				f.setTelefone(Telefone.getText());
				f.setCodFunc(Integer.parseInt(Codigo.getText()));
				f.setCodEmi(Emissora.getText());
				f.setSalario(Float.parseFloat(Salario.getText()));
				
				/*//convertendo uma string para o tipo calendario para poder encaixar no banco
				Calendar calendar = Calendar.getInstance();
				calendar.set(Integer.parseInt(Data.getText().split("/")[2]),Integer.parseInt(Data.getText().split("/")[1]), Integer.parseInt(Data.getText().split("/")[0]));
				f.setDataNasc(calendar);*/
				
				
				FuncionarioDB fdb = new FuncionarioDB();
				try {
					fdb.insereFuncionario(f);
					JOptionPane.showMessageDialog(null, "Funcionario Inseridos Com sucesso!!!");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}	
				
			}
		});
		btnFinalizar.setBounds(335, 218, 89, 23);
		contentPane.add(btnFinalizar);
		
		JButton btnVoltar = new JButton("Menu");
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eu.setVisible(false);
				fechar();
			}
		});
		
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					MenuInicial frame = new MenuInicial();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		
		btnVoltar.setBounds(171, 218, 89, 23);
		contentPane.add(btnVoltar);
		
	}
}
