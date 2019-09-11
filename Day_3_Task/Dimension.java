public class Dimension {
int length;
int height;

 Dimension()
{
    System.out.println("Constructor called");
            length =10;
            height=20;
}

public static void main(String s[])
{
   Dimension d = new Dimension();
   System.out.println(d.length);
   System.out.println(d.height);
}

}
