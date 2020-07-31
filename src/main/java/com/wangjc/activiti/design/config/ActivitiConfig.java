package com.wangjc.activiti.design.config;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * 设计器的配置
 * @author wangjc
 * @title: ActivitiConfig
 * @projectName wangjc-activiti-design
 * @description: TODO
 * @date 2020/7/3110:57
 */
@Configuration
public class ActivitiConfig  implements ProcessEngineConfigurationConfigurer {


    @Override
    public void configure(SpringProcessEngineConfiguration springProcessEngineConfiguration) {
        // 文字样式
        springProcessEngineConfiguration.setActivityFontName("宋体");
        springProcessEngineConfiguration.setLabelFontName("宋体");
        springProcessEngineConfiguration.setAnnotationFontName("宋体");

        springProcessEngineConfiguration.setDbIdentityUsed(false);//是否使用用户自带组织结构表
        springProcessEngineConfiguration.setDatabaseSchemaUpdate("true");//架构更新：是否自动创建表
        springProcessEngineConfiguration.setDatabaseType("mysql");//数据库类型
    }
}
