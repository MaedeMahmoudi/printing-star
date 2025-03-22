import java.util.Scanner;
//this project written by maedeh mahmoudi 401463169
public class Main {
    public static void main(String[] args) {


        System.out.println("enter a number = ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        class Calculate {

            private int number;

            public Calculate(int number) {
                this.number = number;
            }

            public void calculateMatrix(int number) {

                for (int i = 0; i < number + 2; i++) {
                    System.out.print("*");
                    for (int j = 0; j < number; j++) {

                        if (i >= 1 && i < number + 1) {
                            System.out.print(" ");
                        } else
                            System.out.print("*");
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
        }
        Calculate calculate = new Calculate(inputNumber);
        calculate.calculateMatrix(inputNumber);
    }

    }
