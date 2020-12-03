public enum ADARestriction {
    SLOPE("slope"),
    CURB("curb"),
    WIDTH("width"),
    SURFACE("surface"),
    OTHER("other");

    private final String name;

    private ADARestriction(String name) {this.name = name; }

    public String getName() {return name;}

    public static ADARestriction fromString(String name) {
        for (ADARestriction b: ADARestriction.values()) {
            if (b.name == name) return b;
        }
        return ADARestriction.OTHER;
    }
}
