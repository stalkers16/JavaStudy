package Module3;

import java.util.Scanner;
//does not work yet
public class Calculator {

    public static int sum(int x, int y){return x + y; }
    public static int diff(int x, int y){return x - y; }
    public static int mult(int x, int y){return x * y; }
    public static float div(float x, float y){ return x / y; }

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.print("Provide number: ");
        int x = input.nextInt();
        System.out.print("Provide second number: ");
        int y = input.nextInt();

        int action = 0;
            while (action >-1&&action<5){
            System.out.print("Provide action (1- sum up; 2- substract; 3- multiply; 4- divide; 0- quit )");
            action = input.nextInt();

                Calculator result = new Calculator();
                switch(action) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Result = " + result.sum(x, y));
                        break;
                    case 2:
                        System.out.println("Result = " + result.diff(x, y));
                        break;
                    case 3:
                        System.out.println("Result = " +result.mult(x, y));
                        break;
                    case 4:
                        if (y == 0){
                            System.out.println("Dividing by 0  is not allowed!!!");
                            break;
                        }else{
                        System.out.println("Result = " + result.div(x, y));}
                        break;
                    default:
                        System.out.println("No such action!");
                }
                input.close();
            }
    }
}
