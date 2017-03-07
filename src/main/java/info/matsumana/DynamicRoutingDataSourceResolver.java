package info.matsumana;

import info.matsumana.domain.config.DataSourceSwitcher;
import org.joda.time.DateTime;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;
import java.util.stream.Collectors;

public class DynamicRoutingDataSourceResolver extends AbstractRoutingDataSource implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    protected Object determineCurrentLookupKey() {
        // システム時刻が偶数秒ならdataSource1に接続する
//        DateTime dt = new DateTime();
//        int sec = Integer.parseInt(dt.toString("s"));
//        if (sec % 2 == 0) {
//            return "dataSource1";
//        } else {
//            return "dataSource2";
//        }
        return DataSourceSwitcher.getCurrentContext();
    }

    @Override
    public void afterPropertiesSet() {
        Map<String, DataSource> dataSources = context.getBeansOfType(javax.sql.DataSource.class);

        Map<Object, Object> result = dataSources.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals("dataSource"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        this.setTargetDataSources(result);
        super.afterPropertiesSet();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}