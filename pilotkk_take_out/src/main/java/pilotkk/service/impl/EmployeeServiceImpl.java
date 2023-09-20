package pilotkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pilotkk.entity.Employee;
import pilotkk.mapper.EmployeeMapper;
import pilotkk.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
