

public class PrintAreaInsideClass
{

    int l,b, area;



    public void result()
    {
        area=l*b;
    }



    public static void main(String str[])
    {
        PrintAreaInsideClass r = new PrintAreaInsideClass();
        r.l=10;
        r.b=50;
        r.result();
        System.out.println(r.area);

    }


}
