package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/subscribe")
public class SubscriptionController {
    Logger logger = LoggerFactory.getLogger(SubscriptionController.class);

    @PostMapping("/events")
    public void subscribeEven(@RequestParam String event) {
        logger.debug(event);
    }

}
