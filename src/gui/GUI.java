package gui;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import banco.AcessoBanco;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Kyss
 */
public class GUI extends javax.swing.JFrame {
        
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form GUI
     */
    public GUI() {
        Gambis x = new Gambis();
        x.initComponents();
        x.btnRecarregarActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    @SuppressWarnings("serial")
        public class Gambis extends AcessoBanco{
        
	private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblBanco = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pnlBevelLow = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblQntd = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtQntd = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        pnlEtched = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnNovo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if (txtCodigo.getText().equals("") || txtProduto.getText().equals("") || txtQntd.getText().equals("") || txtCnpj.getText().equals("")){
        			JOptionPane.showMessageDialog(null,"Todos os campos deve ser preenchidos.");
        		}else{
        			String codigo = txtCodigo.getText();
            		String produto = txtProduto.getText(); 
            		String tabela = "produto";
            		String qntd = txtQntd.getText();
            		String cnpj = txtCnpj.getText();           		
            			
    	        	AcessoBanco banco = new AcessoBanco();
    	        	banco.add(codigo, produto, qntd, cnpj, tabela);
        		}
                    btnRecarregarActionPerformed(arg0);
        	}
        });
        btnSalvar = new javax.swing.JButton();
        btnSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {

    			String codigo	= txtCodigo.getText();
        		String produto  = "";        		
        		String qntd		= "";
        		String cnpj 	= "";
        		String tabela	= "produto";

        		if (!txtCodigo.getText().equals("")){
        			
        			/*Se for vazio, atribui nulo e e ignorado por updateBanco().*/
        			if (!txtProduto.getText().equals("")){produto = txtProduto.getText();}
        			else {produto = null;}
        			
        			if (!txtQntd.getText().equals("")){qntd = txtQntd.getText();}
        			else {qntd = null;}
        			
        			if (!txtCnpj.getText().equals("")){cnpj = txtCnpj.getText();}
        			else {cnpj = null;}
	            		
        			AcessoBanco banco = new AcessoBanco();
		        	banco.update(codigo,produto,qntd,cnpj,tabela);
        		}else{ JOptionPane.showMessageDialog(null,"Voce precisa especificar o codigo do produto que quer atualizar.");}
                    btnRecarregarActionPerformed(arg0);
        	}
        });
        btnDeletar = new javax.swing.JButton();
        btnDeletar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (!txtCodigo.getText().equals("")){
        			String codigo = txtCodigo.getText();
        			String tabela = "produto";

        			AcessoBanco banco = new AcessoBanco();
		        	banco.delete(tabela,codigo);
        		}else{ JOptionPane.showMessageDialog(null,"Voce precisa especificar o codigo do produto que quer apagar.");}
                    btnRecarregarActionPerformed(e);
        	}
        });
        jSeparator4 = new javax.swing.JSeparator();
        btnTrocaTabela = new javax.swing.JButton();
        lblVer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISEstoque - Tabela de produtos");

        tblBanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblBanco.setModel(new DefaultTableModel(
            new Object [][] {          },
            new String [] { "Codigo", "Produto", "Quantidade", "CNPJ" }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblBanco);
        
        
        btnRecarregar = new javax.swing.JButton();
        btnRecarregar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                    btnRecarregarActionPerformed(e);                                 
        	}
        });
        

        pnlBevelLow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlBevelLow.setPreferredSize(new java.awt.Dimension(370, 170));

        lblCodigo.setText("Codigo");

        lblQntd.setText("Quantidade");

        lblProduto.setText("Produto");

        lblCnpj.setText("CNPJ");

        txtCodigo.setToolTipText("Codigo do produto.");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtProduto.setToolTipText("Nome do produto.");

        txtQntd.setToolTipText("Quantidade de produtos.");

        txtCnpj.setToolTipText("CNPJ do fornecedor.");

        javax.swing.GroupLayout pnlBevelLowLayout = new javax.swing.GroupLayout(pnlBevelLow);
        pnlBevelLow.setLayout(pnlBevelLowLayout);
        pnlBevelLowLayout.setHorizontalGroup(
            pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBevelLowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQntd)
                    .addComponent(lblProduto)
                    .addComponent(lblCodigo)
                    .addComponent(lblCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQntd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        pnlBevelLowLayout.setVerticalGroup(
            pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBevelLowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQntd)
                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEtched.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlEtched.setPreferredSize(new java.awt.Dimension(370, 48));

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Nova linha.");

        btnSalvar.setText("Atualizar");
        btnSalvar.setToolTipText("Salvar no banco de dados.");

        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Deletar linha do banco de dados.");

        btnRecarregar.setText("Recarregar");
        btnRecarregar.setToolTipText("Atualizar banco de dados.");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnTrocaTabela.setText("Tabela Fornecedor");
        btnTrocaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocaTabelaActionPerformed(evt);
            }
        });
        
        JLabel labelImagem = new JLabel("");
        ImageIcon img = new ImageIcon("imagens/almoxarifado_logo.png"); 
        labelImagem.setIcon(img); 
        
        javax.swing.GroupLayout pnlEtchedLayout = new javax.swing.GroupLayout(pnlEtched);
        pnlEtchedLayout.setHorizontalGroup(
        	pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlEtchedLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        						.addComponent(btnNovo, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnDeletar, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        						.addComponent(btnRecarregar, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(btnTrocaTabela, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(labelImagem, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
        );
        pnlEtchedLayout.setVerticalGroup(
        	pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(labelImagem, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        		.addGroup(pnlEtchedLayout.createSequentialGroup()
        			.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(pnlEtchedLayout.createSequentialGroup()
        							.addComponent(btnRecarregar)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnDeletar))
        						.addGroup(pnlEtchedLayout.createSequentialGroup()
        							.addComponent(btnNovo)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnSalvar)))))
        			.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
        			.addComponent(btnTrocaTabela, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        pnlEtched.setLayout(pnlEtchedLayout);

        lblVer.setText("SISEstoque alpha v0.0.4b");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlBevelLow, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(pnlEtched, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEtched, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(pnlBevelLow, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblVer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    

    
    private void btnRecarregarActionPerformed(java.awt.event.ActionEvent evt) {
                            Connection conexao = null;
                    try {
                        conexao = DriverManager.getConnection(getUrl(), getLogin(), getSenhaBanco());
                        Statement state = conexao.createStatement();
                        String cd = "";
                        cd = "select * from produto;";
                        rs = state.executeQuery(cd);

                    } catch (SQLException c) {
                        c.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao tentar conectar.\nErro: " + c);
                    }
                     
        	    DefaultTableModel model = (DefaultTableModel)
                    tblBanco.getModel();
                    
                    for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
                        model.removeRow(i);
                    }
                    
        	    try{        			
        		while(rs.next()){
        			String [] atributos = new String[] {rs.getString("cod_produto"), // Talvez seja fora do while
        											   rs.getString("nome_produto"),
        											   rs.getString("quantidade"),
        											   rs.getString("cnpj_fornecedor")};
        	    	Object[] row = { atributos[0], atributos[1], atributos[2], atributos[3] };
        	    	model.addRow(row);
        			}
        		}
        	    catch(SQLException ex){JOptionPane.showMessageDialog(null,"Erro: ao recarregar. \nSQLException: " + ex.getMessage()+"\nSQLState: " + ex.getSQLState()+"\nVendorError: " + ex.getErrorCode());}
        	    catch(Exception se){JOptionPane.showMessageDialog(null,"Erro ao recarregar.\nErro: "+se);}
        	    try {
                        conexao.close();
                        rs.close();
                    } catch (SQLException c) {
                        c.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao tentar desconectar.\nErro: " + c);
                    }
    }
    }
    
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnTrocaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocaTabelaActionPerformed
        this.setVisible(false);
        new GUI2().setVisible(true);
    }//GEN-LAST:event_btnTrocaTabelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new GUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnRecarregar, btnDeletar, btnNovo, btnSalvar, btnTrocaTabela;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQntd;
    private javax.swing.JLabel lblVer;
    private javax.swing.JPanel pnlBevelLow;
    private javax.swing.JPanel pnlEtched;
    private javax.swing.JTable tblBanco;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQntd;
}