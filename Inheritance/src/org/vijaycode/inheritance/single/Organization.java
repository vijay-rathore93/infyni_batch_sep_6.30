package org.vijaycode.inheritance.single;

public class Organization {

    private String name;
    private String address;
    private Integer code;



    public Organization(String name, String address, Integer code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCode() {
        return code;
    }


   /* public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCode(Integer code) {
        this.code = code;
    }*/
}
