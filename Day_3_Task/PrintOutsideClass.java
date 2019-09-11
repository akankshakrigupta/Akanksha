 class Rectagle
{

    int l,b,area;
    public void result()
    {
        area=l*b;
    }


}
 public class PrintOutsideClass
 {


    public static void main(String s[])
    {
    Rectagle r = new Rectagle();
    r.l=10;
    r.b=20;
    r.result();
    System.out.println(r.area);
    }
 }



