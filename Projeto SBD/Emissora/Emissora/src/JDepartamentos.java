import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Color;


public class JDepartamentos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDepartamentos frame = new JDepartamentos();
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
	public JDepartamentos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setTitle("Menu Departamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblMenuDepartamento = new JLabel("Menu Departamento");
		lblMenuDepartamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenuDepartamento.setBounds(157, 11, 154, 25);
		contentPane.add(lblMenuDepartamento);
		
		JButton btnCadastro = new JButton("Cadastro");
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CadastraDepartamento frame = new CadastraDepartamento();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		
		btnCadastro.setBounds(157, 72, 139, 23);
		contentPane.add(btnCadastro);
		
		JButton btnTodosOsDepartamentos = new JButton("Departamentos");
		btnTodosOsDepartamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListarDepartamentos frame = new JListarDepartamentos();
				setVisible(false);
				frame.setVisible(true);
			}
		});
		btnTodosOsDepartamentos.setBounds(157, 114, 139, 23);
		contentPane.add(btnTodosOsDepartamentos);
		
		JButton btnNewButton = new JButton("MenuInicial");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
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
		
		btnNewButton.setBounds(157, 227, 139, 23);
		contentPane.add(btnNewButton);
	}

}
