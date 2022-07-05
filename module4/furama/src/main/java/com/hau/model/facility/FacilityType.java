package com.hau.model.facility;

import javax.persistence.*;
import java.util.List;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facilityTypeId;
    private String facilityTypeName;

    @OneToMany(targetEntity = Facility.class)
    private List<Facility> facilities;

    public FacilityType() {
    }

    public FacilityType(Integer facilityTypeId, String facilityTypeName) {
        this.facilityTypeId = facilityTypeId;
        this.facilityTypeName = facilityTypeName;
    }

    public Integer getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(Integer facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }
}
