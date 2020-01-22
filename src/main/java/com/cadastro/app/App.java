package com.cadastro.app;
import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        get("/home", (req, res) -> "Cadastro e carrinho de compras");
    }
}
