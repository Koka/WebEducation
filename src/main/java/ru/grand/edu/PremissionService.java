package ru.grand.edu;

import org.apache.ibatis.session.SqlSession;
import target.gen.domain.Premissions;
import target.gen.mapper.PremissionsMapper;

/**
 * Created by Grand on 25.04.2015.
 */
public class PremissionService {
    public void insertPremission(Premissions premission) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            PremissionsMapper premissionMapper = sqlSession.getMapper(PremissionsMapper.class);
            premissionMapper.insert(premission);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    public Premissions getPremissionById(Integer premissionId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            PremissionsMapper premissionMapper = (PremissionsMapper) sqlSession.getMapper(PremissionsMapper.class);
            return premissionMapper.selectByPrimaryKey(premissionId);
        } finally {
            sqlSession.close();
        }
    }


    public void deletePremission(Integer premissionId) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
        try {
            PremissionsMapper premissionMapper = sqlSession.getMapper(PremissionsMapper.class);
            premissionMapper.deleteByPrimaryKey(premissionId);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
}
