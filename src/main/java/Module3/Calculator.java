package Module3;

import java.util.Scanner;

public class Calculator {

    public static int sum(int x, int y){return x + y; }
    public static int diff(int x, int y){return x - y; }
    public static int mult(int x, int y){return x * y; }
    public static float div(float x, float y){ return x / y; }

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.print("Ievadiet skaitli: ");
        int x = input.nextInt();
        System.out.print("Ievadiet skaitli: ");
        int y = input.nextInt();

        int action = 0;
            while (action >-1&&action<5){
            System.out.print("Ievadiet veicamo darbību (1- summēt; 2- atņemt; 3- reizinat; 4- dalīt; 0- iziet )");
            action = input.nextInt();

                Calculator result = new Calculator();
                switch(action) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Skaitļu summa = " + result.sum(x, y));
                        break;
                    case 2:
                        System.out.println("Skaitļu starpība = " + result.diff(x, y));
                        break;
                    case 3:
                        System.out.println("Skaitļu reizinajums = " +result.mult(x, y));
                        break;
                    case 4:
                        if (y == 0){
                            System.out.println("Nedrīkst dalīt ar 0 !!!");
                            break;
                        }else{
                        System.out.println("Skaitļu dalījums = " + result.div(x, y));}
                        break;
                    default:
                        System.out.println("Nav šadas darbības!");
                }
                input.close();
            }
    }
}
