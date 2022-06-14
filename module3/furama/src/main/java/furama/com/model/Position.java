package furama.com.model;

public class Position {
    private Integer positionId;
    public String positionName;
    private Integer status;

    private Position(){

    }

    public Position(Integer positionId, String positionName,Integer status) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.status = status;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
