package com.github.delta.ln.mapper;

import com.github.delta.ln.pojo.ToysMarket;

public interface ToysMarketMapper {

    int insert(ToysMarket market);

    ToysMarket getToysMarketById(Integer id);
}
