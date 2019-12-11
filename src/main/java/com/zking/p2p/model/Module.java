package com.zking.p2p.model;

import lombok.ToString;

import java.util.Objects;

/**
 * @author dong
 * @create 2019-12-1011:33
 */
@ToString
public class Module {
    private String id;
    private String pid;
    private String text;
    private String icon;
    private String url;
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(id, module.id) &&
                Objects.equals(pid, module.pid) &&
                Objects.equals(text, module.text) &&
                Objects.equals(icon, module.icon) &&
                Objects.equals(url, module.url) &&
                Objects.equals(sort, module.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, text, icon, url, sort);
    }
}
