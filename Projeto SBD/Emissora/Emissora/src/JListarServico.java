import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.awt.Toolkit;
import java.awt.Color;


public class JListarServico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					JListarServico frame = new JListarServico();
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
	public JListarServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Syane Andrade\\Documents\\GitHub\\4-Periodo\\Projeto SBD\\Emissora\\Emissora\\admin_icon.png"));
		setTitle("Listar Servico");
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
		
		
//		Instanciando todos os Servicos
        ServicosCanalTVDB sdb = new ServicosCanalTVDB();
        
        try {
			List<ServicosCanalTV> Servicos = sdb.listarServicosCanalTV();
			
			for (ServicosCanalTV s: Servicos){
				System.out.println(s.getNomeCanal());
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
        
        
//        Colunas
        String [] colunas = {"N. Canal","Nome Canal","Emissora","Info Canal"};
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
        	List<ServicosCanalTV> Servicos = sdb.listarServicosCanalTV();
			
			for (ServicosCanalTV s: Servicos){
//		        {"N. Canal","Nome Canal","Emissora","Info Canal"};
				val.addRow(new String[]{Integer.toString(s.getNumCanal()),s.getNomeCanal(),s.getCodEmi(),s.getInfoCanal()});
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
                    ServicosCanalTV supdate = new ServicosCanalTV();
//                    {"Codigo","Nome","Emissora","Salario","Telefone", "Endere�o"}
                    
                    String nome = table.getValueAt(table.getSelectedRow(), 1).toString();
                    String codEmi = table.getValueAt(table.getSelectedRow(), 2).toString();
                    Float salario = Float.parseFloat(table.getValueAt(table.getSelectedRow(), 3).toString());
                    String telefone = table.getValueAt(table.getSelectedRow(), 4).toString();
                    String endereco = table.getValueAt(table.getSelectedRow(), 5).toString();
                    
//                    supdate.setCodFunc(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
//                    supdate.setNome(nome);
//                    supdate.setCodEmi(codEmi);
//                    supdate.setSalario(salario);
//                    supdate.setTelefone(telefone);
//                    supdate.setEndereco(endereco);
                    
//                    JUpdateServico updateFrame = new JUpdateServico(supdate);
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
					JServico frame = new JServico();
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
		    			List<ServicosCanalTV> Servicos = sdb.listarServicosCanalTVNome(Pesquisa.getText());
		    			
		    			for (ServicosCanalTV s: Servicos){
		    				
		    				val.addRow(new String[]{Integer.toString(s.getNumCanal()),s.getNomeCanal(),s.getCodEmi(),s.getInfoCanal()});
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
