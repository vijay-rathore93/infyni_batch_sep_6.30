package org.vijaycode.abstractClasses;

public abstract  class Company implements Address{

    private String name;
    private String code;

    public Company() {
        System.out.println("Zero arguments constructor....");
    }

    public Company(String name, String code) {
        System.out.println("Abstract class constructor....");
        this.name = name;
        this.code = code;
    }

    public abstract void showCompanyInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
