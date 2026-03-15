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
    @Override
    public String toString(){
        return "Model:"+this.model+"\n"+
                "Manufacturer:"+this.manufacturer+"\n"+
                "Top Speed:"+this.topSpeed+" km/h\n"+
                "Max Altitude:"+this.maxAltitude+" metres\n"+
                "Payload:"+this.payload+" tonnes\n";
    }
}
