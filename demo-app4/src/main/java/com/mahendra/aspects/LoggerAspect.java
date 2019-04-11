package com.mahendra.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // AspectJ Framework
@Component // Let Spring recognise this as a BEAN
public class LoggerAspect {
	
	private static Logger log = Logger.getGlobal();
	
	//AspectJ Pointcut Expression
	@After("execution (* com.mahendra.repos.*.*(..) )") 
	// Any Method with Any return type and Any number of Arguments inside ANY class
	// Inside package "com.mahendra.repos"
	public void logIt(JoinPoint pt) {
		log.info(pt.getTarget().getClass()+" : "+pt.getSignature().getName());
	}
	
}
