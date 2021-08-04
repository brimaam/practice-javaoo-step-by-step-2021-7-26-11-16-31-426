package practice06;

public class Student extends Person{
    private Klass klassObject;

    public Student(String name, int age, Klass klass) {
        super(name, age);
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
        return super.introduce() + " I am a Student. I am at Class " + this.klassObject.getNumber() +".";
    }
}
