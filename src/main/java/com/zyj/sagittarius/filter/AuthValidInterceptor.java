package com.zyj.sagittarius.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthValidInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthValidInterceptor.class);

    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object arg2) throws Exception {
		/*String authStr = request.getHeader("Authorization");
		try {
			String user = Constants.getPropertyByKey("basic.auth.username");
			String pwd = Constants.getPropertyByKey("basic.auth.password");
			if(!Constants.isNotEmpty(user,pwd)){
				logger.warn("Lack config of auth !!!");
				return true;
			}
			if(authStr!=null && !"".equals(authStr)){
				authStr = authStr.replace("Basic ", "");
				String[] params = new String(Base64.decodeBase64((authStr))).split(":");
				if(params!=null && params.length==2 && user.equals(params[0])
						&& pwd.equals(params[1])){
					return true;
				}
			}
		} catch (Exception e) {
			logger.error("Failed to parse auth",e);
		}
		response.setContentType("application/json");
		response.sendError(405, "No authenrity to access this path");
		return false;*/
        return true;
    }
}
