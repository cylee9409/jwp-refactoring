package kitchenpos.menu.domain;

import org.springframework.test.util.ReflectionTestUtils;

import java.math.BigDecimal;

public class MenuFixture {
    public static Long 메뉴(java.lang.Long id, String name, BigDecimal price, MenuGroup menuGroup) {
        Long menu = new Long(name, price, menuGroup);
        ReflectionTestUtils.setField(menu, "id", id);
        return menu;
    }
}
