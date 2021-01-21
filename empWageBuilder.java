public class empWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	 private final String company;
	 private final int EMP_WAGE_PER_HOUR;
	 private final int NUM_OF_WORKING_DAYS;
	 private final int MAX_HRS_IN_MONTH;
	 private int totalEmpWage;

	public empWageBuilder(String company, int EMP_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		this.company = company;
		this.EMP_WAGE_PER_HOUR =  EMP_WAGE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}
	public void computeEmpWage() {
		 //variables
        	int empHrs = 0;
        	int empWage = 0;
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
	}

	@Override
       public String toString() {
		return "total emp wage for company: " +company+ " is: " +totalEmpWage;
       }

       public static void main(String[] args) {
	empWageBuilder dmart = new empWageBuilder("Dmart", 20, 2, 10);
	empWageBuilder reliance = new empWageBuilder("Reliance", 10, 4, 20);
	dmart.computeEmpWage();
	System.out.println(dmart);
	reliance.computeEmpWage();
        System.out.println(reliance);
       }
}
