package ru.stqa.pft.addressbook;

public class GroupContData {
    private final String firstname;
    private final String lastname;
    private final String adress;
    private final String mobilenumber;
    private final String emailadress;
    private final String bday;
    private final String bmonth;
    private final String byear;

    public GroupContData(String firstname, String lastname, String adress, String mobilenumber, String emailadress, String bday, String bmonth, String byear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.mobilenumber = mobilenumber;
        this.emailadress = emailadress;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
