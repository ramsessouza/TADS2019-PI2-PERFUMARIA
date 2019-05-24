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
    public static String Cliente(String nome, String cpf, String rg,
    String sexo, String estadoCivil, String dataNascimento, String estado,
    String cidade, String bairro, String logradouro, String numero, String email,
    String telefoneCelular, String telefoneOutros, String observacoes)
    {
        String retorno = "";
        
         if(nome.equalsIgnoreCase("") || nome == "")
        {
            retorno += "Nome\n";
        }
        if(cpf.equalsIgnoreCase("") || cpf == "")
        {
            retorno += "CPF\n";
        }
        if(sexo.equalsIgnoreCase("") || sexo == "")
        {
            retorno += "Sexo\n";
        }
        if(estadoCivil.equalsIgnoreCase("") || estadoCivil == "")
        {
            retorno += "Estado Civil\n";
        }
        if(dataNascimento.equalsIgnoreCase("") || dataNascimento == "")
        {
            retorno += "Data de Nascimento\n";
        }
        if(estado.equalsIgnoreCase("") || estado == "")
        {
            retorno += "Estado\n";
        }
        if(cidade.equalsIgnoreCase("") || cidade == "")
        {
            retorno += "Cidade\n";
        }
        if(bairro.equalsIgnoreCase("") || bairro == "")
        {
            retorno += "Bairro\n";
        }
        if(logradouro.equalsIgnoreCase("") || logradouro == "")
        {
            retorno += "Logradouro\n";
        }
        if(numero.equalsIgnoreCase("") || numero == "")
        {
            retorno += "Número\n";
        }
        if(email.equalsIgnoreCase("") || email == "")
        {
            retorno += "E-mail\n";
        }
        if(telefoneCelular.equalsIgnoreCase("") || telefoneCelular == "")
        {
            retorno += "Telefone Celular\n";
        }
        
        if(telefoneOutros.equalsIgnoreCase("") || telefoneOutros == "")
        {
            retorno += "Telefone (Outros)\n";
        }
        
        if(observacoes.equalsIgnoreCase("") || observacoes == "")
        {
            retorno += "Observações\n";
        }
        
        return retorno;
    }
}
