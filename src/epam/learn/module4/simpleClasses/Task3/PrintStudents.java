package epam.learn.module4.simpleClasses.Task3;

import java.util.ArrayList;

public final class PrintStudents {

    public static ArrayList<Student> printGoodStudents(Student[] students) {
        ArrayList<Student> list = new ArrayList<Student>();

        for (Student student : students) {
            int minMark = 10;

            int[] marks;
            for (int mark : student.getMarks()) {
                if (minMark > mark) {
                    minMark = mark;
                }
            }

            if (minMark >= 9) {
                list.add(student);

                student.toString();
            }
        }
        System.out.println(list);
        return list;
    }


}
