const prompt = require("prompt-sync")();

let employee = {
            name: "",
            numOfWorkHours: "",
            hourlyPayRate: "",
            fedTaxRate: "",
            stateTaxRate: "",
}
let grossPay = employee.numOfWorkHours * employee.hourlyPayRate;
let totalDeductions = ((employee.fedTaxRate / 100) * (grossPay)) + ((employee.stateTaxRate / 100) * (grossPay));
let netPay = grossPay - totalDeductions;

while(true){
    console.log("\tSEMICOLON EMPLOYEE PAYROLL\t\n\n1. Add Employee Payroll\n2. View Employees Payroll\n3. Update Employee Payroll\n4. Exit\n");
    let menuChoice = prompt("Select preferred menu or enter 4 to Exit!: ");
    if(menuChoice == 4){
        console.log("Exiting Program...");
        break;
    }
    else if(menuChoice == 1){
        employee = {
            name : prompt("Enter employee name: "),
            numOfWorkHours: prompt("Enter number of work hours: "),
            hourlyPayRate: prompt("Enter hourly pay rate: "),
            fedTaxRate: prompt("Enter Federal WTH Tax Rate: "),
            stateTaxRate: prompt("Enter State WTH Tax Rate: "),
        }
        console.log("");
        console.log("Employee Name: " + employee.name);
        console.log("Hours worked: " + employee.numOfWorkHours);
        console.log("Pay Rate: " + employee.hourlyPayRate);
        console.log("Gross Pay: " + grossPay);
        console.log("Deductions: " + totalDeductions);
        console.log("\tFederal WTH Tax (20%): " + ((employee.fedTaxRate / 100) * (grossPay)));
        console.log("\tState WTH Tax (9.75%): " + ((employee.stateTaxRate / 100) * (grossPay)));
        console.log("Total Deductions: " + totalDeductions);
        console.log("Net Pay: " + netPay);
        console.log();
    }
    else if(menuChoice == 2){
        console.log(Object.keys(employee));
    }
    else if(menuChoice == 3){
        console.log("Update required fields.")
        employee.name = prompt("Enter name of employee: ");
        employee.numOfWorkHours = prompt("Enter number of work hours: ");
        employee.hourlyPayRate = prompt("Enter hourly pay rate: ")
        employee.fedTaxRate = prompt("Enter Federal WTH Tax Rate: ");
        employee.stateTaxRate = prompt("Enter State WTH Tax Rate: ");
    }
    else{
        console.log("Invalid entry.")
    }
}
