package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Students.Student;

public class Search {
    Scanner in = new Scanner(System.in);
    private ArrayList<Student> studentList = new ArrayList<>();
    Search(String Name) { }
    void addStudentToStudentList(Student st) {
        studentList.add(st);
    }

     void searchAvgStud() {
         System.out.println("Введите фамилию студента:");
         String surname = in.nextLine();
         double avg = 0;
         double sum = 0;
         int col = 0;
         for (Student i : studentList) {
             if (i.getSurname().equals(surname)) {
                 for (int k = 0; k < i.getMarks().length; k++) {
                     sum += i.getMarks()[k];
                     col++;
                 }
                 avg = sum / col;
                 System.out.println("Студент: " + surname + ". Средний балл: " + avg + ".");
             }
         }
     }

        List<Students.Student> searchAvgGroup(){
             List<Students.Student> list = new ArrayList<>();
             System.out.println("Введите номер группы: ");
             int group = in.nextInt();
             double FinalAvg = 0;
             double FinalSum = 0;
             int StudInGroup = 0;
             for (Student i : studentList) {
                 if (i.getGroup() == group) {
                     list.add(i);
                 }
             }
             for (Students.Student k : list) {
                 double avg = 0;
                 double sum = 0;
                 double col = 0;
                 for (int l = 0; l < k.getMarks().length; l++) {
                     sum += k.getMarks()[l];
                     col++;
                 }
                 avg = sum / col;
                 StudInGroup++;
                 FinalSum += avg;
             }
             FinalAvg = FinalSum / StudInGroup;
             System.out.println("Группа: " + group + ". Средний балл:  " + FinalAvg);
             return list;
         }

        List<Student> searchGroup() {
            List<Student> list = new ArrayList<>();
            System.out.println("Введите номер группы(1-3): ");
            int group = in.nextInt();
            System.out.println();
            System.out.println("Студенты " + group + " группы:");
            for (Student i : studentList) {
                if (i.getGroup() == group){
                    list.add(i);
                }
            }
            return list;
        }
    }