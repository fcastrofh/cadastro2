package com.cadastro.controller;
import static spark.Spark.*;
import com.cadastro.model.*;
import com.google.gson.Gson;

public class comprar {
	compra compra = new compra();
	Gson gson = new Gson();
	carrinho carro = new carrinho();
	
    public String carrinhoDeCompras() {
    	
        return gson.toJson(compra.getCarrinho());
    }
    
    public void adicionarProduto(double p, double d, String t, String n) {
    	produto produto = new produto();
    	produto.setPreco(p);
    	produto.setDesconto(d);
    	produto.setTipo(t);
    	produto.setNome(n);
    	
    	carro.addProduto(produto);
    	compra.setCarrinho(carro);;
    }
    
    public double total() {
    	return carro.getTotal();
    }

}
