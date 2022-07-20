package LinkledList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class US {


    static LinkedList<String> states=new LinkedList<>();
    static void addState(String state){
        states.add(state);
    }

    static void removeState(String state){
        if (states.contains(state)) {
            states.remove(state);
            System.out.println( state+" is removed");
        }else {
            System.out.println(state+" is not in list of states.");
        }
    }

    static void removeFirstState(){
        if (states.isEmpty()){
            System.out.println("There is no states to delete.");
        }else {
            states.removeFirst();
        }

    }

    static void removeLastState(){
        if (states.isEmpty()){
            System.out.println("There is no states to delete.");
        }else{
            states.removeLast();
        }

    }

    static void printAndRemoveFirstState(){
        if (states.isEmpty()){
            System.out.println("There is no states to delete.");
        }else {
            System.out.println(states.pollFirst());
        }
    }

    static void printAndRemoveLastState(){
        if (states.isEmpty()){
            System.out.println("There is no states to delete.");
        }else {
            System.out.println(states.pollLast());
        }
    }

    static void printStatesStartingWith(char letter){
        for (int i=0; i<states.size();i++){
            if (states.get(i).startsWith(""+letter)){
                System.out.println(states.get(i));
            }
        }
    }

    static void printAllStates(){
        Iterator<String> iterator=states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
    }
    static String CApitalizeFirstLetter(String word){
        String result=" ";
        if(word.trim().contains("")) {
            String[] words=word.trim().split(" ");
            for(String element:words){
                String firstLetter=""+element.charAt(0)+"".toUpperCase();
           //     result+=firstLetter+element.substring((1)+ " "));
            }

        }else{
            String firstLetter=""+word.charAt(0)+"".toUpperCase();
            result=firstLetter+word.substring((1));
        }

        return result;
    }




    public static void main(String[] args) {
        String answer = "";
        do {
            System.out.println("Select an option:");
            System.out.println(" 1. add state\n" +
                    "    2. remove state by name\n" +
                    "    3. remove first state\n" +
                    "    4. remove last state\n" +
                    "    5. print and remove first state\n" +
                    "    6. print and remove last state\n" +
                    "    7. print all states which starts with letter\n" +
                    "    8. print all states");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Please enter state: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String state = scanner1.nextLine();
                    addState(state);
                    break;
                    case 2:
                    System.out.println("Which state do you want to remove ?");
                    printAllStates();
                    Scanner scanner2=new Scanner(System.in);
                    String stateToDelete=scanner2.next();
                    removeState(stateToDelete);
                case 3:
                    removeFirstState();
                    break;
                    case 4:
                    removeLastState();
                    break;
                case 5:
                    printAndRemoveFirstState();
                    break;
                case 6:
                    printAndRemoveLastState();
                    break;
                case 7:
                    System.out.println("Please provide a letter");
                   char letter=new Scanner(System.in).next().charAt(0);
                case 8:
                    System.out.println("States: ");
                    printAllStates();
                    break;
            }
            System.out.println("Do You Want To Continue?");
            answer = scanner.next();
        } while (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
    }}