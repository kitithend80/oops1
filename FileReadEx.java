import java.io.*;
public class FileReadEx {
    public static void main(String[] args) {
        System.out.println("A.SAMHITHA, CSE24011");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("java.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
