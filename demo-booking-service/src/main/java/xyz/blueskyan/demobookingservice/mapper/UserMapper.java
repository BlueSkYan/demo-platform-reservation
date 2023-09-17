package xyz.blueskyan.demobookingservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.blueskyan.demobookingservice.entity.User;

/**
 * @author Yan Shijie
 * @date
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
