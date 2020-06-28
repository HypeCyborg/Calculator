import java.util.Scanner;

class apples{
    public static void main(String[] args) {
        Scanner apples = new Scanner(System.in);
        double fnum;
        char sign;
        double snum;
        double answer;

        while(true) {  // Use a while loop instead of for loop
            System.out.println("Enter first num:  ");
            fnum=apples.nextDouble();
          // putting an if statement here, "if it has either $£, then follow this route" kinda thing

            System.out.println("Enter second num:  ");
            snum=apples.nextDouble();

            System.out.print("Enter the mathematical operator to be used: ");
            sign = apples.next().charAt(0);

            switch(sign) {
                  case '*':
                    answer = fnum * snum;
                    System.out.println(fnum + " " + sign + " " + snum +  "= " + " " + answer);
                    break;
                  case '/':
                    answer = fnum / snum;
                    System.out.println(fnum + " " + sign + " " + snum + " = " + " " + answer);
                    break;
                    case '-':
                    answer = fnum - snum;
                    System.out.println(fnum + " " + sign + " " + snum + " = " + " " + answer);
                    case '+':
                    answer = fnum + snum;
                    System.out.println(fnum + " " + sign + " " + snum + " = " + " " + answer);
                  default:
                    System.out.println("Your Input is not correct,please check it for any error(s).");
          }
          

                
                }
            } 
        
    

    public static void printResult(double fnum, char sign, double snum, double answer) {
       // move 'System.out.println' here .
    }
}


