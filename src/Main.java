import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> listContact = new HashMap<>();

        int option = 0;
        int id = 1;

        while (true){
            System.out.println("================menu================");
            System.out.println("\nSelect a option:\n");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Display Contact");
            System.out.println("4. Exit\n");
            System.out.println("====================================");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("================Add Contact================");
                    System.out.println("\nType contact name: ");
                    String name = sc.nextLine();
                    listContact.put(id++, name);
                    System.out.println("\nContact added!\n");
                    System.out.println("============================================");
                    break;
                case 2:
                    System.out.println("================Delete Contact===============");

                    listContact.forEach((key, value) -> {
                        System.out.printf("\n%d - %s\n", key, value);
                    });
                    System.out.println("\nType contact id: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    listContact.remove(id);

                    System.out.println("\nContact deleted!\n");

                    System.out.println("===========================================");
                    break;
                case 3:
                    System.out.println("================List contact===============\n");
                    listContact.forEach((key, value) -> {
                        System.out.printf("%d - %s\n", key, value);
                    });
                    System.out.println("\n===========================================");
                    break;
                case 4:
                    System.out.println("Closing Program...");
                    return;

            }

        }
    }
}