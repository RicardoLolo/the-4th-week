package demo;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("src/demo/test"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.45);
                output.writeDouble(3.5);
            }
            File file;
            try (DataInputStream input = new DataInputStream(new FileInputStream("src/demo/test"))) {
                while (true)
                    System.out.println(input.readDouble());
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
