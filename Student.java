public class Student extends Person {


    private String idNumber;
    private String name;
    private double gpa;
    private int course;
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }




    public String toString() {
        return super.toString() + (", student id: " + idNumber + ", gpa: " + gpa);
    }

}

