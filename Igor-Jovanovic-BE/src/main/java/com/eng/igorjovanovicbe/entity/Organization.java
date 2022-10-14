package com.eng.igorjovanovicbe.entity;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Organization {
    private SimpleIntegerProperty identifier=new SimpleIntegerProperty();
    private SimpleBooleanProperty active=new SimpleBooleanProperty();
    private SimpleStringProperty type=new SimpleStringProperty("");
    private SimpleStringProperty name=new SimpleStringProperty("");
    private SimpleStringProperty address=new SimpleStringProperty("");
    private SimpleStringProperty phone=new SimpleStringProperty("");
    private SimpleStringProperty email=new SimpleStringProperty("");

    public Organization() {
    }

    public Organization(int identifier, Boolean active,
                        String type, String name,
                        String address, String phone,
                        String email) {
        this.identifier.set(identifier);
        this.active.set(active);
        this.type.set(type);
        this.name.set(name);
        this.address.set(address);
        this.phone.set(phone);
        this.email.set(email);
    }

    public int getIdentifier() {
        return identifier.get();
    }

    public SimpleIntegerProperty identifierProperty() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
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

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
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
}
