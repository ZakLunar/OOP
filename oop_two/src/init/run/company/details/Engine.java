package init.run.company.details;

public class Engine implements IEngine{
    private final double performance;
    private final String company;

    public Engine(double performance, String company) {
        this.performance = performance;
        this.company = company;
    }

    public double getPerformance() {
        return performance;
    }

    public String getCompany() {
        return company;
    }
}
