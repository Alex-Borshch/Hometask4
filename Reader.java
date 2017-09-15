import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Reader {

    private String name;
    private int age;
    private String gender;
    private String idNumber;
    private double gpa;
    private int year;
    private String major;
    private String[] words;
    private String[] args;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    private String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        exists(fileName);

        try {
            //Объект для чтения файла в буфер
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                try {
                    //В цикле построчно считываем файл
                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                } finally {
                    //Также не забываем закрыть файл
                    in.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public void readFile(String filename) throws FileNotFoundException {

        words = read(filename).split(",");

        for (String s :
                words) {
            args = s.split(":");
            switch (args[0]) {

                case "name":
                    name = args[1];
                    break;
                case "age":
                    age = Integer.parseInt(args[1]);
                    break;
                case "year":
                    year = Integer.parseInt(args[1]);
                    break;
                case "gender":
                    gender = args[1];
                    break;
                case "idNumber":
                    idNumber = args[1];
                    break;
                case "major":
                    major = args[1];
                    break;
                case "gpa":
                    gpa = Double.parseDouble(args[1]);
                    break;
                default:
                    throw new FileNotFoundException("No argument");

            }

        }


    }


}
