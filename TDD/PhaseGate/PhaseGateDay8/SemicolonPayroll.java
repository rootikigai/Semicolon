import java.util.Scanner;

public class SemicolonPayroll{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String employee = {name, numOfWorkHours, hourlyPayRate, fedTaxRate, stateTaxRate};
    int grossPay = employee.numOfWorkHours * employee.hourlyPayRate;
    int totalDeductions = ((employee.fedTaxRate / 100) * (grossPay)) + ((employee.stateTaxRate / 100) * (grossPay));
    int netPay = grossPay - totalDeductions;

    while(true){
        System.out.print("\tSEMICOLON EMPLOYEE PAYROLL\t\n\n1. Add Employee Payroll\n2. View Employees Payroll\n3. Update Employee Payroll\n4. Exit\n");
        System.out.print("Select preferred menu or enter 4 to Exit!: ");
        int menuChoice = 
          if(menuChoice == 4){
              System.out.println("Exiting Program...");
              break;
          }
          else if(menuChoice == 1){
              employee = {
                  name = input.nextLine("Enter employee name: ");
                  numOfWorkHours = input.nextInt("Enter number of work hours: ");
                  hourlyPayRate: prompt("Enter hourly pay rate: ");
                  fedTaxRate: prompt("Enter Federal WTH Tax Rate: ");
                  stateTaxRate: prompt("Enter State WTH Tax Rate: ");
              }
              System.out.print("");
              System.out.print("Employee Name: " + employee.name);
              System.out.print("Hours worked: " + employee.numOfWorkHours);
              System.out.print("Pay Rate: " + employee.hourlyPayRate);
              System.out.print("Gross Pay: " + grossPay);
              System.out.print("Deductions: " + totalDeductions);
              System.out.print("\tFederal WTH Tax (20%): " + ((employee.fedTaxRate / 100) * (grossPay)));
              System.out.print("\tState WTH Tax (9.75%): " + ((employee.stateTaxRate / 100) * (grossPay)));
              System.out.print("Total Deductions: " + totalDeductions);
              System.out.print("Net Pay: " + netPay);
              System.out.print();
          }
          else if(menuChoice == 2){
              System.out.print(Object.keys(employee));
          }
          else if(menuChoice == 3){
              System.out.print("Update required fields.");
              employee.name = prompt("Enter name of employee: ");
              employee.numOfWorkHours = prompt("Enter number of work hours: ");
              employee.hourlyPayRate = prompt("Enter hourly pay rate: ");
              employee.fedTaxRate = prompt("Enter Federal WTH Tax Rate: ");
              employee.stateTaxRate = prompt("Enter State WTH Tax Rate: ");
          }
          else{
              System.out.println("Invalid entry.");
          }
    }
  }
}
