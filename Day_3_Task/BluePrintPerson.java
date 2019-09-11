public class BluePrintPerson {

     BluePrintPerson(String name, int age )
    {

        int diff=100-age;
        System.out.println(diff*diff);
    }

    public static void main(String s[])
    {
        BluePrintPerson obj = new BluePrintPerson("akanksha", 23);

    }

}
