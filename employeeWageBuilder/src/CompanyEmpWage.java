public class CompanyEmpWage {
    public final String company;
    public final int EMP_WAGE_PER_HOUR;
    public final int MAX_NUM_OF_DAYS;
    public final int MAX_NUM_OF_HOURS;
    public int total_EmpWage;

    public CompanyEmpWage(String company, int EMP_WAGE_PER_HOUR, int MAX_NUM_OF_DAYS, int MAX_NUM_OF_HOURS) {
        this.company = company;
        this. EMP_WAGE_PER_HOUR= EMP_WAGE_PER_HOUR;
        this.MAX_NUM_OF_DAYS = MAX_NUM_OF_DAYS;
        this.MAX_NUM_OF_HOURS = MAX_NUM_OF_HOURS;

    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.total_EmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company:" + company + " is: " + total_EmpWage + "\n";

    }
}
