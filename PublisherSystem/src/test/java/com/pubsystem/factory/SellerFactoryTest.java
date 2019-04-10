package com.pubsystem.factory;

import com.pubsystem.domain.Seller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerFactoryTest {

    @Test
    public void getSeller() {

        String name = "Tolkien";
        Seller s = SellerFactory.getSeller(name);
        System.out.println(s);
        Assert.assertNotNull(s.getSelID());
    }
}
