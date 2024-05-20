import java.util.*;
public class two_sum
{
    int num[]=new int[10];
    int t,i,j;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        for(i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the target");
        t=sc.nextInt();
    }
    public void check()
    {
        int a=0,b=0,k=0;
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if((num[i]+num[j])==t)
                {
                    k=1;
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        if(k==1)
            System.out.println(a+" "+b);
        else
            System.out.println("N/A");
    }
    public static void main(String[] args)
    {
        two_sum ob=new two_sum();
        ob.accept();
        ob.check();
    }
}