import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class InputIOClass {
    // Read from Memory and Leave in 2D Array.
    public List<String[]> Input(String filePathString) { // lowercase by convention
        List<String[]> dataList = new ArrayList<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(filePathString))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                dataList.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return dataList;
    }

    public void AppendDatatoStorage(String name, String phoneNumber, String email, String address,
            List<String[]> addressBook) {
        addressBook.add(new String[] { name, phoneNumber, email, address });

        WriteToFile(addressBook);
    }
    
    public void RemoveDatafromStorage(List<String[]> addressBook) {
        WriteToFile(addressBook);
    }
    
    private void WriteToFile(List<String[]> addressBook) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Address Book JAVA/Address Book/src/AddressBook.txt"))) {
            for (String[] contact : addressBook) {
                // Join attributes with comma and write each contact as one line
                String line = String.join(",", contact);
                writer.write(line);
                writer.newLine(); // moves to the next line
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
