import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Toolkit;


public class JUpdateFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCod;
	private JTextField textFieldEmi;
	private JTextField textFieldEnd;
	private JTextField textFieldTel;
	private JTextField textFieldSal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario fu = new Funcionario();
					fu.setCodFunc(12345678);
					fu.setCodEmi("4321");
					fu.setEndereco("rua x");
					fu.setNome("teste");
					fu.setSalario(1435);
					fu.setTelefone("1344-5678");
					JUpdateFuncionario frame = new JUpdateFuncionario(fu);
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
	public JUpdateFuncionario(Funcionario f) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setTitle("Atualizar Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 334);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(58, 261, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.setCodFunc(Integer.parseInt(textFieldCod.getText()));
				f.setCodEmi(textFieldEmi.getText());
				f.setEndereco(textFieldEnd.getText());
				f.setNome(textFieldNome.getText());
				f.setSalario(Float.parseFloat(textFieldSal.getText()));
				f.setTelefone(textFieldTel.getText());
				
				
				FuncionarioDB fdb = new FuncionarioDB();
				try {
					fdb.alterarFuncionario(f);
					JOptionPane.showMessageDialog(null, "Funcionario Atualizado Com sucesso!!!");
					JListarFuncionario Jlistar = new JListarFuncionario();
					setVisible(false);
					Jlistar.setVisible(true);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}
				
				
			}
		});
		btnAtualizar.setBounds(303, 261, 89, 23);
		contentPane.add(btnAtualizar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 23, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 70, 46, 14);
		contentPane.add(lblCdigo);
		
		JLabel lblEmissora = new JLabel("Emissora");
		lblEmissora.setBounds(246, 70, 46, 14);
		contentPane.add(lblEmissora);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 115, 46, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 159, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 205, 46, 14);
		contentPane.add(lblSalario);
		
		textFieldNome = new JTextField();
		textFieldNome.setText(f.getNome());
		textFieldNome.setBounds(58, 20, 380, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCod = new JTextField();
		textFieldCod.setText(Integer.toString(f.getCodFunc()));
		textFieldCod.setEditable(false);
		textFieldCod.setBounds(58, 67, 167, 20);
		contentPane.add(textFieldCod);
		textFieldCod.setColumns(10);
		
		textFieldEmi = new JTextField();
		textFieldEmi.setText((f.getCodEmi()));
		textFieldEmi.setEditable(false);
		textFieldEmi.setBounds(302, 67, 136, 20);
		contentPane.add(textFieldEmi);
		textFieldEmi.setColumns(10);
		
		textFieldEnd = new JTextField();
		textFieldEnd.setText(f.getEndereco());
		textFieldEnd.setBounds(58, 112, 380, 20);
		contentPane.add(textFieldEnd);
		textFieldEnd.setColumns(10);
		
		textFieldTel = new JTextField();
		textFieldTel.setText(f.getTelefone());
		textFieldTel.setBounds(58, 156, 380, 20);
		contentPane.add(textFieldTel);
		textFieldTel.setColumns(10);
		
		textFieldSal = new JTextField();
		textFieldSal.setText(Float.toString(f.getSalario()));
		textFieldSal.setBounds(58, 202, 167, 20);
		contentPane.add(textFieldSal);
		textFieldSal.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				f.setCodFunc(Integer.parseInt(textFieldCod.getText()));
				f.setCodEmi(textFieldEmi.getText());
				f.setEndereco(textFieldEnd.getText());
				f.setNome(textFieldNome.getText());
				f.setSalario(Float.parseFloat(textFieldSal.getText()));
				f.setTelefone(textFieldTel.getText());
				
				
				FuncionarioDB fdb = new FuncionarioDB();
				try {
					fdb.removeFuncionario(f);
					JOptionPane.showMessageDialog(null, "Funcionario excluido Com sucesso!!!");
					JListarFuncionario Jlistar = new JListarFuncionario();
					setVisible(false);
					Jlistar.setVisible(true);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO: "+e1.getMessage());
				}
				
				
			}
		});
		btnExcluir.setBounds(182, 261, 89, 23);
		contentPane.add(btnExcluir);
	}
}