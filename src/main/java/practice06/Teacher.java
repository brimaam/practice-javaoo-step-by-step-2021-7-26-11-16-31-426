package practice06;

public class Teacher extends Person {
    private Klass klassObject;
    private final String intro = super.introduce() + " I am a Teacher. I ";

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
            return this.intro + "teach No Class.";
        }
        return this.intro + "teach Class " + this.klassObject.getNumber() +".";
    }

    public String introduceWith(Student student){
        if(this.klassObject.getNumber() != student.getKlass().getNumber()){
            return this.intro + "don't teach " + student.getName() + ".";
        }
        return this.intro + "teach " + student.getName() + ".";

    }


}
