package ru.stqa.pft.addressbook.model;

public class ContactDate {
    private  String firtname;
    private  String middlename;
    private  String lastname;
    private  String homephone;
    private String group;

    public ContactDate(String firtname, String middlename, String lastname, String homephone, String group) {
        this.firtname = firtname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.homephone = homephone;
        this.group = group;
    }

    public String getFirtname() {
        return firtname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getGroup() {
        return group;
    }
}
