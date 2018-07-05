package com.lemubit.lemuel.androidpayant.operations.clients.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * Create new client with PayantClient class. User's first name, last name, E-mail and phone number are required.
 *
 * @author lemuel
 */
public class PayantClient {

    private String company_name = "";

    @PayantRequired
    private String first_name = "";

    @PayantRequired
    private String last_name = "";

    @PayantRequired
    private String email = "";

    @PayantRequired
    private String phone = "";


    private String address = "";


    private String type = "";


    private String settlement_bank = "";


    private String account_number = "";

    public PayantClient() {
    }

    /**
     * @param firstName client's first name
     * @param lastName  client's last name
     * @param email     client's email address
     * @param phone     client's phone number
     */
    public PayantClient(String firstName, String lastName, String email, String phone) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getcompanyName() {
        return company_name;
    }

    /**
     * @param companyName client's company name
     */
    public void setcompanyName(String companyName) {
        this.company_name = companyName;
    }

    public String getFirstName() {
        return first_name;
    }


    /**
     * @param firstName client's first name
     */
    @PayantRequired
    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    /**
     * @param lastName client's last name
     */
    @PayantRequired
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @param email client's email address
     */
    @PayantRequired
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    /**
     * <p>
     * Note: Use international phone Number format
     *
     * @param phone client's phone number
     */
    @PayantRequired
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    /**
     * @param address client's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    /**
     * @param type client's type Customer, Staff or Vendor
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getsettlementBank() {
        return settlement_bank;
    }

    /**
     * @param settlementBank client's settlement bank
     */
    public void setsettlementBank(String settlementBank) {
        this.settlement_bank = settlementBank;
    }

    public String getaccountNumber() {
        return account_number;
    }

    /**
     * @param accountNumber client's account number
     */
    public void setaccountNumber(String accountNumber) {
        this.account_number = accountNumber;
    }

    @Override
    public String toString() {
        return "PayantClient{" +
                "company_name='" + company_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", settlement_bank='" + settlement_bank + '\'' +
                ", account_number='" + account_number + '\'' +
                '}';
    }
}
