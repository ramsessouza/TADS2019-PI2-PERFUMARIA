package com.grupo8.perfumariapdv.controller;

import com.grupo8.perfumariapdv.db.ItensVendaDao;
import com.grupo8.perfumariapdv.mock.ItensVendaMock;
import com.grupo8.perfumariapdv.model.ItemVenda;
import java.util.List;

public class ItensVendaController {
    
    //SALVAR
    public static String salvar(ItemVenda itensVenda){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            //ItensVendaMock.salvar(itensVenda);
            ItensVendaDao.salvar(itensVenda);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //OBTER ITENS DA VEMDA
    public static List<ItemVenda> obterItens(int idVenda){
        List<ItemVenda> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
            //listaResposta = ItensVendaMock.obterItens(idVenda);
            listaResposta = ItensVendaDao.obterItens(idVenda);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
}
