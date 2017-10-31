package academy;

public abstract class Person implements IPrint {
    private String fName,lName,address;
Person(){
}
    public Person(String fName, String lName, String address) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void printDetails(Person per) {
        System.out.println(per.getfName()+per.getlName()+per.getAddress());
    }
}
