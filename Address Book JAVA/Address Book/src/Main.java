/*
 * Made By Chetas Patel
 */

 import java.util.List;
 import java.util.Scanner;
 
 public class Main {
     public static void main(String[] args) {
 
         InputIOClass reader = new InputIOClass();
         String path = new String("Address Book JAVA/Address Book/src/AddressBook.txt");
         List<String[]> addressBook = reader.Input(path);
         Process functionProcessor = new Process();
 
         Scanner scnObj = new Scanner(System.in);
 
         System.out.println("Welcome! \nThis is an Address Book.");
         System.out.println("1. Add Contact \n2. View Contacts \n3. Search Contact \n4. Delete Contact \n5. Exit");
         System.out.print("Selection: ");
         
         Integer option = null;
         try {
             option = Integer.parseInt(scnObj.nextLine());
         } catch (NumberFormatException e) {
             System.out.println("Invalid input. Please enter a number between 1 and 5.");
         }
 
         switch (option) {
             case 1:
                 functionProcessor.AddNewContact(addressBook);
                 break;
             case 2:
                 functionProcessor.View(addressBook);
                 break;
             case 3:
                 functionProcessor.SearchContact(addressBook);
                 break;
             case 4:
                 functionProcessor.RemoveContact(addressBook);
             case 5:
                 System.exit(0);
                 break;
             default:
                 System.exit(0);
         }
     }
 }
 