import java.util.Scanner;
class array
{
    
    public static boolean check(int arr[] ,int n,  int m)
    {
        if(n == 0){
        return false;}
        else if(arr[n-1] == m){
        return true;}
        else{
        return check(arr,n-1,m);}
        
    }
    public static void main(String[] args)
    {
      int n;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      int arr[] = new int [n];
      for(int i = 0 ; i < n ; i++)
      {
          arr[i] = s.nextInt();
      }
      int m;
      m = s.nextInt();
      if(check(arr,n,m))
      {
          System.out.println("FOUND");
      }
      else
      {
          System.out.println("NOT FOUND");
      }
    }
    
}