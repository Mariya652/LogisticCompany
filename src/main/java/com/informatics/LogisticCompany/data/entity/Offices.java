package com.informatics.LogisticCompany.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "offices")
public class Offices extends BaseEntity {

    private String name;

    private String address;

    @OneToMany(mappedBy = "office")
    @JsonIgnoreProperties("office")
    private List<Employees> employeesList;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private LogisticCompany company;

    @OneToMany(mappedBy = "office")
    @JsonIgnoreProperties("office")
    private List<Parcel> parcels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public LogisticCompany getCompany() {
        return company;
    }

    public void setCompany(LogisticCompany company) {
        this.company = company;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }
}
