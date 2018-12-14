package com.qf.pojo.vo;

public class EditVo {
    private String id;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_mobile;
    private String receiver_state;
    private String receiver_city;
    private String receiver_district;
    private String receiver_address;
    private String receiver_zip;
    private String updated;

    @Override
    public String toString() {
        return "EditVo{" +
                "id='" + id + '\'' +
                ", receiver_name='" + receiver_name + '\'' +
                ", receiver_phone='" + receiver_phone + '\'' +
                ", receiver_mobile='" + receiver_mobile + '\'' +
                ", receiver_state='" + receiver_state + '\'' +
                ", receiver_city='" + receiver_city + '\'' +
                ", receiver_district='" + receiver_district + '\'' +
                ", receiver_address='" + receiver_address + '\'' +
                ", receiver_zip='" + receiver_zip + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    public String getReceiver_state() {
        return receiver_state;
    }

    public void setReceiver_state(String receiver_state) {
        this.receiver_state = receiver_state;
    }

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city;
    }

    public String getReceiver_district() {
        return receiver_district;
    }

    public void setReceiver_district(String receiver_district) {
        this.receiver_district = receiver_district;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_zip() {
        return receiver_zip;
    }

    public void setReceiver_zip(String receiver_zip) {
        this.receiver_zip = receiver_zip;
    }
}
