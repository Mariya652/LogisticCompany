package com.informatics.LogisticCompany.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Getter
//@Setter
@NoArgsConstructor
@Entity
@Table(name = "logisticCompany")
public class LogisticCompany extends BaseEntity {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return this.name;}


}
