package HW170621;

public class Cities {
    int id;
    String name;
    double longitude;
    double latitude;
    boolean airport;
    boolean seaport;


    public Cities(int id, String name, double longitude, double latitude, boolean airport, boolean seaport) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.airport = airport;
        this.seaport = seaport;
    }
}
