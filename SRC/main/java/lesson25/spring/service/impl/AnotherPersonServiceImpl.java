package lesson25.spring.service.impl;

import lesson25.spring.service.PersonService;

//@Primary
//@Component
public class AnotherPersonServiceImpl implements PersonService {

    @Override
    public void print() {
        System.out.println("New person service print");
    }
}
