package com.cadastro.model;
import java.util.List;
import java.util.ArrayList;

public class carrinho {
	private List<produto> produtos = new ArrayList<produto>();;
	private double total;
	
	public List<produto> getProdutos() {
		return produtos;
	}
	
	public void addProduto(produto p) {
		produtos.add(p);
	}
	
	public double getTotal() {
		double subTotal = 0;
		for(produto p : produtos) {
			subTotal = subTotal + p.getPreco(); 
		}
		return subTotal;
	}

}
