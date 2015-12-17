import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;


public class CadastraDepartamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Informacao;
	private JTextField Codigo;
	private JTextField Emissora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraDepartamento frame = new CadastraDepartamento();
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
	public CadastraDepartamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCadrasto = new JLabel("Cadastro Departamento");
		lblCadrasto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadrasto.setBounds(144, 11, 183, 25);
		contentPane.add(lblCadrasto);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 74, 53, 14);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setBounds(94, 71, 330, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Informacao: ");
		lblNewLabel.setBounds(10, 105, 78, 14);
		contentPane.add(lblNewLabel);
		
		Informacao = new JTextField();
		Informacao.setBounds(94, 102, 330, 20);
		contentPane.add(Informacao);
		Informacao.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo: ");
		lblCodigo.setBounds(10, 149, 46, 14);
		contentPane.add(lblCodigo);
		
		Codigo = new JTextField();
		Codigo.setBounds(94, 146, 104, 20);
		contentPane.add(Codigo);
		Codigo.setColumns(10);
		
		JLabel lblEmissora = new JLabel("Emissora: ");
		lblEmissora.setBounds(210, 149, 78, 14);
		contentPane.add(lblEmissora);
		
		Emissora = new JTextField();
		Emissora.setBounds(288, 146, 136, 20);
		contentPane.add(Emissora);
		Emissora.setColumns(10);
		Emissora.setText("1010");
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Departamentos d = new Departamentos();
				
				d.setNomeDep(Nome.getText());
				d.setInfoDep(Informacao.getText());
				d.setCodEmi(Emissora.getText());
				d.setCodDep(Codigo.getText());
	
		         			
				DepartamentosDB dbd = new DepartamentosDB();
				try {
					dbd.insereDepartamentos(d);
					JOptionPane.showMessageDialog(null, "Departamento Inserido Com sucesso!!!");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}	
				
			}
		});
		btnFinalizar.setBounds(335, 213, 89, 23);
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
					JDepartamentos frame = new JDepartamentos();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		btnVoltar.setBounds(10, 213, 89, 23);
		contentPane.add(btnVoltar);
	}

}
