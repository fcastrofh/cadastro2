package com.cadastro.model;

public class produto {
	private double preco;
	private int desconto;
	private String tipo;
	private String nome;
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double p) {
		preco = p;
	}
	
	public int getDesconto() {
		return desconto;
	}
	
	public void setDesconto(int d) {
		desconto = d;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String t) {
		tipo = t;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		nome = n;
	}

}
