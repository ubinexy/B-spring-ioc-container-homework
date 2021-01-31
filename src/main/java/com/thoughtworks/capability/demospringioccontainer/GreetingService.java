package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingService {

    public GreetingService() {
        System.out.println("Creating greeting service.");
    }

    String sayHi() {
        return "hello world";
    }
}
