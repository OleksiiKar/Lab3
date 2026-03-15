package Lab3;

public class Airplanes {
    private String model;
    private String manufacturer;
    private Integer topSpeed;
    private Integer maxAltitude;
    private Integer payload;

    public Airplanes(String model,
                     String manufacturer,
                     Integer topSpeed,
                     Integer maxAltitude,
                     Integer payload){
        this.model = model;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.maxAltitude = maxAltitude;
        this.payload = payload;
    }
}
