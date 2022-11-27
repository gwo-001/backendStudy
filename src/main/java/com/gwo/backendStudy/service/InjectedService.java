package com.gwo.backendStudy.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author Gwo(1552571230 @ qq.com)
 * @Classname InjectedService
 * @Description TODO
 * @Date 2022/11/24 8:53
 */
@Service
public class InjectedService {

    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    public void print(Date dateTime) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        logger.info(sdf.format(dateTime) + this.getClass().getSimpleName());
    }

}
