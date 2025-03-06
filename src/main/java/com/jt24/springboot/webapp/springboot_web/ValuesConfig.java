package com.jt24.springboot.webapp.springboot_web;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Configuration;

@PropertySources({
        @PropertySource(value = "classpath:values.properties", encoding = "UTF-8")

})
@Configuration
public class ValuesConfig {

}
