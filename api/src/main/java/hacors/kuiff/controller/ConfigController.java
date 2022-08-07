package hacors.kuiff.controller;

import hacors.kuiff.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author hakao
 */
@Controller
@RequestMapping("test")
public class ConfigController {

    @Value("${test}")
    private String useLocalCache;

    @Resource
    private DemoService demoService;

    @RequestMapping(value = "config", method = GET)
    @ResponseBody
    public String config() {
        return useLocalCache;
    }

    @RequestMapping(value = "dubbo", method = GET)
    @ResponseBody
    public String dubbo() {
        return demoService.sayName("haha");
    }
}