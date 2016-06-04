package cn.nullah.platform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlatformSpringContext {
	private static final String SPRING_CFG_PATH="spring/platform-base.xml";
	ApplicationContext ctx;
	public static void main(String[] args) {
		PlatformSpringContext platformContext=new PlatformSpringContext();
		platformContext.init();
	}
	
	public void init(){
		ctx=new ClassPathXmlApplicationContext(SPRING_CFG_PATH);
	}
}
