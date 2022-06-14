package furama.com.model;

public class Division {
    private Integer divisionId;
    private String divisionName;
    private Integer status;

    public Division(){}

    public Division(Integer divisionId, String divisionName, Integer status) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.status = status;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
