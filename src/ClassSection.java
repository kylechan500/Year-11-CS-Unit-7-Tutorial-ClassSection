import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList();
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String newSubject){
        subject = newSubject;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int newYearLevel){
        yearLevel = newYearLevel;
    }
    public ArrayList getStudents(){
        return students;
    }
    public void addStudent(Student newStudent){
        if(students.contains(newStudent) == false && newStudent.getYearLevel() == this.yearLevel){
            students.add(newStudent);
        }
    }
    public void removeStudent(Student newStudent){
        students.remove(newStudent);
    }
    public boolean isStudentEnrolled(Student student){
        boolean isStudentEnrolled = students.contains(student);
        return isStudentEnrolled;
    }
    public String toString(){
        return ("ClassSection{subject='"+subject+"', capacity="+capacity+", yearLevel="+yearLevel+", students="+students+"}");
    }
}
