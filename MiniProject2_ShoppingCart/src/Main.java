import java.util.Scanner;
class ShoppingCart{

    String Product = "";
    double Price;
//    double[] Price = {2000,300,400,540,200,1500,750,1350,1200,350,1300,600,900,15_000};
    int Quantity;

    ShoppingCart(String Product,double Price,int Quantity){
        this.Product=Product;
        this.Price=Price;
        this.Quantity=Quantity;
    }

    void Total(){
        double Total = Price * Quantity;
        System.out.println("Your Total amount to be paid :"+ Total);
    }
}

class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String Product;
        double Price = 0;
        int Quantity = 0;
        int choice = 0;
        while (choice != 14) {

            System.out.println("_________________Welcome to JavaMart_________________");
            System.out.println("Kindly choose what do you want to purchase:");
            System.out.println("1.Cricket Bat");
            System.out.println("2.Cricket Ball");
            System.out.println("3.Thigh Pad");
            System.out.println("4.Abdominal Guard");
            System.out.println("5.Batting Pad");
            System.out.println("6.Resistant Band");
            System.out.println("7.Shoe");
            System.out.println("8.Whites");
            System.out.println("9.Hand Sleeves");
            System.out.println("10.Helmet");
            System.out.println("11.Elbow Guard");
            System.out.println("12.Batting Gloves");
            System.out.println("13.Kit bag");
            System.out.println("14.Exit");

            System.out.println("Enter your choice to purchase:");
            choice = input.nextInt();

//            if(choice >= 14)
            if(choice == 14){
                System.out.println("Thankyou for your purchasing with JavaMart");
                break;

            }

            switch (choice) {

                case 1: Product = "Cricket Bat";Price = 2000;break;
                case 2: Product = "Cricket Ball"; Price = 300; break;
                case 3: Product = "Thigh Pad"; Price = 400; break;
                case 4: Product = "Abdominal Guard"; Price = 540; break;
                case 5: Product = "Batting Pad"; Price = 200; break;
                case 6: Product = "Resistant Band"; Price = 1500; break;
                case 7: Product = "Shoe"; Price = 750; break;
                case 8: Product = "Whites"; Price = 1350; break;
                case 9: Product = "Hand Sleeves"; Price = 1200; break;
                case 10: Product = "Helmet"; Price = 350; break;
                case 11: Product = "Elbow Guard"; Price = 1300; break;
                case 12: Product = "Batting Gloves"; Price = 600; break;
                case 13: Product = "Kit Bag"; Price = 15500; break;
                default:
                    System.out.println("Enter valid Choice to purchase");
                    continue;
            }
          
            System.out.println("Enter the Number of Quantity to be needed:");
            Quantity = input.nextInt();

            
            ShoppingCart cart = new ShoppingCart(Product, Price, Quantity);
            System.out.println("Kudos!!!,You have Succesfully purchased:" + Product);
            cart.Total();

        }
     

        input.close();
    }
}