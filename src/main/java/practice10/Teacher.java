package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> classes;
    private final String intro = super.introduce() + " I am a Teacher. I ";

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (this.classes == null) {
            return this.intro + "teach No Class.";
        }

        String classesString = this.classes
                .stream()
                .map(a -> String.valueOf(a.getNumber()))
                .collect(Collectors.joining(", "));

        return this.intro + "teach Class " + classesString + ".";

    }

    public String introduceWith(Student student){
        int total=0;
        for(Klass klass : this.classes) {
            total += klass.getNumber();
        }


        if(total != student.getKlass().getNumber()){
            return this.intro + "don't teach " + student.getName() + ".";
        }
        return this.intro + "teach " + student.getName() + ".";

    }

    public boolean isTeaching(Student student) {
        if(student.getKlass().getNumber() == 2){
            return student.getKlass().isIn();
        }
        return false;
    }
    public static void notifyTeacher(Student student, int note){
        String notif = "I am Tom. I know " + student.getName();
        int number = student.getKlass().getNumber() -1;

        if(note == 1) {
            System.out.print(notif + " become Leader of Class "+ number +".\n");
        } else if (note == 0){
            System.out.print(notif + " has joined Class "+ number +".\n");
        }

    }
}
