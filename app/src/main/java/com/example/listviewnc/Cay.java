package com.example.listviewnc;

public class Cay {
    private String Ten;
    private String MoTa;
    private int Hinh;

    public Cay (String ten, String moTa, int hinh){
        Ten = ten;
        MoTa =moTa;
        Hinh = hinh;
    }
    public String getTen(){
        return Ten;
    }
    public String getMoTa(){
        return MoTa;
    }
    public int getHinh(){
        return Hinh;
    }

 }
