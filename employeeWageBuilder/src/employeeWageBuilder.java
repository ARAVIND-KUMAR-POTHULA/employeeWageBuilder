import java.util.ArrayList;

public class employeeWageBuilder implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final ArrayList<CompanyEmpWage> companyEmpWageArrayList;


    public employeeWageBuilder() {

        companyEmpWageArrayList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int EMP_WAGE_PER_HOUR, int MAX_NUM_DAYS, int MAX_NUM_HOURS) {
        CompanyEmpWage  companyEmpWage = new CompanyEmpWage(company, EMP_WAGE_PER_HOUR, MAX_NUM_DAYS, MAX_NUM_HOURS);
        companyEmpWageArrayList.add(companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

        public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs;
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
