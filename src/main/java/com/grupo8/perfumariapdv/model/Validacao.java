package com.grupo8.perfumariapdv.model;

import java.util.Date;

public class Validacao 
{
    //VALIDACAO DE PRODUTO (CAMPOS OBRIGATÓRIOS)
    public static String ProdutoCamposVazios(String nome, String quantidade, 
            String custo, String valor)
    {
        String retorno = "";
        
        if(nome.equalsIgnoreCase("") || nome == "")
        {
            retorno += "Nome\n";
        }
//        if(categoria.equalsIgnoreCase("") || categoria == "")
//        {
//            retorno += "Categoria\n";
//        }
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
    
    //VALIDACAO DE CLIENTE (CAMPOS OBRIGATÓRIOS)
    public static String ClienteCamposVazios(String nome, String cpf, 
    String dataNascimento, String estado, String cidade, String bairro, 
    String logradouro, String numero)
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
//        if(sexo.equalsIgnoreCase("") || sexo == "")
//        {
//            retorno += "Sexo\n";
//        }
//        if(estadoCivil.equalsIgnoreCase("") || estadoCivil == "")
//        {
//            retorno += "Estado Civil\n";
//        }
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
//        if(email.equalsIgnoreCase("") || email == "")
//        {
//            retorno += "E-mail\n";
//        }
//        if(telefoneCelular.equalsIgnoreCase("") || telefoneCelular == "")
//        {
//            retorno += "Telefone Celular\n";
//        }
//        
//        if(telefoneOutros.equalsIgnoreCase("") || telefoneOutros == "")
//        {
//            retorno += "Telefone (Outros)\n";
//        }
//        
//        if(observacoes.equalsIgnoreCase("") || observacoes == "")
//        {
//            retorno += "Observações\n";
//        }
        
        return retorno;
    }
    
    //VALIDACAO DE PRODUTO (TAMANHO DOS CAMPOS)
    public static String ProdutoCamposTamanho(String nome, String quantidade, 
            String custo, String valor){
        String resposta = "";
        
        if (nome.length()>40){
            
            resposta += "\nNome (tamanho máximo: 40)";
        }
        
        if (quantidade.length()>3){
            
            resposta += "\nQuantidade (tamanho máximo: 3)";
        }
        
        if (custo.length()>8){
            
            resposta += "\n (tamanho máximo: 8)";
        }
        
        if (valor.length()>8){
            
            resposta += "\nValor (tamanho máximo: 8)";
        }
        
        return resposta;
    }
    
    //VALIDACAO DE CLIENTE (TAMANHO DOS CAMPOS)
    public static String ClienteCamposTamanho(String nome, String cpf, 
    String dataNascimento, String estado, String cidade, String bairro, 
    String logradouro, String numero){
        String resposta = "";
        
        if (nome.length()>40){
            
            resposta += "\nNome (tamanho máximo: 40)";
        }
        
        if (cpf.length()>14){
            
            resposta += "\nCPF (tamanho máximo: 14)";
        }
        
        if (dataNascimento.length()>10){
            
            resposta += "\nData Nascimento (tamanho máximo: 10)";
        }
        
        if (estado.length()>30){
            
            resposta += "\nEstado (tamanho máximo: 30)";
        }
        
        if (cidade.length()>30){
            
            resposta += "\nCidade (tamanho máximo: 30)";
        }
        
        if (bairro.length()>30){
            
            resposta += "\nBairro (tamanho máximo: 30)";
        }
        
        if (logradouro.length()>30){
            
            resposta += "\nLogradouro (tamanho máximo: 30)";
        }
        
        if (numero.length()>5){
            
            resposta += "\nNúmero (tamanho máximo: 5)";
        }
        
        return resposta;
    }
    
    
}
