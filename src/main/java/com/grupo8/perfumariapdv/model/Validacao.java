package com.grupo8.perfumariapdv.model;

import java.util.Date;

public class Validacao 
{
    //VALIDACAO DE PRODUTO
    public static String Produto(String nome, String categoria, 
            String quantidade, String custo, String valor)
    {
        String retorno = "";
        
        if(nome.equalsIgnoreCase("") || nome == "")
        {
            retorno += "Nome\n";
        }
        if(categoria.equalsIgnoreCase("") || categoria == "")
        {
            retorno += "Categoria\n";
        }
        if(quantidade.equalsIgnoreCase("") || quantidade == "")
        {
            retorno += "Quantidade\n";
        }

        if(custo.equalsIgnoreCase("") || custo == "")
        {
            retorno += "Custo\n";
        }
        if(valor.equalsIgnoreCase("") || valor == "")
        {
            retorno += "Valor\n";
        }
            return retorno;
      }
    
    //VALIDACAO DE CLIENTE
    public static String Cliente(String nome, Integer cpf, String rg,
    String sexo, String estadoCivil, Date dataNascimento, String estado,
    String cidade, String bairro, String lagradouro, Integer numero, String email,
    String telefoneCelular, String telefoneOutros, String observacoes)
    {
        String retorno = "";
        
//         if(Nome.equalsIgnoreCase("") || Nome == "")
//        {
//            retorno += "Nome\n";
//        }
//        nome
//        cpf
//        rg
//        sexo
//        estadoCivil
//        dataNascimento
//        estado
//        cidade
//        bairro
//        lagradouro
//        numero
//        email
//        telefoneCelular
//        telefoneOutros
//        observacoes
        
        return retorno;
    }
}
