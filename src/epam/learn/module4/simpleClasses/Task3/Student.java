package epam.learn.module4.simpleClasses.Task3;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {

    private String name;

    private int group;

    private int[] marks;

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public static void printGoodStudents(Student[] students) {

        for (Student student : students) {
            int minMark = 10;

            for (int mark : student.marks) {
                if (minMark > mark) {
                    minMark = mark;
                }
            }

            if (minMark >= 9) {
                System.out.printf("Отличник: %s, группа %d %n", student.name, student.group);
            }
        }
    }
}
