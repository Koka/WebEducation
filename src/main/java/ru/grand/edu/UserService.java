package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Users;
import target.gen.mapper.UsersMapper;

/**
 * Created by Grand on 25.04.2015.
 */
public class UserService {
    public void insertUser(Users user) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
            userMapper.insert(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Users getUserById(Integer userId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            UsersMapper userMapper = (UsersMapper) sqlSession.getMapper(UsersMapper.class);
            return userMapper.selectByPrimaryKey(userId);
        } finally {
            sqlSession.close();
        }
    }


    public void deleteUser(Integer userId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
            userMapper.deleteByPrimaryKey(userId);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


}
