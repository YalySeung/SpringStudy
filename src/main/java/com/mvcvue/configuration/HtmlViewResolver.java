package com.mvcvue.configuration;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Locale;

public class HtmlViewResolver extends InternalResourceViewResolver{

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        AbstractUrlBasedView view = buildView(viewName);
        View viewObj = (View) getApplicationContext().getAutowireCapableBeanFactory().initializeBean(view, viewName);
        if (viewObj instanceof JstlView) {
            JstlView jv = (JstlView) viewObj;
        }
        return viewObj;
    }
}
