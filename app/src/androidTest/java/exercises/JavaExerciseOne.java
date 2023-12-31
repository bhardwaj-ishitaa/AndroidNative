package exercises;

public class JavaExerciseOne {
    public static void main(String[] args){
        quesOne();
        quesTwo();
        quesThree();
        quesFour();
        quesFive();
    }
    private static void quesOne() {
        int a = 33;
        double d = a;
        System.out.println("int to double -> "+d);
        double num = 23.2;
        float f = (float) num;
        System.out.println("double to float -> "+f);
        long l = 998755555555764258L;
        int i = (int) l;
        System.out.println("long to int -> "+i);
        short s = (short) l;
        System.out.println("long to short -> "+s);
        char ch = '4';
        String str = String.valueOf(ch);
        System.out.println("char to string -> "+str);
        int number = Character.getNumericValue(ch);
        System.out.println("char to int -> "+number);
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - *");
    }
    private static void quesTwo() {
        int day =6;
        // if else if
        if(day==1)
            System.out.println("Sunday");
        else if(day==2)
            System.out.println("Monday");
        else if(day==3)
            System.out.println("Tuesday");
        else if(day==4)
            System.out.println("Wednesday");
        else if(day==5)
            System.out.println("Thursday");
        else if(day==6)
            System.out.println("Friday");
        else if(day==7)
            System.out.println("Saturday");
        else
            System.out.println("Enter valid Day");

        // switch case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - *");

    }
    private static void quesThree() {
        //factors of 24 using for loop
        System.out.print("Factors of 24 are: ");
        for(int i = 1 ;i <= 24; i++){
            if(24 % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        //factors of 39 using while loop
        int j =1;
        System.out.print("Factors of 39 are: ");
        while(j <= 39 ){
            if(39 % j == 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("");

        //factors of 142 using do while loop
        int k = 1;
        System.out.print("Factors of 142 are: ");
        do {
            if (142 % k == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 142);
        System.out.println("");
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - *");

    }
    private static void quesFour() {
        int x;
        System.out.print("Prime numbers b/w 1 to 100 are: ");
        for (int i = 2; i <= 100; i++) {
            x = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    x = x + 1;
            }
            if (x == 2)
                System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - *");

    }
    private static void quesFive() {
        for (int i=0; i<5; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - *");
    }
}
