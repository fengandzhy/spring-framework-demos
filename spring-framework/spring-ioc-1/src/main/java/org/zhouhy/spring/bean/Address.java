package org.zhouhy.spring.bean;

public class Address {
    private Integer Id;
    private String detail;

    public Address() {
    }

    public Address(Integer id, String detail) {
        Id = id;
        this.detail = detail;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Id=" + Id +
                ", detail='" + detail + '\'' +
                '}';
    }
}
