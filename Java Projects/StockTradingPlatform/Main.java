/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StockTradingPlatform;

/**
 *
 * @author Jayoda Kulatunga
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketData marketData = new MarketData();
        Portfolio portfolio = new Portfolio(10000);     //Initial cash
        
        while(true){
            marketData.updatePrice();
            
            System.out.println("\nMarket Data:");
            for(Stock stock : marketData.getStocks().values()){
                System.out.println(stock.getSymbol() + ": $" + stock.getPrice());
            }
            
            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            
            System.out.println("Choose an option.");
            int option = scanner.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Enter stock symbol: ");
                    String buySymbol = scanner.next();
                    Stock buyStock = marketData.getStock(buySymbol);
                    if(buyStock != null){
                        System.out.println("Enter quantity: ");
                        int buyQuantity = scanner.nextInt();
                        portfolio.buyStock(buyStock, buyQuantity);
                    }else{
                        System.out.println("Stock not found.");
                    }
                    break;
                case 2:
                    System.out.println("Enter stock symbol: ");
                    String sellSymbol = scanner.next();
                    Stock sellStock = marketData.getStock(sellSymbol);
                    if(sellStock != null){
                        System.out.println("Enter quantity: ");
                        int sellQuantity = scanner.nextInt();
                        portfolio.buyStock(sellStock, sellQuantity);
                    }else{
                        System.out.println("Stock not found.");
                    }
                    break;
                case 3:
                    portfolio.printPortfolio(marketData);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}
