package practice10;


public class Student extends Person {
    private Klass klassObject;
    private boolean membership = false;

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

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    @Override
    public String introduce() {
        String studentIntro = super.introduce() + " I am a Student. I am";
        if(this.membership){
            return  studentIntro + " Leader of Class " + this.klassObject.getNumber() +".";
        }
        return studentIntro + " at Class " + this.klassObject.getNumber() +".";
    }
}
