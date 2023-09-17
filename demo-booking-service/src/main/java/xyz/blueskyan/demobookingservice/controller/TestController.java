package xyz.blueskyan.demobookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "demo-booking-service";
    }
}
