/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StockTradingPlatform;

/**
 *
 * @author Jayoda Kulatunga
 */
public class Stock{
    private String symbol;
    private String name;
    private double price;
    
    //Constructor
    public Stock(String symbol, String name, double price){
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }
    
    public String getSymbol(){
        return symbol;
    }
    
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
