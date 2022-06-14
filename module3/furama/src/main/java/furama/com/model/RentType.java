package furama.com.model;

public class RentType {
    private Integer rentTypeId;
    private String RentTypeName;
    private Double RentTypeCost;
    private Integer status;

    public RentType() {
    }

    public RentType(Integer rentTypeId, String rentTypeName, Double rentTypeCost, Integer status) {
        this.rentTypeId = rentTypeId;
        RentTypeName = rentTypeName;
        RentTypeCost = rentTypeCost;
        this.status = status;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return RentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        RentTypeName = rentTypeName;
    }

    public Double getRentTypeCost() {
        return RentTypeCost;
    }

    public void setRentTypeCost(Double rentTypeCost) {
        RentTypeCost = rentTypeCost;
    }
    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
