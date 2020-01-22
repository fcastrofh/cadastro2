package com.cadastro.model;
import java.util.List;
import java.util.ArrayList;

public class carrinho {
	private List<produto> produtos = new ArrayList<produto>();;
	private double total = 0;
	int countA = 0;
	int countB = 0;
	boolean desconto10 = true;
	
	public List<produto> getProdutos() {
		return produtos;
	}
	
	public void addProduto(produto p) {
		produtos.add(p);
		total = total + p.getPreco() - (p.getPreco() * p.getDesconto());
		desconto10(p.getTipo());
	}
	
	public void desconto10(String t) {
		if(t.equals("tipoA") && desconto10) {
			countA = countA + 1;
		}else if(desconto10){
			countB = countB + 1;
		}
		
		if(countA >= 10) {
			for(produto p2 : produtos) {
				p2.setDesconto(0.10);
			}
			desconto10 = false;
		}
		
		if(countB >= 10) {
			for(produto p2 : produtos) {
				p2.setDesconto(0.10);
			}
			desconto10 = false;
		}
	}
	
	public double getTotal() {
		total = 0;
		for(produto p : produtos) {
			total = total + p.getPreco() - (p.getPreco() * p.getDesconto()); 
		}
		return total;
	}

}
