package practice07;

public class Student extends Person {
    private Klass klassObject;

    public Student(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klassObject = klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klassObject;
    }

    @Override
    public String introduce() {
        String studentIntro = " I am a Student. I am";
        if(klassObject.getLeader().getName().equals("Tom")){
            return super.introduce() + studentIntro + " Leader of Class " + this.klassObject.getNumber() +".";
        }
        return super.introduce() + studentIntro + " at Class " + this.klassObject.getNumber() +".";
    }
}

