import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Grand on 25.04.2015.
 */
public class GroupService {
    public void insertGroup(Groups group) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = sqlSession.getMapper(GroupsMapper.class);
            groupMapper.insert(group);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Groups getGroupById(Integer groupId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = (GroupsMapper) sqlSession.getMapper(GroupsMapper.class);
            return groupMapper.selectByPrimaryKey(groupId);
        } finally {
            sqlSession.close();
        }
    }

    public List<Groups> getAllGroups() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = sqlSession.getMapper(GroupsMapper.class);
            return groupMapper.getAllGroups();
        } finally {
            sqlSession.close();
        }
    }


    public void deleteGroup(Integer groupId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = sqlSession.getMapper(GroupsMapper.class);
            groupMapper.deleteByPrimaryKey(groupId);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
}
