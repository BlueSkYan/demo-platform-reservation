package xyz.blueskyan.demobookingservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.blueskyan.demobookingservice.entity.User;
import xyz.blueskyan.demobookingservice.mapper.UserMapper;
import xyz.blueskyan.demobookingservice.service.UserService;

/**
 * @author Yan Shijie
 * @date 2023/1/6
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User getByUsername(String username) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",username);
        return this.getOne(userQueryWrapper);
    }
}
