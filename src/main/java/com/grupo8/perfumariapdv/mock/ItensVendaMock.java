package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.ItenVenda;
import java.util.ArrayList;
import java.util.List;

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
    public static List<ItenVenda> obterItens(int idVenda) throws Exception{
        
        List<ItenVenda> listaResultado = new ArrayList<ItenVenda>();
        
        //verifica se tem dados na lista
        if (listaItensVenda.size() > 0) {
            
            //passa pela lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaItensVenda.size()) {

                //coloca os dados num produto auxiliar para comparacao
                ItenVenda itenVendaAuxiliar = listaItensVenda.get(contadorPosicao);
                //Verifica se é um objeti válido
                if (itenVendaAuxiliar != null && itenVendaAuxiliar.getIdVenda()!= null) 
                {
                    //Verifica se contem valor pesquisado
                    if (itenVendaAuxiliar.getIdVenda() == idVenda) 
                    {
                        //coloca todos os resultados de produto na lisata para retorno
                        listaItensVenda.add(itenVendaAuxiliar);
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