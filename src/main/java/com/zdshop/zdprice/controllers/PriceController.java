package com.zdshop.zdprice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/prices")
public class PriceController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<String> find (@PathVariable String id) {
        logger.info("looking price with id : " + id);
        return Mono.just(
                "service ok");
    }
}
