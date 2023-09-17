package xyz.blueskyan.demobookingservice.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.blueskyan.demobookingservice.entity.User;
import xyz.blueskyan.demobookingservice.service.UserService;

import java.util.List;

/**
 * @author Yan Shijie
 */
@RestController
@RequestMapping("/api/booking/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @GetMapping("/getbyusername")
    public User getByUsername(@RequestParam("username") String username){
        return userService.getByUsername(username);
    }
}
