package org.andrew.testProject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.andrew.testProject.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author Andrew Yang
 * @ClassName TestMapper
 * @Description
 * @Package org.andrew.testProject.mapper
 * @Create 2021-07-14 11:38
 */
@Mapper
public interface TestMapper extends BaseMapper<TestBean> {
}
