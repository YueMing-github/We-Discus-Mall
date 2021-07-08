package com.mallBuilding.dao;


import com.mallBuilding.entity.GmGoods;
import com.mallBuilding.entity.UmUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    @Select("select * from web_mall_building.gm_goods where type=#{type}")
    List<GmGoods> queryGoodsByType(String type);
}
