package practice06;

public class Teacher extends Person {
    private Klass klassObject;
    private final String intro = super.introduce() + " I am a Teacher. I teach";

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

        if (this.klassObject == null){
            return this.intro + " No Class.";
        }
        return this.intro + " Class " + this.klassObject.getNumber() +".";
    }

    public String introduceWith(Student student){
        return this.intro + " Jerry.";
    }


}
