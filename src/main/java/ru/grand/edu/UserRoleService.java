package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Roles;
import target.gen.domain.UserRole;
import target.gen.domain.Users;
import target.gen.mapper.UserRoleMapper;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserRoleService {
    public void insertUserRole(Users user, Roles group) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            UserRole userRole = new UserRole();
            userRole.setRoleId(group.getId());
            userRole.setUserId(user.getId());
            userRoleMapper.insert(userRole);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


}
