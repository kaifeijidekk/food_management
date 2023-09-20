package pilotkk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pilotkk.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
