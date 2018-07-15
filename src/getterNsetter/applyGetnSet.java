package getterNsetter;

public class applyGetnSet {
    public static void main(String[] args) {

        getNset John = new getNset();

        John.setJobType("IT Consultant");
        John.setLoan(45000);
        John.setPayments(1000);

        System.out.println("JobType: "+John.getJobType()+"   "+"Loan: "+John.getLoan()+"  "+"Payment: "+ John.getPayments());


        getNset z = new getNset();

        z.setJobType("Doctor");
        z.setLoan(90000);
        z.setPayments(2000);

        System.out.println("JobType: "+z.getJobType()+"  "+"Loan: "+z.getLoan()+"  "+"Payment: "+ z.getPayments());
    }
}
