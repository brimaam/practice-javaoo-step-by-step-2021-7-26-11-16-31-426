package practice09;

import java.util.Objects;

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
        } else {
            System.out.print("It is not one of us.\n");
        }
    }


    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setMembership(true);
    }
    public boolean isIn(){
        return true;
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
