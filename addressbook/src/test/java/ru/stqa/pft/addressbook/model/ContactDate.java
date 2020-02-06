package ru.stqa.pft.addressbook.model;

public class ContactDate {
    private final String firtname;
    private final String middlename;
    private final String lastname;
    private final String homephone;

    public ContactDate(String firtname, String middlename, String lastname, String homephone) {
        this.firtname = firtname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.homephone = homephone;
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
}
