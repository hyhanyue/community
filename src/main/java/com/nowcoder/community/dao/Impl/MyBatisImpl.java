package com.nowcoder.community.dao.Impl;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.annotation.Priority;

@Repository
@Primary
public class MyBatisImpl implements AlphaDao {
    @Override
    public void select() {
        System.out.println("Mybatis");
    }
}
