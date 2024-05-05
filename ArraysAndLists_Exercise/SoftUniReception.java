package ArrayListProjects;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalCapabilityOfEmployeesPerHour = 0;
        for (int i=1; i<=3; i++)
            totalCapabilityOfEmployeesPerHour += scanner.nextInt();
        int allStudents = scanner.nextInt();

        int hoursToAnswer = 0;

        while(true) {
            if (hoursToAnswer!=0 && hoursToAnswer%4==0) {
                hoursToAnswer++;
            }else if (totalCapabilityOfEmployeesPerHour-allStudents>=0){
                hoursToAnswer++;
                System.out.println((hoursToAnswer) + "  Hours");
                break;
            }else if(allStudents-totalCapabilityOfEmployeesPerHour>0) {
                allStudents-=totalCapabilityOfEmployeesPerHour;
                hoursToAnswer++;
            }
        }

    }
}
