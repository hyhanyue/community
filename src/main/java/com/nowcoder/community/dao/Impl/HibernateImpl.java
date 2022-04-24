package com.nowcoder.community.dao.Impl;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

@Repository("hibernate")
public class HibernateImpl implements AlphaDao {
    @Override
    public void select() {
        System.out.printf("Hibernate");
    }
}
