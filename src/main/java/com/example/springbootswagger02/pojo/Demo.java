package com.example.springbootswagger02.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "测试类")
public class Demo {

    @ApiModelProperty(value = "主键", example = "10001", required = true, dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "名字",example = "tom")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
