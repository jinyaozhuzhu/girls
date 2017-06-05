package com.jin.girl.entity;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by jinyao on 2017/1/12.
 */
//@Entity
public class Girl {

    //    @Id
//    @GeneratedValue
    private Integer id;

    @NotNull(message = "罩杯必传")
    private String cupSize;

    @Min(value = 18, message = "未成年少女")
    private String age;

    public Girl() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
