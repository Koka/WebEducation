import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserGroupService {
    public void insertUserGroup(Users user, Groups group) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserGroupMapper userGroupMapper = sqlSession.getMapper(UserGroupMapper.class);
            UserGroup userGroup = new UserGroup();
            userGroup.setGroupId(group.getId());
            userGroup.setUserId(user.getId());
            userGroupMapper.insert(userGroup);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public List<UserGroup> selectByUser(Users user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserGroupMapper userGroupMapper = sqlSession.getMapper(UserGroupMapper.class);
            return userGroupMapper.selectByUser(user.getId());
        } finally {
            sqlSession.close();
        }
    }

    public List<UserGroup> selectByGroup(Groups group) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserGroupMapper userGroupMapper = sqlSession.getMapper(UserGroupMapper.class);
            return userGroupMapper.selectByUser(group.getId());
        } finally {
            sqlSession.close();
        }
    }
}
