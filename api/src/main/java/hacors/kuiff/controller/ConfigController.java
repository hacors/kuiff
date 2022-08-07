package hacors.kuiff.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author hakao
 */
@Controller
@RequestMapping("config")
public class ConfigController {

    @Value("${test}")
    private String useLocalCache;

    @RequestMapping(value = "get", method = GET)
    @ResponseBody
    public String get() {
        return useLocalCache;
    }
}