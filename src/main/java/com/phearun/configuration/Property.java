package com.phearun.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Property {

	@Value("${hibernate.dialect}")
	public String HIBERNATE_DIALECT;

	@Value("${hibernate.showSql}")
	public String HIBERNATE_SHOW_SQL;

	@Value("${hibernate.hbm2ddl.auto}")
	public String HIBERNATE_HBM2DDL_AUTO;

	@Value("${hibernate.entitymanager.packagesToScan}")
	public String ENTITYMANAGER_PACKAGES_TO_SCAN;

}
