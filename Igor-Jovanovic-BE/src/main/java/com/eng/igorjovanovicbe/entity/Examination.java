package com.eng.igorjovanovicbe.entity;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

public class Examination {
    private SimpleStringProperty identifier=new SimpleStringProperty("");
    private SimpleStringProperty status=new SimpleStringProperty("");
    private SimpleStringProperty serviceType=new SimpleStringProperty("");
    private SimpleStringProperty priority=new SimpleStringProperty("");
    private ObjectProperty<Date> startDate;
    private ObjectProperty<Date> endDate;
    private SimpleStringProperty diagnosis=new SimpleStringProperty("");

    public Examination() {
    }

    public Examination(String identifier, String status,
                       String serviceType, String priority,
                       ObjectProperty<Date> startDate, ObjectProperty<Date> endDate,
                       String diagnosis) {
        this.identifier.set(identifier);
        this.status.set(status);
        this.serviceType.set(serviceType);
        this.priority.set(priority);
        this.startDate =new SimpleObjectProperty<Date>(startDate.get());
        this.endDate = new SimpleObjectProperty<Date>(endDate.get());
        this.diagnosis.set(diagnosis);
    }

    public String getIdentifier() {
        return identifier.get();
    }

    public SimpleStringProperty identifierProperty() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier.set(identifier);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getServiceType() {
        return serviceType.get();
    }

    public SimpleStringProperty serviceTypeProperty() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType.set(serviceType);
    }

    public String getPriority() {
        return priority.get();
    }

    public SimpleStringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }

    public Date getStartDate() {
        return startDate.get();
    }

    public ObjectProperty<Date> startDateProperty() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate.set(startDate);
    }

    public Date getEndDate() {
        return endDate.get();
    }

    public ObjectProperty<Date> endDateProperty() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate.set(endDate);
    }

    public String getDiagnosis() {
        return diagnosis.get();
    }

    public SimpleStringProperty diagnosisProperty() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis.set(diagnosis);
    }
}
