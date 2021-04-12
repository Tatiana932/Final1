package com.models;

public class Client {

    /**
     * There is a model of a Client with their respective attributes
     **/
    private int th_id;
    private String th_name;
    private String th_lastname;
    private String th_mail;
    private String th_phone;
    private String th_subject;

    /**
     *
     */
    public Client(){
        
    }

    public Client(int th_id, String th_name, String th_lastname, String th_mail, String th_phone, String th_subject) {
        this.th_id = th_id;
        this.th_name = th_name;
        this.th_lastname = th_lastname;
        this.th_mail = th_mail;
        this.th_phone = th_phone;
        this.th_subject = th_subject;
    }

    

    public int getTh_id() {
        return th_id;
    }

    public void setTh_id(int th_id) {
        this.th_id = th_id;
    }

    public String getTh_name() {
        return th_name;
    }

    public void setTh_name(String th_name) {
        this.th_name = th_name;
    }

    public String getTh_lastname() {
        return th_lastname;
    }

    public void setTh_lastname(String th_lastname) {
        this.th_lastname = th_lastname;
    }

    public String getTh_mail() {
        return th_mail;
    }

    public void setTh_mail(String th_mail) {
        this.th_mail = th_mail;
    }

    public String getTh_phone() {
        return th_phone;
    }

    public void setTh_phone(String th_phone) {
        this.th_phone = th_phone;
    }

    public String getTh_subject() {
        return th_subject;
    }

    public void setTh_subject(String th_subject) {
        this.th_subject = th_subject;
    }

    

}
