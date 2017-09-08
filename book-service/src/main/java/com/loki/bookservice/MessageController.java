package com.loki.bookservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lokesh on 08-09-2017.
 */
@RefreshScope
@RestController
public class MessageController {

    @Value("${message}")
    private String msg;

    @RequestMapping("/message")
    public String getMessage() {
        return msg;
    }

}
