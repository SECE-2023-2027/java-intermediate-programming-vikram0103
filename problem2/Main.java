package Problem2;
public class Main {
    public static void main(String[] args) {
        Student s = new Student("S101", "Sujan", 85, 90, 95);

        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Average: " + s.calculateAverage());
        System.out.println("Grade: " + s.calculateGrade());
    }
}