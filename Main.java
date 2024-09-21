public class Main
{
  public static void main(String[] args)
  {
    System.out.println(DistanceFormula(0,5,0,0));
    System.out.println(AddingSqrt (1,0,-4));
    System.out.println(SubtractingSqrt (1,1,-6));

  }
  public static double DistanceFormula(int a, int b, int c, int d)
  {
    return Math.sqrt((a-c) * (a-c) + (b-d) * (b-d));
  }
  public static double AddingSqrt(double a, double b, double c)
  {
    return ((-1 * b) + Math.sqrt(b*b - 4*a*c ) )/(2*a); 
  }
  public static double SubtractingSqrt(double a, double b, double c)
  {
  return ((-1 * b) - Math.sqrt(b*b - 4*a*c ) )/(2*a);
  }
}
