package com.login.login_form.auth;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class FormAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)
        throws IOException, ServletException {
        String errorMsg = "Invalid";

        setDefaultFailureUrl("/login?error=true&exception="+errorMsg);
        super.onAuthenticationFailure(request,response, exception);
    }

}
