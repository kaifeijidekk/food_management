package pilotkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pilotkk.entity.User;
import pilotkk.mapper.UserMapper;
import pilotkk.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
