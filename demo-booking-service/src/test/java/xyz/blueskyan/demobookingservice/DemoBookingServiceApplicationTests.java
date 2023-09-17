package xyz.blueskyan.demobookingservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.blueskyan.demobookingservice.entity.User;
import xyz.blueskyan.demobookingservice.mapper.UserMapper;

@SpringBootTest
class DemoBookingServiceApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("张" + i);
            user.setPassword("zhang" + i);
            user.setPhoneNumber("1234567890" + i);
            userMapper.insert(user);
        }

    }

}
