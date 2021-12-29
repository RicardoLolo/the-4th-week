package BaiTapThem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số sinh viên muốn tạo: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManagement studentManager = new StudentManagement(students);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả");
            System.out.println("2. Thêm 1 sinh viên");
            System.out.println("3. Hiển thị thoe giới tính");
            System.out.println("4. Tìm kiếm theo giới tính");
            System.out.println("5. Sửa dữ liệu theo tên");
            System.out.println("6. Xóa 1 sinh viên theo tên");
            System.out.println("7. Hiển thị tất cả sinh viên điểm trung bình trên 7,5");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.displayAllStudent();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    int choice1;
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Nam");
                        System.out.println("2. Nữ");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:
                                studentManager.displayByGender("Nam");
                                break;
                            case 2:
                                studentManager.displayByGender("Nữ");
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 4:
                    System.out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    studentManager.displayByName(name);
                    break;
                case 5:
                    Student student = createStudent(scanner);
                    studentManager.addStudent(student);
                    break;
                case 6:
                    System.out.println("Nhập vào tên muốn tìm: ");
                    scanner.nextLine();
                    String nameDel = scanner.nextLine();
                    studentManager.deleteStudent(nameDel);
                    break;
                case 7:
                    studentManager.sortByAvgPoint();
                    break;
            }
        }while (choice != 0);
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập giới tính");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm TB");
        double avgPoint = scanner.nextDouble();
        return new Student(name1, age, gender, address, avgPoint);
    }
}
