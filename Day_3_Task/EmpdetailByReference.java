class Employe
{
    int emp_id;
      double    emp_salary;
    String emp_name;
    public void display(int id, double salary, String name)
    {
        emp_id=id;
        emp_salary=salary;
        emp_name=name;
        System.out.println(id+" "+name+" "+salary );
    }
}
public class EmpdetailByReference
 {

    public static void main(String s[])
    {
        Employe e = new Employe();
        e.display(101,10.50, "akanksha");

    }



}


