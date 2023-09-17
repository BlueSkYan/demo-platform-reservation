package xyz.blueskyan.demobookingservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.blueskyan.demobookingservice.entity.User;


/**
 * @author Shelumiel Yan
 * @date 2023/1/6
 */
public interface UserService extends IService<User> {

    User getByUsername(String username);
}
