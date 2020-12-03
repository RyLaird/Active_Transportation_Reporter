public enum ObstructionType {
    CONSTRUCTION("construction"),
    POTHOLE("pothole"),
    DAMAGE("damage"),
    WEATHER("weather"),
    HAZARD("hazard"),
    LIGHTING("lighting"),
    OTHER("other");

    private final String name;

    private ObstructionType(String name) {this.name = name; }

    public String getName() {return name;}

    public static ObstructionType fromString(String name) {
        for (ObstructionType b: ObstructionType.values()) {
            if (b.name == name) return b;
        }
        return ObstructionType.OTHER;
    }
}
