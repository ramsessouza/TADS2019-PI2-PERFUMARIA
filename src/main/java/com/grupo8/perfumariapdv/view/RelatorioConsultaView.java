package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ItensVendaController;
import com.grupo8.perfumariapdv.controller.VendaController;
import com.grupo8.perfumariapdv.fonts.FontManager;
import com.grupo8.perfumariapdv.model.ItemVenda;
import com.grupo8.perfumariapdv.model.Venda;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
*@author – GabrielaYamamoto
*/
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
        jpCabecalho2 = new javax.swing.JPanel();
        lbCabecalho2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        itensVendaTabela = new javax.swing.JTable();

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
        lbCabecalho.setText("Relatório de Vendas");
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "CPF Cliente", "Total itens", "Subtotal", "PG Dinheiro", "PG Cartão", "Troco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendasTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        vendasTabela.getTableHeader().setReorderingAllowed(false);
        vendasTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendasTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vendasTabela);
        if (vendasTabela.getColumnModel().getColumnCount() > 0) {
            vendasTabela.getColumnModel().getColumn(0).setResizable(false);
            vendasTabela.getColumnModel().getColumn(0).setPreferredWidth(1);
            vendasTabela.getColumnModel().getColumn(1).setResizable(false);
            vendasTabela.getColumnModel().getColumn(1).setPreferredWidth(3);
            vendasTabela.getColumnModel().getColumn(2).setResizable(false);
            vendasTabela.getColumnModel().getColumn(3).setResizable(false);
            vendasTabela.getColumnModel().getColumn(3).setPreferredWidth(2);
            vendasTabela.getColumnModel().getColumn(4).setResizable(false);
            vendasTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
            vendasTabela.getColumnModel().getColumn(5).setResizable(false);
            vendasTabela.getColumnModel().getColumn(5).setPreferredWidth(5);
            vendasTabela.getColumnModel().getColumn(6).setResizable(false);
            vendasTabela.getColumnModel().getColumn(6).setPreferredWidth(5);
            vendasTabela.getColumnModel().getColumn(7).setResizable(false);
            vendasTabela.getColumnModel().getColumn(7).setPreferredWidth(5);
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

        jpCabecalho2.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho2.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho2.setMinimumSize(new java.awt.Dimension(853, 29));

        lbCabecalho2.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho2.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho2.setText("Itens da Venda");
        lbCabecalho2.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho2.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho2.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalho2Layout = new javax.swing.GroupLayout(jpCabecalho2);
        jpCabecalho2.setLayout(jpCabecalho2Layout);
        jpCabecalho2Layout.setHorizontalGroup(
            jpCabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalho2Layout.createSequentialGroup()
                .addComponent(lbCabecalho2, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCabecalho2Layout.setVerticalGroup(
            jpCabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        itensVendaTabela.setBackground(new java.awt.Color(255, 255, 255));
        itensVendaTabela.setForeground(new java.awt.Color(255, 255, 255));
        itensVendaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id do Item", "Id do Produto", "Nome Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itensVendaTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        itensVendaTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(itensVendaTabela);
        if (itensVendaTabela.getColumnModel().getColumnCount() > 0) {
            itensVendaTabela.getColumnModel().getColumn(0).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            itensVendaTabela.getColumnModel().getColumn(1).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(1).setPreferredWidth(3);
            itensVendaTabela.getColumnModel().getColumn(2).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(3).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(3).setPreferredWidth(3);
            itensVendaTabela.getColumnModel().getColumn(4).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(4).setPreferredWidth(6);
            itensVendaTabela.getColumnModel().getColumn(5).setResizable(false);
            itensVendaTabela.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

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
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(jpCabecalho2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCabecalho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
//DECLARAÇÕES
//============================================================================== 
    private DefaultTableModel tableModel;
    private DefaultTableModel tableMode2;
    
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
        
        String dataInicio = converteData(dcDataInicial.getText());
        String dataFim = converteData(dcDataFinal.getText());
        
        List<Venda> resultado = VendaController.procurar(
                dataInicio, dataFim);
        
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
                    Object[] dadosTabela = new Object[8];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = venda.getId();
                    //dadosTabela[1] = venda.getData().toString();
                    dadosTabela[1] = venda.getDataString();
                    //dadosTabela[2] = venda.getCliente().getNome();
                    dadosTabela[2] = venda.getCliente().getCpf();
                    //dadosTabela[3] = venda.getItensVenda().size(); usado somente com o Mock
                    dadosTabela[3] = venda.getQtdItens();
                    dadosTabela[4] = venda.getSubtotal();
                    dadosTabela[5] = venda.getPagamentoDinheiro();
                    dadosTabela[6] = venda.getPagamentoCartao();
                    dadosTabela[7] = (venda.getPagamentoDinheiro()+venda.getPagamentoCartao())-venda.getSubtotal();
                    
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
    
    //VER DETALHES DA VENDA
    public void detalhesVenda(){
        //obtem a linha da tabela
        Integer row = vendasTabela.getSelectedRow();
        
        //obtem o id dessa linha
        Integer idVenda = (Integer) vendasTabela.getValueAt(row, 0);
        
        List<ItemVenda> resultado = ItensVendaController.obterItens(idVenda);
        
        //Obtém a tabela para trabalhar nela
        tableMode2 = (DefaultTableModel) itensVendaTabela.getModel();
        
        //Limpa resultados anteriores
        tableMode2.setRowCount(0);
        
        if (resultado != null && resultado.size() > 0)
        {
            //Percorre a lista de resultados e os adiciona na tabela
            for (int i = 0; i < resultado.size(); i++) 
            {
                
                //Obtém cada item da lista de resultados
                ItemVenda itemVenda = resultado.get(i);

                if (itemVenda != null) 
                {
                    //Cria arrai com resultados
                    Object[] dadosTabela = new Object[6];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = itemVenda.getIdItem();
                    dadosTabela[1] = itemVenda.getId();
                    dadosTabela[2] = itemVenda.getNome();
                    dadosTabela[3] = itemVenda.getQuantidade();
                    dadosTabela[4] = itemVenda.getValor();
                    dadosTabela[5] = itemVenda.getValorTotal();
                    
                    //Adiciona a linha de dados na tabela
                    tableMode2.addRow(dadosTabela);
                }
            }
        }else{

            //Caso não tenha retornado resultados
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem resultados para esta venda!",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
   
    //CONVERTE DATA dd/mm/aa to aaaa/mm/dd
    public String converteData(String data){
        String dia = data.substring(0, 2);
        String mes = data.substring(3,5);
        String ano = data.substring(6,8);
        
        return "20"+ano+"-"+mes+"-"+dia;
    }
   
//==============================================================================
//EVENTOS
//==============================================================================    
    //PESQUISAR PRODUTO
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
   
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Muda a cor do cabecalho da tabela
        vendasTabela.getTableHeader().setBackground(new Color(017, 128, 216));
        vendasTabela.getTableHeader().setForeground(Color.white);
        itensVendaTabela.getTableHeader().setBackground(new Color(017, 128, 216));
        itensVendaTabela.getTableHeader().setForeground(Color.white);
        
        //Muda a cor da fonte da tabela
        vendasTabela.setForeground(Color.black);
        itensVendaTabela.setForeground(Color.black);

        //Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
        lbCabecalho2.setFont(futuraPT20Bold);
    }//GEN-LAST:event_formInternalFrameOpened
    
    //SAIR DA TELA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void vendasTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendasTabelaMouseClicked
        detalhesVenda();
    }//GEN-LAST:event_vendasTabelaMouseClicked

//==============================================================================
//NAO MEXER
//==============================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private datechooser.beans.DateChooserCombo dcDataFinal;
    private datechooser.beans.DateChooserCombo dcDataInicial;
    private javax.swing.JTable itensVendaTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpCabecalho2;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbCabecalho2;
    private javax.swing.JLabel lbDataFinal;
    private javax.swing.JLabel lbDataInicial;
    private javax.swing.JTable vendasTabela;
    // End of variables declaration//GEN-END:variables
}
