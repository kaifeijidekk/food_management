package pilotkk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pilotkk.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
