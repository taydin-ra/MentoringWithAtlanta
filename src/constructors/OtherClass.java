package constructors;

public class OtherClass {
    //step1 create Pay class that has 3 attributes named double hourlyRate, int numberOfHours, and int overTime
//create a constructor that stores those attributes as parameters
//create a double method that returns weekly salary (hourlyRate * numberOfHours)
//create a double method that returns the payment of the "overtime" ,  1.5 times the hourly rate,
// calculate the total payment
//print it out all of this information with toString method


}

class Pay1{
    double hourlyRate; // 0.00
    int numberOfHours; //0
    int overTime; //0

    public Pay1(double saatlikUcret, int calismaSaatleri , int ExtraSaat){
        this.hourlyRate=saatlikUcret;
        this.numberOfHours=calismaSaatleri;
        this.overTime=ExtraSaat;
    }
    public double weeklySalary(){
        return hourlyRate* numberOfHours;
    }
    public double overTime(){
        return (hourlyRate*1.5) * overTime;
    }

    public double totalSalary() {
        return weeklySalary() + overTime();
    }

    public String toString() {

        String output= "Hourly rate is : " + this.hourlyRate + "\n" +
                numberOfHours + "hours works in a week " +
                "\n totally gets " + " " + weeklySalary() +
                "\n overtime :" + overTime() +
                "\n after added overTime : " + totalSalary();

        return output;
    }

    public static void main(String[] args) {
        Pay1 payment=new Pay1(50.00, 40, 8);
        System.out.println(payment);
    }
}
