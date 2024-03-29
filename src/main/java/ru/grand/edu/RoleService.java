package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Roles;
import target.gen.mapper.RolesMapper;

/**
 * Created by Grand on 25.04.2015.
 */
public class RoleService {
    public void insertRole(Roles role) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            RolesMapper roleMapper = sqlSession.getMapper(RolesMapper.class);
            roleMapper.insert(role);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Roles getRoleById(Integer roleId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            RolesMapper roleMapper = (RolesMapper) sqlSession.getMapper(RolesMapper.class);
            return roleMapper.selectByPrimaryKey(roleId);
        } finally {
            sqlSession.close();
        }
    }



    public void deleteRole(Integer roleId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            RolesMapper roleMapper = sqlSession.getMapper(RolesMapper.class);
            roleMapper.deleteByPrimaryKey(roleId);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }


}
