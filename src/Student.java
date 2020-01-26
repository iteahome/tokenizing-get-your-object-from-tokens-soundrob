import java.util.Scanner;

public class Student {

    int id;
    String firstName, lastName, city, nativeLanguage;
    float grade;
    Student(int id, String firstName, String lastName, String city, String nativeLanguage, float grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }

    public String toString() {
        return id + " " + firstName + " " + lastName + " " + city + " " + nativeLanguage + " " + grade;
    }
        public static void main(String[] arg){

        Student student = new Student(1, "Andrei", "Mladin","Cluj-Napoca", "Romana",10);
        Scanner scanner = new Scanner(student.toString()).useDelimiter(";");
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }

}
