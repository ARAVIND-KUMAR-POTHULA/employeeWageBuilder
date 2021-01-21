public class empWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int EMP_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		 //variables
        	int empHrs = 0;
        	int empWage = 0;
        	int totalEmpWage = 0;
        	int totalWorkingDays = 0;
        	int totalEmpHrs = 0;
        	// Computation
        	while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {

                	totalWorkingDays++;

                	int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                	switch (empCheck) {

                        	case IS_FULL_TIME:
                                	empHrs=12;
                                	break;
                        	case IS_PART_TIME:
                                	empHrs=8;
                                	break;
                        	default:
                                	empHrs=0;
                	}
        		totalEmpHrs += empHrs;
        		System.out.println("Day: " + totalWorkingDays + "  Emp Hr: " + empHrs);
        	}
        	totalEmpWage = EMP_WAGE_PER_HOUR * totalEmpHrs;
        	System.out.println("total employee wage = " + totalEmpWage);
		return totalEmpWage;
	}


       public static void main(String[] args) {
	computeEmpWage("Dmart", 20, 2, 10);
	computeEmpWage("Reliance", 10, 4, 20);
       }
}
