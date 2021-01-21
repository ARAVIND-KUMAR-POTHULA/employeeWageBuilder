public class empWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

	//variables
	int empHrs=0,empWage=0;
        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        // Case Checking
        switch (empCheck) {

		case IS_FULL_TIME:
            		System.out.println(" Full Time Employee");
			empHrs=12;
			break;
        	case IS_PART_TIME:
	                System.out.println("Part Time Employee");
                        empHrs=8;
			 break;
		default:
			System.out.println("Employee is absent");
                	empHrs=0;
	}
	empWage = EMP_WAGE_PER_HOUR * empHrs;
	System.out.println("employee wage = " + empWage);
    }
}
