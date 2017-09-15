import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        Person[] persons = new Person[8];

        persons[0] = new Person("Mania", 20, "F");
        persons[1] = new Person("Petia", 2, "M");
        persons[2] = new Student("Ivan", 23, "M", "HDY93745", 3.5);
        persons[3] = new Student("Sarah", 21, "F", "RHY46847", 4);
        persons[4] = new Teacher("Grisha", 40, "M", "Programming", 50000);
        persons[5] = new Teacher("Klara", 72, "F", "Russian language", 35.800);
        persons[6] = new CollegeStudent("Gavrilo", 18, "M", "RHF11645", 4, 1, "English");
        persons[7] = new CollegeStudent("Galia", 16, "M", "RFHSW486", 2.5, 2, "English");

        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("______________________________________________________________________________");

        Reader r = new Reader();
        try {
            r.readFile("Data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Cant read file");
        }
        System.out.println(new CollegeStudent(r.getName(), r.getAge(), r.getGender(), r.getIdNumber(), r.getGpa(), r.getYear(), r.getMajor()));

    }


}