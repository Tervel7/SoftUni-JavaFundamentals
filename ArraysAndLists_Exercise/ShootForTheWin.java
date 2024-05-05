package ArrayListProjects;

import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetsString = scanner.nextLine();

        int[] targets = stringToIntArray(targetsString);

        int shotTargets = 0;

        String command = scanner.next();
        while (true) {
            if ((command.equals("End"))) {
                break;
            }

            int shootIndex = Integer.parseInt(command);

            if (shootIndex <= -1) {
                continue;
            }

            for (int i = 0; i < targets.length; i++) {
                if (shootIndex == i) {
                    int shootValue = targets[shootIndex];
                    registerShot(shootValue,targets);
                    targets[i] = -1;
                    shotTargets++;
                    break;
                }
            }

            command = scanner.next();
        }

        System.out.print("Shot targets -" + shotTargets + " -> ");
        for (int i : targets) {
            System.out.print(i + " ");
        }
    }


    static int[] stringToIntArray(String s) {
        String[] targetsStringArray = s.split(" ");

        int[] arr = new int[targetsStringArray.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = Integer.parseInt(targetsStringArray[i]);
        }
        return arr;
    }

    private static void registerShot(int valueOfShot, int[] arr) {
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]==-1)
                continue;
            if(arr[i]>valueOfShot)
                arr[i]-=valueOfShot;
            else
                arr[i]+=valueOfShot;
        }
    }

}
