package com.fengfang.domain;

/**
 * TODO
 *
 * @author liuxh
 * @date 2020/8/11 21:38
 **/
public class Address {
    private String address;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
