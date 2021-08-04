package practice08;


public class Klass {
    private final int  number;
    private static Student leader;

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
        if(student.getKlass().getLeader().getName() != leader.getName()){
            System.out.print("It is not one of us.\n");
        }
        else {
            System.out.print("It is not one of us.\n");
            leader = student;
        }
    }


    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        leader = student;
    }


}
