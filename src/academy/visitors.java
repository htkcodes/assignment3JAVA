package academy;
import java.util.Date;

public final class visitors extends Person {

private Date dateOfVisit,timeOfVisit;

    public visitors() {

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

    public visitors(String fName, String lName, String address, Date dateOfVisit, Date timeOfDiscord) {
        super(fName, lName, address);
        this.dateOfVisit = dateOfVisit;
        this.timeOfVisit = timeOfDiscord;
    }

    public visitors(String fName, String lName, String address) {
        super(fName, lName, address);
    }

    @Override
    public String getfName() {
        return super.getfName();
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public Date getTimeOfVisit() {
        return timeOfVisit;
    }

    public void setTimeOfVisit(Date timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }

    public Date getDateofVisit() {
        return dateOfVisit;
    }

    public void setDateofVisit(Date dateofVisit) {
        this.dateOfVisit = dateofVisit;
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
