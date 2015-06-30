package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Premissions;
import target.gen.domain.RolePremission;
import target.gen.domain.Roles;
import target.gen.mapper.RolePremissionMapper;

/**
 * Created by Grand on 26.04.2015.
 */
public class RolePremissionService {

    public void insertPremissionRole(Premissions user, Roles group) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            RolePremissionMapper userRoleMapper = sqlSession.getMapper(RolePremissionMapper.class);
            RolePremission userRole = new RolePremission();
            userRole.setRoleId(group.getId());
            userRole.setPremissionId(user.getId());
            userRoleMapper.insert(userRole);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


}
