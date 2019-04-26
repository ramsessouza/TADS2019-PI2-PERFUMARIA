package com.grupo8.perfumariapdv.view;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;

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

        jpTudo = new javax.swing.JPanel();
        jpCabecario = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jpBotoes = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnCadastroProduto = new javax.swing.JButton();
        btnConsultaProduto = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        btnRelatorioVendas = new javax.swing.JButton();
        jpCorpo = new javax.swing.JPanel();
        dskPainelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PerfumariaPDV 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 560));
        setMinimumSize(new java.awt.Dimension(1024, 560));
        setResizable(false);

        jpTudo.setBackground(new java.awt.Color(255, 255, 255));
        jpTudo.setMaximumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setMinimumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setPreferredSize(new java.awt.Dimension(1024, 560));

        jpCabecario.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecario.setMaximumSize(new java.awt.Dimension(1024, 40));
        jpCabecario.setMinimumSize(new java.awt.Dimension(1024, 40));
        jpCabecario.setPreferredSize(new java.awt.Dimension(1024, 40));

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCabecarioLayout = new javax.swing.GroupLayout(jpCabecario);
        jpCabecario.setLayout(jpCabecarioLayout);
        jpCabecarioLayout.setHorizontalGroup(
            jpCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCabecarioLayout.setVerticalGroup(
            jpCabecarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpBotoes.setBackground(new java.awt.Color(51, 51, 51));
        jpBotoes.setMaximumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setMinimumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setPreferredSize(new java.awt.Dimension(165, 502));

        btnVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnVenda.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        btnVenda.setBorder(null);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCadastroProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastroProduto.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setText("Cadastra Produto");
        btnCadastroProduto.setBorder(null);
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        btnConsultaProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnConsultaProduto.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnConsultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaProduto.setText("Consulta Produto");
        btnConsultaProduto.setBorder(null);
        btnConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProdutoActionPerformed(evt);
            }
        });

        btnCadastroCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastroCliente.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroCliente.setText("Cadastro Cliente");
        btnCadastroCliente.setBorder(null);
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnConsultaCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnConsultaCliente.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaCliente.setText("Consulta Cliente");
        btnConsultaCliente.setBorder(null);
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });

        btnRelatorioVendas.setBackground(new java.awt.Color(51, 51, 51));
        btnRelatorioVendas.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnRelatorioVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioVendas.setText("Relatório Vendas");
        btnRelatorioVendas.setBorder(null);
        btnRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastroProduto)
                        .addComponent(btnConsultaCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCadastroCliente, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnConsultaProduto)
                    .addComponent(btnRelatorioVendas))
                .addGap(19, 19, 19))
        );
        jpBotoesLayout.setVerticalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jpCorpo.setMaximumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setMinimumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setPreferredSize(new java.awt.Dimension(853, 514));

        dskPainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dskPainelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dskPainelPrincipal.setMaximumSize(new java.awt.Dimension(853, 514));
        dskPainelPrincipal.setMinimumSize(new java.awt.Dimension(853, 514));

        javax.swing.GroupLayout dskPainelPrincipalLayout = new javax.swing.GroupLayout(dskPainelPrincipal);
        dskPainelPrincipal.setLayout(dskPainelPrincipalLayout);
        dskPainelPrincipalLayout.setHorizontalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        dskPainelPrincipalLayout.setVerticalGroup(
            dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpCorpoLayout = new javax.swing.GroupLayout(jpCorpo);
        jpCorpo.setLayout(jpCorpoLayout);
        jpCorpoLayout.setHorizontalGroup(
            jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCorpoLayout.setVerticalGroup(
            jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpTudoLayout = new javax.swing.GroupLayout(jpTudo);
        jpTudo.setLayout(jpTudoLayout);
        jpTudoLayout.setHorizontalGroup(
            jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTudoLayout.createSequentialGroup()
                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpTudoLayout.createSequentialGroup()
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpTudoLayout.setVerticalGroup(
            jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTudoLayout.createSequentialGroup()
                .addComponent(jpCabecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTudoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTudoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        //retira o painel superior
        ((BasicInternalFrameUI)clienteCadastroAlteracao.getUI()).setNorthPane(null); 
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
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpCabecario;
    private javax.swing.JPanel jpCorpo;
    private javax.swing.JPanel jpTudo;
    // End of variables declaration//GEN-END:variables
//==============================================================================
}
