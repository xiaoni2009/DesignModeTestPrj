package cn.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoni on 2019/8/27.
 * Mysql 数据库（具体同事类）
 */
public class MysqlDatabase extends AbstractDatabase {
    private List<String> dataset = new ArrayList<String>();

    public MysqlDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("Mysql 添加数据：" + data);
        this.dataset.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        this.mediator.sync(AbstractDatabase.MYSQL, data); // 数据同步作业交给中介者管理
    }

    public void select() {
        System.out.println("Mysql 查询，数据：" + this.dataset.toString());
    }

}
