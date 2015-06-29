import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Grand on 29.06.2015.
 */
public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory SQL_SESSION_FACTORY = null;

    public static SqlSessionFactory getSqlSessionFactory(){
        if(SQL_SESSION_FACTORY==null){
            Reader reader = null;
            try {
                reader = Resources.getResourceAsReader("/mybatis-config.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader);
        }
        return SQL_SESSION_FACTORY;
    }
}
