import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Add");
            System.out.println("2: Delete");
            System.out.println("3: Update");
            System.out.println("4: Show All");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Enter your id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter your age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your address: ");
                    String address = scanner.nextLine();
                    Student s = new Student(id,age,name,address);
                    m.add(s);
                    System.out.println("Add successfully!");
                    break;
                case 2:
                    System.out.print("Enter your id: ");
                    int idd = Integer.parseInt(scanner.nextLine());
                    m.delete(idd);
                    break;
                case 3:
                    System.out.print("Enter your id: ");
                    int idu = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter your age: ");
                    int ageu = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter your name: ");
                    String nameu = scanner.nextLine();
                    System.out.print("Enter your address: ");
                    String addressu = scanner.nextLine();
                    Student su = new Student(idu,ageu,nameu,addressu);
                    m.update(su);
                    break;
                case 4:
                    m.showAll();
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
