package exercises.JavaExerciseThree;

import java.util.LinkedHashSet;

 class OrderedSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer i) {
        return super.add(i);
    }
}

public class QuestionTwo {
    public static void main(String[] args) {
        OrderedSet orderedSet = new OrderedSet();
        orderedSet.add(765);
        orderedSet.add(6);
        orderedSet.add(9);
        orderedSet.add(9);
        orderedSet.add(8);
        orderedSet.add(123);

        System.out.println("Attendees in Android Session:"+ orderedSet);

    }
}
