package org.andrew.testProject.controller;

import org.andrew.testProject.bean.TestBean;
import org.andrew.testProject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Andrew Yang
 * @ClassName TestController
 * @Description
 * @Package org.andrew.testProject.controller
 * @Create 2021-07-14 11:37
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/selectList")
    private List<TestBean> selectList() {
        return testService.selectList();
    }

    @PostMapping("/insertA")
    private void insertA() {
        testService.insertA();
    }
}
