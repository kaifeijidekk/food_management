package pilotkk.dto;

import pilotkk.entity.Setmeal;
import pilotkk.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
