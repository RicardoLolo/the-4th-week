package BaiTapThem;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManagement {
    private Student[] students;
    private static int index = 0;

    public StudentManagement(Student[] students) {
        this.students = students;
    }

    public void displayAllStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }
    public void addStudent(Student student) {
        if (index == students.length) {
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[index] = student;
        index++;
        System.out.println("Thêm thành công!");
        System.out.println("---------------");
    }
    public void displayByName(String name) {
        for (Student student : students) {
            if (student != null && student.getGender().equals(name)) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void deleteStudent(String Name) {
        int index = 0;
        Student[] studentList = new Student[students.length];
        for (Student student : students) {
            if (student != null && !student.getName().equals(Name)) {
                studentList[index] = student;
                index++;
            }
        }
        students = studentList;
        System.out.println("Xóa thành công!");
        System.out.println("---------------");
    }

    public void sortByAvgPoint() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getAvgPoint() < o2.getAvgPoint()) {
                        return -1;
                    } else if (o1.getAvgPoint() > o2.getAvgPoint()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sắp xếp thành công!");
        System.out.println("---------------");
    }

    public void addStudent() {
    }

    public void displayByGender(String nam) {
    }
}

