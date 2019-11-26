package com.teligen.datamonitor.modules.test.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
//@Repository
public interface TestDao {
    List<Map<String,Object>> getList();
}
