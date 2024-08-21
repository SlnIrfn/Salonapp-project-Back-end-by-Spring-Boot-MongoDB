package com.salonappbackend.Salon.App.Backend.Project.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "barberdetails")
public class Barber {
    @Id
    private String id;

    @NotBlank(message = "Barber name is required")
    private String babername;

    @NotBlank(message = "NIC number is required")
    private int nicnumber;

    private String phonenumber;

    private String email;

    private String password;

    private String baberphoto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBabername() {
        return babername;
    }

    public void setBabername(String babername) {
        this.babername = babername;
    }

    public int getNicnumber() {
        return nicnumber;
    }

    public void setNicnumber(int nicnumber) {
        this.nicnumber = nicnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBaberphoto() {
        return baberphoto;
    }

    public void setBaberphoto(String baberphoto) {
        this.baberphoto = baberphoto;
    }
}
