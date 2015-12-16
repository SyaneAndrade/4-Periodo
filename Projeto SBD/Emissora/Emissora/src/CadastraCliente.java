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
import javax.swing.JTextField;
import javax.swing.JButton;


public class CadastraCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Endereco;
	private JTextField telefone;
	private JTextField Emissora;
	private JTextField Codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraCliente frame = new CadastraCliente();
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
	public CadastraCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeCliente.setBounds(163, 11, 141, 32);
		contentPane.add(lblCadastroDeCliente);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 51, 45, 14);
		contentPane.add(lblNewLabel);
		
		Nome = new JTextField();
		Nome.setBounds(81, 48, 303, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco: ");
		lblEndereco.setBounds(10, 89, 60, 14);
		contentPane.add(lblEndereco);
		
		Endereco = new JTextField();
		Endereco.setBounds(81, 86, 303, 20);
		contentPane.add(Endereco);
		Endereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(10, 123, 60, 14);
		contentPane.add(lblTelefone);
		
		telefone = new JTextField();
		telefone.setBounds(80, 120, 304, 20);
		contentPane.add(telefone);
		telefone.setColumns(10);
		
		JLabel lblEmissora = new JLabel("Emissora: ");
		lblEmissora.setBounds(10, 151, 60, 14);
		contentPane.add(lblEmissora);
		
		Emissora = new JTextField();
		Emissora.setBounds(78, 148, 86, 20);
		contentPane.add(Emissora);
		Emissora.setColumns(10);
		Emissora.setText("1010");
		
		JLabel lblCodigo = new JLabel("Codigo: ");
		lblCodigo.setBounds(186, 151, 52, 14);
		contentPane.add(lblCodigo);
		
		Codigo = new JTextField();
		Codigo.setBounds(253, 148, 131, 20);
		contentPane.add(Codigo);
		Codigo.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(295, 227, 89, 23);
		contentPane.add(btnFinalizar);
		
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente c = new Cliente();
				
				c.setNomeCli(Nome.getText());
				c.setEndereco(Endereco.getText());
				c.setTelefones(telefone.getText());
				c.setCodEmi(Emissora.getText());
				c.setCodCli(Codigo.getText());
	
		         			
				ClienteDB cbd = new ClienteDB();
				try {
					cbd.insereCliente(c);
					JOptionPane.showMessageDialog(null, "Cliente Inserido Com sucesso!!!");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}	
				
			}
		});
		
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
					JCliente frame = new JCliente();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		
		btnVoltar.setBounds(27, 227, 89, 23);
		contentPane.add(btnVoltar);
	}

}