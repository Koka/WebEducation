import org.apache.ibatis.session.SqlSession;

import java.util.List;

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

    public List<RolePremission> selectByPremission(Premissions premission) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            RolePremissionMapper userRoleMapper = sqlSession.getMapper(RolePremissionMapper.class);
            return userRoleMapper.selectByPremission(premission.getId());
        } finally {
            sqlSession.close();
        }
    }

    public List<RolePremission> selectByRole(Roles role) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            RolePremissionMapper userRoleMapper = sqlSession.getMapper(RolePremissionMapper.class);
            return userRoleMapper.selectByPremission(role.getId());
        } finally {
            sqlSession.close();
        }
    }
}
