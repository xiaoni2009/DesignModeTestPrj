package cn.chay.datasource;

/**
 * @author Chay
 * @date 2020/4/7 14:07
 */
public class DataSourceContexHolder {
    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    /**
     * 设置数据源
     *
     * @param db
     */
    public static void setDataSource(String db) {
        contextHolder.set(db);
    }

    /**
     * 取得当前数据源
     *
     * @return
     */
    public static String getDataSource() {
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear() {
        contextHolder.remove();
    }
}
