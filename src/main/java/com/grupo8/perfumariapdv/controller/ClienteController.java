package com.grupo8.perfumariapdv.controller;

import com.grupo8.perfumariapdv.db.ClienteDao;
import com.grupo8.perfumariapdv.mock.ClienteMock;
import com.grupo8.perfumariapdv.model.Cliente;
import java.util.List;

/*
*@author – RamsesSouza
*/
public class ClienteController {
    
    //SALVAR
    public static String salvar(Cliente cliente){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            //ClienteMock.salvar(cliente);
            ClienteDao.salvar(cliente);
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
                //listaResposta = ClienteMock.listar();
                listaResposta = ClienteDao.listar();
            } else {
                //listaResposta = ClienteMock.procurar(nome);
                listaResposta = ClienteDao.procurar(nome);
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
            //ClienteMock.atualizar(cliente);
            ClienteDao.atualizar(cliente);
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
            //ClienteMock.excluir(id);
            ClienteDao.excluir(id);
        } catch (Exception e) 
        {
            //em caso de erro retorna erro para a classe que chamou
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    //OBTER POR ID
    public static Cliente obter(Integer id) {
        
        //Instancia cliente para retornar no fim da funcao
        Cliente cliente =  new Cliente();
        
        try 
        {
            //tenta obter o cliente procurado
            //cliente = ClienteMock.obter(id);
            cliente = ClienteDao.obter(id);
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            e.printStackTrace();
        }

        return cliente;
    }
    
    //OBTER POR CPF
    public static Cliente obter2(String cpf) {
        
        //Instancia cliente para retornar no fim da funcao
        Cliente cliente =  new Cliente();
        
        try 
        {
            //tenta obter o cliente procurado
            //cliente = ClienteMock.obter2(cpf);
            cliente = ClienteDao.obter2(cpf);
        } 
        catch (Exception e) 
        {
            return cliente = null;
        }

        return cliente;
    }
}
