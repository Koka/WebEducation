import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserRoleService {
    public void insertUserRole(Users user, Roles group) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
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

    public List<UserRole> selectByUser(Users User) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            return userRoleMapper.selectByUser(User.getId());
        } finally {
            sqlSession.close();
        }
    }

    public List<UserRole> selectByRole(Roles role) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            return userRoleMapper.selectByUser(role.getId());
        } finally {
            sqlSession.close();
        }
    }
}
