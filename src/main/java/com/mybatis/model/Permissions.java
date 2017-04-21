package com.mybatis.model;

public class Permissions {
    private Long id;

    private String rootname;

    private Integer rootlevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRootname() {
        return rootname;
    }

    public void setRootname(String rootname) {
        this.rootname = rootname;
    }

    public Integer getRootlevel() {
        return rootlevel;
    }

    public void setRootlevel(Integer rootlevel) {
        this.rootlevel = rootlevel;
    }
}