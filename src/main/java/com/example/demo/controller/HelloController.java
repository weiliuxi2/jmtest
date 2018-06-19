/******************************************************************************
* Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
* All Rights Reserved.
* 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
* 复制、修改或发布本软件.
*****************************************************************************/

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FIXME
 *
 * @author  weiliuxi
 * @since   jdk1.8
 * @version 2018年6月19日 weiliuxi
 */
@RestController(value = "/hello")
public class HelloController {
    
    
    @GetMapping
    public String hello() {
        
        return "20180619";
    }
    
    
    
}
