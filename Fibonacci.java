public class Fibonacci 
{
  public static void main(String[] args) 
  {
  int n = 10, a = 0, b = 1;
  for (int i = 0; i < n; i++) 
  {
    System.out.print(a + " ");
    a = a + b;
    b = a - b;
   }
  }
}
