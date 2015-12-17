import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;


public class JServico extends JFrame {

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
					JServico frame = new JServico();
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
	public JServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblMenuServico = new JLabel("Menu Servico");
		lblMenuServico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenuServico.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuServico.setBounds(149, 11, 130, 28);
		contentPane.add(lblMenuServico);
		
		JButton btnNewButton = new JButton("Cadastra");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
//				fechar();
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CadastraServico frame = new CadastraServico();
					frame.setVisible(true);
					fechar();
				} catch (Exception a) {
					a.printStackTrace();
				}
				
			}
		});
		
		btnNewButton.setBounds(175, 68, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnServicos = new JButton("Servicos");
		btnServicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JListarServico frame = new JListarServico();
				setVisible(false);
				frame.setVisible(true);
			}
		});
		btnServicos.setBounds(175, 122, 89, 23);
		contentPane.add(btnServicos);
		
		JButton btnMenuinicial = new JButton("MenuInicial");
		
		btnMenuinicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//bntVoltar.setVisible(false);
				fechar();
			}
		});
		
		btnMenuinicial.addMouseListener(new MouseAdapter() {
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
		
		
		btnMenuinicial.setBounds(175, 227, 89, 23);
		contentPane.add(btnMenuinicial);
	}

}
