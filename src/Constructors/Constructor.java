package Constructors;

public class Constructor {



}

class Pay {
    double hourlyRate;
    int numberOfHours;
    int overTime;

    public Pay(double hourlyRate, int numberOfHours, int overTime) {
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.overTime = overTime;
    }

    public double weeklySalary() {
        return hourlyRate * numberOfHours;
    }

    double overtime() {
        return (this.hourlyRate * 1.5) * overTime;
    }

    public String toString() {

        String output = "Hourly rate is : " + this.hourlyRate + "\n" +
                numberOfHours + "hours works in a week " +
                "\n totally gets " + " " + weeklySalary() +
                "\n overtime :" + overtime() +
                "\n after added overTime : " + (weeklySalary() + overtime());

        return output;
    }

    public static void main(String[] args) {
        Pay pay = new Pay(45.5, 40, 8);
        System.out.println(pay);

    }
}