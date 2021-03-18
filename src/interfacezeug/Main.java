package interfacezeug;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static HashSet<iBuyable> shoppingcart = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Press Enter if you want to start your shopping tour!");
        scanner.nextLine();

        System.out.println("What do you want to buy?");
        String input = scanner.next();

        int amount;

        while (!input.equals("exit")) {
            if (input.equals("kuerbis") || input.equals("schoggi") || input.equals("milch") || input.equals("gummischlange")) {

                System.out.println("How much " + input + " would you like to buy?");
                amount = scanner.nextInt();

                switch (input) {
                    case "kuerbis":
                        for (int i = 0; i < amount; i++){
                            shoppingcart.add(new Kuerbis());
                        }
                        break;
                    case "schoggi":
                        for (int i = 0; i < amount; i++){
                            shoppingcart.add(new Schoggi());
                        }
                        break;
                    case "milch":
                        for (int i = 0; i < amount; i++){
                            shoppingcart.add(new Milch());
                        }
                        break;
                    case "gummischlange":
                        for (int i = 0; i < amount; i++){
                            shoppingcart.add(new Gummischlange());
                        }
                }
            }else{
                System.out.println("This product is not available.");
            }
            System.out.println("What do you want to buy?");
            input = scanner.next();
        }



        System.out.println("The final price is: " + calculateSum(shoppingcart));
    }


    public static double calculateSum(HashSet<iBuyable> shoppingcart) {
        double sum = 0;
        for (iBuyable p : shoppingcart){
            sum += p.getPrice();
        }
        return sum;
    }

    //wohin, wie viel, was?
    public static void addProduct(HashSet<iBuyable> cart, int amount, String product){

        switch (product){
            case "k":
                for(int i = amount; i > 0; i--){
                    cart.add(new Kuerbis());
                }
                break;
            case "s":
                for(int i = amount; i > 0; i--){
                    cart.add(new Schoggi());
                }
                break;
            case "m":
                for(int i = amount; i > 0; i--){
                    cart.add(new Milch());
                }
                break;
            case "g":
                for(int i = amount; i > 0; i--){
                    cart.add(new Gummischlange());
                }
        }
    }

}













