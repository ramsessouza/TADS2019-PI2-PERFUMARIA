package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.controller.ProdutoController;
import com.grupo8.perfumariapdv.model.Produto;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteConsultaView extends javax.swing.JInternalFrame {
//==============================================================================       
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public ClienteConsultaView() {
        initComponents();
    }

    //NAO MEXER NO METODO ABAIXO (CÓDIGO GERADOR)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTabela = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
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
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setFont(new java.awt.Font("Futura PT", 0, 20)); // NOI18N
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consulta de Cliente");

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Futura PT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do Cliente");

        txtClienteNome.setBackground(java.awt.Color.white);
        txtClienteNome.setFont(new java.awt.Font("Futura PT", 0, 13)); // NOI18N
        txtClienteNome.setMinimumSize(new java.awt.Dimension(14, 24));
        txtClienteNome.setPreferredSize(new java.awt.Dimension(14, 24));

        btnPesquisar.setBackground(new java.awt.Color(17, 128, 216));
        btnPesquisar.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        clienteTabela.setBackground(java.awt.Color.white);
        clienteTabela.setFont(new java.awt.Font("Futura PT", 0, 13)); // NOI18N
        clienteTabela.setForeground(new java.awt.Color(255, 255, 255));
        clienteTabela.setModel(new javax.swing.table.DefaultTableModel(
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
                "Id", "Nome", "Sexo", "CPF", "RG", "Logradouro", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(clienteTabela);
        if (clienteTabela.getColumnModel().getColumnCount() > 0) {
            clienteTabela.getColumnModel().getColumn(0).setResizable(false);
            clienteTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            clienteTabela.getColumnModel().getColumn(2).setResizable(false);
            clienteTabela.getColumnModel().getColumn(3).setResizable(false);
            clienteTabela.getColumnModel().getColumn(3).setPreferredWidth(10);
            clienteTabela.getColumnModel().getColumn(4).setResizable(false);
            clienteTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
            clienteTabela.getColumnModel().getColumn(5).setResizable(false);
            clienteTabela.getColumnModel().getColumn(5).setPreferredWidth(5);
            clienteTabela.getColumnModel().getColumn(6).setResizable(false);
            clienteTabela.getColumnModel().getColumn(6).setPreferredWidth(5);
        }

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(17, 128, 216));
        btnAlterar.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(17, 128, 216));
        btnDeletar.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(751, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)))
                        .addGap(14, 14, 14))))
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//==============================================================================       
    //DECLARA O MODELO DE TABELA PARA SER USADO NA PESQUISA
    private DefaultTableModel tableModel;
    
    //INSTANCIA DA TELA DE CADASTRO/ALTERACAO DE PRODUTO
    ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    
    public void tableModelLimpar(){
        //NAO ESTA SENDO USADO
        if(tableModel==null)
        {
            //Obtém a tabela para trabalhar nela
            tableModel = (DefaultTableModel) clienteTabela.getModel();
        }
        //Limpa resultados anteriores
        tableModel.setRowCount(0);
    }
    
    //BOTÃO SAIR DA TELA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    //BOTÃO DELETAR PRODUTO 
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        //verifica se tem dados na tabela visual
        if (clienteTabela.getSelectedRow() >= 0) 
        {
            //Obtém a linha do item selecionado na tabela visual
            final int row = clienteTabela.getSelectedRow();

            //obtem nome do produto para confirmar exclusao
            String nome = (String) clienteTabela.getValueAt(row, 1);

            //Mostra o diálogo de confirmação de exclusão
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", 
                    JOptionPane.YES_NO_OPTION);

            //verifica se sim ou nao para exclusao
            if (respostaConfirmacao == JOptionPane.YES_OPTION) 
            {
                //Obtém o ID do produto da tabela visual
                Integer idProduto = (Integer) clienteTabela.getValueAt(row, 0);

                //Solicita ao serviço a exclusão do produto com o ID
                String respostaController = ProdutoController.excluir(idProduto);
                
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
    
    //BOTÃO PESQUISAR PRODUTO
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    //FUNCAO PESQUISAR PRODUTO
    public void pesquisar(){
        List<Produto> resultado = ProdutoController.procurar(
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
                Produto produto = resultado.get(i);

                if (produto != null) 
                {
                    //Cria arrai com resultados
                    Object[] dadosTabela = new Object[6];
                    //Cada dado na coluna correspondente
                    dadosTabela[0] = produto.getId();
                    dadosTabela[1] = produto.getNome();
                    dadosTabela[2] = produto.getCategoria();
                    dadosTabela[3] = produto.getQuantidade();
                    dadosTabela[4] = produto.getCusto();
                    dadosTabela[5] = produto.getValor();

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
    
    //BOTÃO ALTERAR UM PRODUTO
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        //obtem a linha da tabela
        int row = clienteTabela.getSelectedRow();
        
        //obtem o id dessa linha
        Integer idProduto = (Integer) clienteTabela.getValueAt(row, 0);
        
        //chama o controller para obter o produto do id selecionado (nova instancia de produto)
        Produto produto = ProdutoController.obter(idProduto);
        
        //verifica se produto é válido
        if(produto != null)
        {
            //verifica se a tela ja existe
            if(produtoCadastroAlteracao == null )
            {   
                //se não existir faz uma tela
                produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
            }
            //seta o produto da tela de cadastro alteracao com o cliente obtido
            produtoCadastroAlteracao.setProduto(produto);
            
            //Configura a tela de cadastro/alteracao como uma tela de alteracao
            produtoCadastroAlteracao.setModoEdicao(true);
            
            //coloca a tela com cabecario e titulo de alteracao de produto
            produtoCadastroAlteracao.setCabecario("Alteração do Produto: "
                    +produto.getNome());
            produtoCadastroAlteracao.setTitle("PDV Vendas / Consulta de Produto / Alteração de Produto");
            
            //mostro a tela no painel principal
            this.getParent().add(produtoCadastroAlteracao);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoCadastroAlteracao.setVisible(true);
            
            //coloco ela na frente de todas
            produtoCadastroAlteracao.toFront();
            
            //coloco as informacoes do produto na tela
            produtoCadastroAlteracao.carregarDadosTela();
        
            //redimensiona tela para tamanho do painel
            try 
            {
                produtoCadastroAlteracao.setMaximum(true);
            } 
            catch (PropertyVetoException ex) 
            {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            //informa ao usuário que não foi possível abrir o cliente para edição
            JOptionPane.showMessageDialog(rootPane, 
                    "Não foi possível localizar este produto para edição. "
                            + "\n Procure o administrador do sistema!",
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    //AO ABRIR
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //NAO ESTA SENDO USADO
    }//GEN-LAST:event_formInternalFrameOpened
    
    //AO ATIVAR
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //NAO ESTA SENDO USADO
    }//GEN-LAST:event_formInternalFrameActivated

//==============================================================================       
    //NAO MEXER (ELEMENTOS DA TELA)
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
//==============================================================================       
}
