package hacors.kuiff.dubbo;

import hacors.kuiff.Core;
import hacors.kuiff.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hakao
 */
@DubboService
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private Core core;

    @Override
    public String sayName(String name) {
        return "say " + name + core.process();
    }
}
