package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("src/demo/temp");) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        try (FileInputStream input = new FileInputStream("src/demo/temp");){
            int value;
            while ((value = input.read())!= -1)
                System.out.println(value + " ");
        }
    }
}
