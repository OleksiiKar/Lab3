package Lab3;

public class Airplane {
    private String model;
    private String manufacturer;
    private Integer topSpeed;
    private Integer maxAltitude;
    private Double payload;

    public Airplane(String model,
                    String manufacturer,
                    Integer topSpeed,
                    Integer maxAltitude,
                    Double payload){
        this.model = model;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.maxAltitude = maxAltitude;
        this.payload = payload;
    }
}
