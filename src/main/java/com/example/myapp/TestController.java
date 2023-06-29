package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class TestController {
    @GetMapping("/test")
    public String getTest(){
        return "Get metodin endpoint";
    }

    @GetMapping("/test/first")
        public String getTestFirst(){
        return "Get metodin endpoint first";
    }

    @GetMapping("/test/second")
        public String getTestSecond(){
        return "Get metodin endpoint second";
    }

        @GetMapping("/test/second/{fn}")
        public String getTestSecondFn(@PathVariable(value = "fn") String fn){
        return "Terve "+fn;
    }
}
