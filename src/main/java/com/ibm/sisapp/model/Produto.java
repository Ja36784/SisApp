package com.ibm.sisapp.model;

public class Produto {
	
	String produto;
	double preco;
	int quantidade;
	int qtdEstoque;	
	

	public Produto(DadosCadastroProduto dados) {
		super();
		this.produto = dados.produto();
		this.preco = dados.preco();
		
		this.quantidade = dados.quantidade();
		this.qtdEstoque = dados.qtdEstoque();
	}


	@Override
	public String toString() {
		return "Produto [produto=" + produto + ", preco=" + preco + ", quantidade=" + quantidade + ", qtdEstoque="
				+ qtdEstoque + "]";
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getQtdEstoque() {
		return qtdEstoque;
	}


	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	
	
}
