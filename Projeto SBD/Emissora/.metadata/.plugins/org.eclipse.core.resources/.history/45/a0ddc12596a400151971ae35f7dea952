import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;


public class JListarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField Pesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListarFuncionario frame = new JListarFuncionario();
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
	public JListarFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
//				try {
//					FuncionarioPainel frame = new FuncionarioPainel();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eu.setVisible(false);
				setVisible(false);
				try {
					FuncionarioPainel frame = new FuncionarioPainel();
					frame.setVisible(true);
				} catch (Exception j) {
					j.printStackTrace();
				}
			}
		});	
//		
		
		btnVoltar.setBounds(10, 364, 89, 23);
		contentPane.add(btnVoltar);
		
		
//		Instanciando todos os funcionarios
        FuncionarioDB fdb = new FuncionarioDB();
        
        try {
			List<Funcionario> funcs = fdb.listarFuncionario();
			
			for (Funcionario f: funcs){
				System.out.println(f.getNome());
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
        
        
//        Colunas
        String [] colunas = {"Codigo","Nome","Emissora","Salario","Telefone", "Endereço"};
        Object [][] dados = {};
        
        
//
		
        DefaultTableModel model = new DefaultTableModel(dados,colunas);
		table = new JTable(model);
		table.setBounds(34, 208, 390, -166);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(601, 313);
		scrollPane.setLocation(10, 42);
		contentPane.add(scrollPane);
		table.setFillsViewportHeight(true);
		
		
        DefaultTableModel val = (DefaultTableModel) table.getModel();
        try {
			List<Funcionario> funcs = fdb.listarFuncionario();
			
			for (Funcionario f: funcs){
				val.addRow(new String[]{Integer.toString(f.getCodFunc()),f.getNome(),f.getCodEmi(),Float.toString(f.getSalario()),f.getTelefone(),f.getEndereco()});
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
        
//        Adicionando os eventos de inserção
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (table.getSelectedRow() > -1) {
                    // print first column value from selected row
                    System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
                    Funcionario fupdate = new Funcionario();
//                    {"Codigo","Nome","Emissora","Salario","Telefone", "Endereço"}
                    
                    String nome = table.getValueAt(table.getSelectedRow(), 1).toString();
                    String codEmi = table.getValueAt(table.getSelectedRow(), 2).toString();
                    Float salario = Float.parseFloat(table.getValueAt(table.getSelectedRow(), 3).toString());
                    String telefone = table.getValueAt(table.getSelectedRow(), 4).toString();
                    String endereco = table.getValueAt(table.getSelectedRow(), 5).toString();
                    
                    fupdate.setCodFunc(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
                    fupdate.setNome(nome);
                    fupdate.setCodEmi(codEmi);
                    fupdate.setSalario(salario);
                    fupdate.setTelefone(telefone);
                    fupdate.setEndereco(endereco);
                    
                    JUpdateFuncionario updateFrame = new JUpdateFuncionario(fupdate);
                    updateFrame.setVisible(true);
                    
                    
                    
                    
                }
            }
        });
        
        
        
//		contentPane.add(table);
		
		Pesquisa = new JTextField();
		Pesquisa.setBounds(112, 11, 499, 20);
		contentPane.add(Pesquisa);
		Pesquisa.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setBounds(23, 14, 46, 14);
		contentPane.add(lblPesquisar);
		
		Pesquisa.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {

		            System.out.println(Pesquisa.getText());
		            DefaultTableModel val = (DefaultTableModel) table.getModel();
		            val.setRowCount(0);
		            try {
		    			List<Funcionario> funcs = fdb.listarFuncionarioNome(Pesquisa.getText());
		    			
		    			for (Funcionario f: funcs){
		    				val.addRow(new String[]{Integer.toString(f.getCodFunc()),f.getNome(),f.getCodEmi(),Float.toString(f.getSalario()),f.getTelefone(),f.getEndereco()});
		    			}
		    		} catch (ClassNotFoundException e1) {
		    			// TODO Auto-generated catch block
		    			e1.printStackTrace();
		    		} catch (SQLException e1) {
		    			// TODO Auto-generated catch block
		    			e1.printStackTrace();
		    		}	
		            
		            
		            
		    }
		});
	}
}
