import java.util.Scanner;

class convert {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Please input amount in dollars as X.XX to convert to Euros.");
      double usd_amount = scan.nextDouble();

      double euro_amount = USD_EURO(usd_amount);

      System.out.println("$" + usd_amount + " is equal to €" + euro_amount);
    }

    public static double USD_EURO(double dollars){
      double euros = dollars * 0.88;
      return euros;
    }


}