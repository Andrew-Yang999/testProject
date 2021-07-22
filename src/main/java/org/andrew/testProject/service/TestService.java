package org.andrew.testProject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.andrew.testProject.bean.TestBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Andrew Yang
 * @ClassName TestService
 * @Description
 * @Package org.andrew.testProject.service
 * @Create 2021-07-14 11:38
 */
public interface TestService extends IService<TestBean> {

    List<TestBean> selectList();

    @Transactional
    void insertA();
}
