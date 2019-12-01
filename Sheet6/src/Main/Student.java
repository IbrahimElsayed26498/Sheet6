/*
In the name of Allah, the Gracious, the Merciful
 */
package Main;

/**
 *
 * @author Ibrahim
 */
public class Student {
    int MAXSIZE = 4;
    int counter = 0;
    private String name;
    private String address;
    int numCourses;
    String courses[] = new String[MAXSIZE];
    int grades[] = new int [MAXSIZE];
    
    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        return String.format("name : %s\nAddress : %s", name, address);
    }
    
    public void addCoursesGrade(String course, int grade){
        courses[counter] = course;
        grades[counter] = grade;
        counter++;
    }
    
    public void printGrades(){
        for(int i = 0; i < counter-1; i++){
            System.out.printf("%s : %d\n", courses[i],grades[i] );
        }
    }
    
    public double getAvarage(){
        double total = 0;
        for(int i = 0; i < counter-1; i++){
            total += grades[i];
        }
        
        return total/(counter-1);
    }
}
