package com.grupo8.perfumariapdv.view;

import com.grupo8.perfumariapdv.model.Produto;
import com.grupo8.perfumariapdv.model.Validacao;
import com.grupo8.perfumariapdv.controller.ProdutoController;
import javax.swing.JOptionPane;

public class ProdutoCadastroAlteracaoView extends javax.swing.JInternalFrame {
//==============================================================================       
    //NAO MEXER NO METODO ABAIXO (INICIALIZAÇÃO DOS COMPONENTES)
    public ProdutoCadastroAlteracaoView() {
        initComponents();
    }

    //NAO MEXER NO METODO ABAIXO (CÓDIGO GERADOR)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pneCadastroProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lbCabecario = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 600));
        setMinimumSize(new java.awt.Dimension(1280, 600));
        setPreferredSize(new java.awt.Dimension(1280, 600));
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

        pneCadastroProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel2.setText("Nome");

        jLabel3.setText("Categoria");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Higiene", "Cosmeticos" }));

        jLabel4.setText("Quantidade");

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel5.setText("Custo");

        jLabel7.setText("R$");

        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel6.setText("Valor");

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel1.setText("Descrição");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jLabel8.setText("R$");

        javax.swing.GroupLayout pneCadastroProdutoLayout = new javax.swing.GroupLayout(pneCadastroProduto);
        pneCadastroProduto.setLayout(pneCadastroProdutoLayout);
        pneCadastroProdutoLayout.setHorizontalGroup(
            pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidade))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pneCadastroProdutoLayout.setVerticalGroup(
            pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(pneCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pneCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setText("OK");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lbCabecario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbCabecario.setText("Cadastro de Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pneCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCabecario, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCabecario)
                .addGap(18, 18, 18)
                .addComponent(pneCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//==============================================================================
     //INSTANCIA DE PRODUTO PARA CASO DE EDICAO
    private Produto produto = null;
    
    //MODO DA TELA CRIAÇÃO E EDICAO
    private boolean modoEdicao = false;
    
    //ID DE PRODUTO PARA CASO DE EDICAO
    private Integer idProduto;
    
    //TEXTO DO CABECARIO
    private String cabecario;
    
    //GETERS E SETERS DA PÁGINA
     public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public boolean isModoEdicao() {
        return modoEdicao;
    }
    
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
    
    
    
    //FUNÇÃO DE LIMPAR FORMULÁRIO CADASTRAR/ALTERAR PRODUTO
    public void limparFormulario(){
        txtNome.setText("");
        cboCategoria.setSelectedIndex(0); 
        txtQuantidade.setText("");
        txtCusto.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }
    
    //FUNCAO PARA CARREGAR DADOS DO PRODUTO NA TELA
    public void carregarDadosTela(){
        //verifica se está no modo de edição e há um produto para edição
        if (modoEdicao && produto != null) 
        {
            txtNome.setText(produto.getNome());
            
            //combobox fazer for e achar item 
            for (int i = 0; i < cboCategoria.getItemCount(); i++) 
            {
                if (cboCategoria.getItemAt(i).equals(produto.getCategoria())) 
                {
                    cboCategoria.setSelectedIndex(i);
                    break;
                }
            }
            
            //campos formatados usar "setValue"
            txtQuantidade.setValue(produto.getQuantidade());
            txtCusto.setValue(produto.getCusto());
            txtValor.setValue(produto.getValor());
            
            txtDescricao.setText(produto.getDescricao());
        }
    }
    
    //BOTÃO SALVAR ALTERAÇÃO/CADASTRO DE PRODUTO
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        //validacao dos campos
        String produtoOK = Validacao.Produto(txtNome.getText(),
            cboCategoria.getSelectedItem().toString(), txtQuantidade.getText(),
            txtCusto.getText(), txtValor.getText());
        
        //Se os campos obrigatórios estiverem okay
        if (produtoOK.equalsIgnoreCase("") || produtoOK == "")
        {
            String respostaController = null;
            
            //verifica se nao esta em modo de edicao
            if (!modoEdicao){
                //caso nao esteja cria um novo objeto
                produto = new Produto();
            }
            
            //coloca dados nos atributos (instancia ocorre no inicio da classe)
            produto.setNome(txtNome.getText());
            produto.setCategoria(cboCategoria.getSelectedItem().toString());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produto.setCusto(Float.parseFloat(txtCusto.getText().replaceAll(",", ".")));
            produto.setValor(Float.parseFloat(txtValor.getText().replaceAll(",", ".")));
            produto.setDescricao(txtDescricao.getText());
                
            if (!modoEdicao)//for modo de cadastro
            {
                //envia produto para salvar para o controller
                respostaController = ProdutoController.salvar(produto);
            }
            else//caso for mode de alteracao
            {
                respostaController = ProdutoController.atualizar(produto);
            }
            
            //verifica resposta do controller
            if (respostaController == null)//se a resposta for positiva
            {
                if (!modoEdicao)//se for modo de cadastro
                {
                    JOptionPane.showMessageDialog(rootPane,
                        "Produto cadastrado com sucesso!",
                        "Confirmação",
                        JOptionPane.INFORMATION_MESSAGE);
                } 
                else//caso for modo de alteracao
                {
                    JOptionPane.showMessageDialog(rootPane,
                        "Produto atualizado com sucesso!",
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
        else//se os campos obrigatorios nao foram preenchidos
        {
            JOptionPane.showMessageDialog(this,"O(s) campo(s) abaixo:\n"+produtoOK+
                "Não foram preenchidos, preencha-os e tente novamente!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    //BOTÃO SAIR DA TELA DE CADASTRO/ALTERACAO DE PRODUTOS
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    //QUANDO FORM INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Colocar a variavel cabecario no jlabel
        lbCabecario.setText(cabecario);
    }//GEN-LAST:event_formInternalFrameOpened
    
    //QUANDO FORM É EXIBIDO
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Colocar a variavel cabecario no jlabel
        lbCabecario.setText(cabecario);
    }//GEN-LAST:event_formComponentShown

//==============================================================================
    //NAO MEXER (ELEMENTOS DA TELA)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCabecario;
    private javax.swing.JPanel pneCadastroProduto;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
//==============================================================================       
}
