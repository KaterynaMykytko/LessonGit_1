 import java.util.Scanner;

    public class Arithmetics {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть перше число:");
            String str1 = sc.next();
            int a = Integer.parseInt(str1);

            System.out.println("Введіть друге число:");
            String str2 = sc.next();
            int b = Integer.parseInt(str2);

            System.out.println("Введіть знак арифметичноі операціі.");
            String sign = sc.next();

            switch (sign) {
                case "+":
                    System.out.println("Сума чисел = " + add(a,b));
                    break;

                case "-":
                    System.out.println("Різниця чисел = " + sub(a,b));
                    break;

                case "*":
                    System.out.println("Множення чисел = " + mul(a,b));
                    break;

                case "/":
                    System.out.println("Ділення чисел = " + div(a,b));
                    break;

                default:
                    System.out.println("Виникла помилка. Введіть коректні дані.");
                    break;
            }



        }

        static int add (int a, int b){
            int result = a + b;
            return result;
        }

        static int sub (int a, int b){
            int result = a - b;
            return result;
        }
        static int mul (int a, int b){
            int result = a * b;
            return result;
        }
        static int div (int a, int b){
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Помилка.Спроба ділення на нуль.");
                return 0;
            }
        }
    }


