public class Commission extends Hourly{
    private double totalSales;
    private double cRate;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.cRate = cRate;
    }

    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }

    public double pay(){
        double payment = super.pay() + (cRate*totalSales);
        totalSales = 0;
        return payment;
    }

    public String toString()
    {
        String result = super.toString();

        result += "\nTotal Sales: " + totalSales;

        return result;
    }

}
