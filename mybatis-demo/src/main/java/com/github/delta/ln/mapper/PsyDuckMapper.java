package com.github.delta.ln.mapper;

import com.github.delta.ln.pojo.PsyDuck;

/**
 * 数据库操作
 */
public interface PsyDuckMapper {

  int insert(PsyDuck duck);

  PsyDuck getPsyDuckById(Integer id);

  PsyDuck selectByExample(PsyDuck duck);
}
