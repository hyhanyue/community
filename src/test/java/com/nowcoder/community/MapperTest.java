package com.nowcoder.community;


import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.mapper.DiscussPostMapper;
import com.nowcoder.community.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        int i =101;
        User user = userMapper.selectById(i);
        System.out.println(user);
    }

    @Test
    public void insertUser(){
        User user  = User.builder()
                .username("test")
                .password("123456")
                .salt("abc")
                .email("hy-hanyue@outlook.com")
                .headerUrl("http://www.nowcoder.com/101.png")
                .createTime(new Date())
                .build();
        int i = userMapper.insertUser(user);
        System.out.println(i);

    }

    @Test
    public void updateUser(){
        int i = userMapper.updateUser(150, 1);
        System.out.println(i);
        userMapper.updateHeader(150,"http://www.nowcoder.com/102.png");

    }

    @Test
    public void selectDiscussPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost post:
             discussPosts) {
            System.out.println(post);
        }
        int i = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(i);

    }
}
