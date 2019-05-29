package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.model.Cliente;
import com.grupo8.perfumariapdv.model.Validacao;
import com.grupo8.perfumariapdv.controller.ClienteController;
import com.grupo8.perfumariapdv.fonts.FontManager;
import java.awt.Font;
import javax.swing.JOptionPane;

public class ClienteCadastroAlteracaoView extends javax.swing.JInternalFrame {
//==============================================================================       
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public ClienteCadastroAlteracaoView() {
        initComponents();
    }

    //NAO MEXER NO METODO ABAIXO (CÓDIGO GERADOR)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        rdbFeminino = new javax.swing.JRadioButton();
        rdbMasculino = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelefoneCelular = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTelefoneOutros = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Cadastro de Cliente");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");

        txtNome.setBackground(java.awt.Color.white);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CPF");

        txtCpf.setBackground(java.awt.Color.white);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtCpf.setMinimumSize(new java.awt.Dimension(4, 22));
        txtCpf.setPreferredSize(new java.awt.Dimension(47, 22));
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Data de nascimento");

        txtDataNascimento.setBackground(java.awt.Color.white);
        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtDataNascimento.setMinimumSize(new java.awt.Dimension(4, 22));
        txtDataNascimento.setPreferredSize(new java.awt.Dimension(34, 22));
        txtDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusLost(evt);
            }
        });
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Sexo");

        rdbFeminino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdbFeminino);
        rdbFeminino.setText("F");

        rdbMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdbMasculino);
        rdbMasculino.setText("M");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Estado Civíl");

        cboEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        cboEstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)" }));
        cboEstadoCivil.setMinimumSize(new java.awt.Dimension(103, 22));
        cboEstadoCivil.setPreferredSize(new java.awt.Dimension(103, 22));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado");

        cboEstado.setBackground(new java.awt.Color(255, 255, 255));
        cboEstado.setForeground(new java.awt.Color(0, 0, 0));
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cboEstado.setMinimumSize(new java.awt.Dimension(51, 22));
        cboEstado.setPreferredSize(new java.awt.Dimension(51, 22));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cidade");

        txtCidade.setBackground(java.awt.Color.white);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Bairro");

        txtBairro.setBackground(java.awt.Color.white);
        txtBairro.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtBairro.setPreferredSize(new java.awt.Dimension(123123, 22));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Logradouro ");

        txtLogradouro.setBackground(java.awt.Color.white);
        txtLogradouro.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtLogradouro.setPreferredSize(new java.awt.Dimension(123123, 22));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Número");

        txtNumero.setBackground(java.awt.Color.white);
        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtNumero.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtNumero.setPreferredSize(new java.awt.Dimension(123123, 22));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("E-mail");

        txtEmail.setBackground(java.awt.Color.white);
        txtEmail.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtEmail.setPreferredSize(new java.awt.Dimension(123123, 22));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Telefone Celular");

        txtTelefoneCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTelefoneCelular.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Telefone (Outros)");

        txtTelefoneOutros.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneOutros.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefoneOutros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTelefoneOutros.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtTelefoneOutros.setPreferredSize(new java.awt.Dimension(123123, 22));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Observações");

        txtObservacoes.setBackground(java.awt.Color.white);
        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        txtObservacoes.setMaximumSize(new java.awt.Dimension(2147483647, 843));
        jScrollPane1.setViewportView(txtObservacoes);

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 102, 51));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("OK");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbFeminino))
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtTelefoneOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbMasculino)
                            .addComponent(rdbFeminino)
                            .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addGap(30, 30, 30))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
     //INSTANCIA DE CLIENTE PARA CASO DE EDICAO
    private Cliente cliente = null;
    
    //MODO DA TELA CRIAÇÃO E EDICAO
    private boolean modoEdicao = false;
    
    //ID DE CLIENTE PARA CASO DE EDICAO
    private Integer idCliente;
    
    //TEXTO DO CABECARIO
    private String cabecario = "Cadastro de Cliente";
    
    //GETERS E SETERS DA PÁGINA
     public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean isModoEdicao() {
        return modoEdicao;
    }
    
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
    
    
    //FUNÇÃO DE LIMPAR FORMULÁRIO CADASTRAR/ALTERAR CLIENTE
    public void limparFormulario(){
        txtNome.setText("");
        txtCpf.setText("");
        txtDataNascimento.setText("");
        buttonGroup1.clearSelection();
        cboEstadoCivil.setSelectedIndex(0);
        cboEstado.setSelectedIndex(0);
        txtCidade.setText("");
        txtBairro.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtEmail.setText("");
        txtTelefoneCelular.setText("");
        txtTelefoneOutros.setText("");
        txtObservacoes.setText("");
    }
    
    //FUNCAO PARA CARREGAR DADOS DO CLIENTE NA TELA
    public void carregarDadosTela(){
        //verifica se está no modo de edição e há um cliente para edição
        if (modoEdicao && cliente != null) 
        {
            //campos normais usar "setText"
            //campos formatados usar "setValue"
            txtNome.setText(cliente.getNome());
            txtCpf.setValue(cliente.getCpf());
            txtDataNascimento.setValue(cliente.getDataNascimento());
            
            //Para radio buttons fazer a validação abaixo
            if (cliente.getSexo() == rdbMasculino.getText()){
                rdbMasculino.setSelected(true);
           }else{
                rdbFeminino.setSelected(true);
            }
                        
            //combobox fazer for e achar item 
            for (int i = 0; i < cboEstadoCivil.getItemCount(); i++){
                if (cboEstadoCivil.getItemAt(i).equals(cliente.getEstadoCivil())){
                    cboEstadoCivil.setSelectedIndex(i);
                    break;
                }
            }
            for (int i = 0; i < cboEstado.getItemCount(); i++){
                if (cboEstado.getItemAt(i).equals(cliente.getEstado())){
                    cboEstado.setSelectedIndex(i);
                    break;
                }
            }
            
            //campos normais usar "setText"
            //campos formatados usar "setValue"
            txtCidade.setText(cliente.getCidade());
            txtBairro.setText(cliente.getBairro());
            txtLogradouro.setText(cliente.getLogradouro());
            txtNumero.setValue(Integer.parseInt(cliente.getNumero()));
            txtEmail.setText(cliente.getEmail());
            txtTelefoneCelular.setValue(Integer.parseInt(cliente.getTelefoneCelular()));
            txtTelefoneOutros.setValue(Integer.parseInt(cliente.getTelefoneOutros()));
            txtObservacoes.setText(cliente.getObservacoes());
        }
    }
    
    //BOTÃO SALVAR ALTERAÇÃO/CADASTRO DE CLIENTE
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //validacao dos campos se foram preenchidos
        String clientePreenchido = Validacao.ClienteCamposVazios(txtNome.getText(),
            txtCpf.getText().replace(".", "").replace("-", "").replaceAll(" ", ""), 
            txtDataNascimento.getText().replaceAll("/", "").replaceAll(" ", ""), 
            cboEstado.getSelectedItem().toString().replaceAll(" ", ""),
            txtCidade.getText(), txtBairro.getText(), txtLogradouro.getText(), txtNumero.getText());
        
        //Se os campos obrigatórios estiverem okay
        if (clientePreenchido.equalsIgnoreCase("") || clientePreenchido == "")
        {
            
            //valida se os campos foram preenchidos com o tamanho correto
            String clienteTamanhoOK = Validacao.ClienteCamposTamanho(txtNome.getText(),
            txtCidade.getText(), txtBairro.getText(), txtLogradouro.getText(), txtNumero.getText(),
            txtEmail.getText(), txtTelefoneCelular.getText(), txtTelefoneOutros.getText(), txtObservacoes.getText());
            
            //Se os campos forem preenchidos com o tamanho correto
            if (clienteTamanhoOK.equalsIgnoreCase("") || clienteTamanhoOK == "")
            {
            
                String respostaController = null;

                //verifica se nao esta em modo de edicao
                if (!modoEdicao){
                    //caso nao esteja cria um novo objeto
                    cliente = new Cliente();
                }

                //coloca dados nos atributos (instancia ocorre no inicio da classe)
                cliente.setNome(txtNome.getText());
                cliente.setCpf(txtCpf.getText());
                cliente.setDataNascimento(txtDataNascimento.getText());
                
                //para radio button usar "isSelected"
                if(rdbMasculino.isSelected()){
                    cliente.setSexo(rdbMasculino.getText());
                }else{
                    cliente.setSexo(rdbFeminino.getText());
                }       
                
                cliente.setEstadoCivil(cboEstadoCivil.getSelectedItem().toString());
                cliente.setEstado(cboEstado.getSelectedItem().toString());
                cliente.setCidade(txtCidade.getText());
                cliente.setBairro(txtBairro.getText());
                cliente.setLogradouro(txtLogradouro.getText());
                cliente.setNumero(txtNumero.getText());
                cliente.setEmail(txtEmail.getText());
                cliente.setTelefoneCelular(txtTelefoneCelular.getText());
                cliente.setTelefoneOutros(txtTelefoneOutros.getText());
                cliente.setObservacoes(txtObservacoes.getText());

                if (!modoEdicao)//for modo de cadastro
                {
                    //envia cliente para salvar para o controller
                    respostaController = ClienteController.salvar(cliente);
                }
                else//caso for mode de alteracao
                {
                    respostaController = ClienteController.atualizar(cliente);
                }

                //verifica resposta do controller
                if (respostaController == null)//se a resposta for positiva
                {
                    if (!modoEdicao)//se for modo de cadastro
                    {
                        JOptionPane.showMessageDialog(rootPane,
                            "Cliente cadastrado com sucesso!",
                            "Confirmação",
                            JOptionPane.INFORMATION_MESSAGE);
                    } 
                    else//caso for modo de alteracao
                    {
                        JOptionPane.showMessageDialog(rootPane,
                            "Cliente atualizado com sucesso!",
                            "Confirmação",
                            JOptionPane.INFORMATION_MESSAGE);    
                        this.dispose();
                    }
                    //Limpa o formulário
                    limparFormulario();
                }
                else//se a resposta do controller for negativa
                {
                    //Exibe mensagens de erro para o usuário
                    JOptionPane.showMessageDialog(rootPane, 
                            respostaController
                                +"\n Procure o administrador do sistema!",
                            "Erro", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            else//se os campos foram preenchidos com tamanhos incorretos 
            {
                JOptionPane.showMessageDialog(rootPane, 
                    "Os campos abaixo ultrapassaram os limites de caracteres:" 
                            + clienteTamanhoOK + 
                            "\nPreencha os campo corretamente e tente novamente!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        else//se os campos obrigatorios nao foram preenchidos
        {
            JOptionPane.showMessageDialog(this,"O(s) campo(s) abaixo:\n"+clientePreenchido+
                "Não foram preenchidos, preencha-os e tente novamente!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    //BOTÃO SAIR DA TELA DE CADASTRO/ALTERACAO DE CLIENTES
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    //QUANDO A INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
        
        //Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed
    
    //QUANDO FORM É EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Colocar a variavel cabecario no jlabel
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formComponentShown
    
    //EVENTO PARA VERIFICAR SE A DATA DE NASCIMENTO É VÁLIDA
    private void txtDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusLost
        try{
            Cliente cliente = new Cliente();
            cliente.setDataNascimento(txtDataNascimento.getText());
            String dia = cliente.getDataNascimento().substring(0, 2);
            String mes = cliente.getDataNascimento().substring(3, 5);
            String ano = cliente.getDataNascimento().substring(6, 10);

            if(Integer.parseInt(dia) > 31 || Integer.parseInt(mes) > 12 || Integer.parseInt(ano) < 1900){
                JOptionPane.showMessageDialog(rootPane,
                    "A data inserida no campo não é uma data válida. \n"
                            + "Preencha-o novamente com uma data válida!",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,
                    "Você tentou inserir uma data inválida ou não preencheu o campo. \n"
                            + "Preencha-o novamente com uma data válida!",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_txtDataNascimentoFocusLost

//==============================================================================
    //NAO MEXER (ELEMENTOS DA TELA)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JRadioButton rdbFeminino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JFormattedTextField txtTelefoneCelular;
    private javax.swing.JFormattedTextField txtTelefoneOutros;
    // End of variables declaration//GEN-END:variables
//==============================================================================       
}
