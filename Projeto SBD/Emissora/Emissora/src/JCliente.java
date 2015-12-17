import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;


public class JCliente extends JFrame {

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
					JCliente frame = new JCliente();
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
	public JCliente() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setTitle("Menu Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblMenuCliente = new JLabel("Menu Cliente");
		lblMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenuCliente.setBounds(177, 11, 106, 24);
		contentPane.add(lblMenuCliente);
		
		JButton btnCadastraCliente = new JButton("Cadastra Cliente");
		btnCadastraCliente.setBounds(164, 74, 135, 23);
		contentPane.add(btnCadastraCliente);
		
		btnCadastraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnCadastraCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CadastraCliente frame = new CadastraCliente();
					frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		
		
		JButton btnNewButton = new JButton("Ver todos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListarCliente frame = new JListarCliente();
				setVisible(false);
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(164, 108, 135, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMenuInicial = new JButton("Menu Inicial");
		btnMenuInicial.setBounds(164, 213, 135, 23);
		contentPane.add(btnMenuInicial);
		
		btnMenuInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnMenuInicial.addMouseListener(new MouseAdapter() {
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
	}

}
