package com.informatics.LogisticCompany.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "clients")
public class Clients extends User {

    @OneToMany(mappedBy = "sender")
    @JsonIgnoreProperties("sender")
    private List<Parcel> sendParcels;

    @OneToMany(mappedBy = "receiver")
    @JsonIgnoreProperties("receiver")
    private List<Parcel> receiveParcels;

    public List<Parcel> getSendParcels() {
        return sendParcels;
    }

    public void setSendParcels(List<Parcel> sendParcels) {
        this.sendParcels = sendParcels;
    }

    public List<Parcel> getReceiveParcels() {
        return receiveParcels;
    }

    public void setReceiveParcels(List<Parcel> receiveParcels) {
        this.receiveParcels = receiveParcels;
    }
}
