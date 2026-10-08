package com.MyOrg;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        return Map.of("a", a, "b", b, "sum", a + b);
    }
}
