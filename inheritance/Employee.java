public class Employee extends Person {

    private double payRate; 
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

     public Employee() {
        super();
        this.payRate = 0.00;
        this.hoursWorked = 0;
        this.department = "";
     }

     public Employee(String first, String last, String dept, double pay, double hours){
        super(first, last);
        department = dept;
        payRate = pay;
        hoursWorked = hours;
     }

     public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
     }

     public void print() {
        System.out.println("The employee " + super.getFirst() + " " + super.getLast() + " from the " + department + " department worked " + hoursWorked + 
        " hours with a pay rate of $" + payRate + ". " + this.toString());
     }

     public double calculatePay() {
        if (hoursWorked <= HOURS){
           return (double) payRate * hoursWorked;
        } 
        return (double) HOURS * payRate + ((double) (hoursWorked - HOURS) * payRate * OVERTIME);
     }

     public void setAll(String first, String last, double rate, double hours, String dep){
         super.setName(first, last);
         this.payRate = rate;
         this.hoursWorked = hours;
         this.department = dep;
     }

     public double getPayRate(){return this.payRate;}
     public double getHoursWorked(){return this.hoursWorked;}
     public String getDepartment(){return this.department;}

     public boolean equals(Object obj) { 
        if (obj instanceof Employee) {
           Employee kam = (Employee) obj;
           return ((super.equals(obj)) && (kam.getPayRate() == this.getPayRate()) && (kam.getHoursWorked() == this.getHoursWorked()) && (kam.getDepartment() == this.getDepartment()));
        }
        return false;
      }

     public Employee getCopy() {
       return new Employee(getFirst(), getLast(), department, payRate, hoursWorked);
     }

     public void copy(Employee e) {
        super.copy(e);
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
     }
}