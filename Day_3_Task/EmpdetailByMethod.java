public class EmpdetailByMethod
{
    int emp_id ;
    double salary;
    String name;

    public void display()
    {
        System.out.println(emp_id+" "+salary+" "+name);
    }

    public static void main(String s[])
    {
        EmpdetailByMethod e = new EmpdetailByMethod();
        e.emp_id=153;
        e.salary=1000.00;
        e.name="akanksha";
        e.display();


    }

}
