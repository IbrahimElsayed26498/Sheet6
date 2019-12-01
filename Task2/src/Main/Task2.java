/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Courses course1 = new Courses("Software Eng.");
        Courses course2 = new Courses("Database");
        
        
        course1.addStudent("Ahmed Mohmed");
        course1.addStudent("Ali Mohmed");
        course1.addStudent("Ahmed Ali");
        course1.addStudent("Mohmed Ali");
        
        course2.addStudent("Ahmed");
        course2.addStudent("Ali");
        course2.addStudent("Mohamed");
        course2.addStudent("John");
        
        System.out.println("Course1 : ");
        System.out.println("Name : " + course1.getName());
        System.out.println("Number of Students : " + course1.getNumberOfStudents());
        String students[] = course1.getStudents();
        for(String student : students){
            System.out.println(student);
        }
        System.out.println();
        
        
        System.out.println("Course2 : ");
        System.out.println("Name : " + course2.getName());
        System.out.println("Number of Students : " + course2.getNumberOfStudents());
        String students2[] = course2.getStudents();
        for(String student : students2){
            System.out.println(student);
        }
        
    }
    
}
