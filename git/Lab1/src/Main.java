package Students;
import Students.Search;
import Students.Student;





import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void selection(Search StudentList) { }
    public static void main(String[] args) {
        Search List = new Search("StudentList");
        List.addStudentToStudentList(new Student("Нестерович", 2,new int[]{10, 9, 10, 10} ));
        List.addStudentToStudentList(new Student("Карпенко", 9, new int[]{4, 5, 7}));
        List.addStudentToStudentList(new Student("Денисова", 5, new int[]{7, 5, 8, 10}));
        List.addStudentToStudentList(new Student("Дружинин",2, new int[]{5, 10, 7, 6 }));
        List.addStudentToStudentList(new Student("Решетникова", 1, new int[]{10, 10, 9}));
        selection(List);

        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите необходимый пункт:");
            System.out.println("1. Вывод среднего балла студента.");
            System.out.println("2. Вывод среднего балла группы.");
            System.out.println("3. Выход");
            System.out.println("Ваш выбор: ");
            int p = in.nextInt();
            selection(p, List);
        }
    }
    private static void selection(int p, Search StudentList) {
        switch(p) {
            case 1:
                StudentList.searchAvgStud();
                break;
            case 2:
                List<Student> searchGroup = StudentList.searchAvgGroup();
                for(Student s: searchGroup){
                    System.out.println(s);
                }
                System.out.println();
                break;
            case 3:
                System.exit(0);
        }

    }
}
