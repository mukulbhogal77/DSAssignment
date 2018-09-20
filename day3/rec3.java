import java.util.Scanner;
class num
{
    
    public static int find(int n)
    {
        if(n <= 1)
        return n;
        return find(n-1) + find(n-2);
    }
    public static void main(String[] args)
    {
      int n;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      System.out.println(find(n));
    }
}