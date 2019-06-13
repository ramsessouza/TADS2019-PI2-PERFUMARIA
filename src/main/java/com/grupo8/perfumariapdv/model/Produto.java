package com.grupo8.perfumariapdv.model;

/*
*@author – DeboraGomes
*/
public class Produto 
{
    private Integer id;
    private String nome;
    private String categoria;
    private Integer quantidade;
    private Float custo;
    private Float valor;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = Categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float Custo) {
        this.custo = Custo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float Valor) {
        this.valor = Valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }
    
}
