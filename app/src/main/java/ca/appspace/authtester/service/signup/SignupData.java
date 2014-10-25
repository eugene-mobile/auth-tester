package ca.appspace.authtester.service.signup;

import java.io.Serializable;

/**
 * Created by esukharev on 23/10/2014.
 */
public class SignupData implements Serializable {
    private String email;
    private String name;
    private boolean doctor;
    private String medicalRecord;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}
