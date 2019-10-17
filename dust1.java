import java.util.*;
import java.io.*;

class dust1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n=0,p=1;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        }
         while(p<=t){
           int sum=a; int j=1;
           int l=2*n;
            while(j<l){
             sum=sum+(j*b);
             System.out.print(sum+" ");
             j=j*2;
          } p++;
        }
    }

}

