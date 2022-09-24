package com.example.myapplication;


public class RespDto {

    private int stamp;
    private int afterStamp;
    private int afterCoupon;

    public RespDto(int stamp, int afterStamp, int afterCoupon) {
        this.stamp = stamp;
        this.afterStamp = afterStamp;
        this.afterCoupon = afterCoupon;
    }

    public int getStamp() {
        return stamp;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public int getAfterStamp() {
        return afterStamp;
    }

    public void setAfterStamp(int afterStamp) {
        this.afterStamp = afterStamp;
    }

    public int getAfterCoupon() {
        return afterCoupon;
    }

    public void setAfterCoupon(int afterCoupon) {
        this.afterCoupon = afterCoupon;
    }
}
