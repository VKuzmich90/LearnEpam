package epam.learn.module4.simpleClasses.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintStudents {

    ArrayList<Student> list = new ArrayList<Student>();

    public ArrayList<Student> printGoodStudents(Student[] students) {


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
