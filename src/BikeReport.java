import java.sql.Timestamp;

public class BikeReport extends Report {

    private ObstructionType obstructionType;

    public BikeReport(
            String obstructionType,
            User creator,
            double latitude,
            double longitude,
            Timestamp timestamp,
            String information
    ) {
        this.obstructionType = ObstructionType.fromString(obstructionType);
        this.creator = creator;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeStamp = timestamp;
        this.additional_information = information;
    }

    public ObstructionType getObstructionType() {
        return obstructionType;
    }

    public String getReportType() {
        return "Bike";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
