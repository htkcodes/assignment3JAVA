package academy;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*
*@todo Complete employee and visitor classes
*
* */

public class Driver {
    static Scanner input=new Scanner(System.in);
    static String pattern = "dd/MM/yyyy";
    static EMPLOYEE_TYPE reg=EMPLOYEE_TYPE.REGULAR ;
    static EMPLOYEE_TYPE teach=EMPLOYEE_TYPE.TEACHER;
    public  static void main(String[] args) throws ParseException

    {
        int employeeCount=1;
        int visitCount=1;
        int stuCount=1;


        students[] stu=new students[stuCount];
       employees[] worker = new employees[employeeCount];
       visitors[] visit =new visitors[visitCount];




        System.out.println("Press 1. To Enter students" + "\nPress 2. To enter Employees" + " \nPress 3. To enter Visitors");
        System.out.print("Option: ");
        int count=input.nextInt();

        switch (count)
        {
            case 1:
                stuCall(stu,false);
                break;
            case 2:
                employCall(worker,false);
                break;
            case 3:
                visitorCall(visit,false);
                break;
            default:
                System.out.println("Press 1,2,3 next time");
        }
    }
    public static void stuCall(students[] stu,boolean trigger) throws ParseException {
        if (!trigger)
        {
            System.out.println("Press 1. To Add Students" + "\nPress 2.To Print Details");
            int option=input.nextInt();
            boolean isTrue=false;
            switch (option)
            {

                case 1:
                    isTrue=true;
                    addStudents(stu);
                    break;
                case 2:
                    if(!isTrue)
                    {
                        System.out.println("You have not added any students");
                        stuCall(stu,false);
                    }
                    try {
                        printS(stu);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("lol");
            }

        }
        else{
            System.out.println("Press 1. To Add Students" + "\nPress 2.To Print Details");
            int option=input.nextInt();
            switch (option)
            {

                case 1:
                    addStudents(stu);
                    break;
                case 2:
                    printS(stu);
                    break;
                default:
                    System.out.println("lol");
            }
        }
    }

    public static void employCall(employees[] worker,boolean trigger)
    {

        if (!trigger)
        {
            System.out.println("Press 1. To Add Employees" + "Press 2.To Print Details");
            int option=input.nextInt();
            boolean isTrue=false;
            switch (option)
            {

                case 1:
                    isTrue=true;
                    addEmployees(worker);
                    break;
                case 2:
                    if(!isTrue)
                    {
                        System.out.println("You have not added any workers");
                       addEmployees(worker);
                    }
                       printE(worker);
                    break;
                default:
                    System.out.println("lol");
            }

        }
        else{
            System.out.println("Press 1. To Add Employees" + "Press 2.To Print Details");
            int option=input.nextInt();
            switch (option)
            {

                case 1:
                    addEmployees(worker);
                    break;
                case 2:
                    printE(worker);
                    break;
                default:
                    System.out.println("lol");
            }
        }
    }
    public static void visitorCall(visitors[] visit,boolean trigger) throws ParseException
    {
        if (!trigger)
        {
            System.out.println("Press 1. To Add Visitors" + "Press 2.To Print Visitors");
            int option=input.nextInt();
            boolean isTrue=false;
            switch (option)
            {

                case 1:
                    isTrue=true;
                    addVisitors(visit);
                    break;
                case 2:
                    if(!isTrue)
                    {
                        System.out.println("You have not added any visitors");
                        visitorCall(visit,false);
                    }
                    try{
                        printV(visit);
                    }catch (ParseException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("lol");
            }

        }
        else{
            System.out.println("Press 1. To Add Visitors" + "Press 2.To Print Details");
            int option=input.nextInt();
            switch (option)
            {

                case 1:
                    addVisitors(visit);
                    break;
                case 2:
                    printV(visit);
                    break;
                default:
                    System.out.println("lol");
            }
        }

        /*
        * System.out.print("Enter first time (hh:mm aa): ");
 String time = input.nextLine();
 System.out.println();
 System.out.print("Enter second time (hh:mm aa): ");
 String time2 = input.nextLine();
 System.out.println();
 DateFormat sdf = new SimpleDateFormat("hh:mm aa");
        * */
    }

    public static void addStudents(students[] stu)
    {

            for(int z=0; z <stu.length;z++) stu[z] = new students();
            for (int i=0;i<stu.length;i++)
            {
                System.out.print("Enter your first name: ");
                String fName=input.next();
                System.out.print("Enter your last name: ");
                String lName=input.next();

                while(true)
                {
                    System.out.print("Enter your address (Street,City,Parish): ");//DO NOT ENTER SPACE!.
                    String address=input.next();

                    if(address.matches("^\\s*(?:\\w+\\s*,\\s*){2,}(?:\\w+\\s*)$"))
                    {
                        stu[i].setAddress(address);
                        break;
                    }
                    else
                        System.out.println("Address Entered Doesn't Match Format. \n Try Again !!\n");
                }

                while (true)
                {
                    char male='M';
                    char female='F';

                    System.out.print("Enter your gender (M OR F): ");
                    String gen=input.next();
                    char gender=gen.charAt(0);
                    gender=Character.toUpperCase(gender);
                    if (gender == male || gender == female)
                    {
                        stu[i].setGender(gender);
                        break;
                    }
                    else {
                        System.out.println(  "Please Enter 'M' or 'F' ");
                    }


                }


                System.out.print("Enter DOB (dd/MM/yyyy): ");

                SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
                Date date2=null;
                String dob=input.next();
                try {
                    dateFormat.setLenient(false);
                    date2 = dateFormat.parse(dob);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                System.out.println("How many subjects are you doing?: ");
                int subCount=input.nextInt();
                String [] subjectsArr=new String[subCount];
                String subjects ="";
                for (int j=0;j<subjectsArr.length;j++)
                {
                    Scanner subNames=new Scanner(System.in);
                    System.out.println("Enter " + (j+1) + " Subject Name: ");
                    subjectsArr[j]=subNames.next();
                }
                for (int q=0;q<subjectsArr.length;q++) subjects += (String.format("\n%s", subjectsArr[q]));

                stu[i].setSubjects(subjects);
                stu[i].setfName(fName);
                stu[i].setlName(lName);
                stu[i].setDateOfBirth(date2);



            }
        try {
            stuCall(stu,true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public  static void printS(students[] stu) throws ParseException
    {
        for (int i=0;i<stu.length;i++)
        {
            System.out.println("Student" + (i+1) + "Name: " + stu[i].getfName() + "  " + stu[i].getlName()
            + '\n' + "Student " + (i+1) + "Address: " + stu[i].getAddress() + '\n' + "Student " + (i+1) + "Gender:" + stu[i].getGender() + '\n' +
                    "Student " +(i+1) + "Date of Birth: " + stu[i].getDateOfBirth() + "\n\n"
            );

        }
        stu[0].printDetails();

    }

    public static void addVisitors(visitors[] visit) throws ParseException
    {
        for(int z=0; z <visit.length;z++) visit[z] = new visitors();
        for(int e=0;e<visit.length;e++)
        {
            System.out.print("Enter your first name: ");
            String fName = input.next();
            System.out.print("Enter your last name: ");
            String lName = input.next();
            System.out.print("Enter time of Visit (hh:mm:ss): ");
            String time=input.next();
            SimpleDateFormat sdf =new SimpleDateFormat("hh:mm:ss");
            Date timeOfVisit = sdf.parse(time);
            System.out.print("Enter Date of Visit (dd/MM/yyyy): ");
            String date=input.next();
            SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
            Date dateOfVisit=sdf2.parse(date);
            visit[e].setfName(fName);
            visit[e].setlName(lName);
            visit[e].setTimeOfVisit(timeOfVisit);
            visit[e].setDateofVisit(dateOfVisit);

        }
        try{
            visitorCall(visit,true);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
    public static void printV(visitors[] visit) throws ParseException
    {
        String display=new  String ();
        SimpleDateFormat output= new SimpleDateFormat("'Time : 'KK:mm a");
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
        for (int i=0;i<visit.length;i++)
        {
            display+="Visitor " + (i+1) + " Name: " + visit[i].getfName() + " " + visit[i].getlName()
                    + "\nVisitor Date of Visit: " + sdf2.format(visit[i].getDateofVisit()) + '\n' + "Visitor Time of Visit" +output.format(visit[i].getTimeOfVisit());
        }
        JOptionPane.showMessageDialog(null,display, "Visitor Info", JOptionPane.INFORMATION_MESSAGE);
        visit[0].printDetails();
    }
    public static void addEmployees(employees[] worker)
    {
        for(int l=0;l<worker.length;l++) worker[l] = new employees();
        for(int b=0;b<worker.length;b++) {


            System.out.print("Enter your first name: ");
            String fName = input.next();
            System.out.print("Enter your last name: ");
            String lName = input.next();


            while (true) {
                System.out.print("Enter your address (Street,City,Parish): ");//DO NOT ENTER SPACE!.
                String address = input.next();

                if (address.matches("^\\s*(?:\\w+\\s*,\\s*){2}(?:\\w+\\s*)$")) {
                    worker[b].setAddress(address);
                    break;
                } else
                    System.out.println("Address Entered Doesn't Match Format. \n Try Again !!\n");
            }

            while (true) {
                char male = 'M';
                char female = 'F';

                System.out.print("Enter your gender (M OR F): ");
                String gen = input.next();
                char gender = gen.charAt(0);
                gender = Character.toUpperCase(gender);
                if (gender == male || gender == female) {
                    worker[b].setGender(gender);
                    break;
                } else {
                    System.out.println("Please Enter 'M' or 'F' : ");
                }
            }

            System.out.print("What type of employee is this person?: ");
            String type=input.next();

            if (type.equalsIgnoreCase(reg.name()))
            {
                final double gross=200000d;
                worker[b].setSalary(worker[b].calculateGrossSalary(gross));
            }
            else
            if(type.equalsIgnoreCase(teach.name()))
            {
                final int rate;
                final int hrsPerWeek=30;
                System.out.println("How many subjects is the teacher delivering?");
                int dSubjects=input.nextInt();
                if (dSubjects>3) rate=5000; else rate=3000;
                worker[b].setSalary(worker[b].calculateGrossSalary(rate,hrsPerWeek));
            }


            worker[b].setfName(fName);
            worker[b].setlName(lName);
        }
            employCall(worker,true);

    }
    public static void printE(employees[] worker){
String display=new String();
        for (int i=0;i<worker.length;i++) {
            display+="Employee Name: " + worker[i].getfName() + " " + worker[i].getlName() + "\n" + "Employee Gender: " + worker[i].getGender() + "\n" + "Employee Salary: " + worker[i].getSalary() + "\n" +
                    "Employee Address : " + worker[i].getAddress()+"\n salary: "
                    + worker[i].getSalary();
            JOptionPane.showMessageDialog(null,display, "Employee Info", JOptionPane.INFORMATION_MESSAGE);
        }
worker[0].printDetails();
    }

}
