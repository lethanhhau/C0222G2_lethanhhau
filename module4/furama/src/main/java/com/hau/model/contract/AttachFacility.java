package com.hau.model.contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttachFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachFacilityId;
    private String attachFacilityName;
    private Double cost;
    private String unit;
    private String status;

    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail> contractDetails;

    public AttachFacility() {
    }

    public AttachFacility(Integer attachFacilityId, String attachFacilityName, Double cost, String unit, String status,
                          List<ContractDetail> contractDetails) {
        this.attachFacilityId = attachFacilityId;
        this.attachFacilityName = attachFacilityName;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
        this.contractDetails = contractDetails;
    }

    public Integer getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(Integer attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public String getAttachFacilityName() {
        return attachFacilityName;
    }

    public void setAttachFacilityName(String attachFacilityName) {
        this.attachFacilityName = attachFacilityName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
