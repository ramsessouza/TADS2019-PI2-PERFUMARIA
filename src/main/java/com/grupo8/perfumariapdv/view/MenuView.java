package com.grupo8.perfumariapdv.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuView extends javax.swing.JFrame {
//==============================================================================    
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public MenuView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //NAO MEXER NO METODO ABAIXO (PARA INICIALIZAR O FORMULÁRIO)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dskPainelPrincipal = new javax.swing.JDesktopPane();
        btnVenda = new javax.swing.JButton();
        btnCadastroProduto = new javax.swing.JButton();
        btnConsultaProduto = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        btnRelatorioVendas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 540));
        setPreferredSize(new java.awt.Dimension(870, 540));
        setResizable(false);

        dskPainelPrincipal.setMaximumSize(new java.awt.Dimension(690, 490));
        dskPainelPrincipal.setMinimumSize(new java.awt.Dimension(690, 490));
        dskPainelPrincipal.setPreferredSize(new java.awt.Dimension(690, 490));

        javax.swing.GroupLayout dskPainelPrincipalLayout = new javax.swing.GroupLayout(dskPainelPrincipal);
        dskPainelPrincipal.setLayout(dskPainelPrincipalLayout);
        dskPainelPrincipalLayout.setHorizontalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dskPainelPrincipalLayout.setVerticalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnVenda.setText("Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCadastroProduto.setText("Cadastrar Produtos");
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        btnConsultaProduto.setText("Consultar Produtos");
        btnConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProdutoActionPerformed(evt);
            }
        });

        btnCadastroCliente.setText("Cadastro Cliente");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnConsultaCliente.setText("Consulta Cliente");
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });

        btnRelatorioVendas.setText("Relatório Vendas");
        btnRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioVendasActionPerformed(evt);
            }
        });

        btnSair.setText("Sair ");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //NAO MEXER NO METODO ABAIXO (DECLARACAO DE CLASSE PRINCIPAL)
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }
//==============================================================================
    private ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    private ProdutoConsultaView produtoConsulta;
    
    
    //BOTÃO CADASTRO DE PRODUTO
    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed
        //verifica se a tela ja existe
        if(produtoCadastroAlteracao == null )
        {   
            //se não existir faz uma tela
            produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
        }
        
        //verifico se a tela ja esta no painel
        if(!produtoCadastroAlteracao.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(produtoCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoCadastroAlteracao.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        produtoCadastroAlteracao.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            produtoCadastroAlteracao.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //coloca título de acordo com a funcao cadasto/alteracao
        produtoCadastroAlteracao.setTitle("CADASTRO DE PRODUTOS");
    }//GEN-LAST:event_btnCadastroProdutoActionPerformed
    
    //BOTÃO CONSULTA DE PRODUTO
    private void btnConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProdutoActionPerformed
        //verifica se a tela ja existe
        if(produtoConsulta == null )
        {   
            //se não existir faz uma tela
            produtoConsulta = new ProdutoConsultaView();
        }
        
        //verifico se a tela ja esta no painel
        if(!produtoConsulta.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(produtoConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoConsulta.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        produtoConsulta.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            produtoConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //limpa tabela de pesquisa
        produtoConsulta.tableModelLimpar();
    }//GEN-LAST:event_btnConsultaProdutoActionPerformed
    
    //BOTÃO DE SAIR DO SISTEMA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    private void btnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaClienteActionPerformed

    private void btnRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioVendasActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendaActionPerformed
    
   
//==============================================================================
    //NAO MEXER (ELEMENTOS DA TELA)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JButton btnConsultaCliente;
    private javax.swing.JButton btnConsultaProduto;
    private javax.swing.JButton btnRelatorioVendas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVenda;
    private javax.swing.JDesktopPane dskPainelPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
//==============================================================================
}
