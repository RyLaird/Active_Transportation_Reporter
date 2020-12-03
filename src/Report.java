import java.sql.Timestamp;

public class Report {
    //protected Intersection intersection;
    protected User creator;
    protected double latitude;
    protected double longitude;
    protected Timestamp timeStamp;
    protected String additional_information;

    public User getUser() {return this.creator;}

    public double getLatitude() {return this.latitude;}

    public double getLongitude() {return this.longitude;}

    public Timestamp getTimeStamp() {return this.timeStamp;}

    public String getInformation() {return this.additional_information;}
}