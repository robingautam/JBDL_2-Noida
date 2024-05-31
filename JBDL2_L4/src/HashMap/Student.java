package HashMap;

public class Student {
    int id;
    String name;
    String email;

    Student(){}
    Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (s.email.equals(this.email) && s.id==this.id && this.name.equals(s.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id+this.name.hashCode();
    }
}
