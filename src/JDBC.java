import com.mysql.cj.jdbc.MysqlDataSource;
//每种数据库都会提供自己的类 DataSourse
import javax.sql.DataSource;

public class JDBC {

    //通过jdbc操作数据库
    //往java105 这个数据库中的 student 表中插入一条记录。
    public static void main(String[] args) {
        //1,创建数据源对象
        DataSource dataSource = new MysqlDataSource();
        //来自于标准库JDBC里面的一个接口
        //                        来自于MySQL驱动包（就是往项目里导入的jar包，如果导入失败，就找不到这个类）
        //用到了 多态


    }
}
