package practice05;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String intro = super.introduce() + " I am a Teacher. I teach";

        if (this.klass == 0){
            return intro + " No Class.";
        }
        return intro + " Class " + this.klass +".";

    }
}
