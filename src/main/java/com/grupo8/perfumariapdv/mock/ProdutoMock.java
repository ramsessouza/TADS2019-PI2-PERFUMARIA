package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.Produto;
import java.util.ArrayList;
import java.util.List;


public class ProdutoMock 
{
    private static int sequenciaIdProdutos = 0;
    
    //INSTANCIA DE LISTA DO TIPO ABSTRATO PRODUTO
    private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    
    //CONSTRUTOR DA CLASSE PRODUTOMOCK INICIANDO A LISTA DO TIPO ABSTRATO PRODUTO
    public ProdutoMock(){
        listaProdutos = new ArrayList<Produto>();
    }
    
    //SALVA UM PRODUTO NA LISTA/TABELA DE PRODUTOS
    public static void salvar(Produto produto) throws Exception {
        produto.setId(sequenciaIdProdutos++);
        listaProdutos.add(produto);
    }
    
    //OBTÉM LISTA DE PRODUTOS
    public static List<Produto> listar() throws Exception {
        return listaProdutos;
    }
    
    //PROCURA UM PRODUTO
    public static List<Produto> procurar(String nome) throws Exception{
        
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        //verifica se tem dados na lista
        if (nome != null && listaProdutos.size() > 0) {
            
            //passa pela lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaProdutos.size()) {

                //coloca os dados num produto auxiliar para comparacao
                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);
                //Verifica se é um produto válido
                if (produtoAuxiliar != null && produtoAuxiliar.getNome() != null) 
                {
                    //Verifica se contem valor pesquisado no nome do produto
                    if (produtoAuxiliar.getNome().toUpperCase().contains(nome.toUpperCase())) 
                    {
                        //coloca todos os resultados de produto na lisata para retorno
                        listaResultado.add(produtoAuxiliar);
                    }
                }
                contadorPosicao++;
            }
        }
        else
        {
            //caso a lista esteja vazia retorna erro
            throw new Exception("Não há dados para pesquisa");
        }
        return listaResultado;
    }
    
    //OBTER UM PRODUTO
    public static Produto obter(int id) throws Exception {
        //verifica se a lista tem dados
        if (listaProdutos.size() > 0) {
            //percorre a lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaProdutos.size()) 
            {
                //obtém um produto da lista
                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);
                //verifica se é um produto válido com id desejado
                if (produtoAuxiliar != null
                        && produtoAuxiliar.getId() != null
                        && produtoAuxiliar.getId() == id) 
                {
                    //retorna o produto procurado
                    return produtoAuxiliar;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            //se a lista nao tiver dados retorna erro, usar try catch
            throw new Exception("Não há dados para pesquisa");
        }
        //caso nao achar o produto desejado
        return null;
    }
    
    //ATUALIZA UM PRODUTO
    public static void atualizar(Produto produtoAtualizado) throws Exception {
        
        //verifica se produto é valido se tem id e se a lista tem dados
        if (produtoAtualizado != null
                && produtoAtualizado.getId() != null
                && listaProdutos.size() > 0) 
        {

            int contador = 0;
            boolean atualizacao = false;
            
            //passa por toda a lista enquanto o produto nao eh encontrado
            while (contador < listaProdutos.size() && !atualizacao) 
            {
                
                //pega um produto da lista
                Produto produtoDesatualizado = listaProdutos.get(contador);
                
                //verifica se o produto eh valido e com o mesmo id
                if (produtoDesatualizado != null
                    && produtoDesatualizado.getId() == produtoAtualizado.getId()) 
                {
                    //atualiza todos as atributos do produto
                    produtoDesatualizado.setNome(
                            produtoAtualizado.getNome());
                    produtoDesatualizado.setCategoria(
                            produtoAtualizado.getCategoria());
                    produtoDesatualizado.setQuantidade(
                            produtoAtualizado.getQuantidade());
                    produtoDesatualizado.setCusto(
                            produtoAtualizado.getCusto());
                    produtoDesatualizado.setValor(
                            produtoAtualizado.getValor());
                    produtoDesatualizado.setDescricao(
                            produtoAtualizado.getDescricao());
                    //sinaliza que produto foi atualizado para sair da lista
                    atualizacao = true;
                }
                contador++;
            }
        }
        else 
        {
            //caso nao encontrar produto retorna erro para a classe que chamou
            throw new Exception("Não há cliente para atualizar");
        }
    }
    
    //EXCLUI UM PRODUTO
    public static void excluir(int id) throws Exception {
        //verifica se a lista contém dados
        if (listaProdutos.size() > 0) 
        {
            
            int contadorPosicao = 0;
            boolean removido = false;
            
            //passa pela lista
            while (contadorPosicao < listaProdutos.size() && !removido) 
            {
                //obtem um produto da lista
                Produto produtoAuxiliar = listaProdutos.get(contadorPosicao);

                //verifica se o produto atual tem o mesmo id
                if (produtoAuxiliar != null && produtoAuxiliar.getId() == id) 
                {
                    //caso tenha excluo o produto atual da lista
                    listaProdutos.remove(contadorPosicao);
                    removido = true;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            //caso a lista esteja vazia retorno erro para a classe que chamou
            throw new Exception("Não há cliente para remover");
        }
    }
}