import java.util.Scanner;
public class CountElement
{
    public static void main(String[] args)
    {
        int n,m,count=0;
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("number of element:\n");
        n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter all element:\n");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("element count\n");
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==m)
            {
                count++;
            }
        }
        System.out.println("number of count of element:\n"+count);
    }
}
