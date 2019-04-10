package com.pubsystem.factory;

import com.pubsystem.domain.Seller;
import com.pubsystem.util.Misc;

public class SellerFactory {

    public static Seller getSeller(String selName) {
        return new Seller.Builder().selID(Misc.generateId())
                .selName(selName)
                .build();
    }
}
