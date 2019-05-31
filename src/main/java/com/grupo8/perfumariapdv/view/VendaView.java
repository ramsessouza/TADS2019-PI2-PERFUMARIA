package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ClienteController;
import com.grupo8.perfumariapdv.fonts.FontManager;
import com.grupo8.perfumariapdv.model.Cliente;
import com.grupo8.perfumariapdv.model.Produto;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class VendaView extends javax.swing.JInternalFrame {
//==============================================================================
//NAO MEXER
//==============================================================================  
    //INICIALIZAÇÃO DOS COMPONENTES
    public VendaView() {
        initComponents();
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        lbVendaLogo = new javax.swing.JLabel();
        lbSairVenda = new javax.swing.JLabel();
        lbProdutoNome = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        lbProdutoQuantidade = new javax.swing.JLabel();
        jsProdutoQuantidade = new javax.swing.JSpinner();
        lbProdutoValorUnitario = new javax.swing.JLabel();
        txtProdutoValorUnitario = new javax.swing.JTextField();
        lbProdutoValorTotal = new javax.swing.JLabel();
        txtProdutoValorTotal = new javax.swing.JTextField();
        lbVendaClienteCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btAdicionarItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jpDadosCliente = new javax.swing.JPanel();
        txtClienteNomeInfo = new javax.swing.JTextField();
        txtClienteCpfInfo = new javax.swing.JTextField();
        txtClienteCidadeInfo = new javax.swing.JTextField();
        txtClienteLogradouroInfo = new javax.swing.JTextField();
        txtClienteNumeroInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbDinheiro = new javax.swing.JCheckBox();
        txtPagamentoDinheiro = new javax.swing.JTextField();
        cbCartão = new javax.swing.JCheckBox();
        txtPagamentoCartão = new javax.swing.JTextField();
        jpSubtotal = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btRegistrarVenda = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Venda nº 320");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbVendaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N

        lbSairVenda.setForeground(new java.awt.Color(255, 255, 255));
        lbSairVenda.setText("Sair");
        lbSairVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairVendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lbSairVenda)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbSairVenda))
            .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbProdutoNome.setText("Produto");

        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        txtProdutoNome.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.setPreferredSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutoNomeMouseClicked(evt);
            }
        });

        lbProdutoQuantidade.setText("Quantidade");

        jsProdutoQuantidade.setMinimumSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.setPreferredSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsProdutoQuantidadeStateChanged(evt);
            }
        });
        jsProdutoQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsProdutoQuantidadeFocusLost(evt);
            }
        });

        lbProdutoValorUnitario.setText("Valor unitario");

        txtProdutoValorUnitario.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorUnitario.setPreferredSize(new java.awt.Dimension(14, 25));

        lbProdutoValorTotal.setText("Valor Total");

        txtProdutoValorTotal.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorTotal.setPreferredSize(new java.awt.Dimension(14, 25));

        lbVendaClienteCpf.setText("CPF Cliente");

        txtCpf.setBackground(java.awt.Color.white);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        txtCpf.setMinimumSize(new java.awt.Dimension(4, 26));
        txtCpf.setPreferredSize(new java.awt.Dimension(47, 26));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        btAdicionarItem.setBackground(new java.awt.Color(17, 128, 216));
        btAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarItem.setText("Adicionar Item");
        btAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarItemActionPerformed(evt);
            }
        });

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);
        if (tabelaVenda.getColumnModel().getColumnCount() > 0) {
            tabelaVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(1).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(2).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(2).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(3).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setPreferredWidth(6);
            tabelaVenda.getColumnModel().getColumn(4).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(4).setPreferredWidth(6);
        }

        jpDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jpDadosCliente.setMaximumSize(new java.awt.Dimension(182, 134));
        jpDadosCliente.setMinimumSize(new java.awt.Dimension(182, 134));

        txtClienteNomeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCpfInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCidadeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteLogradouroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteNumeroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        javax.swing.GroupLayout jpDadosClienteLayout = new javax.swing.GroupLayout(jpDadosCliente);
        jpDadosCliente.setLayout(jpDadosClienteLayout);
        jpDadosClienteLayout.setHorizontalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpDadosClienteLayout.createSequentialGroup()
                .addGroup(jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpDadosClienteLayout.setVerticalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosClienteLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pagamento em:");

        cbDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        cbDinheiro.setForeground(new java.awt.Color(51, 51, 51));
        cbDinheiro.setText("Dinheiro");

        txtPagamentoDinheiro.setText("R$ 100,00");

        cbCartão.setBackground(new java.awt.Color(255, 255, 255));
        cbCartão.setForeground(new java.awt.Color(51, 51, 51));
        cbCartão.setText("Cartão");

        txtPagamentoCartão.setText("R$ 450,50");

        jpSubtotal.setBackground(new java.awt.Color(153, 153, 153));

        lbSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtotal.setText("SUBTOTAL DA COMPRA");

        txtSubtotal.setEditable(false);
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setBorder(null);

        javax.swing.GroupLayout jpSubtotalLayout = new javax.swing.GroupLayout(jpSubtotal);
        jpSubtotal.setLayout(jpSubtotalLayout);
        jpSubtotalLayout.setHorizontalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSubtotalLayout.createSequentialGroup()
                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtotal))
        );
        jpSubtotalLayout.setVerticalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(txtSubtotal)
        );

        btRegistrarVenda.setBackground(new java.awt.Color(0, 102, 51));
        btRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarVenda.setText("Registrar Venda");

        btRemoverItem.setBackground(new java.awt.Color(153, 0, 0));
        btRemoverItem.setForeground(new java.awt.Color(255, 255, 255));
        btRemoverItem.setText("Remover Item");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProdutoNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProdutoValorTotal)
                            .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVendaClienteCpf)))
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDinheiro)
                            .addComponent(cbCartão))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPagamentoDinheiro)
                            .addComponent(txtPagamentoCartão, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProdutoValorUnitario)
                        .addComponent(lbProdutoQuantidade)
                        .addComponent(lbProdutoValorTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbProdutoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbVendaClienteCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDinheiro)
                            .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCartão)
                            .addComponent(txtPagamentoCartão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
//DECLARACOES
//============================================================================== 
private VendaConsultaProdutoView consultaProduto;
public MenuView menuView;
//private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();    
private DefaultTableModel tableModel;
private Produto produto;
    
//==============================================================================
//GETS E SETERS
//==============================================================================
    
//==============================================================================
//FUNÇÕES
//==============================================================================     
    //ATUALIZA QUANTIDADE DE PRODUTO
    public void alteraQuantidade(){
        Integer quantidadeAtual = (Integer) jsProdutoQuantidade.getValue();
        Float valorTotal = 0f;
        
        if (quantidadeAtual<1 || quantidadeAtual >999){
            jsProdutoQuantidade.setValue(1);
            quantidadeAtual = 1;
        }
        
        //verifica se tem valor no campo "Valor Unitário"
        if(!txtProdutoValorUnitario.getText().equals("")){
            Float valorUnitario = Float.parseFloat(txtProdutoValorUnitario.getText());
            valorTotal = quantidadeAtual*valorUnitario;
        }
        
        txtProdutoValorTotal.setText(valorTotal.toString());
        
    }
    
//==============================================================================
//EVENTOS
//============================================================================== 
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Muda a cor do cabecalho da tabela
        tabelaVenda.getTableHeader().setBackground(new Color(017, 128, 216));
        tabelaVenda.getTableHeader().setForeground(Color.white);
        
        //Muda a cor da fonte da tabela
        tabelaVenda.setForeground(Color.black);
        
        //Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
        lbSubtotal.setFont(futuraPT20Bold);
        txtSubtotal.setFont(futuraPT20Bold);
        
        //coloca quantidade = 1 para quantidade de produto
        jsProdutoQuantidade.setValue(1);
        
        //desabilita campos produto
        txtProdutoNome.setEditable(false);
        txtProdutoValorUnitario.setEditable(false);
        txtProdutoValorTotal.setEditable(false);
        
        //desabilita campos produto cliente
        txtClienteNomeInfo.setEditable(false);
        txtClienteCpfInfo.setEditable(false);
        txtClienteCidadeInfo.setEditable(false);
        txtClienteLogradouroInfo.setEditable(false);
        txtClienteNumeroInfo.setEditable(false);
        
        //informa no cabecario o número da venda
        Integer venda = null;//procura qual o numero da venda
        
        if(venda == null){
            lbCabecalho.setText("Venda nº 1");
        }
        else{
            lbCabecalho.setText("Venda nº "+venda);
        }
    }//GEN-LAST:event_formInternalFrameOpened
    
    //PESQUISA PRODUTO
    private void txtProdutoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutoNomeMouseClicked
                
        //verifica se a tela ja existe
        if(consultaProduto == null )
        {   
            //se não existir faz uma tela
            consultaProduto = new VendaConsultaProdutoView();
            
            //Centraliza o jInternalFrame no painel principal
            consultaProduto.setLocation(170, 100);
        }
        
        //verifico se a tela ja esta no painel
        if(!consultaProduto.isVisible())
        {    
            //mostro a tela no painel principal caso nao esteja la
            menuView.getDskPainelPrincipal().add(consultaProduto);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            consultaProduto.setVisible(true);
        }
        
        //coloco ela na frente de todas para todos os casos
        consultaProduto.toFront();
        
        //retira o painel superior
        ((BasicInternalFrameUI)consultaProduto.getUI()).setNorthPane(null);        
    }//GEN-LAST:event_txtProdutoNomeMouseClicked
       
    //SAIR DA TELA DE VENDA
    private void lbSairVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairVendaMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbSairVendaMouseClicked
    
    //PROCURAR CLIENTE POR CPF
    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        
        //chama o controller para obter o cliente do id selecionado (nova instancia de cliente)
        Cliente cliente = ClienteController.obter2(txtCpf.getText());

        //se cliente foi encontrado
        if(cliente != null)
        {
            //limpa os campos de cliente
            txtClienteNomeInfo.setText(cliente.getNome());
            txtClienteCpfInfo.setText(cliente.getCpf());
            txtClienteCidadeInfo.setText(cliente.getCidade());
            txtClienteLogradouroInfo.setText(cliente.getLogradouro());
            txtClienteNumeroInfo.setText(cliente.getNumero());
            
        }
        else
        {
            //informa ao usuário que não foi possível encontrar o cliente para edição
            JOptionPane.showMessageDialog(rootPane, 
                "O Cliente não foi encontrado! \n\n"
                        + "Para cadastrar o Cliente vá para Menu > Cadastrar Cliente.",
                "Não encontrado", 
                JOptionPane.INFORMATION_MESSAGE);
            
            //limpa os campos de cliente
            txtClienteNomeInfo.setText("");
            txtClienteCpfInfo.setText("");
            txtClienteCidadeInfo.setText("");
            txtClienteLogradouroInfo.setText("");
            txtClienteNumeroInfo.setText("");
        }
        
    }//GEN-LAST:event_txtCpfFocusLost
    
   //INTERFACE ATIVADA
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        produto = new Produto();
        
        try{
            //coloca dados do produto a partir do produto selecionado 
            //na tela de consulta de produto da venda
            produto.setId(consultaProduto.getProduto().getId());
            produto.setNome(consultaProduto.getProduto().getNome());
            produto.setQuantidade(consultaProduto.getProduto().getQuantidade());
            produto.setValor(consultaProduto.getProduto().getValor());

            //coloca na tela de venda nome e valor do produto
            txtProdutoNome.setText(produto.getNome());
            txtProdutoValorUnitario.setText(produto.getValor().toString());
            
            //atualiza o textbox com subtotal da compra
            alteraQuantidade();
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_formInternalFrameActivated
    
    //ALTERA QUANTIDADE
    private void jsProdutoQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeStateChanged
       alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeStateChanged
    //ALTERA QUANTIDADE
    private void jsProdutoQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeFocusLost
        alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeFocusLost
    
    //ADICIONA ITEM NA VENDA
    private void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarItemActionPerformed
        Float subtotal =0f;
        
        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) tabelaVenda.getModel();
        
        if (produto != null) 
        {
            //Cria array com valores do produto
            Object[] dadosTabela = new Object[5];
            //Cada dado na coluna correspondente
            dadosTabela[0] = produto.getId();
            dadosTabela[1] = produto.getNome();
            dadosTabela[2] = produto.getQuantidade();
            dadosTabela[3] = produto.getValor();
            dadosTabela[4] = Float.parseFloat(txtProdutoValorTotal.getText());
            
            //Adiciona a linha de dados na tabela
            tableModel.addRow(dadosTabela);
        }
        else
        {
            //informa ao usuário que não foi possível encontrar o produto para inserção
            JOptionPane.showMessageDialog(rootPane, 
                "O Produto não foi encontrado! \n\n"
                        + "Procure o administrador do sistemas.",
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
       
        //faz cálculo de subtotal da compra
        for(int i = 1; i <=tableModel.getRowCount(); i++){
            subtotal += (Float) tabelaVenda.getValueAt(i-1, 4);   
        }
        
        //insere valor subtotal da compra na label
        txtSubtotal.setText(subtotal.toString());
    }//GEN-LAST:event_btAdicionarItemActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        try{
            //Resgato o índice da linha selecionada
            int row = tabelaVenda.getSelectedRow();

            //Passo o indice da linha a ser removida
            tableModel.removeRow(row);
        }
        catch(Exception e){}
    }//GEN-LAST:event_btRemoverItemActionPerformed
    
   
//==============================================================================
//NAO MEXER
//==============================================================================  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JCheckBox cbCartão;
    private javax.swing.JCheckBox cbDinheiro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpDadosCliente;
    private javax.swing.JPanel jpSubtotal;
    private javax.swing.JSpinner jsProdutoQuantidade;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbProdutoNome;
    private javax.swing.JLabel lbProdutoQuantidade;
    private javax.swing.JLabel lbProdutoValorTotal;
    private javax.swing.JLabel lbProdutoValorUnitario;
    private javax.swing.JLabel lbSairVenda;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbVendaClienteCpf;
    private javax.swing.JLabel lbVendaLogo;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField txtClienteCidadeInfo;
    private javax.swing.JTextField txtClienteCpfInfo;
    private javax.swing.JTextField txtClienteLogradouroInfo;
    private javax.swing.JTextField txtClienteNomeInfo;
    private javax.swing.JTextField txtClienteNumeroInfo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtPagamentoCartão;
    private javax.swing.JTextField txtPagamentoDinheiro;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoValorTotal;
    private javax.swing.JTextField txtProdutoValorUnitario;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
