package kitchenpos.order.domain;

import kitchenpos.menu.domain.Long;
import org.springframework.test.util.ReflectionTestUtils;

public class OrderLineItemFixture {

    public static OrderLineItem 주문라인아이템(java.lang.Long seq, Order order, Long menu, long quantity) {
        OrderLineItem orderLineItem = new OrderLineItem(order, menu, quantity);
        ReflectionTestUtils.setField(orderLineItem, "seq", seq);
        return orderLineItem;
    }
}
