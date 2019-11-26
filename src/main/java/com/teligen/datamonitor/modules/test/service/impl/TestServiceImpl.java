package com.teligen.datamonitor.modules.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.teligen.datamonitor.modules.test.dao.TestDao;
import com.teligen.datamonitor.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Map<String, Object>> getList() {
        PageHelper.startPage(0,10);
        return testDao.getList();
    }
}
