import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
   
    System.out.println("Welcome to the Change Calculator");
    System.out.println("Please Enter Your Bill");
    System.out.print("Total Bill: ");
    Double tbill = kin.nextDouble();
    
    System.out.println("Please Enter How Much You Paid");
    System.out.print("Paid: ");
    Double tpaid = kin.nextDouble();
    Double owed = (tpaid - tbill);
    if(owed >= 20){
    number20s = owed / 20;   
    };
  }
}