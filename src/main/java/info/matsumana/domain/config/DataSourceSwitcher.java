package info.matsumana.domain.config;

/**
 * Created by xlliu on 06/03/2017.
 */
public class DataSourceSwitcher {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>() {
        protected String initialValue() {
            return "dataSource1";
        }
    };

    public static String getCurrentContext() {
        return contextHolder.get();
    }

    public static void setCurrentContext(String context) {
        contextHolder.set(context);
    }

    public static void clearContext() {
        contextHolder.remove();
    }

}
