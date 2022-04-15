package com.example.springbootswagger02.controller;

import com.example.springbootswagger02.pojo.Demo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "测试")
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test01")
    @ApiOperation(value = "测试01")
    public String test01(){
        return "hello";
    }

    @GetMapping("/test02")
    @ApiOperation(value = "测试02")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "主键ID",required = true,paramType = "path",defaultValue = "10001")
             , @ApiImplicitParam(name = "name",value = "名称", paramType = "path",defaultValue = "Tom")})
    public String test02(String id,String name){
        return id+"："+name;
    }

    @PutMapping("/test03")
    @ApiOperation(value = "测试03")
    public Demo test03(@RequestBody Demo demo){
        return demo;
    }
}
