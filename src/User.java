import java.sql.Timestamp;

public class User {
    private String firstName;
    private String lastName;
    //make fields optional
    //maybe email username or email list for important updates
    //reporting of crashes -- identify dangerous intersections etc.
    //Look into captcha
    private String telephone;
    private String email;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getEmail(){
        return this.email;
    }

    public User (
            String firstName,
            String lastName,
            String telephone,
            String email
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }

    //method for user to create Bike Report
    public BikeReport createBikeReport(
            String obstructionType,
            User creator,
            double latitude,
            double longitude,
            Timestamp timestamp,
            String information){
        return new BikeReport(obstructionType, this, latitude, longitude, timestamp, information);
    }

    //method for user to create Pedestrian Report
    public PedestrianReport createPedestrianReport(
            String obstructionType,
            User creator,
            double latitude,
            double longitude,
            Timestamp timestamp,
            String information){
        return new PedestrianReport(obstructionType, this, latitude, longitude, timestamp, information);
    }

    //method for user to create ADA Report
    public ADAReport createADAReport(
            String adaRestriction,
            String obstructionType,
            User creator,
            double latitude,
            double longitude,
            Timestamp timestamp,
            String information){
        return new ADAReport(adaRestriction, obstructionType, this, latitude, longitude, timestamp, information);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        //TODO

        User u1 = new User("John", "Black", "5555555555", "jblack@gmail.com");
        System.out.println(u1.firstName);

    }
}
