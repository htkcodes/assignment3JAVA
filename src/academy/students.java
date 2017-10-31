package academy;

import java.util.Date;

public final class  students extends Person {
    private String subjects;
    Date dateOfBirth;
    char gender;

    public students(){

    }

    public students(String fName, String lName, String address) {
        super(fName, lName, address);
    }
    public students(String fName, String lName, String address,char gender,Date dateOfBirth,String subjects) {
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.subjects=subjects;
    }

    public char getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubjects() {
        return subjects;
    }

    @Override
    public void printDetails() {
contact();
    }

    @Override
    public void contact(String name, String teleNum, String emailAddress) {
        System.out.println("Institution Name: " + name + "Telephone Number : " + teleNum + "Email Address" + emailAddress);
    }
    public  void contact() {
        contact("Miraki Evening Institute","8767994990","mei@miraki.com");    
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getfName() {
        return super.getfName();
    }

    @Override
    public void setfName(String fName) {
        super.setfName(fName);
    }

    @Override
    public String getlName() {
        return super.getlName();
    }

    @Override
    public void setlName(String lName) {
        super.setlName(lName);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }
}
