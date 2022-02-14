package foodcourt;

import java.util.Scanner;

public class FoodCourt {


        private static final String INVALID_MESSAGE = "Please give valid input";
        public static int numberDivider(int number)
        {
            int hundreds = number/100;
            int rupees = number%100;
            if(number > 99) {
                System.out.print("i.e, "+hundreds + " hundred and " + rupees + " rupees --> ");
                return number;
            }
            else
            {
                System.out.print(rupees + " rupees");
                return number;
            }
        }

        public static int foodItem(int item)
        {
            int num;
            switch (item)
            {
                case 1:
                    System.out.println("Price of Burger 43 rs/-");
                    num = 43;
                    numberDivider(num);
                    return 43;
                case 2:
                    System.out.println("Price of chocolate 512 rs/-");
                    num = 512;
                    numberDivider(num);
                    return 512;
                case 3:
                    System.out.println("Price of Drink 89 rs/-");
                    num = 89;
                    numberDivider(num);
                    return 89;
                default:
                    System.out.println("selected invalid item");
                    return 0;
            }

        }

        public static void changeCalculator(int amount, int item)
        {
            int a = foodItem(item);
            if(amount >= 0 && amount >= a)
            {
                int total = amount - a;
                System.out.println("Calculation :"+amount+" - "+a+" = "+total+" rupees");
                numberDivider(total);
                System.out.println(" YOUR CHANGE ");
                System.out.println("------------------------------------------------------------------");
            }
            else
            {
                System.out.println(INVALID_MESSAGE);

            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------Food Court----------------------------");
            System.out.println("Select needed item from below :");
            System.out.println("1. Burger");
            System.out.println("2. Chocolate");
            System.out.println("3. Drink");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Choose Number -->");
            int n = sc.nextInt();
            if(n == 1 || n == 2 || n == 3)
            {
                foodItem(n);
                System.out.print("Mention the amount :");
                int userGivenAmount = sc.nextInt();
                int actualAmount = foodItem(n);
                if(userGivenAmount > actualAmount)
                {
                    changeCalculator(userGivenAmount,n);
                }
                else
                {
                    System.out.println(INVALID_MESSAGE);
                }

            }
            else
            {
                System.out.println(INVALID_MESSAGE);
            }



        }
    }

