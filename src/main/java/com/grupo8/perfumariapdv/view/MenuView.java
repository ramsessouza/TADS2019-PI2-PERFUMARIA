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
        jpCabecalho = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jpBotoes = new javax.swing.JPanel();
        btnVenda = new javax.swing.JButton();
        btnCadastroProduto = new javax.swing.JButton();
        btnConsultaProduto = new javax.swing.JButton();
        btnCadastroCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        btnRelatorioVendas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(1024, 40));

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desligar.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jpBotoes.setBackground(new java.awt.Color(102, 102, 102));
        jpBotoes.setForeground(new java.awt.Color(153, 153, 153));
        jpBotoes.setMaximumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setMinimumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setPreferredSize(new java.awt.Dimension(165, 502));

        btnVenda.setBackground(new java.awt.Color(102, 102, 102));
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        btnVenda.setBorder(null);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCadastroProduto.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setText("Cadastrar Produto");
        btnCadastroProduto.setBorder(null);
        btnCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutoActionPerformed(evt);
            }
        });

        btnConsultaProduto.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaProduto.setText("Consultar Produto");
        btnConsultaProduto.setBorder(null);
        btnConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProdutoActionPerformed(evt);
            }
        });

        btnCadastroCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroCliente.setText("Cadastrar Cliente");
        btnCadastroCliente.setBorder(null);
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        btnConsultaCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaCliente.setText("Consultar Cliente");
        btnConsultaCliente.setBorder(null);
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });

        btnRelatorioVendas.setBackground(new java.awt.Color(102, 102, 102));
        btnRelatorioVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioVendas.setText("Relatório");
        btnRelatorioVendas.setBorder(null);
        btnRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioVendasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar_produto.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultar_produto.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar_cliente.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consultar_cliente.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio_vendas.png"))); // NOI18N

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
            jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpBotoesLayout.createSequentialGroup()
                        .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpBotoesLayout.createSequentialGroup()
                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpBotoesLayout.createSequentialGroup()
                                        .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jpBotoesLayout.createSequentialGroup()
                                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
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
                    .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpTudoLayout.createSequentialGroup()
                        .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpTudoLayout.setVerticalGroup(
            jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTudoLayout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
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
        
        //coloca cabecario de acordo com a funcao cadasto/alteracao
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
        
        //retira o painel superior
        ((BasicInternalFrameUI)produtoCadastroAlteracao.getUI()).setNorthPane(null);
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
        
        //retira o painel superior
        ((BasicInternalFrameUI)produtoConsulta.getUI()).setNorthPane(null);
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
        
        //coloca cabecario de acordo com a funcao cadasto/alteracao
        clienteCadastroAlteracao.setCabecario("Cadastro de Cliente");
        
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
        
        //retira o painel superior
        ((BasicInternalFrameUI)clienteConsulta.getUI()).setNorthPane(null);
    }//GEN-LAST:event_btnConsultaClienteActionPerformed
    
    //BOTAO CONSULTA DE RELATORIO VENDAS
    private void btnRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioVendasActionPerformed
        //verifica se a tela ja existe
        if(relatorioConsulta == null )
        {   
            //se não existir faz uma tela
            relatorioConsulta = new RelatorioConsultaView();
        }
        
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
        
        //retira o painel superior
        ((BasicInternalFrameUI)relatorioConsulta.getUI()).setNorthPane(null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpCorpo;
    private javax.swing.JPanel jpTudo;
    // End of variables declaration//GEN-END:variables
//==============================================================================
}
