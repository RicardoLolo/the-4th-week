package demo.ObjectInputStreamAndObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectInputStreamExample {
    public static void main(String args[]) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/demo/ObjectInputStreamAndObjectOutputStream/product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}