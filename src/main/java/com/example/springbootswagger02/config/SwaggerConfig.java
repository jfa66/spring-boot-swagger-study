package com.example.springbootswagger02.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootConfiguration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger.enable}")
    private boolean swaggerEnable;

    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //设置是否开启
        docket.enable(swaggerEnable?true:false);
        //设置分组
        docket.groupName("demo");
        //...
        //设置api信息
        docket.apiInfo(apiInfo());
        //设置扫描范围
        docket.select().paths(PathSelectors.any()).build();
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger学习接口")
                .description("Swagger学习接口")
                .termsOfServiceUrl("xxx")
                .license("Swagger学习接口Licence Version 1.0")
                .licenseUrl("#")
                .version("1.0")
                .build();
    }
}
