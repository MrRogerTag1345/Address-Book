import java.util.List;
import java.util.Scanner;

public class Process {
    // Provides a readable view of contacts in the list.
    public void View(List<String[]> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).length; j++) {
                System.out.println(data.get(i)[j]);
            }
            System.out.println();
        }
    }

    // Asks User for New Contact Information.
    public void AddNewContact(List<String[]> addressBook) {
        Scanner scnObj = new Scanner(System.in);
        InputIOClass appendNewData = new InputIOClass();

        System.out.println("Adding a New Contact, lets start with a name.");
        System.out.print("What is the FULL Name of the Contact: ");
        String name = scnObj.nextLine();
        System.out.print("What is, " + name + " phone number? Make sure to include - or spaces.: ");
        String phoneNumber = scnObj.nextLine();
        System.out.print("What is, " + name + " email address? Write NULL if unknown.: ");
        String email = scnObj.nextLine();
        System.out.print("What is, " + name + " home address? Write NULL if unknown.: ");
        String address = scnObj.nextLine();


        System.out.println("\nThis is," + name + " information...");
        System.out.println(name);
        System.out.println(phoneNumber);
        System.out.println(email);
        System.out.println(address);
        System.out.print("Is this information correct? (Y|N): ");
        String selection = scnObj.nextLine();

        if (selection.toLowerCase().contains("y")) {
            appendNewData.AppendDatatoStorage(name, phoneNumber, email, address, addressBook);
            System.out.println("Phone Contact Book has been updated.");
        }
        else {
            System.out.println("No Changes have been made");
        }
    } 
}

