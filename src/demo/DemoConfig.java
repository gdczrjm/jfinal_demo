package demo;

import com.jfinal.config.*;

public class DemoConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
		//me.setViewType(ViewType.JSP);
	}
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		//me.add("/user",UserController.class, "/path");
	}
	public void configPlugin(Plugins me) {}
	
	public void configInterceptor(Interceptors me) {}
	
	public void configHandler(Handlers me) {}
}