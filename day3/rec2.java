import java.util.Scanner;
class array
{
    
    public static void rev(int arr[] ,int n)
    {
        System.out.println(arr[n-1]);
        rev(arr,n-1);
        
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
      rev(arr,n);
    }
    
}