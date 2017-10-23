package com.example.demo;

import java.io.IOException;

import javax.sql.DataSource;

import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.spring.ProcessEngineFactoryBean;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.SpringBootProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@SpringBootApplication
//EnableProcessApplication
public class CamundaSignavioExampleApplication extends SpringBootProcessApplication{

	public static void main(String[] args) {
		SpringApplication.run(CamundaSignavioExampleApplication.class, args);
	}

	/*

	@Autowired
	ApplicationContext context;
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	DataSourceTransactionManager transactionManager;
	
	@Bean
	public ProcessEngineFactoryBean processEngine(DataSourceTransactionManager transactionManager,
	      ResourceLoader resourceLoader) throws IOException {
	   SpringProcessEngineConfiguration springProcessEngineConfiguration = new SpringProcessEngineConfiguration();
	  // springProcessEngineConfiguration.setProcessEngineName("default");
	   springProcessEngineConfiguration.setTransactionManager(transactionManager);
	   springProcessEngineConfiguration.setDataSource(datasource);
	   springProcessEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
	   springProcessEngineConfiguration.setJobExecutorActivate(true);
	   
	   Resource resource =
		          context.getResource("file:/Users/bhattso/camunda/Invoice-decision.bpmn");
	   Resource[] bpmnResources = {resource};
	   
	   springProcessEngineConfiguration.setDeploymentResources(bpmnResources);
	   ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
	   processEngineFactoryBean.setProcessEngineConfiguration(springProcessEngineConfiguration);
	   return processEngineFactoryBean;
	}
	
	*/

}
