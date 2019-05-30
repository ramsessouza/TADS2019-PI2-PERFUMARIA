package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ClienteController;
import com.grupo8.perfumariapdv.fonts.FontManager;
import com.grupo8.perfumariapdv.model.Cliente;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ClienteConsultaView extends javax.swing.JInternalFrame {
//==============================================================================
//NAO MEXER
//==============================================================================     
    //INICIALIZAÇÃO DOS COMPONENTES
    public ClienteConsultaView() {
        initComponents();
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTabela = new javax.swing.JTable();

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

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consulta de Cliente");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do Cliente");

        txtClienteNome.setBackground(java.awt.Color.white);
        txtClienteNome.setForeground(new java.awt.Color(0, 0, 0));

        btnPesquisar.setBackground(new java.awt.Color(17, 128, 216));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

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

        btnAlterar.setBackground(new java.awt.Color(0, 102, 51));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(153, 0, 0));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        clienteTabela.setBackground(new java.awt.Color(255, 255, 255));
        clienteTabela.setForeground(new java.awt.Color(255, 255, 255));
        clienteTabela.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id", "Nome", "CPF", "Celular", "Lagradouro", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        clienteTabela.setMinimumSize(new java.awt.Dimension(105, 400));
        clienteTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        clienteTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(clienteTabela);
        if (clienteTabela.getColumnModel().getColumnCount() > 0) {
            clienteTabela.getColumnModel().getColumn(0).setResizable(false);
            clienteTabela.getColumnModel().getColumn(0).setPreferredWidth(5);
            clienteTabela.getColumnModel().getColumn(1).setResizable(false);
            clienteTabela.getColumnModel().getColumn(2).setResizable(false);
            clienteTabela.getColumnModel().getColumn(2).setPreferredWidth(17);
            clienteTabela.getColumnModel().getColumn(3).setResizable(false);
            clienteTabela.getColumnModel().getColumn(4).setResizable(false);
            clienteTabela.getColumnModel().getColumn(5).setResizable(false);
            clienteTabela.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtClienteNome)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
//DECLARAÇÕES
//============================================================================== 
    //DECLARA O MODELO DE TABELA PARA SER USADO NA PESQUISA
    private DefaultTableModel tableModel;
    
    //INSTANCIA DA TELA DE CADASTRO/ALTERACAO DE CLIENTE
    ClienteCadastroAlteracaoView clienteCadastroAlteracao;

//==============================================================================
//FUNÇÕES
//============================================================================== 
    //NAO ESTA SENDO USADO
    public void tableModelLimpar(){
        if(tableModel==null)
        {
            //Obtém a tabela para trabalhar nela
            tableModel = (DefaultTableModel) clienteTabela.getModel();
        }
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
    }
    
    //PESQUISA CLIENTE
    public void pesquisar(){
        List<Cliente> resultado = ClienteController.procurar(
                txtClienteNome.getText());
        
        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) clienteTabela.getModel();
        
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
        
        if (resultado != null && resultado.size() > 0)
        {
            //Percorre a lista de resultados e os adiciona na tabela
            for (int i = 0; i < resultado.size(); i++) 
            {
                
                //Obtém cada item da lista de resultados
                Cliente cliente = resultado.get(i);

                if (cliente != null) 
                {
                    //Cria array com resultados
                    Object[] dadosTabela = new Object[6];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = cliente.getId();
                    dadosTabela[1] = cliente.getNome();
                    dadosTabela[2] = cliente.getCpf();
                    dadosTabela[3] = cliente.getTelefoneCelular();
                    dadosTabela[4] = cliente.getLogradouro();
                    dadosTabela[5] = cliente.getNumero();

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
    //SAI DA TELA DE CONSULTA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    //DELETA CLIENTE 
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        //verifica se tem dados na tabela visual
        if (clienteTabela.getSelectedRow() >= 0) 
        {
            //Obtém a linha do item selecionado na tabela visual
            final int row = clienteTabela.getSelectedRow();

            //obtem nome do cliente para confirmar exclusao
            String nome = (String) clienteTabela.getValueAt(row, 1);

            //Mostra o diálogo de confirmação de exclusão
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o cliente \"" + nome + "\"?",
                    "Confirmar exclusão", 
                    JOptionPane.YES_NO_OPTION);

            //verifica se sim ou nao para exclusao
            if (respostaConfirmacao == JOptionPane.YES_OPTION) 
            {
                //Obtém o ID do cliente da tabela visual
                Integer idCliente = (Integer) clienteTabela.getValueAt(row, 0);

                //Solicita ao serviço a exclusão do cliente com o ID
                String respostaController = ClienteController.excluir(idCliente);
                
                //verifica se deu certo a exclusao
                if (respostaController == null) 
                {   
                    //pesquisa novamente para exibir os dados modificados
                    pesquisar();
                } 
                else 
                {
                    //Exibe a mensagem de erro ao usuário
                    JOptionPane.showMessageDialog(
                            rootPane, 
                            respostaController 
                                    +"\n Procure o administrador do sistema!",
                            "Falha na Exclusão", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    //PESQUISA CLIENTE
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
        
    //ALTERA CLIENTE
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        //obtem a linha da tabela
        int row = clienteTabela.getSelectedRow();
        
        //obtem o id dessa linha
        Integer idCliente = (Integer) clienteTabela.getValueAt(row, 0);
        
        //chama o controller para obter o cliente do id selecionado (nova instancia de cliente)
        Cliente cliente = ClienteController.obter(idCliente);
        
        //verifica se cliente é válido
        if(cliente != null)
        {
            //verifica se a tela ja existe
            if(clienteCadastroAlteracao == null )
            {   
                //se não existir faz uma tela
                clienteCadastroAlteracao = new ClienteCadastroAlteracaoView();
            }
            //seta o cliente da tela de cadastro alteracao com o cliente obtido
            clienteCadastroAlteracao.setCliente(cliente);
            
            //Configura a tela de cadastro/alteracao como uma tela de alteracao
            clienteCadastroAlteracao.setModoEdicao(true);
            
            //coloca a tela com cabecario e titulo de alteracao de cliente
            clienteCadastroAlteracao.setCabecario("Alteração do Cliente: "
                    +cliente.getNome());
            //clienteCadastroAlteracao.setTitle("PDV Vendas / Consulta de Cliente / Alteração de Cliente");
            
            //mostro a tela no painel principal
            this.getParent().add(clienteCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            clienteCadastroAlteracao.setVisible(true);
            
            //coloco ela na frente de todas
            clienteCadastroAlteracao.toFront();
            
            //coloco as informacoes do cliente na tela
            clienteCadastroAlteracao.carregarDadosTela();
        
            //redimensiona tela para tamanho do painel
            try 
            {
                clienteCadastroAlteracao.setMaximum(true);
            } 
            catch (PropertyVetoException ex) 
            {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //retira o painel superior
            ((BasicInternalFrameUI)clienteCadastroAlteracao.getUI()).setNorthPane(null);
        }
        else
        {
            //informa ao usuário que não foi possível abrir o cliente para edição
            JOptionPane.showMessageDialog(rootPane, 
                    "Não foi possível localizar este cliente para edição. "
                            + "\n Procure o administrador do sistema!",
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    //INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Muda a cor do cabecalho da tabela
        clienteTabela.getTableHeader().setBackground(new Color(017, 128, 216));
        clienteTabela.getTableHeader().setForeground(Color.white);
        
        //Muda a cor da fonte da tabela
        clienteTabela.setForeground(Color.black);

        //Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }//GEN-LAST:event_formInternalFrameOpened
    
//==============================================================================
//NAO MEXER
//==============================================================================         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTable clienteTabela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JTextField txtClienteNome;
    // End of variables declaration//GEN-END:variables
}
