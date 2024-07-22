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
import java.util.Random;

public class MarketData{
    private HashMap<String, Stock> stocks;
    private Random random;
    
    //Constructor
    public MarketData(){
        stocks = new HashMap<>();
        random = new Random();
        initializeMarket();     //Abstract method
    }
    
    public void initializeMarket(){
        //Initialize with some stocks
        stocks.put("APPL", new Stock("APPL","Apple Inc.", 150.00));
        stocks.put("GOOGL", new Stock("GOOGL","Alphabet Inc.", 2800.00));
        stocks.put("AMZN", new Stock("AMZN","Amezon Inc.", 3400.00));
        //Add more stocks as needed
    }
    
    public Stock getStock(String symbol){
        return stocks.get(symbol);
    }
    
    public void updatePrice(){
        for(Stock stock : stocks.values()){
            double change = random.nextGaussian() * 10;
            stock.setPrice(stock.getPrice() + change);
        }
    }
    
    public Map<String, Stock> getStocks(){
        return stocks;
    }
}
