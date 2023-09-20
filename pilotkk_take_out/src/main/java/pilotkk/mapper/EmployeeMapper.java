package pilotkk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import pilotkk.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
