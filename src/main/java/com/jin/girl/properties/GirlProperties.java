package com.jin.girl.properties;

/**
 * Created by jinyao on 2017/1/12.
 */
//@Component
//@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;

    private String age;

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
        return "GirlProperties{" +
                "cupSize='" + cupSize + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
