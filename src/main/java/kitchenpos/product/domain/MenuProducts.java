package kitchenpos.product.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MenuProducts {

    private List<MenuProduct> menuProducts = new ArrayList<>();

    public MenuProducts addList(List<MenuProduct> menuProductList) {
        menuProductList.stream()
                .forEach(menuProducts::add);

        return this;
    }

    public BigDecimal getMenuProductPriceSum() {
        int productsPriceSum = menuProducts.stream()
                .mapToInt(menuProduct -> menuProduct.getMenuProductPrice().intValue())
                .sum();
        return new BigDecimal(productsPriceSum);
    }

    public List<MenuProduct> getMenuProducts() {
        return menuProducts;
    }
}
