package practice10;


public class Klass {
    private final int  number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if (student.isMembership()){
            leader = student;
            Teacher.notifyTeacher(student, 1);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }


    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {

        student.setMembership(true);
        Teacher.notifyTeacher(student, 0);
    }

    public boolean isIn(){
        return true;
    }
}
