class MyCalculator implements AdvancedArithmetic 
{

public int divisor_sum(int a)
     {
     int i=1,f=0,sum=0;
     while(i<=a)
         {
         if(a%i==0)
             {
             f=i;
             sum+=f;
         }
         i++;

     }
     return sum;


 }
}