package com.cadastro.app;
import static spark.Spark.*;
import com.cadastro.controller.*;

public class App 
{
    public static void main( String[] args )
    {
    	comprar comprar = new comprar();
    	
        get("/home", (req, res) -> "Cadastro e carrinho de compras");
        
        get("/carrinho", (req, res) -> comprar.carrinhoDeCompras());
        
        post("/addProduto", "application/json", (req, resp) -> {
            String a, b, c, d;
            a = req.queryParams("txt_preco");
            b = req.queryParams("txt_desconto");
            c = req.queryParams("txt_tipo");
            d = req.queryParams("txt_nome");
            
            comprar.adicionarProduto(Double.parseDouble(a), Integer.parseInt(b), c, d);
            
            return String.join(" AND ", a, b, c, d);
        });
    }
}
