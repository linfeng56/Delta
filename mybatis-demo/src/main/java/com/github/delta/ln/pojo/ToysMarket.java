package com.github.delta.ln.pojo;

public class ToysMarket {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToysMarket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
