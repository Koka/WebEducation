import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Grand on 29.06.2015.
 */
public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory SQL_SESSION_FACTORY = null;

    public static SqlSessionFactory getSqlSessionFactory() {
        if(SQL_SESSION_FACTORY==null){
            Reader reader = null;
            try {
                Class.forName("org.postgresql.Driver");
                reader = Resources.getResourceAsReader("mybatis-config.xml");
                SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader, "development");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return SQL_SESSION_FACTORY;
    }
}
