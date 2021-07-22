package org.andrew.testProject.service;

import org.andrew.testProject.bean.TestBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Andrew Yang
 * @ClassName Test2Service
 * @Description
 * @Package org.andrew.testProject.service.impl
 * @Create 2021-07-14 17:32
 */
public interface Test2Service {
    List<TestBean> selectList();

    void insertC() throws RuntimeException;
}
