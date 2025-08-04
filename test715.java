import java.util.Random;
import java.util.Scanner;

public class test715 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int num = 0;
//        while (sc.hasNextInt()){
//            int tmp = sc.nextInt();
//            sum +=tmp;
//            num++;
//        }
//        System.out.println("sum ="+sum);
//        System.out.println("avg ="+sum/num);
//        sc.close();
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int Guess = random.nextInt(100);
        while (true){
        System.out.println("请输入数字");
        int num = sc.nextInt();
        if(num < Guess){
        System.out.println("<");

        }else if(num > Guess){
        System.out.println(">");
        }
        else{
        System.out.println("bingo");
        break;
        }
        }
        sc.close();

        }
        }
//




