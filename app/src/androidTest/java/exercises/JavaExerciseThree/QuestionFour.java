package exercises.JavaExerciseThree;

import java.util.TreeMap;

public class QuestionFour {
    TreeMap<String,String> contacts = new TreeMap<String, String>();

    public void addContact(String name, String number){
        contacts.put(name,number);
    }
    public String retrieveContact(String name){
        return  contacts.get(name);
    }
    public void removeContact(String name){
        contacts.remove(name);
    }

    public static void main(String[] args) {

        QuestionFour contactBook = new QuestionFour();
        contactBook.addContact("B","2");
        contactBook.addContact("C","3");
        contactBook.addContact("D","4");
        contactBook.addContact("A","1");
        System.out.println(contactBook.retrieveContact("A"));
        contactBook.removeContact("D");
        System.out.println(contactBook.contacts);
    }
}
