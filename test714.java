import java.util.Scanner;

public class test714 {
  public static void main(String[] args){
    System.out.println("hello world");
    System.out.println(100);
    System.out.println(3.14);
    System.out.println('a');
    System.out.println(true);
    System.out.println(false);
    System.out.println();
    char ch = '哈';
    System.out.println(ch);
    String s1 = "hello";
    String s2 = "world";
    System.out.println(s1+s2);
    int num = 10;
    String s3 = num + "";
    String s4 = String.valueOf(num);
    System.out.println(s3);
    System.out.println(s4);
    String str1 = "100";
    int num1 = Integer.parseInt(str1);
    System.out.println(num1);
    StringBuilder sb = new StringBuilder("yangjiahao");
    sb.reverse();
    System.out.println(sb);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n);
    int t = 1;
    int res = 0;
    while(t<=100){
      res += t;
      t++;
    }
    System.out.println(res);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("请输入姓名");
    String name = sc1.nextLine();
    System.out.println("请输入年龄");
    int age = sc1.nextInt();
    System.out.println("请输入工资");
    float salary = sc1.nextFloat();
    System.out.println("name:"+name+"\n"+"age:"+age+"\n"+"salary:"+salary);
    sc1.close();

    
  }
}
