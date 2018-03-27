package com.jd.controller;

import com.jd.domain.Greeting;
import com.jd.domain.Request;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/requestGet")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


    @RequestMapping(value="/greeting2")
    public String Greeting2(@RequestParam(value="name",defaultValue="meiyou") String name){
        return name;
    }

    @RequestMapping("/greeting3")
    public List<Greeting> greeting3(@RequestParam(value="name", defaultValue="World") String name) {
        List<Greeting> list=new ArrayList<Greeting>();
        list.add(new Greeting(counter.incrementAndGet(),
                String.format(template, name)));
        list.add(new Greeting(counter.incrementAndGet(),
                String.format(template, name)));
        return list;
    }

    @RequestMapping(value="requestPost",method = {RequestMethod.POST})
    public Greeting greeting(Request request){

        return new Greeting(counter.incrementAndGet(),
                String.format(template, request.getName()));
    }
}
