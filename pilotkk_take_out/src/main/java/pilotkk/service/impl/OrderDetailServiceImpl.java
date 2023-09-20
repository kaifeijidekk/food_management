package pilotkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pilotkk.entity.OrderDetail;
import pilotkk.mapper.OrderDetailMapper;
import pilotkk.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}