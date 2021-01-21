public class empWageBuilder {
    public static void main(String[] args) {

           // Constants
        int IS_FULL_TIME = 1;
	int IS_PART_TIME = 2;
	int EMP_WAGE_PER_HOUR = 20;
	//variables
	int empHrs=0,empWage=0;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        // Case Checking
        if (empCheck == IS_FULL_TIME) {
            System.out.println(" Full Time Employee");
		empHrs=12;
        }
        else if (empCheck == IS_PART_TIME){
	    System.out.println("Part Time Employee");
                empHrs=8;
        }
	else {
		System.out.println("Employee is absent");
                empHrs=0;
	}
	empWage = EMP_WAGE_PER_HOUR * empHrs;
	System.out.println("employee wage = " + empWage);
    }
}
