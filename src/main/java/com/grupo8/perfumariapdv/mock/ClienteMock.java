package com.grupo8.perfumariapdv.mock;

import com.grupo8.perfumariapdv.model.Cliente;
import java.util.ArrayList;
import java.util.List;


public class ClienteMock 
{
    private static int sequenciaIdClientes = 0;
    
    //INSTANCIA DE LISTA DO TIPO ABSTRATO CLIENTE
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    //CONSTRUTOR DA CLASSE CLIENTEMOCK INICIANDO A LISTA DO TIPO ABSTRATO CLIENTE
    public ClienteMock(){
        listaClientes = new ArrayList<Cliente>();
    }
    
    //SALVA UM CLIENTE NA LISTA/TABELA DE CLIENTES
    public static void salvar(Cliente cliente) throws Exception {
        cliente.setId(sequenciaIdClientes++);
        listaClientes.add(cliente);
    }
    
    //OBTÉM LISTA DE CLIENTES
    public static List<Cliente> listar() throws Exception {
        return listaClientes;
    }
    
    //PROCURA UM CLIENTE
    public static List<Cliente> procurar(String nome) throws Exception{
        
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        //verifica se tem dados na lista
        if (nome != null && listaClientes.size() > 0) {
            
            //passa pela lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) {

                //coloca os dados num cliente auxiliar para comparacao
                Cliente clienteAuxiliar = listaClientes.get(contadorPosicao);
                //Verifica se é um cliente válido
                if (clienteAuxiliar != null && clienteAuxiliar.getNome() != null) 
                {
                    //Verifica se contem valor pesquisado no nome do cliente
                    if (clienteAuxiliar.getNome().toUpperCase().contains(nome.toUpperCase())) 
                    {
                        //coloca todos os resultados de cliente na lista para retorno
                        listaResultado.add(clienteAuxiliar);
                    }
                }
                contadorPosicao++;
            }
        }
        else
        {
            //caso a lista esteja vazia retorna erro
            throw new Exception("Não há dados para pesquisa");
        }
        return listaResultado;
    }
    
    //OBTER UM CLIENTE POR ID
    public static Cliente obter(int id) throws Exception {
        //verifica se a lista tem dados
        if (listaClientes.size() > 0) {
            //percorre a lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) 
            {
                //obtém um cliente da lista
                Cliente clienteAuxilizr = listaClientes.get(contadorPosicao);
                //verifica se é um cliente válido com id desejado
                if (clienteAuxilizr != null
                        && clienteAuxilizr.getId() != null
                        && clienteAuxilizr.getId() == id) 
                {
                    //retorna o cliente procurado
                    return clienteAuxilizr;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            //se a lista nao tiver dados retorna erro, usar try catch
            throw new Exception("Não há dados para pesquisa");
        }
        //caso nao achar o cliente desejado
        return null;
    }
    
    //OBTER UM CLIENTE POR CPF
    public static Cliente obter2(String cpf) throws Exception {
        //verifica se a lista tem dados
        if (listaClientes.size() > 0) {
            //percorre a lista
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) 
            {
                //obtém um cliente da lista
                Cliente clienteAuxilizr = listaClientes.get(contadorPosicao);
                //verifica se é um cliente válido com id desejado
                if (clienteAuxilizr != null
                        && clienteAuxilizr.getCpf()!= null
                        && clienteAuxilizr.getCpf().equals(cpf)) 
                {
                    //retorna o cliente procurado
                    return clienteAuxilizr;
                }
                
                contadorPosicao++;
            }
        }
        else 
        {
            //se a lista nao tiver dados retorna erro, usar try catch
            throw new Exception("Não há dados para pesquisa");
        }
        //caso nao achar o cliente desejado
        return null;
    }
    
    //ATUALIZA UM CLIENTE
    public static void atualizar(Cliente clienteAtualizado) throws Exception {
        
        //verifica se cliente é valido se tem id e se a lista tem dados
        if (clienteAtualizado != null
                && clienteAtualizado.getId() != null
                && listaClientes.size() > 0) 
        {

            int contador = 0;
            boolean atualizacao = false;
            
            //passa por toda a lista enquanto o cliente nao eh encontrado
            while (contador < listaClientes.size() && !atualizacao) 
            {
                
                //pega um cliente da lista
                Cliente clienteDesatualizado = listaClientes.get(contador);
                
                //verifica se o cliente eh valido e com o mesmo id
                if (clienteDesatualizado != null
                    && clienteDesatualizado.getId() == clienteAtualizado.getId()) 
                {
                    //atualiza todos as atributos do cliente
                    clienteDesatualizado.setNome(
                            clienteAtualizado.getNome());
                    clienteDesatualizado.setBairro(
                            clienteAtualizado.getBairro());
                    clienteDesatualizado.setCidade(
                            clienteAtualizado.getCidade());
                    clienteDesatualizado.setCpf(
                            clienteAtualizado.getCpf());
                    clienteDesatualizado.setDataNascimento(
                            clienteAtualizado.getDataNascimento());
                    clienteDesatualizado.setEmail(
                            clienteAtualizado.getEmail());
                    clienteDesatualizado.setEstado(
                            clienteAtualizado.getEstado());
                    clienteDesatualizado.setEstadoCivil(
                            clienteAtualizado.getEstadoCivil());
                    clienteDesatualizado.setLogradouro(
                            clienteAtualizado.getLogradouro());
                    clienteDesatualizado.setNumero(
                            clienteAtualizado.getNumero());
                    clienteDesatualizado.setObservacoes(
                            clienteAtualizado.getObservacoes());
                    clienteDesatualizado.setSexo(
                            clienteAtualizado.getSexo());
                    clienteDesatualizado.setTelefoneCelular(
                            clienteAtualizado.getTelefoneCelular());
                    clienteDesatualizado.setTelefoneOutros(
                            clienteAtualizado.getTelefoneOutros());
                    //sinaliza que cliente foi atualizado para sair da lista
                    atualizacao = true;
                }
                contador++;
            }
        }
        else 
        {
            //caso nao encontrar cliente retorna erro para a classe que chamou
            throw new Exception("Não há cliente para atualizar");
        }
    }
    
    //EXCLUI UM CLIENTE
    public static void excluir(int id) throws Exception {
        //verifica se a lista contém dados
        if (listaClientes.size() > 0) 
        {
            
            int contadorPosicao = 0;
            boolean removido = false;
            
            //passa pela lista
            while (contadorPosicao < listaClientes.size() && !removido) 
            {
                //obtem um cliente da lista
                Cliente clienteAuxiliar = listaClientes.get(contadorPosicao);

                //verifica se o cliente atual tem o mesmo id
                if (clienteAuxiliar != null && clienteAuxiliar.getId() == id) 
                {
                    //caso tenha excluo o cliente atual da lista
                    listaClientes.remove(contadorPosicao);
                    removido = true;
                }
                contadorPosicao++;
            }
        }
        else 
        {
            //caso a lista esteja vazia retorno erro para a classe que chamou
            throw new Exception("Não há cliente para remover");
        }
    }
}