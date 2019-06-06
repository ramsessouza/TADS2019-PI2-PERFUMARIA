package com.grupo8.perfumariapdv.controller;

import com.grupo8.perfumariapdv.mock.ItensVendaMock;
import com.grupo8.perfumariapdv.model.ItenVenda;
import java.util.List;

public class ItensVendaController {
    
    //SALVAR
    public static String salvar(ItenVenda itensVenda){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            ItensVendaMock.salvar(itensVenda);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //OBTER ITENS DA VEMDA
    public static List<ItenVenda> obterItens(int idVenda){
        List<ItenVenda> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
            listaResposta = ItensVendaMock.obterItens(idVenda);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
}
