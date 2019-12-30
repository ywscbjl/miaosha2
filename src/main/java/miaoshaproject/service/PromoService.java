package miaoshaproject.service;

import miaoshaproject.service.model.PromoModel;

public interface PromoService {
    //根据itemId获取正在进行的秒杀
    PromoModel getPromoByItemId(Integer itemId);
    //活动发布
    void publishPromo(Integer promoId);
    //生成秒杀用的令牌
    String generateSecondKillToken(Integer promoId,Integer itemId,Integer userId);
}
