package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.ItemVenda;
import java.util.ArrayList;
import java.util.List;

public class ItensVendaMock 
{
    //INSTANCIA DE LISTA ITENSVENDA
    private static ArrayList<ItemVenda> listaItensVenda = new ArrayList<ItemVenda>();
    
    //CONSTRUTOR DA CLASSE ITENSVENDAMOCK INICIANDO A LISTA ITENSVENDA
    public ItensVendaMock(){
        listaItensVenda = new ArrayList<ItemVenda>();
    }
    
    //SALVA UMA ITENSVENDA NA LISTA/TABELA DE ITENSVENDA
    public static void salvar(ItemVenda itensVenda) throws Exception {
        listaItensVenda.add(itensVenda);
    }
    
    //OBTER UMA LISTA DE VENDAS
    public static List<ItemVenda> obterItens(int idVenda) throws Exception{
        
        List<ItemVenda> listaResultado = new ArrayList<ItemVenda>();
        
        //verifica se tem dados na lista
        if (listaItensVenda.size() > 0) {
            
            //passa pela lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaItensVenda.size()) {

                //coloca os dados num produto auxiliar para comparacao
                ItemVenda itemVendaAuxiliar = listaItensVenda.get(contadorPosicao);
                //Verifica se é um objeti válido
                if (itemVendaAuxiliar != null && itemVendaAuxiliar.getIdVenda()!= null) 
                {
                    //Verifica se contem valor pesquisado
                    if (itemVendaAuxiliar.getIdVenda() == idVenda) 
                    {
                        //coloca todos os resultados de produto na lisata para retorno
                        listaItensVenda.add(itemVendaAuxiliar);
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
    
}