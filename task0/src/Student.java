package Students;

public class Student {
    private String surname;
    private int group;
    private int[] marks;

    Student(){ }
    Student(String surname, int group, int[] marks) {
        this.surname = surname;
        this.group = group;
        this.marks = marks;
    }

    public String getSurname() {return surname;}
    public int getGroup() {return group;}
    public int[] getMarks() {return marks;}
    public String toString(){
        return "Студент: " + this.surname + " , группа: "+this.group+".";
    }

}
