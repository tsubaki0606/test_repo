import java.util.Scanner;

public class test717 {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");

            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入您的密码");
            String Password = sc.nextLine();
            if(Password.equals("123456")){
                System.out.println("登录成功");
                break;
            }else{
                count--;
                System.out.println("你还有"+count+"机会");
            }
        }
    }
}
