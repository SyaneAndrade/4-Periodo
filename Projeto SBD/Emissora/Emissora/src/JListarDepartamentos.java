import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.awt.Color;


public class JListarDepartamentos extends JFrame {

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
					JListarDepartamentos frame = new JListarDepartamentos();
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
	public JListarDepartamentos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));

		
		setTitle("Listar Departamentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setBounds(10, 11, 46, 14);
		contentPane.add(lblPesquisar);
		
		Pesquisa = new JTextField();
		Pesquisa.setBounds(191, 8, 420, 20);
		contentPane.add(Pesquisa);
		Pesquisa.setColumns(10);
		
		
//		Instanciando todos os Departamentos
        DepartamentosDB ddb = new DepartamentosDB();
        
        try {
			List<Departamentos> Departamentoss = ddb.listarDepartamentos();
			
			for (Departamentos d: Departamentoss){
				System.out.println(d.getNomeDep());
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
        
        
//        Colunas
        String [] colunas = {"Codigo","Nome","Emissora","Info Departamento"};
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
        	List<Departamentos> Departamentoss = ddb.listarDepartamentos();
			
			for (Departamentos d: Departamentoss){
				val.addRow(new String[]{d.getCodDep(),d.getNomeDep(),d.getCodEmi(),d.getInfoDep()});
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
        
//        Adicionando os eventos de inser��o
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (table.getSelectedRow() > -1) {
                    // print first column value from selected row
                    System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
                    Departamentos dupdate = new Departamentos();
//                    {"Codigo","Nome","Emissora","Salario","Telefone", "Endere�o"}
                    
//                    String nome = table.getValueAt(table.getSelectedRow(), 1).toString();
//                    String codEmi = table.getValueAt(table.getSelectedRow(), 2).toString();
//                    Float salario = Float.parseFloat(table.getValueAt(table.getSelectedRow(), 3).toString());
//                    String telefone = table.getValueAt(table.getSelectedRow(), 4).toString();
//                    String endereco = table.getValueAt(table.getSelectedRow(), 5).toString();
                    
//                    dupdate.setCodFunc(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
//                    dupdate.setNome(nome);
//                    dupdate.setCodEmi(codEmi);
//                    dupdate.setSalario(salario);
//                    dupdate.setTelefone(telefone);
//                    dupdate.setEndereco(endereco);
                    
//                    JUpdateDepartamentos updateFrame = new JUpdateDepartamentos(dupdate);
//                    updateFrame.setVisible(true);
                    
                    
                    
                    
                }
            }
        });
        
        
        
//		contentPane.add(table);
		
		
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
					JDepartamentos frame = new JDepartamentos();
					frame.setVisible(true);
				} catch (Exception j) {
					j.printStackTrace();
				}
			}
		});	
		btnVoltar.setBounds(10, 364, 89, 23);
		contentPane.add(btnVoltar);
		
		
		
		Pesquisa.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent e) {

		            System.out.println(Pesquisa.getText());
		            DefaultTableModel val = (DefaultTableModel) table.getModel();
		            val.setRowCount(0);
		            try {
		    			List<Departamentos> Departamentoss = ddb.listarDepartamentosNome(Pesquisa.getText());
		    			
		    			for (Departamentos d: Departamentoss){
		    				val.addRow(new String[]{d.getCodDep(),d.getNomeDep(),d.getCodEmi(),d.getInfoDep()});
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
