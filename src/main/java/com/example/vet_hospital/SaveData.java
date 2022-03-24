package com.example.vet_hospital;

public class SaveData implements java.io.Serializable{
    private static final long serialVersionUID = 1L; /* the universal version
    identifier for a Serializable class to ensure loaded data corresponds exactly to a
    serialized object*/

    public String theFirstname;
    public String theLastname;
    public String theEmail;
    public String thePhone;
    public String theEID;



    public SaveData() {
    }
}
