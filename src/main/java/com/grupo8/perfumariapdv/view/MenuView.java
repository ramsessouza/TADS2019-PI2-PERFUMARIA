package com.grupo8.perfumariapdv.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

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
        lbCabecario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PerfumariaPDV 1.0");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(888, 588));
        jPanel1.setMinimumSize(new java.awt.Dimension(888, 588));

        dskPainelPrincipal.setMaximumSize(new java.awt.Dimension(713, 550));
        dskPainelPrincipal.setMinimumSize(new java.awt.Dimension(713, 550));

        javax.swing.GroupLayout dskPainelPrincipalLayout = new javax.swing.GroupLayout(dskPainelPrincipal);
        dskPainelPrincipal.setLayout(dskPainelPrincipalLayout);
        dskPainelPrincipalLayout.setHorizontalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        dskPainelPrincipalLayout.setVerticalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        btnVenda.setText("Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCadastroProduto.setText("Cadastrar Produto");
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        btnConsultaProduto.setText("Consultar Produto");
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

        lbCabecario.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbCabecario.setText("Bem vindo usuário! PDV Vendas Perfumaria 1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        //NIMBUS==================================================================
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
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
        
        //GLASS=================================================================
//        try {
//            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        //EM CASO DE USAR NIMBUS OU GLASS=======================================
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
        
    }
//==============================================================================
    private ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    private ProdutoConsultaView produtoConsulta;
    private ClienteCadastroAlteracaoView clienteCadastroAlteracao;
    private ClienteConsultaView clienteConsulta;
    private RelatorioConsultaView relatorioConsulta;
    
    
    //BOTÃO CADASTRO DE PRODUTO
    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutoActionPerformed
        //verifica se a tela ja existe
        if(produtoCadastroAlteracao == null )
        {   
            //se não existir faz uma tela
            produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
        }
        
        //coloca título e cabecario de acordo com a funcao cadasto/alteracao
        produtoCadastroAlteracao.setTitle("PDV Vendas / Cadastro de Produto");
        produtoCadastroAlteracao.setCabecario("Cadastro de Produto");
        
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
    }//GEN-LAST:event_btnCadastroProdutoActionPerformed
    
    //BOTÃO CONSULTA DE PRODUTO
    private void btnConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProdutoActionPerformed
        //verifica se a tela ja existe
        if(produtoConsulta == null )
        {   
            //se não existir faz uma tela
            produtoConsulta = new ProdutoConsultaView();
        }
        
        //coloca título de acordo com a funcao
        produtoConsulta.setTitle("PDV Vendas / Consulta de Produto");
        
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
    
    //BOTÃO CADASTRO DE CLIENTE
    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        //verifica se a tela ja existe
        if(clienteCadastroAlteracao == null )
        {   
            //se não existir faz uma tela
            clienteCadastroAlteracao = new ClienteCadastroAlteracaoView();
        }
        
        //coloca título de acordo com a funcao cadasto/alteracao
        clienteCadastroAlteracao.setTitle("PDV Vendas / Cadastro Cliente");
        
        //verifico se a tela ja esta no painel
        if(!clienteCadastroAlteracao.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(clienteCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            clienteCadastroAlteracao.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        clienteCadastroAlteracao.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            clienteCadastroAlteracao.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastroClienteActionPerformed

    //BOTÃO CONSULTA DE CLIENTE
    private void btnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClienteActionPerformed
        //verifica se a tela ja existe
        if(clienteConsulta == null )
        {   
            //se não existir faz uma tela
            clienteConsulta = new ClienteConsultaView();
        }
        
        //coloca título de acordo com a funcao
        clienteConsulta.setTitle("PDV Vendas / Consulta de Cliente");
        
        //verifico se a tela ja esta no painel
        if(!clienteConsulta.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(clienteConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            clienteConsulta.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        clienteConsulta.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            clienteConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //limpa tabela de pesquisa
        clienteConsulta.tableModelLimpar();
    }//GEN-LAST:event_btnConsultaClienteActionPerformed
    
    //BOTAO CONSULTA DE RELATORIO VENDAS
    private void btnRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioVendasActionPerformed
        //verifica se a tela ja existe
        if(relatorioConsulta == null )
        {   
            //se não existir faz uma tela
            relatorioConsulta = new RelatorioConsultaView();
        }
        
        //coloca título de acordo com a funcao
        relatorioConsulta.setTitle("PDV Vendas / Relatório de Vendas");
        
        //verifico se a tela ja esta no painel
        if(!relatorioConsulta.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            dskPainelPrincipal.add(relatorioConsulta);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            relatorioConsulta.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        relatorioConsulta.toFront();
        
        //redimensiona tela para tamanho do painel
        try {
            relatorioConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //limpa tabela de pesquisa
        relatorioConsulta.tableModelLimpar();
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
    private javax.swing.JLabel lbCabecario;
    // End of variables declaration//GEN-END:variables
//==============================================================================
}
