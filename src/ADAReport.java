import java.sql.Timestamp;

public class ADAReport extends Report {

    private ADARestriction adaRestriction;
    private ObstructionType obstructionType;

    public ADAReport(
            String adaRestriction,
            String obstructionType,
            User creator,
            double latitude,
            double longitude,
            Timestamp timestamp,
            String information
    ) {
        this.adaRestriction = ADARestriction.fromString(adaRestriction);
        this.obstructionType = ObstructionType.fromString(obstructionType);
        this.creator = creator;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeStamp = timestamp;
        this.additional_information = information;
    }

    public ADARestriction getAdaRestriction() {
        return adaRestriction;
    }

    public ObstructionType getObstructionType() {
        return obstructionType;
    }

    public String getReportType() {
        return "ADA";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}
