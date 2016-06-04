package cn.nullah.platform.dao.anno;

/* 
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO
 * 
 * @Project : platform-dao
 * @Author : developer
 * @Date : 2015年12月27日
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
	String value() default DataSource.MAIN;
	
	public static String MAIN = "DS_MAIN";

	public static String READ = "DS_READ";

	public static String WRITER = "DS_WRITER";
	
	public static String REPORT = "DS_REPORT";

}
