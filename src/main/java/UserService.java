import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Grand on 25.04.2015.
 */
public class UserService {
    public void insertUser(Users user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
            userMapper.insert(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public Users getUserById(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UsersMapper userMapper =(UsersMapper) sqlSession.getMapper(UsersMapper.class);
            return userMapper.selectByPrimaryKey(userId);
        }finally{
            sqlSession.close();
        }
    }

    public List<Users> getAllUsers() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
            return userMapper.getAllUsers();
        }finally{
            sqlSession.close();
        }
    }


    public void deleteUser(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UsersMapper userMapper = sqlSession.getMapper(UsersMapper.class);
            userMapper.deleteByPrimaryKey(userId);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }


}
