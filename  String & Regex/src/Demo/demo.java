package Demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^\\[+84]\\[0-9]{9,10}$");
        while (true) {
            System.out.println("phone number of Quang Cò :");
            String sdt = sc.nextLine();
            if (pattern.matcher(sdt).find()) {
                System.out.println("phone number ok");
                break;
            } else {
                System.err.println("phone number wrong");
            }
        }
    }
}
