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


            /*InitialContext cxt = null;
            try {
                cxt = new InitialContext();
            } catch (NamingException e) {
                e.printStackTrace();
            }
            if ( cxt == null ) {
                System.err.println("no context");
            }

            DataSource ds = null;
            try {
                ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/test" );
            } catch (NamingException e) {
                e.printStackTrace();
            }

            if ( ds == null ) {
                System.err.println("no db");
            }*/

        }
        return SQL_SESSION_FACTORY;
    }
}
