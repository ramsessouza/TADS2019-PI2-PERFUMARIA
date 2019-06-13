create database DBPERFUMARIA;

use DBPERFUMARIA;

CREATE TABLE TBPRODUTOS(
id int(10) not null auto_increment,
nome varchar(50),
categoria varchar(30),
quantidade int(3),
custo decimal(8,2),
valor decimal(8,2),
descricao varchar(1000),
primary key (id)
);

CREATE TABLE TBCLIENTES(
 id int(10) not null auto_increment,
 nome varchar(50),
 cpf varchar(20),
 sexo varchar(10),
 estadoCivil varchar(20),
 dataNascimento varchar(20),
 estado varchar(20),
 cidade varchar(20),
 bairro varchar(50),
 logradouro varchar(50),
 numero varchar(10),
 email varchar(50),
 telefoneCelular varchar(20),
 telefoneOutros varchar(20),
 observacoes varchar(500),
primary key (id)
);

CREATE TABLE TBVENDAS(
id int(10) not null,
data TIMESTAMP,
qtdItens int(10),
subtotal decimal(8,2),
pagamentoDinheiro decimal(8,2),
pagamentoCartao decimal(8,2),
nomeCliente varchar(50),
cpfCliente varchar(15)
);    

CREATE TABLE TBITEMVENDA (
idVenda int(10),
idItem int(10),
nomeProduto VARCHAR(50),
idProduto int(10),
qtdItens int(10),
valorTotal decimal(8,2),
valor decimal(8,2)
)