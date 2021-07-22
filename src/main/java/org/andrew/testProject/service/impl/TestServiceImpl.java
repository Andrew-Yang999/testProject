package org.andrew.testProject.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.andrew.testProject.bean.TestBean;
import org.andrew.testProject.mapper.TestMapper;
import org.andrew.testProject.service.Test2Service;
import org.andrew.testProject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author Andrew Yang
 * @ClassName TestServiceImpl
 * @Description
 * @Package org.andrew.testProject.service.impl
 * @Create 2021-07-14 11:38
 */
@Slf4j
@Service("TestService")
public class TestServiceImpl extends ServiceImpl<TestMapper, TestBean> implements TestService {
    @Autowired
    private Test2Service test2Service;
    @Override
    public List<TestBean> selectList() {
        return baseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    @Transactional
    public void insertA() {
        String salesBillNo = "111111";


        TestBean testBean = new TestBean();
        testBean.setName(salesBillNo);
        testBean.setStatus(1);
        baseMapper.insert(testBean);
        test2Service.insertC();
//        throw new RuntimeException();
    }

    public void insertB(String salesBillNo) throws RuntimeException {
        TestBean testBean = new TestBean();
        testBean.setName(salesBillNo);
        testBean.setStatus(2);
        baseMapper.insert(testBean);
        throw new RuntimeException();
    }
}
