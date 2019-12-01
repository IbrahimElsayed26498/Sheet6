/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class Sheet6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Mohamed Elsaid", "Menouf");
        Student student2 = new Student("Ahmed Hassan", "Cairo");
        
        student1.addCoursesGrade("Math", 50);
        student1.addCoursesGrade("Physics", 40);
        student1.addCoursesGrade("programming", 70);
        student1.addCoursesGrade("Arabic", 90);
        
        student2.addCoursesGrade("English", 70);
        student2.addCoursesGrade("Database", 80);
        student2.addCoursesGrade("Security", 75);
        student2.addCoursesGrade("Logic", 95);
        
        System.out.println("Student 1 :");
        System.out.println(student1);
        System.out.println("\nGrades :\n");
        student1.printGrades();
        System.out.println("\nAvarage : " + student1.getAvarage());
        System.out.println();
        
        
        System.out.println("Student 2 :");
        System.out.println(student2.toString());
        System.out.println("\nGrades :\n");
        student2.printGrades();
        System.out.println("\nAvarage : " + student2.getAvarage());
        
        
    }
    
}
