package exercises.JavaExerciseThree;

import java.util.HashMap;

public class QuestionThree {
    HashMap<Integer, String> studentRegister = new HashMap<Integer, String>();

    public void addStudent(int id, String name){
        studentRegister.put(id,name);
    }

    public String getStudentById(int id){
        return studentRegister.get(id);
    }

    public void removeStudentById(int id){
        studentRegister.remove(id);
    }
    public static void main(String[] args) {

        QuestionThree studentRegistry = new QuestionThree();
        studentRegistry.addStudent(1,"A");
        studentRegistry.addStudent(2,"B");
        studentRegistry.addStudent(3,"C");
        studentRegistry.addStudent(4,"D");
        studentRegistry.addStudent(5,"E");
        System.out.println(studentRegistry.getStudentById(2));
        studentRegistry.removeStudentById(4);
        System.out.println(studentRegistry.studentRegister);
    }
}
