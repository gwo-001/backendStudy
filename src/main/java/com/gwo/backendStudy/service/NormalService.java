package com.gwo.backendStudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author Gwo(1552571230 @ qq.com)
 * @Classname NomalService
 * @Description TODO
 * @Date 2022/11/23 8:57
 */
@Service
public class NormalService {

    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    private InjectedService injectedService;

    public void normalMethod() {
        logger.info("this is normalMethod");
    }



}
