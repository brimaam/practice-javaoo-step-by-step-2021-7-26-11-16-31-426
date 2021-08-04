package practice07;

public class Klass {
    private int number;
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
        leader = student;
    }


    public Student getLeader() {
        return leader;
    }

}
