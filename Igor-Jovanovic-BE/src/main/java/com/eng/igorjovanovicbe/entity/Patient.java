package com.eng.igorjovanovicbe.entity;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {
    private SimpleStringProperty identifier=new SimpleStringProperty("");
    private SimpleBooleanProperty active=new SimpleBooleanProperty();
    private SimpleStringProperty name=new SimpleStringProperty("");
    private SimpleStringProperty surname=new SimpleStringProperty("");
    private SimpleStringProperty gender=new SimpleStringProperty("");
    private SimpleObjectProperty<Date> birthDate;
    private SimpleStringProperty address=new SimpleStringProperty("");
    private SimpleStringProperty phone=new SimpleStringProperty("");
    private SimpleStringProperty email=new SimpleStringProperty("");
    private SimpleBooleanProperty deceased=new SimpleBooleanProperty();
    private SimpleStringProperty martialStatus=new SimpleStringProperty("");

    public Patient() {
    }

    public Patient(String identifier, Boolean active,
                   String name, String surname,
                   String gender, ObjectProperty<Date> birthDate,
                   String address, String phone,
                   String email, Boolean deceased,
                   String martialStatus) {
        this.identifier.set(identifier);
        this.active.set(active);
        this.name.set(name);
        this.surname.set(surname);
        this.gender.set(gender);
        this.birthDate =new SimpleObjectProperty<>(birthDate.get());
        this.address.set(address);
        this.phone.set(phone);
        this.email.set(email);
        this.deceased.set(deceased);
        this.martialStatus.set(martialStatus);
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

    public boolean isActive() {
        return active.get();
    }

    public SimpleBooleanProperty activeProperty() {
        return active;
    }

    public void setActive(boolean active) {
        this.active.set(active);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public String getGender() {
        return gender.get();
    }

    public SimpleStringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public Object getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate.set(birthDate);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getPhone() {
        return phone.get();
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public boolean isDeceased() {
        return deceased.get();
    }

    public SimpleBooleanProperty deceasedProperty() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased.set(deceased);
    }

    public String getMartialStatus() {
        return martialStatus.get();
    }

    public SimpleStringProperty martialStatusProperty() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus.set(martialStatus);
    }
}
