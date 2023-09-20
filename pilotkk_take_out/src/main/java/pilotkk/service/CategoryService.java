package pilotkk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pilotkk.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
