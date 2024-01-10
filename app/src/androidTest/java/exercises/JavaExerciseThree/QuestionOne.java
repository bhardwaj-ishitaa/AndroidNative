package exercises.JavaExerciseThree;

import java.util.LinkedList;


     abstract class AbstractListProcessor {
        abstract void processList(LinkedList<Integer> list);
    }
     class SumListProcessor extends AbstractListProcessor{

        @Override
        void processList(LinkedList<Integer> list) {
            int sum = 0;
            for (int i : list) {
                sum = sum + i ;
            }
            System.out.println(sum);
        }
    }
     class ProductListProcessor extends AbstractListProcessor{

        @Override
        void processList(LinkedList<Integer> list) {
            int product = 1;
            for (int i : list) {
                product = product * i ;
            }
            System.out.println(product);
        }
    }
public class QuestionOne {
    public static void main(String[] args) {
        SumListProcessor sumListProcessor = new SumListProcessor();
        ProductListProcessor productListProcessor = new ProductListProcessor();
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(7);
        list.add(80);
        productListProcessor.processList(list);
        sumListProcessor.processList(list);
    }
}
