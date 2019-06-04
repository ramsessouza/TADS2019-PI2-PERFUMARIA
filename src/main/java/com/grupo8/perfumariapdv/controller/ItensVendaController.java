package com.grupo8.perfumariapdv.controller;

import com.grupo8.perfumariapdv.mock.ItensVendaMock;
import com.grupo8.perfumariapdv.model.ItenVenda;

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
    
    //OBTER
    public static ItenVenda obter(Integer id) {
        
        //Instancia produto para retornar no fim da funcao
        ItenVenda itensVenda =  new ItenVenda();
        
        try 
        {
            //tenta obter o produto procurado
            itensVenda = ItensVendaMock.obter(id);
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            e.printStackTrace();
        }

        return itensVenda;
    }
}
