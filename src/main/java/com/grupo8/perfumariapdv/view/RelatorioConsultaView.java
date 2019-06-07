package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ItensVendaController;
import com.grupo8.perfumariapdv.controller.ProdutoController;
import com.grupo8.perfumariapdv.controller.VendaController;
import com.grupo8.perfumariapdv.fonts.FontManager;
import com.grupo8.perfumariapdv.model.ItemVenda;
import com.grupo8.perfumariapdv.model.Venda;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioConsultaView extends javax.swing.JInternalFrame {
//==============================================================================
//NAO MEXER
//==============================================================================       
    //INICIALIZAÇÃO DOS COMPONENTES
    public RelatorioConsultaView() {
        initComponents();
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        lbDataInicial = new javax.swing.JLabel();
        dcDataInicial = new datechooser.beans.DateChooserCombo();
        lbDataFinal = new javax.swing.JLabel();
        dcDataFinal = new datechooser.beans.DateChooserCombo();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendasTabela = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consulta de Relatório de Vendas");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCabecalhoLayout.createSequentialGroup()
                    .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCabecalhoLayout.createSequentialGroup()
                    .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        lbDataInicial.setBackground(new java.awt.Color(0, 0, 0));
        lbDataInicial.setForeground(new java.awt.Color(0, 0, 0));
        lbDataInicial.setText("Data inicial");

        dcDataInicial.setCalendarBackground(new java.awt.Color(255, 255, 255));
        dcDataInicial.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        lbDataFinal.setBackground(new java.awt.Color(0, 0, 0));
        lbDataFinal.setForeground(new java.awt.Color(0, 0, 0));
        lbDataFinal.setText("Data Final");

        dcDataFinal.setCalendarBackground(new java.awt.Color(255, 255, 255));
        dcDataFinal.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        btnPesquisar.setBackground(new java.awt.Color(17, 128, 216));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        vendasTabela.setBackground(new java.awt.Color(255, 255, 255));
        vendasTabela.setForeground(new java.awt.Color(255, 255, 255));
        vendasTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Cliente", "Total itens", "Subtotal", "PG Dinheiro", "PG Cartão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendasTabela.setMinimumSize(new java.awt.Dimension(105, 400));
        vendasTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        vendasTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(vendasTabela);
        if (vendasTabela.getColumnModel().getColumnCount() > 0) {
            vendasTabela.getColumnModel().getColumn(0).setResizable(false);
            vendasTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            vendasTabela.getColumnModel().getColumn(1).setResizable(false);
            vendasTabela.getColumnModel().getColumn(1).setPreferredWidth(10);
            vendasTabela.getColumnModel().getColumn(2).setResizable(false);
            vendasTabela.getColumnModel().getColumn(3).setResizable(false);
            vendasTabela.getColumnModel().getColumn(3).setPreferredWidth(3);
            vendasTabela.getColumnModel().getColumn(4).setResizable(false);
            vendasTabela.getColumnModel().getColumn(4).setPreferredWidth(6);
            vendasTabela.getColumnModel().getColumn(5).setResizable(false);
            vendasTabela.getColumnModel().getColumn(5).setPreferredWidth(6);
            vendasTabela.getColumnModel().getColumn(6).setResizable(false);
            vendasTabela.getColumnModel().getColumn(6).setPreferredWidth(6);
        }

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(79, 32));
        btnSair.setMinimumSize(new java.awt.Dimension(79, 32));
        btnSair.setPreferredSize(new java.awt.Dimension(79, 32));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnDetalhes.setBackground(new java.awt.Color(0, 102, 51));
        btnDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalhes.setText("Detalhes");
        btnDetalhes.setMaximumSize(new java.awt.Dimension(79, 32));
        btnDetalhes.setMinimumSize(new java.awt.Dimension(79, 32));
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDataInicial)
                            .addComponent(dcDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDataFinal)
                            .addComponent(dcDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDataInicial)
                            .addComponent(lbDataFinal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
//DECLARAÇÕES
//============================================================================== 
    //DECLARA O MODELO DE TABELA PARA SER USADO NA PESQUISA
    private DefaultTableModel tableModel;
    
    //INSTANCIA DA TELA DE CADASTRO/ALTERACAO DE PRODUTO
    ProdutoCadastroAlteracaoView produtoCadastroAlteracao;

//==============================================================================
//FUNÇÕES
//==============================================================================
    //LIMPA TABELA DE VENDAS
    public void tableModelLimpar(){
        
        if(tableModel==null)
        {
            //Obtém a tabela para trabalhar nela
            tableModel = (DefaultTableModel) vendasTabela.getModel();
        }
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
    }
    
    //PESQUISAR PRODUTO
    public void pesquisar(){
        List<Venda> resultado = VendaController.procurar(
                null,null);
        
        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) vendasTabela.getModel();
        
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
        
        if (resultado != null && resultado.size() > 0)
        {
            //Percorre a lista de resultados e os adiciona na tabela
            for (int i = 0; i < resultado.size(); i++) 
            {
                
                //Obtém cada item da lista de resultados
                Venda venda = resultado.get(i);

                if (venda != null) 
                {
                    //Cria arrai com resultados
                    Object[] dadosTabela = new Object[7];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = venda.getId();
                    //dadosTabela[1] = venda.getData().toString();
                    dadosTabela[1] = venda.getDataString();
                    dadosTabela[2] = venda.getCliente().getNome();
                    dadosTabela[3] = venda.getItensVenda().size();
                    dadosTabela[4] = venda.getSubtotal();
                    dadosTabela[5] = venda.getPagamentoDinheiro();
                    dadosTabela[6] = venda.getPagamentoCartao();

                    //Adiciona a linha de dados na tabela
                    tableModel.addRow(dadosTabela);
                }
            }
        }else{

            //Caso a pesquisa não tenha retornado resultados
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem resultados para a sua pesquisa!",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
//==============================================================================
//EVENTOS
//============================================================================== 
    //DETALHES DA VENDA
    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        //obtem a linha da tabela
        int row = vendasTabela.getSelectedRow();
        
        //obtem o id dessa linha
        Integer idVenda = (Integer) vendasTabela.getValueAt(row, 0);
        
        List<ItemVenda> resultado = ItensVendaController.obterItens(idVenda);
        
//        ItensVendaView itensVendaView = new ItensVendaView(this,true);
//        itensVendaView.setVisible(true);
//        
//        //Obtém a tabela para trabalhar nela
//        tableModel = (DefaultTableModel) vendasTabela.getModel();
//        
//        //Limpa resultados anteriores
//        tableModel.setRowCount(0);
//        
//        if (resultado != null && resultado.size() > 0)
//        {
//            //Percorre a lista de resultados e os adiciona na tabela
//            for (int i = 0; i < resultado.size(); i++) 
//            {
//                
//                //Obtém cada item da lista de resultados
//                Produto produto = resultado.get(i);
//
//                if (produto != null) 
//                {
//                    //Cria array com resultados
//                    Object[] dadosTabela = new Object[6];
//                    //Cada dado na coluna correspondente
//                    dadosTabela[0] = produto.getId();
//                    dadosTabela[1] = produto.getNome();
//                    dadosTabela[2] = produto.getCategoria();
//                    dadosTabela[3] = produto.getQuantidade();
//                    dadosTabela[4] = produto.getCusto();
//                    dadosTabela[5] = produto.getValor();
//
//                    //Adiciona a linha de dados na tabela
//                    tableModel.addRow(dadosTabela);
//                }
//            }
//        }else{
//
//            //Caso a pesquisa não tenha retornado resultados
//            JOptionPane.showMessageDialog(rootPane,
//                    "Não existem resultados para a sua pesquisa!",
//                    "Não há dados",
//                    JOptionPane.ERROR_MESSAGE);
//        }
        
   
    }//GEN-LAST:event_btnDetalhesActionPerformed
    
    //PESQUISAR PRODUTO
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
   
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Muda a cor do cabecalho da tabela
        vendasTabela.getTableHeader().setBackground(new Color(017, 128, 216));
        vendasTabela.getTableHeader().setForeground(Color.white);
        
        //Muda a cor da fonte da tabela
        vendasTabela.setForeground(Color.black);

        //Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }//GEN-LAST:event_formInternalFrameOpened
    
    //SAIR DA TELA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

//==============================================================================
//NAO MEXER
//==============================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private datechooser.beans.DateChooserCombo dcDataFinal;
    private datechooser.beans.DateChooserCombo dcDataInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbDataFinal;
    private javax.swing.JLabel lbDataInicial;
    private javax.swing.JTable vendasTabela;
    // End of variables declaration//GEN-END:variables
}
