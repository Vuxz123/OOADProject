package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.CheckoutControl;
import com.ethnicthv.server.application.OrderStatusControl;
import com.ethnicthv.server.business.domain.order.OrderDetail;
import com.ethnicthv.server.business.util.OrderInfo;

import java.util.List;

public class OrderMakingForm {
    private final CheckoutControl checkoutControl;
    private final OrderStatusControl orderStatusControl;

    public OrderMakingForm(CheckoutControl checkoutControl, OrderStatusControl orderStatusControl) {
        this.checkoutControl = checkoutControl;
        this.orderStatusControl = orderStatusControl;
    }

    public void run() {
        List<Integer> productList = null;
        long userId = 0;
        //TODO: get input
        if(this.validate(productList, userId)) {
            if(this.confirmOrder()) {
                OrderInfo info = new OrderInfo(productList, userId);
                checkoutControl.placingOrder(info);
            }
        }

    }

    public void runDeleteOrder() {

    }

    public void runSaveOrder() {

    }

    public void runViewOrder() {
        long userId = 0;
        //TODO: get data

        List<OrderDetail> orderDetailList = checkoutControl.getOrders(userId);
    }

    public void runConfirmOrderDelivery() {
        long userId = 0;
        long orderId = 0;
        //TODO: get data

        orderStatusControl.confirmOrder(userId, orderId);
    }

    private boolean confirmOrder() {
        return true;
    }

    private boolean validate(List<Integer> productList, long userId) {
        return true;
    }
}
