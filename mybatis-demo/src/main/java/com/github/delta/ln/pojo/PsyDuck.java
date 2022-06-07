package com.github.delta.ln.pojo;

/**
 * 可达鸭
 */
public class PsyDuck {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 性别：1公，2母
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 描述
     */
    private String remark;

    /**
     * 市场ID，关联toys_market表id
     */
    private Integer marketId;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    @Override
    public String toString() {
        return "PsyDuck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", remark='" + remark + '\'' +
                ", marketId=" + marketId +
                '}';
    }
}
