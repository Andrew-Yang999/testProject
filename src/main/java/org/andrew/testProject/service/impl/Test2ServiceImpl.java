package org.andrew.testProject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.andrew.testProject.bean.TestBean;
import org.andrew.testProject.mapper.TestMapper;
import org.andrew.testProject.service.Test2Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Andrew Yang
 * @ClassName TestServiceImpl
 * @Description
 * @Package org.andrew.testProject.service.impl
 * @Create 2021-07-14 11:38
 */
@Slf4j
@Service("Test2Service")
public class Test2ServiceImpl extends ServiceImpl<TestMapper, TestBean> implements Test2Service {
    @Override
    public List<TestBean> selectList() {
        return baseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void insertC() {
        String salesBillNo = "111111";


        TestBean testBean = new TestBean();
        testBean.setName(salesBillNo);
        testBean.setStatus(3);
        baseMapper.insert(testBean);
        insertD(salesBillNo);
//        throw new RuntimeException();
    }
    public void insertD(String salesBillNo) throws RuntimeException {
        TestBean testBean = new TestBean();
        testBean.setName(salesBillNo);
        testBean.setStatus(4);
        baseMapper.insert(testBean);
        throw new RuntimeException();
    }
}
