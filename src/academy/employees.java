package academy;

public class employees extends Person implements ICalculate,IPrint {
private char gender;
private double salary;

public employees()
{

}

    @Override
    public void printDetails() {
contact();
    }


    @Override
    public void contact(String name, String teleNum, String emailAddress) {
        System.out.println("Institution Name: " + name + "Telephone Number : " + teleNum + "Email Address" + emailAddress);
    }
    public void contact() {
        contact("Miraki Evening Institute","8767994990","mei@miraki.com");
    }

    public double calculateGrossSalary(double a) {
    double val= a;
    return val;
}
    @Override
    public double calculateGrossSalary(double rate, int hrsPerWeek) {
        double amtToBePaid=(rate*hrsPerWeek);

        return amtToBePaid;
    }

    public employees(String fName, String lName, String address, char gender) {
        super(fName, lName, address);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


