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
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (!(obj instanceof Airplane compObj)) return false;

        return this.model.equals(compObj.model)
                && this.manufacturer.equals(compObj.manufacturer)
                && this.topSpeed.equals(compObj.topSpeed)
                && this.maxAltitude.equals(compObj.maxAltitude)
                && this.payload.equals(compObj.payload);
    }
    public String getModel(){
        return this.model;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public Integer getTopSpeed(){
        return this.topSpeed;
    }
    public Integer getMaxAltitude(){
        return this.maxAltitude;
    }
    public Double getPayload(){
        return this.payload;
    }
}
