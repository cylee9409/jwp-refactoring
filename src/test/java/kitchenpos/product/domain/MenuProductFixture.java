package kitchenpos.product.domain;

import kitchenpos.product.domain.MenuProduct;
import kitchenpos.product.domain.Product;
import org.springframework.test.util.ReflectionTestUtils;

public class MenuProductFixture {

    public static MenuProduct 메뉴상품(java.lang.Long seq, Long menu, Product product, long quantity) {
        MenuProduct menuProduct = new MenuProduct(menu, product, quantity);
        ReflectionTestUtils.setField(menuProduct, "seq", seq);
        return menuProduct;
    }

}
