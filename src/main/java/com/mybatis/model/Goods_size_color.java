package com.mybatis.model;

public class Goods_size_color {
    private Long id;

    private Integer lenghtsize;

    private String color;

    private Long goodsid;

    private Integer widthsize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLenghtsize() {
        return lenghtsize;
    }

    public void setLenghtsize(Integer lenghtsize) {
        this.lenghtsize = lenghtsize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getWidthsize() {
        return widthsize;
    }

    public void setWidthsize(Integer widthsize) {
        this.widthsize = widthsize;
    }
}