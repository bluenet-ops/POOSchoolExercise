import org.generation.courses.Courses;
import org.generation.student.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Roberto", "Díaz", 12345, 85, 2024);
        Student student2 = new Student("Eduardo", "López", 1111, 90, 2024);
        Student student3 = new Student("Javier", "Sánchez", 22222, 80, 2024);
        
        Courses course1 = new Courses("Ing. Desarrollo de Software", "Prof. JC", 2024);
        Courses course2 = new Courses("Arquitectura", "Prof. Magali", 2024);
        Courses course3 = new Courses("Contaduría", "Prof. Fer", 2024);
        
        course1.enroll(student1);
        course2.enroll(student2);
        course3.enroll(student3);
        
        System.out.println("Estudiante " + student1.firstName + " con matrícula " + student1.registration + " registrado en " + course1.courseName);
        System.out.println("Número de estudiantes inscritos en curso #1: " + course1.countStudents());
        System.out.println("Mejor grado en el curso: " + "(" + course1.bestGrade()+ ")" + " con el/la " + course1.professorName);
        System.out.println("Se verifica si el estudiante aprueba: ");
        int approvedNewYear = student1.changeYearIfApproved();
        System.out.println("Nuevo año del estudiante: " + approvedNewYear);
        
        course1.unEnroll(student1);
        System.out.println("Número de estudiantes restantes en curso #1: " + course1.countStudents());
    }
}