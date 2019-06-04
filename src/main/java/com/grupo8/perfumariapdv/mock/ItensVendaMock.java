package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.ItenVenda;
import java.util.ArrayList;

public class ItensVendaMock 
{
    //INSTANCIA DE LISTA ITENSVENDA
    private static ArrayList<ItenVenda> listaItensVenda = new ArrayList<ItenVenda>();
    
    //CONSTRUTOR DA CLASSE ITENSVENDAMOCK INICIANDO A LISTA ITENSVENDA
    public ItensVendaMock(){
        listaItensVenda = new ArrayList<ItenVenda>();
    }
    
    //SALVA UMA ITENSVENDA NA LISTA/TABELA DE ITENSVENDA
    public static void salvar(ItenVenda itensVenda) throws Exception {
        listaItensVenda.add(itensVenda);
    }
    
    //OBTER UMA LISTA DE VENDAS
    public static ItenVenda obter(int idVenda) throws Exception {
        //verifica se a lista tem dados
        if (listaItensVenda.size() > 0) {
            
            //percorre a lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaItensVenda.size()) 
            {
                //obtém um produto da lista
                ItenVenda itensVendaAuxiliar = listaItensVenda.get(contadorPosicao);
                //verifica se é um produto válido com id desejado
                if (itensVendaAuxiliar != null
                        && itensVendaAuxiliar.getIdVenda()!= null
                        && itensVendaAuxiliar.getIdVenda()== idVenda) 
                {
                    //retorna o produto procurado
                    return itensVendaAuxiliar;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            //se a lista nao tiver dados retorna erro, usar try catch
            throw new Exception("Não há dados para pesquisa");
        }
        //caso nao achar o itens de venda desejado
        return null;
    }
    
}