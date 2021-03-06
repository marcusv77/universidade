/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.VendedorMenu;

import java.util.List;
import javax.swing.JOptionPane;
import sistemaoficina.Funcionarios.Vendedor;
import sistemaoficina.Clientes.Cliente;
import sistemaoficina.Servicos.Ordem;

/**
 *
 * @author Daniel
 */
public class CadastroOrdem extends javax.swing.JFrame {

    /**
     * Creates new form CadastroOrdem
     */
    private MenuVendedor menuVendedor;
    private Vendedor vendedor;
    
    public CadastroOrdem() {
        initComponents();
        ClienteSelected.removeAllItems();
        ClienteSelected.addItem("Selecione");
        
        bg.add(ManutencaoButton);
        bg.add(OrcamentoButton);
    }
    /**
    * Transfere para a tela Visualizar Ordens Pendentes a referencia da tela MenuVendedor
    * e a variavel Vendedor utilizada no menu
    * @param menuVend - Referente a tela anterior
    * @param vendedor - Variavel utilizada
    */
    public void enviaVendedor(MenuVendedor menuVend, Vendedor vendedor) {
        this.menuVendedor = menuVend;
        this.vendedor = vendedor;
        List<Cliente> clientes = vendedor.getListaClientes();
        
        if(!clientes.isEmpty())
            ClienteSelected.removeAllItems();
        
        for(Cliente cli : clientes) {
            ClienteSelected.addItem(cli.getCpf());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ClienteSelected = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MotivoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        KmText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescricaoText = new javax.swing.JTextArea();
        Cadastrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ManutencaoButton = new javax.swing.JRadioButton();
        OrcamentoButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Ordem");

        ClienteSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ClienteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteSelectedActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel3.setText("Motivo:");

        MotivoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotivoTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Kilometragem do carro:");

        KmText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KmTextKeyTyped(evt);
            }
        });

        jLabel5.setText("CPF do cliente:");

        jLabel6.setText("Descrição:");

        DescricaoText.setColumns(20);
        DescricaoText.setRows(5);
        jScrollPane1.setViewportView(DescricaoText);

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        ManutencaoButton.setText("Manutenção");
        ManutencaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManutencaoButtonActionPerformed(evt);
            }
        });

        OrcamentoButton.setText("Orçamento");
        OrcamentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrcamentoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(MotivoText)
                                        .addComponent(jLabel4)
                                        .addComponent(KmText, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                    .addComponent(ManutencaoButton)
                                    .addComponent(OrcamentoButton)
                                    .addComponent(jLabel5)
                                    .addComponent(ClienteSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                .addGap(116, 116, 116))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ManutencaoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrcamentoButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MotivoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Cancelar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MotivoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotivoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotivoTextActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
        
        menuVendedor.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void ClienteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteSelectedActionPerformed

    private void ManutencaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManutencaoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManutencaoButtonActionPerformed

    private void OrcamentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrcamentoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrcamentoButtonActionPerformed

    /**
    * Cadastra a ordem de acordo com os campos introduzidos e selecionados na tela
    */
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if(!MotivoText.getText().equals("") && !KmText.getText().equals("") && !DescricaoText.getText().equals("")) {
            
            String cpf = (String)ClienteSelected.getSelectedItem();

            if(!cpf.equals("Selecione")) {
                String tipo = "Orçamento";
                if(ManutencaoButton.isSelected())
                    tipo = "Manutenção";

                Ordem ordem = new Ordem(tipo, MotivoText.getText(), DescricaoText.getText(), Double.parseDouble(KmText.getText()), false, false, vendedor.getIdOrdem(), cpf);

                if(tipo.equals("Manutenção"))
                    ordem.setAprovacao(true);

                vendedor.addOrdem(ordem);
            }

            menuVendedor.setVendedor(vendedor);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Message", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            menuVendedor.setVisible(true);
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Campos vazios não são permitidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    /**
    * Acompanha os eventos de digitação do campo de Km para que nao seja digitado letras
    */
    private void KmTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KmTextKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }           
    }//GEN-LAST:event_KmTextKeyTyped

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
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroOrdem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> ClienteSelected;
    private javax.swing.JTextArea DescricaoText;
    private javax.swing.JTextField KmText;
    private javax.swing.JRadioButton ManutencaoButton;
    private javax.swing.JTextField MotivoText;
    private javax.swing.JRadioButton OrcamentoButton;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
