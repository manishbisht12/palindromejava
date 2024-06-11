
import java.io.*;
class  p5_palindrome
{
    public static boolean isPal(int n)
    {
        boolean flag=false;
        int rem=0, num=n, s=0;
        while(n>0)
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;
        }
        if(s==num)
        {
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) throws Exception
    {
        PrintWriter pw=new PrintWriter("Number.txt");
        for(int i=111;i<=999;i++)
        {
            pw.println(i);
            pw.flush();
        }
        pw=new PrintWriter("PalindromeOnlyNumber.txt");
        BufferedReader br=new BufferedReader(new FileReader("Number.txt"));
        String line=br.readLine();
        while(line!=null)
        {
            if(isPal(Integer.parseInt(line)))
            {
                pw.println(line);
                pw.flush();
            }
            line=br.readLine();
        }
        System.out.println("*****After****");
        br=new BufferedReader(new FileReader("PalindromeOnlyNumber.txt"));
        line=br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
        
        
    }
}
