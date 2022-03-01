package com.informatics.LogisticCompany.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Getter
//@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employees extends User {

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Offices office;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private LogisticCompany company;

    public Offices getOffice() {
        return office;
    }

    public void setOffice(Offices office) {
        this.office = office;
    }

    public LogisticCompany getCompany() {
        return company;
    }

    public void setCompany(LogisticCompany company) {
        this.company = company;
    }
}
