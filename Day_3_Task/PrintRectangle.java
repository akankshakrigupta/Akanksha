import java.util.Scanner;

class PrintRectangle {

    public static void main(String[] args)
    {
        int rows, columns, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("  Enter Number of Rows : ");
        rows = sc.nextInt();

        System.out.print("  Enter Number of Columns : ");
        columns = sc.nextInt();

        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

