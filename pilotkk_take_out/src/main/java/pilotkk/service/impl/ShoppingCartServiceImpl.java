package pilotkk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pilotkk.entity.ShoppingCart;
import pilotkk.mapper.ShoppingCartMapper;
import pilotkk.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
