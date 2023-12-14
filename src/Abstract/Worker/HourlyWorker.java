package Abstract.Worker;

public class HourlyWorker extends Worker {

    private int hoursWorked;

    public void SetHoursWorked(int i){
        hoursWorked = i;
    }

    @Override
    public float GetWeeklyWage() {
        return 0;
    }

}
