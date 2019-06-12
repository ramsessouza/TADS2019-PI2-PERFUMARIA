package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VendaMock 
{
    //private static int sequenciaIdVendas = 0;
    
    //INSTANCIA DE LISTA DO TIPO ABSTRATO VENDA
    private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
    
    //CONSTRUTOR DA CLASSE VENDAMOCK INICIANDO A LISTA DO TIPO ABSTRATO VENDA
    public VendaMock(){
        listaVendas = new ArrayList<Venda>();
    }
    
    //SALVA UM VENDA NA LISTA/TABELA DE VENDAS
    public static void salvar(Venda venda) throws Exception {
        //venda.setId(sequenciaIdVendas++);
        listaVendas.add(venda);
    }
    
    //OBTER A ULTIMA VENDA
    public static Venda obterUltima() throws Exception {
        //verifica se a lista tem dados
        if (listaVendas.size() > 0) {
            
            //obtém a ultima venda da lista
            Venda vendaAuxiliar = listaVendas.get(listaVendas.size()-1);
            
            //verifica se é uma venda válida
            if (vendaAuxiliar != null) 
            {
                //retorna a ultima venda
                return vendaAuxiliar;
            }
            
        }
        else 
        {
            //se a lista nao tiver dados retorna erro, usar try catch
            throw new Exception("Não há dados para pesquisa");
        }
        //caso nao achar o venda desejada
        return null;
    }
    
    //OBTÉM LISTA DE VENDAS
    public static List<Venda> listar() throws Exception {
        return listaVendas;
    }
    
    //PROCURA UM VENDA POR DATA
    public static List<Venda> procurar(Date dataInicio, Date dataFim) throws Exception{
        
        List<Venda> listaResultado = new ArrayList<Venda>();
//        
//        //verifica se tem dados na lista
//        if (nome != null && listaVendas.size() > 0) {
//            
//            //passa pela lista
//            int contadorPosicao = 0;
//            while (contadorPosicao < listaVendas.size()) {
//
//                //coloca os dados num venda auxiliar para comparacao
//                Venda vendaAuxiliar = listaVendas.get(contadorPosicao);
//                //Verifica se é um venda válido
//                if (vendaAuxiliar != null && vendaAuxiliar.getNome() != null) 
//                {
//                    //Verifica se contem valor pesquisado no nome do venda
//                    if (vendaAuxiliar.getNome().toUpperCase().contains(nome.toUpperCase())) 
//                    {
//                        //coloca todos os resultados de venda na lista para retorno
//                        listaResultado.add(vendaAuxiliar);
//                    }
//                }
//                contadorPosicao++;
//            }
//        }
//        else
//        {
//            //caso a lista esteja vazia retorna erro
//            throw new Exception("Não há dados para pesquisa");
//        }
        return listaResultado;
    }
    
}