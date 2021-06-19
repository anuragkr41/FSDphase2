package com.learnersAcademy.generators;


import org.hibernate.type.Type;

import com.learnersAcademy.models.Classes;

import java.io.Serializable;
import java.util.Properties;

import javax.servlet.RequestDispatcher;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;

public class StringPrefixSequenceIdGeneratorTeachers extends SequenceStyleGenerator {

	
	private String valuePrefix;
	private String numberFormat;
	private static String val="TCH_";

	public static final String VALUE_PREFIX_PARAMETER ="valuePrefix";
	public static final String VALUE_PREFIX_DEFAULT = val;
	
	public static final String NUMBER_FORMAT_PARAMETER="numberFormat";
	public static final String NUMBER_FORMAT_DEFAULT = "%d";
	
	@Override
    public Serializable generate(SharedSessionContractImplementor session,
            Object object) throws HibernateException {
        return valuePrefix + String.format(numberFormat, super.generate(session, object));
    }
	
	@Override
	 public void configure(Type type, Properties params,
	            ServiceRegistry serviceRegistry) throws MappingException {
	        super.configure(LongType.INSTANCE, params, serviceRegistry);
	        valuePrefix = ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER,
	                params, VALUE_PREFIX_DEFAULT);
	        numberFormat = ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER,
	                params, NUMBER_FORMAT_DEFAULT);
	    }
	
}
