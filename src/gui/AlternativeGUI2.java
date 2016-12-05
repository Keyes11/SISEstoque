package gui;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import banco.AcessoBanco;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Kyss
 */
public class AlternativeGUI2 extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form GUI2
     */
    public AlternativeGUI2() {
        initComponents();
        AcessoBanco banco = new AcessoBanco();
        String cd = banco.mostrarDado("fornecedor");
        textPane.setText(cd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSeparator1 = new javax.swing.JSeparator();
        pnlEtched = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnNovo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if (txtCnpj.getText().equals("") || txtNome.getText().equals("") || txtEndereco.getText().equals("") || txtTelefone.getText().equals("")){
        			JOptionPane.showMessageDialog(null,"Todos os campos deve ser preenchidos.");
        		}else{
        			String codigo = txtCnpj.getText();
            		String nome = txtNome.getText();        		
            		String endereco = txtEndereco.getText();
            		String telefone = txtTelefone.getText();
            		String tabela = "fornecedor";
                	AcessoBanco banco = new AcessoBanco();
    	        	banco.add(codigo,nome,endereco,telefone,tabela);
                        String cd = banco.mostrarDado("fornecedor");
                        textPane.setText(cd);
        		}
        	}
        });
        btnSalvar = new javax.swing.JButton();
        btnSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String codigo 	= txtCnpj.getText();
        		String nome 	= "";        		
        		String endereco = "";
        		String telefone = "";
        		String tabela	= "fornecedor";
        		
        		if (!txtCnpj.getText().equals("")){
        			
        			/*Se for vazio, atribui nulo e e ignorado por updateBanco().*/
        			if (!txtNome.getText().equals("")){nome = txtNome.getText();}
        			else {nome = null;}
        			if (!txtEndereco.getText().equals("")){endereco = txtEndereco.getText();}
        			else {endereco = null;}
        			if (!txtTelefone.getText().equals("")){telefone = txtTelefone.getText();}
        			else {telefone = null;}

        			AcessoBanco banco = new AcessoBanco();
		        	banco.update(codigo,nome,endereco,telefone,tabela);
                                String cd = banco.mostrarDado("fornecedor");
                                textPane.setText(cd);
        		}else{ JOptionPane.showMessageDialog(null,"Voce precisa especificar o CNPJ do fornecedor que quer atualizar.");}
        	}
        });
        btnRecarregar = new javax.swing.JButton();
        btnRecarregar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                            AcessoBanco banco = new AcessoBanco();
                            String cd = banco.mostrarDado("fornecedor");
                            textPane.setText(cd);
        	}
        });
        btnDeletar = new javax.swing.JButton();
        btnDeletar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if (!txtCnpj.getText().equals("")){
        			String codigo = txtCnpj.getText();
        			String tabela = "fornecedor";

        			AcessoBanco banco = new AcessoBanco();
		        	banco.delete(tabela,codigo);
                                String cd = banco.mostrarDado("fornecedor");
                                textPane.setText(cd);
        		}else{ JOptionPane.showMessageDialog(null,"Voce precisa especificar o CNPJ do fornecedor que quer apagar.");}
        	}
        });
        jSeparator4 = new javax.swing.JSeparator();
        btnTrocaTabela = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        pnlBevelLow = new javax.swing.JPanel();
        lblCnpj = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISEstoque - Tabela de fornecedores");

        pnlEtched.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlEtched.setPreferredSize(new java.awt.Dimension(370, 48));

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Nova linha.");

        btnSalvar.setText("Atualizar");
        btnSalvar.setToolTipText("Salvar no banco de dados.");

        btnRecarregar.setText("Recarregar");
        btnRecarregar.setToolTipText("Atualizar banco de dados.");

        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Deletar linha do banco de dados.");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnTrocaTabela.setText("Tabela Produto");
        btnTrocaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocaTabelaActionPerformed(evt);
            }
        });
        
        labelImagem = new JLabel("");
        ImageIcon img = new ImageIcon("imagens/almoxarifado_logo.png"); 
        labelImagem.setIcon(img); 
        javax.swing.GroupLayout pnlEtchedLayout = new javax.swing.GroupLayout(pnlEtched);
        pnlEtchedLayout.setHorizontalGroup(
        	pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlEtchedLayout.createSequentialGroup()
        			.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        						.addComponent(btnNovo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnDeletar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnRecarregar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(btnTrocaTabela, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(labelImagem, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        			.addGap(6))
        );
        pnlEtchedLayout.setVerticalGroup(
        	pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlEtchedLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnRecarregar)
        						.addComponent(btnNovo))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnDeletar)
        						.addComponent(btnSalvar))
        					.addGap(18)
        					.addComponent(btnTrocaTabela, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addGap(0, 34, Short.MAX_VALUE))
        				.addGroup(pnlEtchedLayout.createSequentialGroup()
        					.addGroup(pnlEtchedLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(labelImagem, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(15))))
        );
        pnlEtched.setLayout(pnlEtchedLayout);

        pnlBevelLow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlBevelLow.setPreferredSize(new java.awt.Dimension(370, 166));

        lblCnpj.setText("CNPJ");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereco");

        lblTelefone.setText("Telefone");

        txtCnpj.setToolTipText("CNPJ do fornecedor.");
        txtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjActionPerformed(evt);
            }
        });

        txtNome.setToolTipText("Nome do fornecedor.");

        txtEndereco.setToolTipText("Endereço do Fornecedor.");

        txtTelefone.setToolTipText("Telefone do Fornecedor.");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBevelLowLayout = new javax.swing.GroupLayout(pnlBevelLow);
        pnlBevelLow.setLayout(pnlBevelLowLayout);
        pnlBevelLowLayout.setHorizontalGroup(
            pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBevelLowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(lblNome)
                    .addComponent(lblCnpj)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlBevelLowLayout.setVerticalGroup(
            pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBevelLowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBevelLowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setText("SISEstoque alpha v0.0.4b");
        
        textPane = new JTextPane();
        textPane.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addContainerGap(825, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(40)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(pnlBevelLow, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
        					.addComponent(pnlEtched, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(50))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 860, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(pnlEtched, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        				.addComponent(pnlBevelLow, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jSeparator1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrocaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocaTabelaActionPerformed
        this.setVisible(false);
        new AlternativeGUI().setVisible(true);
    }//GEN-LAST:event_btnTrocaTabelaActionPerformed

    private void txtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjActionPerformed
      
    }//GEN-LAST:event_txtCnpjActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
       
    }//GEN-LAST:event_txtTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(AlternativeGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlternativeGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlternativeGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlternativeGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlternativeGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecarregar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTrocaTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlBevelLow;
    private javax.swing.JPanel pnlEtched;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private JLabel labelImagem;
    private JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
