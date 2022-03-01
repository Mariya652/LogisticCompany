package com.informatics.LogisticCompany.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Getter
//@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "roles")
public class Roles extends BaseEntity{

    private String type;

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }


}
