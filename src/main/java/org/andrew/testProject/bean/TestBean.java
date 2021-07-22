package org.andrew.testProject.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Andrew Yang
 * @ClassName TestBean
 * @Description
 * @Package org.andrew.testProject.bean
 * @Create 2021-07-14 11:39
 */
@Data
@TableName("test_bean")
public class TestBean implements Serializable {
    @TableId
    private int id;
    @TableField
    private String name;
    @TableField
    private long status;
}
