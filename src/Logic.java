import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
    private static Logger l=Logger.getLogger(Logic.class.getName());
    public static void main(String[] args) {
        try {
            System.out.println("请输入除数");
        Scanner ip=new Scanner(System.in);
        int f=ip.nextInt();
        System.out.println("请输入被除数");
        int c=ip.nextInt();
        System.out.println(f/c);
        }catch (ArithmeticException e){
           l.error("0不能做除数");
        }catch (InputMismatchException e){
            l.debug("数据类型错误");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("程序结束");
        }
    }
}
