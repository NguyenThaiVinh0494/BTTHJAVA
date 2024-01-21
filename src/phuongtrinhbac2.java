import java.util.Scanner;

public class phuongtrinhbac2 {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
            System.out.println("nhập giá trị cho a: "); double a = scanner.nextDouble();
    System.out.println("nhập giá trị cho b: "); double b = scanner.nextDouble();
          System.out.println("nhập giá trị cho c: "); double c = scanner.nextDouble();
          if(a==0) {
              if (b == 0) {
                  System.out.println("phương trình vô nghiệm");
              } else {
                  System.out.println("phương trình có 1 nghiệm: " + "x = " + (-c / b));
              }
          }
           double d = Math.pow(b,2)-4*a*c;
          if(d<0){ System.out.println("phương trình vô nghiệm");}
          if(d==0){ System.out.println("phương trình có 1 nghiệm: " + "x = " + -b/2*a);}
          if(d>0){ double x1 = (-b+Math.sqrt(d))/ 2*a*c;
              double x2 = (-b-Math.sqrt(d))/ 2*a*c;
              System.out.println("phương trình có 2 nghiệm" + "x1 =" +x1 + "x2 =" +x2);}

          }
    }

