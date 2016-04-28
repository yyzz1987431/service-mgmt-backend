package test.mcs.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.paas.ipaas.mcs.manage.rest.interfaces.IMemoryCacheServiceManager;
import com.alibaba.dubbo.config.annotation.Reference;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/dubbo/consumer/mcs-consumer.xml"})
public class TestMcsDubbo {
  @Reference
  private IMemoryCacheServiceManager iMemoryCacheServiceManager;


  @Test
  public void getFuncList() {
    String fl = iMemoryCacheServiceManager.getFuncList();
    System.out.println(fl);
  }

  @Test
  public void create() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"create\",\"serviceId\":\"108\",\"capacity\":\"128\","
            + "\"haMode\":\"single\",\"serviceName\":\"test\"}";
    System.out.println("----------create-res:\n" + iMemoryCacheServiceManager.create(param));
    System.out.println("----------开通单例，耗时：" + (System.currentTimeMillis() - s));

  }

  @Test
  public void createCluster() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"create\",\"serviceId\":\"106\",\"capacity\":\"128\",\"haMode\":\"cluster\"}";
    System.out.println("----------create-res:\n" + iMemoryCacheServiceManager.create(param));
    System.out.println("----------开通集群，耗时：" + (System.currentTimeMillis() - s));
  }

  @Test
  public void createReplication() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"create\",\"serviceId\":\"106\",\"capacity\":\"32\",\"haMode\":\"replication\"}";
    System.out.println("----------create-res:\n" + iMemoryCacheServiceManager.create(param));
    System.out.println("----------开通集群，耗时：" + (System.currentTimeMillis() - s));
  }

  @Test
  public void createSentinel() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"create\",\"serviceId\":\"106\",\"capacity\":\"32\",\"haMode\":\"sentinel\"}";
    System.out.println("----------create-res:\n" + iMemoryCacheServiceManager.create(param));
    System.out.println("----------开通集群，耗时：" + (System.currentTimeMillis() - s));
  }


  @Test
  public void modify() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"modify\",\"serviceId\":\"104\",\"capacity\":\"152\","
            + "\"haMode\":\"single\",\"serviceName\":\"test\"}";
    System.out.println("----------modify-res:\n" + iMemoryCacheServiceManager.modify(param));
    System.out.println("----------修改单例，耗时：" + (System.currentTimeMillis() - s));

  }

  @Test
  public void modifyCluster() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"7E1080DCE0584729BEA8BBAFE6C6CAC8\",\"applyType\":\"modify\",\"serviceId\":\"MCS003\",\"capacity\":\"10240\",\"haMode\":\"cluster\"}";
    System.out.println("----------modify-res:\n" + iMemoryCacheServiceManager.modify(param));
    System.out.println("----------修改集群，耗时：" + (System.currentTimeMillis() - s));
  }

  @Test
  public void stop() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"22E750F3714D4A078F5C765CA45CC841\",\"applyType\":\"stop\",\"serviceId\":\"MCS001\",\"capacity\":\"152\","
            + "\"haMode\":\"single\",\"serviceName\":\"test\"}";
    System.out.println("----------stop-res:\n" + iMemoryCacheServiceManager.stop(param));
    System.out.println("----------停止单例，耗时：" + (System.currentTimeMillis() - s));

  }

  @Test
  public void stopCluster() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"stop\",\"serviceId\":\"106\",\"capacity\":\"256\",\"haMode\":\"cluster\"}";
    System.out.println("----------stop-res:\n" + iMemoryCacheServiceManager.stop(param));
    System.out.println("----------停止集群，耗时：" + (System.currentTimeMillis() - s));
  }


  @Test
  public void start() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"start\",\"serviceId\":\"104\",\"capacity\":\"152\","
            + "\"haMode\":\"single\",\"serviceName\":\"test\"}";
    System.out.println("----------start-res:\n" + iMemoryCacheServiceManager.start(param));
    System.out.println("----------启动单例，耗时：" + (System.currentTimeMillis() - s));

  }

  @Test
  public void startCluster() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"start\",\"serviceId\":\"106\",\"capacity\":\"256\",\"haMode\":\"cluster\"}";
    System.out.println("----------start-res:\n" + iMemoryCacheServiceManager.start(param));
    System.out.println("----------启动集群，耗时：" + (System.currentTimeMillis() - s));
  }

  @Test
  public void restart() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"restart\",\"serviceId\":\"104\",\"capacity\":\"152\","
            + "\"haMode\":\"single\",\"serviceName\":\"test\"}";
    System.out.println("----------restart-res:\n" + iMemoryCacheServiceManager.restart(param));
    System.out.println("----------重启单例，耗时：" + (System.currentTimeMillis() - s));

  }

  @Test
  public void restartCluster() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"applyType\":\"restart\",\"serviceId\":\"106\",\"capacity\":\"256\",\"haMode\":\"cluster\"}";
    System.out.println("----------restart-res:\n" + iMemoryCacheServiceManager.restart(param));
    System.out.println("----------重启集群，耗时：" + (System.currentTimeMillis() - s));
  }


  @Test
  public void get() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"104\",\"key\":\"a\"}";
    System.out.println("----------get-res:\n" + iMemoryCacheServiceManager.get(param));
    System.out.println("----------获得数据，耗时：" + (System.currentTimeMillis() - s));
    long s1 = System.currentTimeMillis();
    String param1 =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"106\",\"key\":\"a\"}";
    System.out.println("----------get-res:\n" + iMemoryCacheServiceManager.get(param1));
    System.out.println("----------获得数据，耗时：" + (System.currentTimeMillis() - s1));

  }

  @Test
  public void del() {
    long s = System.currentTimeMillis();
    String param =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"104\",\"key\":\"a\"}";
    System.out.println("----------del-res:\n" + iMemoryCacheServiceManager.del(param));
    System.out.println("----------删除数据，耗时：" + (System.currentTimeMillis() - s));
    long s1 = System.currentTimeMillis();
    String param1 =
        "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"106\",\"key\":\"a\"}";
    System.out.println("----------del-res:\n" + iMemoryCacheServiceManager.del(param1));
    System.out.println("----------删除数据，耗时：" + (System.currentTimeMillis() - s1));

  }

  @Test
  public void clean() {
    long s = System.currentTimeMillis();
    String param = "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"104\"}";
    System.out.println("----------clean-res:\n" + iMemoryCacheServiceManager.clean(param));
    System.out.println("----------清空数据，耗时：" + (System.currentTimeMillis() - s));
    long s1 = System.currentTimeMillis();
    String param1 = "{\"userId\":\"FFF49D0D518948D0AB28D7A8EEE25D03\",\"serviceId\":\"106\"}";
    System.out.println("----------clean-res:\n" + iMemoryCacheServiceManager.clean(param1));
    System.out.println("----------清空数据，耗时：" + (System.currentTimeMillis() - s1));

  }

}