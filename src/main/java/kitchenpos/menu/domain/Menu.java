package kitchenpos.menu.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Menu {

    private static final String INVALID_PRICE = "유효하지 않은 가격입니다.";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private java.lang.Long id;

    @Column(unique = true)
    private String name;

    private BigDecimal price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "menu_group_id")
    private MenuGroup menuGroup;

    public Menu() {

    }

    public Menu(String name, BigDecimal price, MenuGroup menuGroup) {
        validatePriceValue(price);
        this.name = name;
        this.price = price;
        this.menuGroup = menuGroup;
    }

    private void validatePriceValue(BigDecimal price) {
        if (Objects.isNull(price) || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(INVALID_PRICE);
        }
    }

    public java.lang.Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public MenuGroup getMenuGroup() {
        return menuGroup;
    }

}
