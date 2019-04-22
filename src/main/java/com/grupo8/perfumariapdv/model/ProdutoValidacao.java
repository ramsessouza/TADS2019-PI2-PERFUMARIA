package com.grupo8.perfumariapdv.model;

public class ProdutoValidacao 
{
    public static String ValidarProduto(String Nome, String Categoria, 
            String Quantidade, String Custo, String Valor)
    {
        String retorno = "";
        
        if(Nome.equalsIgnoreCase("") || Nome == "")
        {
            retorno += "Nome\n";
        }
        if(Categoria.equalsIgnoreCase("") || Categoria == "")
        {
            retorno += "Categoria\n";
        }
        if(Quantidade.equalsIgnoreCase("") || Quantidade == "")
        {
            retorno += "Quantidade\n";
        }

        if(Custo.equalsIgnoreCase("") || Custo == "")
        {
            retorno += "Custo\n";
        }
        if(Valor.equalsIgnoreCase("") || Valor == "")
        {
            retorno += "Valor\n";
        }
            return retorno;
        
    }
}
