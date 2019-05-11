package AddressBook;

public class  Occupation {

    private String job;
    private String emailAddress;
    private String workAddress;

    // constructor
    public Occupation( String work, String email, String wAddress)
    {
        job = work;
        emailAddress = email;
        workAddress = wAddress;
    }

    // methods
    public String getJob()
    {
        return job;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getWorkAddress()
    {
        return workAddress;
    }


    public String export(){
        return getJob() + "\n" + getEmailAddress() + "\n" + getWorkAddress();
    }

    public String toString()
    {
        return "<html>"+"Job: " + getJob()+"<br>"+ "Email: "+getEmailAddress()+"<br>"+"Work: "+getWorkAddress()+"<html>";
    }
}
