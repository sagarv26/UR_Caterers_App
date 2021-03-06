package com.example.sagar.urcatters.Model;

public class RecyclerItem {
    private String orderName;
    private int orderThumbnail;

    public RecyclerItem(String orderName, int orderThumbnail) {
        this.orderName = orderName;
        this.orderThumbnail = orderThumbnail;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderThumbnail() {
        return this.orderThumbnail;
    }

    public void setOrderThumbnail(int orderThumbnail) {
        this.orderThumbnail = orderThumbnail;
    }
}
