package exercises.JavaExerciseThree;

import java.util.LinkedList;
import java.util.Locale;
import java.util.TreeSet;
  abstract class AbstractSetProcessor {
    abstract void processSet(TreeSet<String> set);
}
class UpperCaseSetProcessor extends AbstractSetProcessor{
    @Override
    void processSet(TreeSet<String> set) {
        TreeSet<String> upperCaseSet = new TreeSet<String>();
        for(String name: set){
            upperCaseSet.add(name.toUpperCase(Locale.ROOT));
        }
        System.out.println("upperCaseSet : "+upperCaseSet);
    }
}
class LowerCaseSetProcessor extends AbstractSetProcessor{
    @Override
    void processSet(TreeSet<String> set) {
        TreeSet<String> lowerCaseSet = new TreeSet<String>();
        for(String name: set){
            lowerCaseSet.add(name.toLowerCase(Locale.ROOT));
        }
        System.out.println("lowerCaseSet : "+lowerCaseSet);
    }
}

public class QuestionFive {
    public static void main(String[] args) {

        TreeSet<String> nameSet = new TreeSet<String>();
        nameSet.add("Xyz");
        nameSet.add("Pqr");
        nameSet.add("Uvw");
        nameSet.add("Efg");
        nameSet.add("Ijk");

        UpperCaseSetProcessor upperCaseSetProcessor = new UpperCaseSetProcessor();
        LowerCaseSetProcessor lowerCaseSetProcessor = new LowerCaseSetProcessor();
        upperCaseSetProcessor.processSet(nameSet);
        lowerCaseSetProcessor.processSet(nameSet);
    }
}
