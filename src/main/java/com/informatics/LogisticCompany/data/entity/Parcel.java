package com.informatics.LogisticCompany.data.entity;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "parcels")
public class Parcel extends BaseEntity {

    private int number;
    private String addressTo;
    private LocalDate sendDate;
    private LocalDate receiveDate;
    private double price;
    private double weight;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    @JsonIgnoreProperties({"sendParcels", "receiveParcels"})
    private Clients sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    @JsonIgnoreProperties({"receiveParcels", "sendParcels"})
    private Clients receiver;

    @ManyToOne
    @JoinColumn(name = "office_id")
    @JsonIgnoreProperties({"parcels", "employeesList", "company"})
    private Offices office;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private LogisticCompany company;

//    @ManyToOne
//    @JoinColumn(name = "employee_id")
    private Long employeeId;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public LocalDate getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDate receiveDate) {
        this.receiveDate = receiveDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Clients getSender() {
        return sender;
    }

    public void setSender(Clients sender) {
        this.sender = sender;
    }

    public Clients getReceiver() {
        return receiver;
    }

    public void setReceiver(Clients receiver) {
        this.receiver = receiver;
    }

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

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
