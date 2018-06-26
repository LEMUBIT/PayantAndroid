package com.lemubit.lemuel.androidpayant.operations.clients.model;

import com.lemubit.lemuel.androidpayant.annotation.PayantRequired;

/**
 * Payant Client model class, user's first name, last name, E-mail and phone number is required.
 *
 * @author lemuel
 */
public class PayantClient {

    String company_name = "";

    @PayantRequired
    String first_name = "";

    @PayantRequired
    String last_name = "";

    @PayantRequired
    String email = "";

    @PayantRequired
    String phone = "";


    String address = "";


    String type = "";


    String settlement_bank = "";


    String account_number = "";

    public PayantClient() {
    }


    public PayantClient(String first_name, String last_name, String email, String phone) {
        this("", first_name, last_name, email, phone, "", "", "", "");
    }

    public PayantClient(String first_name, String last_name, String email, String phone, String address, String type) {
        this("", first_name, last_name, email, phone, address, type, "", "");
    }

    public PayantClient(String first_name, String last_name, String email, String phone, String address, String type, String settlement_bank, String account_number) {
        this("", first_name, last_name, email, phone, address, type, settlement_bank, account_number);
    }

    public PayantClient(String company_name, String first_name, String last_name, String email, String phone, String address, String type, String settlement_bank, String account_number) {
        this.company_name = company_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.type = type;
        this.settlement_bank = settlement_bank;
        this.account_number = account_number;
    }

    public String getCompany_name() {
        return company_name;
    }

    /**
     * Set client's company name
     *
     * @param company_name
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getFirstName() {
        return first_name;
    }


    /**
     * Set client's first name
     *
     * @param first_name
     */
    @PayantRequired
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    /**
     * Set client's last name
     *
     * @param last_name
     */
    @PayantRequired
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Set client's email address
     *
     * @param email
     */
    @PayantRequired
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    /**
     * Set client's phone number
     * <p>
     * Note: Use international phone Number format
     *
     * @param phone
     */
    @PayantRequired
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    /**
     * Set client's address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    /**
     * Set client's type Customer, Staff or Vendor
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getsettlementBank() {
        return settlement_bank;
    }

    /**
     * Set client's settlement bank
     *
     * @param settlement_bank
     */
    public void setsettlementBank(String settlement_bank) {
        this.settlement_bank = settlement_bank;
    }

    public String getaccountNumber() {
        return account_number;
    }

    /**
     * Set client's account number
     *
     * @param account_number
     */
    public void setaccountNumber(String account_number) {
        this.account_number = account_number;
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
