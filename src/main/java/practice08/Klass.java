package practice08;


import java.util.Objects;

public class Klass {
    private final int number;
    private Student leader;
    private Student klassMember;

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
        if (klassMember != null){
            leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }


    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        klassMember = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


}
