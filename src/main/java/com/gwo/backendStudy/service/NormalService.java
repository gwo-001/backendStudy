package com.gwo.backendStudy.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.logging.Logger;

/**
 * @author Gwo(1552571230 @ qq.com)
 * @Classname NomalService
 * @Description TODO
 * @Date 2022/11/23 8:57
 */
@Service
public class NormalService implements BeanPostProcessor {

    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    private InjectedService injectedService;

    public void normalMethod() {
        logger.info("this is normalMethod");
        injectedService.print(new Date());
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("NormalService-完成初始化");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("NormalService-开始初始化");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
