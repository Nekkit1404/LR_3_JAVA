import java.io.PrintWriter;        // для записи данных в файл
import java.io.FileNotFoundException; // для обработки ошибок при записи
import java.util.ArrayList;         // для хранения списка курсов

// Класс Student хранит информацию о студенте
public class Student {
    String name;        // имя студента
    int studentId;      // ID студента
    ArrayList<String> courses; // список курсов студента

    // Конструктор с параметрами: задаёт имя и ID
    public Student(String name, int studentId) {
        this.name = name;                 // присваиваем имя
        this.studentId = studentId;       // присваиваем ID
        this.courses = new ArrayList<>(); // создаём пустой список курсов
    }

    // Конструктор по умолчанию: если имя и ID не переданы
    public Student() {
        this.name = "Иван";            // стандартное имя
        this.studentId = 0;               // стандартный ID
        this.courses = new ArrayList<>(); // пустой список курсов
    }

    // Метод для вывода информации о студенте в консоль
    public void printInfo() {
        System.out.println("Имя: " + name + ", ID: " + studentId);
    }

    // Метод для изменения имени студента
    public void updateName(String newName) {
        this.name = newName;               // обновляем поле name
    }

    // Метод для добавления курса в список
    public void addCourse(String course) {
        courses.add(course);               // добавляем курс в ArrayList
    }

    // Метод для вывода списка курсов в файл через PrintWriter
    public void listCourses(PrintWriter writer) {
        if (courses.isEmpty()) {           // проверяем, есть ли курсы
            writer.println(name + " не записан ни на один курс.");
        } else {
            writer.println("Курсы студента " + name + ":");
            for (String c : courses) {    // перебираем все курсы
                writer.println("- " + c);  // записываем каждый курс в файл
            }
        }
    }
}
