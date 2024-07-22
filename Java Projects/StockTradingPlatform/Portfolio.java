/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StockTradingPlatform;

/**
 *
 * @author Jayoda Kulatunga
 */
import java.util.HashMap;
import java.util.Map;

public class Portfolio{
    private Map<String, Integer> holdings;
    private double cash;
    
    //Constructor
    public Portfolio(double initialCash){
        holdings = new HashMap<>();
        cash = initialCash;
    }
    
    public void buyStock(Stock stock, int quantity){
        double cost = stock.getPrice() * quantity;
        if(cost <= cash){
            cash -= cost;
            holdings.put(stock.getSymbol(), holdings.getOrDefault(stock.getSymbol(), 0) + quantity);
            System.out.println("Bought " + quantity + "shares of " + stock.getName());
        }else{
            System.out.println("Not enough cash to buy " + quantity + "shares of " + stock.getName());
        }
    }
    
    public void sellStock(Stock stock, int quantity){
        int currentHoldings = holdings.getOrDefault(stock.getSymbol(), 0);
        if(quantity <= currentHoldings){
            double revenue = stock.getPrice() * quantity;
            cash += revenue;
            holdings.put(stock.getSymbol(), currentHoldings - quantity);
            System.out.println("Sold " + quantity + "shares of " + stock.getName());
        }else{
            System.out.println("Not enough shares to sell " + quantity + "shares of " + stock.getName());
        }
    }
    
    public void printPortfolio(MarketData marketData){
        System.out.println("Portfolio");
        System.out.println("Cash $" + cash);
        for(String symbol : holdings.keySet()){
            Stock stock = marketData.getStock(symbol);
            int quantity = holdings.get(symbol);
            double value = stock.getPrice() * quantity;
            System.out.println(symbol + ": " + quantity + "shares, values: $" + value);
        }
    }
    
    public double getCash(){
        return cash;
    }
    
    
}
