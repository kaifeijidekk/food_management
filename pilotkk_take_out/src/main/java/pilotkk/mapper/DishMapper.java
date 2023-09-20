package pilotkk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pilotkk.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
