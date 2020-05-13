package Constructors;

public class Task {
    //Java Program to demonstrate the working of banking system
    //where we deposit and withdraw amount from our account
    //Creating an account class which has deposit() and withdraw() methods


    /*
    Create the instance variables
    int acc_no;
    String name;
    float amount;
     */
    public int acc_no; //0
    public String name; //null
    public float amount; //0.0


    public Task(int acc_no, String name, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }



    /*/
    Create a constructor with 3 parameters (int a, String name, float amt)

   your instance variables are equal to your parameters of the constructor
     */


    /*
    Create a method is called deposit
    one parameter float amnt
    return type is void

    add your parameter amnt to your instance variable amount

    then print out amnt + "deposited")
     */

    public void deposit(float amnt) {
        amount += amnt;
        System.out.println(amnt + " deposited");

    }

    /*
    Create a method is called withdraw
    with parameter float amnt
    return type is void
    if  instance amount is less than your  withdraw amnt
    print out "insufficient balance"
    if  instance amount is greater than your  withdraw amnt
    subtract amnt from the instance amount

    then print out amnt + "withdrawn"

     */
    public void withdraw(float amnt) {
        if (amount < amnt) {
            System.out.println("insufficient balance");
        } else {
            amount -= amnt;
        }
        System.out.println(amnt + " withdrawn");
    }



    /*
    create a method checkBalance
    return type is void
    print out the "Balance is : " + amount
     */

    public void checkBalance(){
        System.out.println("Balance is : " + amount);
    }

    /*
    and write the toString method to print out the instance variable
     */
    @Override
    public String toString() {
        return "Task{" +
                "acc_no=" + acc_no +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    /*
    and call these methods in the main method
     */
}
