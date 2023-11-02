import java.util.Scanner;

public class Product {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int id, price;
        String title, description, category;
        
        System.out.print("Enter Your ID : ");
        id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Your Title : ");
        title = sc.nextLine();
        
        System.out.print("Enter The Price : ");
        price = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Your Description : ");
        description = sc.nextLine();
        
        System.out.print("Enter The Category : ");
        category = sc.nextLine();
        
        System.out.println("\n\n===== List of your Information ======\nYour ID : "+id+"\nYour Title : "+title+"\nPrice : "+price+"\nEnter Description : "+description+"\nEnter The Category : "+category+"\n---------- x ----------");
        
    }
    
}
