import java.util.Scanner;
public class IceCream {
    public static void main(String[] args) {
        System.out.print("Please type in the last 6 digits of your student number");
        Scanner scanner=new Scanner(System.in);
        String last6Digits = scanner.nextLine();
int vanillaPrice = Integer.parseInt(last6Digits.substring(4,6));
int chocolatePrice = Integer.parseInt(last6Digits.substring(2, 4));
int strawberryPrice = Integer.parseInt(last6Digits.substring(0, 2));

        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
        String flavour = scanner.nextLine();

        while (!flavour.equals("v") && !flavour.equals("c") && !flavour.equals("s")) {
            System.out.print("We don't have that flavour. Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
            flavour = scanner.nextLine();
        }

        System.out.print("How many scoops would you like? ");
        int scoops = Integer.parseInt(scanner.nextLine());

        while (scoops > 3) {
            System.out.print("That's too many scoops to fit in a cone. How many scoops would you like? ");
            scoops = Integer.parseInt(scanner.nextLine());
        }
        while (scoops <1) {
            System.out.print("We don't sell just a cone.How many scoops would you like?");
            scoops = Integer.parseInt(scanner.nextLine());
        }

        int pricePerScoop;
        int totalPriceInPence;


        if (flavour.equals("v")) {
            pricePerScoop = vanillaPrice;
        } else if (flavour.equals("c")) {
            pricePerScoop = chocolatePrice;
        } else {
            pricePerScoop = strawberryPrice;
        }


        totalPriceInPence = 100 + (pricePerScoop * scoops);


        int pounds = totalPriceInPence / 100;
        int pence = totalPriceInPence % 100;

        System.out.println("That will be " + pounds + "." + pence + " please.");
        scanner.close();
    }





    }

