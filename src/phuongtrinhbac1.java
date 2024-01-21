import java.util.Scanner;
public class phuongtrinhbac1 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhập giá trị cho a: "); double a = scanner.nextDouble();
         System.out.println("nhập giá trị cho b: "); double b = scanner.nextDouble();
        if (a==0) {
            if(b==0)
            { System.out.println("phương trình vô nghiệm");}
            else {System.out.println("phương trình vô nghiệm");}}
         else { double x = -b/a;
                System.out.println("nghiêm của phương trình là: x = " + x);}
        }
    }

