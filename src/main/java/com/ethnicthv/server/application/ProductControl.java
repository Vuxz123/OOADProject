package com.ethnicthv.server.application;

import com.ethnicthv.server.business.domain.product.Product;
import com.ethnicthv.server.business.util.SellingStatistic;

import java.util.List;

public class ProductControl {
    public List<Product> search(String searchInput) {
        return null;
    }

    public Product getProduct(long productId) {
        return null;
    }

    public boolean addToCart(long productId, long userId, int amount) {
        return false;
    }

    public SellingStatistic getProductSellingStatistic() {
        return null;
    }
}
