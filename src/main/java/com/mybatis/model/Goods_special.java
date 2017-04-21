package com.mybatis.model;

public class Goods_special {
    private Long id;

    private Long goodsid;

    private Double special;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    public Double getSpecial() {
        return special;
    }

    public void setSpecial(Double special) {
        this.special = special;
    }
}