package com.penghk.learn.domain;

/**
 * @author penggk
 */
public class Menu {
    /**
     * 菜单本身id
     */
    private Integer id;
    /**
     * 父菜单id
     */
    private Integer pId;
    /**
     * 菜单名
     */
    private String name;
    /**
     * 菜单导向的url
     */
    private String url;

    public Menu() {
    }

    public Menu(Integer id, Integer pId, String name, String url) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
