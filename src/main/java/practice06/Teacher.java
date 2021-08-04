package practice06;

public class Teacher extends Person {
    private Klass klassObject;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klassObject = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klassObject;
    }

    @Override
    public String introduce() {
        String intro = super.introduce() + " I am a Teacher. I teach";

        if (this.klassObject == null){
            return intro + " No Class.";
        }
        return intro + " Class " + this.klassObject.getNumber() +".";

    }
}
