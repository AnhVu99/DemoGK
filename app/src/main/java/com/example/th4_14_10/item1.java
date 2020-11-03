package com.example.th4_14_10;

public class item1 {
    String name;
    Float gia;
    int anh;

    public item1(String name, Float gia, int anh) {
        this.name = name;
        this.gia = gia;
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
