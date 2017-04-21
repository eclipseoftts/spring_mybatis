package com.mybatis.model;

public class Users {
    private Long id;

    private String username;

    private String password;

    private String address;

    private Integer telephone;

    private Integer sex;

    private String portrait;

    private Double account;

    private String bank;

    private Long permissionsid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Long getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(Long permissionsid) {
        this.permissionsid = permissionsid;
    }

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", telephone=" + telephone + ", sex=" + sex + ", portrait=" + portrait + ", account=" + account
				+ ", bank=" + bank + ", permissionsid=" + permissionsid + "]";
	}
}