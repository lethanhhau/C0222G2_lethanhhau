package com.hau.model.contract;

import com.hau.model.customer.CustomerType;

import javax.persistence.*;

@Entity
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractDetailId;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contractId")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attach_facility_id", referencedColumnName = "attachFacilityId")
    private AttachFacility attachFacility;

    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer contractDetailId, Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.contractDetailId = contractDetailId;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
