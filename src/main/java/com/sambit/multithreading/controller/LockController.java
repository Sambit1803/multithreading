package com.sambit.multithreading.controller;

import com.sambit.multithreading.service.LockedCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LockController {

    @Autowired
    private LockedCounterService counterService;

    @GetMapping("/increment")
    public String incrementCounter(@RequestParam(defaultValue = "Unknown") String name) {
        counterService.increment(name);
        return "Done";
    }

    @GetMapping("/counter")
    public int getCounter() {
        return counterService.getCounter();
    }
}

