import java.io.PrintWriter;        // для записи в файл
import java.io.FileNotFoundException; // обработка ошибок записи

public class Main {
    public static void main(String[] args) {

        // ================Задание 1: Создание объектов и запись в students.txt================

        Student student1 = new Student("Никита", 101); // создаём первый объект
        Student student2 = new Student("Дэнчик", 102); // создаём второй объект

        try (PrintWriter writer = new PrintWriter("students.txt")) { // открываем файл для записи
            // записываем данные студентов в файл
            writer.println("Студент 1: " + student1.name + ", ID: " + student1.studentId);
            writer.println("Студент 2: " + student2.name + ", ID: " + student2.studentId);
            System.out.println("students.txt создан"); // уведомляем в консоль
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи students.txt"); // обработка ошибки
        }

        // ================Задание 2: Использование конструкторов================

        Student s1 = new Student("Лёха", 201); // объект с параметрами
        Student s2 = new Student("Саша", 202);   // объект с параметрами
        Student s3 = new Student();               // объект по умолчанию

        try (PrintWriter writer = new PrintWriter("constructors.txt")) { // файл для записи
            writer.println(s1.name + ", ID: " + s1.studentId);
            writer.println(s2.name + ", ID: " + s2.studentId);
            writer.println(s3.name + ", ID: " + s3.studentId);
            System.out.println("constructors.txt создан");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи constructors.txt");
        }

        // ================Задание 3: Методы printInfo и updateName================

        Student s4 = new Student("Ярик", 301); // создаём объект
        s4.printInfo();                             // выводим информацию в консоль
        s4.updateName("Ярослав Паранюк");            // обновляем имя студента

        try (PrintWriter writer = new PrintWriter("update_log.txt")) { // записываем в файл
            writer.println("После обновления имени:");
            writer.println("Имя: " + s4.name + ", ID: " + s4.studentId);
            System.out.println("update_log.txt создан");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи update_log.txt");
        }


        // ================Задание 4: Курсы===================

        Student s5 = new Student("Диана", 401);   // создаём объект
        s5.addCourse("Кросс-платформенное программирование на Java");        // добавляем курсы
        s5.addCourse("Операционные Системы");

        try (PrintWriter writer = new PrintWriter("courses.txt")) { // записываем список курсов
            s5.listCourses(writer);                  // используем метод listCourses
            System.out.println("courses.txt создан");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи courses.txt");
        }
    }
}
