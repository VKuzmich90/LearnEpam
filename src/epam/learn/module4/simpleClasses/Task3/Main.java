package epam.learn.module4.simpleClasses.Task3;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

import static epam.learn.module4.simpleClasses.Task3.PrintStudents.printGoodStudents;

public class Main {

    public static void main(String[] args) {

        printGoodStudents(getArrayOfStudents());

    }

    public static Student[] getArrayOfStudents() {
        Student[] students = new Student[10];

        students[0] = new Student("Иванов А.И.", 101, new int[]{5, 6, 7, 8, 9});
        students[1] = new Student("Петров С.А.", 102, new int[]{9, 9, 10, 10, 10});
        students[2] = new Student("Рожков К.К.", 102, new int[]{9, 8, 7, 10, 6});
        students[3] = new Student("Серов К.С.", 101, new int[]{6, 5, 7, 10, 4});
        students[4] = new Student("Дмитриев Н.Н.", 103, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("Константинов С.С.", 104, new int[]{6, 7, 8, 10, 4});
        students[6] = new Student("Старых Е.А.", 104, new int[]{10, 9, 9, 10, 9});
        students[7] = new Student("Анискович А.Д.", 102, new int[]{7, 6, 4, 10, 5});
        students[8] = new Student("Зыль К.О.", 102, new int[]{7, 8, 7, 10, 8});
        students[9] = new Student("Потрихалина Н.Ю.", 103, new int[]{9, 10, 10, 10, 9});

        return students;
    }


}

