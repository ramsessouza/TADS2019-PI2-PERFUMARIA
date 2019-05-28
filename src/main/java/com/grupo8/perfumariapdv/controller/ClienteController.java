package com.grupo8.perfumariapdv.controller;

import com.grupo8.perfumariapdv.mock.ClienteMock;
import com.grupo8.perfumariapdv.model.Cliente;
import java.util.List;

public class ClienteController {
    
    //SALVAR
    public static String salvar(Cliente cliente){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            ClienteMock.salvar(cliente);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //PROCURAR/LISTAR
    public static List<Cliente> procurar(String nome){
        List<Cliente> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
        
            if (nome == null || "".equals(nome)) {
                listaResposta = ClienteMock.listar();
            } else {
                listaResposta = ClienteMock.procurar(nome);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
    //ATUALIZAR
    public static String atualizar(Cliente cliente) 
    {
        String resposta = null;

        try
        {
            //tenta fazer a atualização
            ClienteMock.atualizar(cliente);
        } 
        catch (Exception e) 
        {   
            //em caso de erro retorna para a classe que chamou com o erro
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    //EXCLUIR
    public static String excluir(Integer id) 
    {
        String resposta = null;

        try 
        {   
            //tenta excluir 
            ClienteMock.excluir(id);
        } catch (Exception e) 
        {
            //em caso de erro retorna erro para a classe que chamou
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    //OBTER
    public static Cliente obter(Integer id) {
        
        //Instancia cliente para retornar no fim da funcao
        Cliente cliente =  new Cliente();
        
        try 
        {
            //tenta obter o cliente procurado
            cliente = ClienteMock.obter(id);
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            e.printStackTrace();
        }

        return cliente;
        
    }
}
