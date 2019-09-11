public class Area {

    int length;
    int height;
    int area;
   public void Area()
    {
        length=10;
        height=20;
         area=length*height;
         System.out.println(area);


    }
    public static void main (String s[])
    {
        Area a = new Area();
        a.Area();

    }
}
