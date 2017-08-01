package cn.xufx.springmvc.controller;
import cn.xufx.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by xufuxiu on 2017/8/1.
 */
@Controller
public class UserController
{
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user() {
        User user = new User();
        user.setFavoriteFrameworks((new String []{"Spring MVC","Struts 2"}));
        ModelAndView modelAndView = new ModelAndView("user", "command", user);//view、key、value
        return modelAndView;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(
            @ModelAttribute("SpringWeb")User user,//model（key=SpringWeb,value=User）
            ModelMap model) //model(key1="webFramework",key2="SpringWeb",key3="org.springframework.validation.BindingResult.SpringWeb")
    {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("address", user.getAddress());
        model.addAttribute("receivePaper", user.isReceivePaper());
        model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
        return "userlist";
    }

    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList()
    {//在每个请求之前被执行
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }
}
