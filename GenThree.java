/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {

  int a= Integer.parseInt(args[0]);
  int b= Integer.parseInt(args[1]);
  int max = Math.max (a,b);
  int min = Math.min (a,b);
  int i=0;
  int random = (int) (Math.random() * (max - min) + min);
  System.out.println(random);
  min=random;

while (i<2)
 {
  random = (int)(Math.random() * (max - min) + min);
  System.out.println(random);
  min= Math.min (min, random);
  i=i+1;
  }
 
 System.out.println("The minimal generated number was "+min);
	}
}
