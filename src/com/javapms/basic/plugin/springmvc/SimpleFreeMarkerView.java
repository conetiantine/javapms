package com.javapms.basic.plugin.springmvc;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContextException;
import org.springframework.web.servlet.view.AbstractTemplateView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class SimpleFreeMarkerView
        extends AbstractTemplateView {
    public static final String CONTEXT_PATH = "base";
    private Configuration configuration;

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    protected Configuration getConfiguration() {
        return this.configuration;
    }

    protected FreeMarkerConfig autodetectConfiguration()
            throws BeansException {
        try {
            return
                    (FreeMarkerConfig) BeanFactoryUtils.beanOfTypeIncludingAncestors(getApplicationContext(),
                            FreeMarkerConfig.class, true, false);
        } catch (NoSuchBeanDefinitionException ex) {
            throw new ApplicationContextException(
                    "Must define a single FreeMarkerConfig bean in this web application context (may be inherited): FreeMarkerConfigurer is the usual implementation. This bean may be given any name.",

                    ex);
        }
    }

    protected void initApplicationContext()
            throws BeansException {
        super.initApplicationContext();
        if (getConfiguration() == null) {
            FreeMarkerConfig config = autodetectConfiguration();
            setConfiguration(config.getConfiguration());
        }
        checkTemplate();
    }

    protected void checkTemplate()
            throws ApplicationContextException {
        try {
            getConfiguration().getTemplate(getUrl());
        } catch (ParseException ex) {
            throw new ApplicationContextException(
                    "Failed to parse FreeMarker template for URL [" + getUrl() +
                            "]", ex);
        } catch (IOException ex) {
            throw new ApplicationContextException(
                    "Could not load FreeMarker template for URL [" + getUrl() +
                            "]", ex);
        }
    }

    protected void renderMergedTemplateModel(Map model, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        model.put("base", request.getContextPath());
        getConfiguration().getTemplate(getUrl()).process(model,
                response.getWriter());
    }
}



/* Location:           F:\jsp源码\门户管理系统\javapms-1.2-beta\ROOT\WEB-INF\classes\

 * Qualified Name:     com.javapms.basic.plugin.springmvc.SimpleFreeMarkerView

 * JD-Core Version:    0.7.0.1

 */