import java.util.Scanner;

public class dust4 
{

    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int len=15-s1.length();
                System.out.print(s1);
               if(x<10)
                { for(int d=0;d<len;d++)
                System.out.print(" ");
                System.out.print("00");
                }else
                if(x<100)
                 {for(int j=0;j<len;j++)
                 System.out.print(" ");
                 System.out.print("0");
                 }else
                 if(x<1000)
                 { for(int k=0;k<len;k++)
                  System.out.print(" ");
                 }
                  System.out.print(x+"\n"); 
             }
            
            System.out.println("================================");

   }
}



