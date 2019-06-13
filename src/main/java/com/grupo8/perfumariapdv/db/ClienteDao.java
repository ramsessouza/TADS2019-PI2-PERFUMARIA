package com.grupo8.perfumariapdv.db;

import com.grupo8.perfumariapdv.db.ConnectionUtils;
import com.grupo8.perfumariapdv.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao
{
     public static void salvar(Cliente cliente) 
        throws SQLException, Exception {
        
        String sql = "INSERT INTO DBPERFUMARIA.TBCLIENTES(nome, cpf, "
                + "sexo, estadoCivil, dataNascimento, estado, cidade, bairro, "
                + "logradouro, numero, email, telefoneCelular, telefoneOutros, observacoes) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            Connection connection = null;
            PreparedStatement preparedStatement = null;
        
            try {
            
            connection = ConnectionUtils.obterConexao();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getEstadoCivil());
            preparedStatement.setString(5, cliente.getDataNascimento());
            preparedStatement.setString(6, cliente.getEstado());
            preparedStatement.setString(7, cliente.getCidade());
            preparedStatement.setString(8, cliente.getBairro());
            preparedStatement.setString(9, cliente.getLogradouro());
            preparedStatement.setString(10, cliente.getNumero());
            preparedStatement.setString(11, cliente.getEmail());
            preparedStatement.setString(12, cliente.getTelefoneCelular());
            preparedStatement.setString(13, cliente.getTelefoneOutros());
            preparedStatement.setString(14, cliente.getObservacoes());
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<Cliente> listar()
        throws SQLException, Exception {
        
        String sql = "SELECT  id, nome, cpf, sexo, estadoCivil, dataNascimento, "
                + "estado, cidade, bairro, logradouro, numero, email, "
                + "telefoneCelular, telefoneOutros, observacoes "
                + "FROM DBPERFUMARIA.TBCLIENTES";
        List<Cliente> listaClientes = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setEstadoCivil(result.getString("estadoCivil"));
                cliente.setDataNascimento(result.getString("dataNascimento"));
                cliente.setEstado(result.getString("estado"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setLogradouro(result.getString("logradouro"));
                cliente.setNumero(result.getString("numero"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefoneCelular(result.getString("telefoneCelular"));
                cliente.setTelefoneOutros(result.getString("telefoneOutros"));
                cliente.setObservacoes(result.getString("observacoes"));
                
                listaClientes.add(cliente);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaClientes;
    }

    public static List<Cliente> procurar(String nome)
        throws SQLException, Exception {
        
        String sql = "SELECT  id, nome, cpf, sexo, estadoCivil, dataNascimento, "
                + "estado, cidade, bairro, logradouro, numero, email, "
                + "telefoneCelular, telefoneOutros, observacoes "
                + "FROM DBPERFUMARIA.TBCLIENTES WHERE nome LIKE (?)";
        List<Cliente> listaClientes = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;        
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + nome + "%");
            
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setEstadoCivil(result.getString("estadoCivil"));
                cliente.setDataNascimento(result.getString("dataNascimento"));
                cliente.setEstado(result.getString("estado"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setLogradouro(result.getString("logradouro"));
                cliente.setNumero(result.getString("numero"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefoneCelular(result.getString("telefoneCelular"));
                cliente.setTelefoneOutros(result.getString("telefoneOutros"));
                cliente.setObservacoes(result.getString("observacoes"));
                
                listaClientes.add(cliente);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaClientes;
    }

    public static Cliente obter(Integer id) 
        throws SQLException, Exception {
        
        String sql = "SELECT * FROM DBPERFUMARIA.TBCLIENTES WHERE id =?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();
            
            if(result.next()){
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setEstadoCivil(result.getString("estadoCivil"));
                cliente.setDataNascimento(result.getString("dataNascimento"));
                cliente.setEstado(result.getString("estado"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setLogradouro(result.getString("logradouro"));
                cliente.setNumero(result.getString("numero"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefoneCelular(result.getString("telefoneCelular"));
                cliente.setTelefoneOutros(result.getString("telefoneOutros"));
                cliente.setObservacoes(result.getString("observacoes"));
                
                return cliente;
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    } 
    
    public static Cliente obter2(String cpf) 
        throws SQLException, Exception {
        
        String sql = "SELECT * FROM DBPERFUMARIA.TBCLIENTES WHERE cpf =?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, cpf);
            result = preparedStatement.executeQuery();
            
            if(result.next()){
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setEstadoCivil(result.getString("estadoCivil"));
                cliente.setDataNascimento(result.getString("dataNascimento"));
                cliente.setEstado(result.getString("estado"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setLogradouro(result.getString("logradouro"));
                cliente.setNumero(result.getString("numero"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefoneCelular(result.getString("telefoneCelular"));
                cliente.setTelefoneOutros(result.getString("telefoneOutros"));
                cliente.setObservacoes(result.getString("observacoes"));
                
                return cliente;
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    }
    
    public static void atualizar(Cliente clienteAtualizado) 
        throws SQLException, Exception {
        
        String sql = "UPDATE DBPERFUMARIA.TBCLIENTES SET nome = ?, cpf = ?, "
                + "sexo = ?, estadoCivil = ?, dataNascimento = ?, estado = ?, "
                + "cidade = ?, bairro = ?, logradouro = ?, numero = ?, email = ?, "
                + "telefoneCelular = ?, telefoneOutros = ?, observacoes = ? "
                + "WHERE id = ?;";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, clienteAtualizado.getNome());
            preparedStatement.setString(2, clienteAtualizado.getCpf());
            preparedStatement.setString(3, clienteAtualizado.getSexo());
            preparedStatement.setString(4, clienteAtualizado.getEstadoCivil());
            preparedStatement.setString(5, clienteAtualizado.getDataNascimento());
            preparedStatement.setString(6, clienteAtualizado.getEstado());
            preparedStatement.setString(7, clienteAtualizado.getCidade());
            preparedStatement.setString(8, clienteAtualizado.getBairro());
            preparedStatement.setString(9, clienteAtualizado.getLogradouro());
            preparedStatement.setString(10, clienteAtualizado.getNumero());
            preparedStatement.setString(11, clienteAtualizado.getEmail());
            preparedStatement.setString(12, clienteAtualizado.getTelefoneCelular());
            preparedStatement.setString(13, clienteAtualizado.getTelefoneOutros());
            preparedStatement.setString(14, clienteAtualizado.getObservacoes());
            preparedStatement.setInt(15, clienteAtualizado.getId());

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void excluir(Integer id)
        throws SQLException, Exception {
        String sql = "DELETE FROM DBPERFUMARIA.TBCLIENTES WHERE id = ?";        
             
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    
}

