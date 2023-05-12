package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.ProductControl;
import com.ethnicthv.server.business.domain.product.Product;
import com.ethnicthv.server.business.util.SellingStatistic;

import java.util.List;

public class ViewProductForm {
    private final ProductControl productControl;

    public ViewProductForm(ProductControl productControl) {
        this.productControl = productControl;
    }

    public void runSearch() {
        String searchInput = "";
        //TODO: get input

        List<Product> res = productControl.search(searchInput);
        //TODO: return res
    }

    public void runViewProduct() {
        long productId = 0;
        //TODO: get input

        Product res = productControl.getProduct(productId);
        //TODO: return res;
    }

    public void runAddToCart() {
        long productId = 0;
        long userId = 0;
        int amount = 0;
        //TODO: get input

        if (productControl.addToCart(productId, userId, amount)) {
            //TODO: success
        } else {
            //TODO: product exist
        }
    }

    public void runViewSellingStatistic() {
        SellingStatistic statistic = productControl.getProductSellingStatistic();
        //TODO: return statistic
    }
}
