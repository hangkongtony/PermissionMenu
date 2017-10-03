package com.penghk.learn.controller;


import com.penghk.learn.domain.Member;
import com.penghk.learn.domain.Menu;
import com.penghk.learn.domain.Role;
import com.penghk.learn.domain.User;
import com.penghk.learn.service.MemberService;
import com.penghk.learn.service.MenuService;
import com.penghk.learn.service.RoleService;
import com.penghk.learn.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 菜单控制器
 * @author penghk
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;


    //操作员分配角色
    @RequestMapping("users/userManage")
    public String allocateRole(Model model,HttpServletRequest request){
        List<User> users = userService.selectAllUsers();
        model.addAttribute("users" , users);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        model.addAttribute("basePath",basePath);
        return "users/userManage";
    }


    //后台操作员界面
    @RequestMapping("users/addUserPage")
    public String addUserPage(Model model,HttpServletRequest request){
        List<User> users = userService.selectAllUsers();
        model.addAttribute("users" , users);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        model.addAttribute("basePath",basePath);
        return "users/addUserPage";
    }

    @RequestMapping("role/addRolePage")
    public String addRolePage(Model model, HttpSession session,HttpServletRequest request){
        List<Role> roleList = roleService.getAllRole();
        model.addAttribute("roles" ,roleList);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        model.addAttribute("basePath",basePath);
        return "role/roleManage";
    }

    @RequestMapping("role/roleManage")
    public String getAllRole(Model model, HttpSession session, HttpServletRequest request){
        List<Role> roleList = roleService.getAllRole();
        model.addAttribute("roles" ,roleList);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        model.addAttribute("basePath",basePath);
        return "role/roleManage";
    }

    @RequestMapping("/member/member_list.htm")
    public String getAllMember(ModelMap modelMap,HttpSession session,HttpServletRequest request){
        if(null==session.getAttribute("loginUser")||"".equals(session.getAttribute("loginUser"))){
            return "welcome/noAccess";
        }
        List<Member> members = memberService.getAllMember();
        modelMap.addAttribute("members",members);
        String basePath = request.getScheme()+"://"+request.getRemoteHost()+":"+request.getServerPort();
        modelMap.addAttribute("basePath",basePath);
        return "member/memberList";
    }

    /**
     *通过角色查询对应的所有菜单
     * @param modelMap
     * @return menu的json
     */
    @RequestMapping("/all")
//    @ResponseBody
    public String getAllMenu(ModelMap modelMap,int roleId){
        List<Menu> menuList = menuService.getAllMenuByRole(roleId);
        modelMap.addAttribute("menus" , menuList);
        return "welcome/menu";
//        ObjectMapper mapper = new ObjectMapper();
//        String userJson = "{}";
//        try {
//             userJson = mapper.writeValueAsString(menuList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return userJson;
    }


}
