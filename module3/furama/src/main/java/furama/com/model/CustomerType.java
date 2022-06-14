package furama.com.model;

public class CustomerType {
    private Integer customerTypeId;
    private String customerTypeName;
    private Integer status;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeId, String customerTypeName, Integer status) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.status = status;
    }


    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
}
