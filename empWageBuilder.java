public class empWageBuilder {
    public static void main(String[] args) {

           // Constants
        int IS_PRESENT = 1;
	int EMP_WAGE_PER_HOUR = 20;
	//variables
	int empHrs=0,empWage=0;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);
        // Case Checking
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
		empHrs=8;
        }
        else {
	    System.out.println("Employee is Absent");
                empHrs=0;
        }
	empWage = EMP_WAGE_PER_HOUR * empHrs;
	System.out.println("employee wage = " + empWage);
    }
}
