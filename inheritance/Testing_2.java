import java.util.Scanner;

public class Testing_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        int hours;
    
        System.out.println("Enter employee last name");
        last = input.nextLine();
        System.out.println("Enter employee first name");
        first = input.nextLine();
        System.out.println("Enter employee department");
        dept = input.nextLine();
        System.out.println("Enter employee pay rate");
        pay_rate = input.nextDouble();
        System.out.println("Enter employee hours");
        hours = input.nextInt();
        
        Employee emp  = new Employee(first, last, dept, pay_rate, hours);
        Employee newEmp = new Employee(); 
        newEmp.setAll("Richard", "Richardson", 12.00, 9, "IDK");

        System.out.println();

        newEmp.printFirstLast();
        newEmp.print();

        System.out.println();

        emp.printFirstLast();
        emp.print();

        Employee copyEmp = new Employee();
        copyEmp.copy(emp);

        System.out.println(copyEmp.equals(emp));

    }

}