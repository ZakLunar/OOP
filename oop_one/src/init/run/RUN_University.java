package init.run;

import init.university.Aspirant;
import init.university.Student;

public class RUN_University {
    public static void main(String[] args) {

        Student student1 = new Student("Mikha", "Petrov", "BA", 4.3);
        Student student2 = new Student("Leo", "Mask", "SA", 5);
        Student student3 = new Student("Ivan", "Budko", "RE", 3.2);

        Student student4 = new Aspirant("Max", "Losko", "SA", 5);
        Student student5 = new Aspirant("Kleo", "Marko", "AA", 4);

        Student[] students = {student1, student4, student2, student3, student5};

        for (Student student: students ) {
            student.getScholarship();
        }
    }
}
