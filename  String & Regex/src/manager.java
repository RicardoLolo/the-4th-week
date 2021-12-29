import BaiTapThem.Student;

public interface manager {
    void displayAllStudent();
    void addStudent(Student student);
    void displayByName(String name);
    void deleteStudent(String Name);
    void sortByAvgPoint();
}
