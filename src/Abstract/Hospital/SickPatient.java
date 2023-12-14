package Abstract.Hospital;

public class SickPatient extends Patient{


    public SickPatient(String name, String address, int egn, String report, boolean sick, int daysSick) {
        super(name, address, egn);
        this.report = report;
        this.sick = sick;
        this.daysSick = daysSick;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public int getDaysSick() {
        return daysSick;
    }

    public void setDaysSick(int daysSick) {
        this.daysSick = daysSick;
    }

    String report;
    boolean sick;
    int daysSick;

    @Override
    void Cure() {

    }
}
