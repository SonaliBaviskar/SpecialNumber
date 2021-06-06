import java.util.*;
class SpecialNumber{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter Number: ");
       int N = sc.nextInt();
        if(N>9 && N<100)
        {
          int last = N%10;
          int First=N/10;
          
          int sum = last+First;
          int Mul = last*First;
          int Add = sum+Mul;
          
        System.out.println("sum of digits="+ First+ "+"+ last+ "="+ sum);
        System.out.println("Mul of digits="+ First+ "*"+ last+ "="+ Mul);
        System.out.println("sum of the sum of digit and product of digit ="+ sum+ "+"+ Mul+ "="+ Add);
        if (N==Add)
        {
           System.out.println(Add +" Special number "); 
        }
        else
        {
            System.out.println("not special number "); 
        }
        }
       else 
        {
            System.out.println("No 2 digit number ");
        }
    }
}  
     