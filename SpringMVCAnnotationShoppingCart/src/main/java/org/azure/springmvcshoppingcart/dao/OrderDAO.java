package org.azure.springmvcshoppingcart.dao;

import java.util.List;

import org.azure.springmvcshoppingcart.model.CartInfo;
import org.azure.springmvcshoppingcart.model.OrderDetailInfo;
import org.azure.springmvcshoppingcart.model.OrderInfo;
import org.azure.springmvcshoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}