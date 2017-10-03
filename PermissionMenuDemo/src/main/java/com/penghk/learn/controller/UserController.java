package com.penghk.learn.controller;

import com.penghk.learn.domain.Role;
import com.penghk.learn.domain.User;
import com.penghk.learn.service.RoleService;
import com.penghk.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户控制器
 * @author penghk
 */
@Controller
public class UserController {

    private static final String  SUCCESS = "common/success";
    private static final String  ERROR = "common/error";

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @RequestMapping("/getUser")
    public String getUsers(Model model){
        List<User> users = userService.selectAllUsers();
        model.addAttribute("users" ,users);
        return "users";
    }

    @RequestMapping("user/allocateRolePage.htm")
    public String allocateRolePage(Model model, int id, HttpServletRequest request){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        model.addAttribute("basePath",basePath);
        List<Role> roles = roleService.getAllRole();
        model.addAttribute("roles",roles);
        return "users/allocateRole";
    }

    @RequestMapping("user/allocateRoleAction")
    public String allocateRoleAction(Model model,User user){
        boolean isUpdate = userService.updateUser(user);
        if(isUpdate){
            model.addAttribute("msg" , "角色分配成功");
            return SUCCESS;
        }else {
            model.addAttribute("msg" , "角色分配失败");
            return ERROR;
        }
    }
}
