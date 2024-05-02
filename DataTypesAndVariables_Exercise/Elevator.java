package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        if((double)(people/elevatorCapacity)<=1)
            System.out.println("Only 1 course is needed.");
        else if(people%elevatorCapacity==0){
            System.out.println(people/elevatorCapacity + " courses are needed");
        } else {
            System.out.println(people/elevatorCapacity + " courses * " + elevatorCapacity + " people" );
            System.out.println(people%elevatorCapacity==1? "1 course * 1 person" : "1 corse * " + people%elevatorCapacity + " people");
        }
    }
}
