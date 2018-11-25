package com.example.design.pattern.design_pattern.factory.facade;

/**
 * Created by geely
 * 外观模式（门面模式）
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
