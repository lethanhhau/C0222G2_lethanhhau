package com.hau.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "education_degree")
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationDegreeId;
    private String educationDegreeName;

    @OneToMany(mappedBy = "educationDegree")
    private List<Employee> employees;

    public EducationDegree() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public EducationDegree(Integer educationDegreeId, String educationDegreeName) {
        this.educationDegreeId = educationDegreeId;
        this.educationDegreeName = educationDegreeName;
    }

    public Integer getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Integer educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }
}
