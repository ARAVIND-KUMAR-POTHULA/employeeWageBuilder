public class employeeWageBuilder implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;


    public employeeWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company, int EMP_WAGE_PER_HOUR, int MAX_NUM_DAYS, int MAX_NUM_HOURS) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EMP_WAGE_PER_HOUR, MAX_NUM_DAYS, MAX_NUM_HOURS);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

        public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;


        while (totalEmpHrs <= companyEmpWage.MAX_NUM_OF_HOURS && totalWorkingDays < companyEmpWage.MAX_NUM_OF_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "\tEmp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.EMP_WAGE_PER_HOUR;
    }

    public static void main(String[] args)  {


        employeeWageBuilder empWageBuilder = new employeeWageBuilder();
        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);


        empWageBuilder.computeEmpWage();

    }
}
