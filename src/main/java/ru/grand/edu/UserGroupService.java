package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Groups;
import target.gen.domain.UserGroup;
import target.gen.domain.Users;
import target.gen.mapper.UserGroupMapper;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserGroupService {
    public void insertUserGroup(Users user, Groups group) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
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

}
