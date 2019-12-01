/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class Courses {
    int MAXSIZE = 4;
    int counter = 0;
    String name;
    String students[] = new String[MAXSIZE];
    int numberOfStudents = 0;

    public Courses(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addStudent(String student){
        students[counter++] = student;
        numberOfStudents++;
    }
    
    public String[] getStudents(){
        return this.students;
    }
    
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
}
