public class CompanyEmpWage {
	 public final String company;
         public final int EMP_WAGE_PER_HOUR;
         public final int NUM_OF_WORKING_DAYS;
         public final int MAX_HRS_IN_MONTH;
         public int totalEmpWage;

        public CompanyEmpWage(String company, int EMP_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
                this.company = company;
                this.EMP_WAGE_PER_HOUR =  EMP_WAGE_PER_HOUR;
                this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
                this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

        }

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
       public String toString() {
              return "total emp wage for company: " +company+ " is: " +totalEmpWage;
       }

}
