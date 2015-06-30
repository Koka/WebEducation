package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Groups;
import target.gen.mapper.GroupsMapper;

/**
 * Created by Grand on 25.04.2015.
 */
public class GroupService {
    public void insertGroup(Groups group) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = sqlSession.getMapper(GroupsMapper.class);
            groupMapper.insert(group);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Groups getGroupById(Integer groupId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = (GroupsMapper) sqlSession.getMapper(GroupsMapper.class);
            return groupMapper.selectByPrimaryKey(groupId);
        } finally {
            sqlSession.close();
        }
    }


    public void deleteGroup(Integer groupId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            GroupsMapper groupMapper = sqlSession.getMapper(GroupsMapper.class);
            groupMapper.deleteByPrimaryKey(groupId);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
}
