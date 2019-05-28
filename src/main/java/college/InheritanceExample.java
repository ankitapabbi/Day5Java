package college;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InheritanceExample {

    public static void main(String[] args) {
        StudentData sd = new StudentData();
        sd.setCourse_name("Mobile Application Design and Development");
        float marks[]={85.5f,90.0f,95.6f,82.2f,90.50f};
        sd.setMarks(marks);

        FacultyData fd = new FacultyData();

        fd.setDept_name("Computer Science");
        fd.setDesignation("Professor");
        fd.setSalary(100000);


       //----------Student bday---------------------------
        SimpleDateFormat sdf= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";

        try {
            Date s1BirthDate = sdf.parse(dateInString);
            sd.setBirthdate(s1BirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //----------Student bday---------------------------

        //----------Date Joined bday---------------------------
        SimpleDateFormat sdf1= new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
        String dateJoin = "31-08-1982 10:20:56";

        try {
            Date joinedDate = sdf1.parse(dateJoin);
            fd.setDate_joined(joinedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //----------Date Joined---------------------------



    }


}
