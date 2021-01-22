public class empWageBuilder {
	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public empWageBuilder() {
		 companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int EMP_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {

			companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EMP_WAGE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
			numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i=0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		 //variables
        	int empHrs = 0;
        	int empWage = 0;
        	int totalWorkingDays = 0;
        	int totalEmpHrs = 0;
		int totalEmpWage = 0;
        	// Computation
        	while (totalEmpHrs <= companyEmpWage.MAX_HRS_IN_MONTH && totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS) {

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
        	return totalEmpWage = companyEmpWage.EMP_WAGE_PER_HOUR * totalEmpHrs;
	}


       public static void main(String[] args) {
	empWageBuilder empWageBuilderObject = new empWageBuilder();
	empWageBuilderObject.addCompanyEmpWage("Dmart", 20, 2, 10);
	empWageBuilderObject.addCompanyEmpWage("Reliance", 10, 4, 20);
	empWageBuilderObject.computeEmpWage();
       }
}
