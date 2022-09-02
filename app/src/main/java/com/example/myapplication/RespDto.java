package com.example.myapplication;


public class RespDto {

    private int coupon;

    public RespDto(int coupon) {
        this.coupon = coupon;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }
}
