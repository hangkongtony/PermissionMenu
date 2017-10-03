package com.penghk.learn.controller;

import com.penghk.learn.domain.User;
import com.penghk.learn.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 欢迎界面控制器
 * @author penghk
 */
@Controller
public class WelcomeController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/login")
    public String Login(){
        return "welcome/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Model model , User user , HttpSession session, HttpServletRequest request, HttpServletResponse response){
        User user1 = userService.getUserByName(user.getLoginName());
//        if(null!=user1&& StringUtils.isNotBlank(user1.getLoginName())){
//            if(!StringUtils.equals(user.getPassword(),user1.getPassword())){
//                model.addAttribute("msg" , "密码不正确！");
//                return "welcome/login";
//            }
//        }else {
//            model.addAttribute("msg", "登录名不正确！");
//            return "welcome/login";
//        }
        session.setAttribute("loginUser" ,user1.getLoginName());
        session.setMaxInactiveInterval(30*60);//设置session时长 second
        model.addAttribute("roleId" , user1.getRoleId());
//        return "redirect:/index？roleId="+user1.getRoleId();//？乱码
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String toIndexPage(ModelMap modelMap , HttpSession session,int roleId){
        if(null == session.getAttribute("loginUser")||"".equals(session.getAttribute("loginUser"))){
            return "welcome/noAccess";
        }
        modelMap.addAttribute("roleId" ,roleId);
        return "welcome/index";
    }

    @RequestMapping("/welcome/menu")
    public String getMenu(HttpSession session,ModelMap modelMap){
        return "welcome/menu";
    }

    @RequestMapping("/welcome/content")
    public String getContent(HttpSession session,ModelMap modelMap){
        String loginName = session.getAttribute("loginUser").toString();
        modelMap.addAttribute("loginName" ,loginName);
        return "welcome/content";
    }
}
