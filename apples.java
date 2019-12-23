
import java.util.Scanner;

class apples{
public static void main(String[] args) {
    Scanner  apples=new Scanner(System.in);
    int fnum;
    char sign;
    int snum;
    int answer;
    
System.out.println("Enter first num:  ");
  fnum=apples.nextInt();

   


    System.out.println("Enter second num:  ");
    snum=apples.nextInt();

    System.out.print("Enter the mathematical operator to be used: ");
    sign=apples.next().charAt(0);

    if (sign == '+') {
      answer = fnum + snum;
      System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ answer );

    }

    else if(sign == '-') {
        answer = fnum - snum;
      System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ answer );
        
    }

    else if(sign == '/') {
        answer = fnum / snum;
      System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ answer );
        
    }

    else if(sign == '*' ) {
        answer = fnum * snum;
        System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ answer );

    }
    
    else
			
        System.out.println("Your Input is not correct,please check it for any error(s).");
        
    




    








}
    









}
    




