package hacors.kuifer.dubbo;

import hacors.kuifer.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hakao
 */
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayName(String name) {
        return null;
    }
}
