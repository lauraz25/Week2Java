package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid;
    /*
    final means you can't reassign it. When Java autocreated this, it made it final because
    there's no method to reassign it.
    */

    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid);
        this.studentid = studentid;
    }
}
