package com.penghk.learn.controller;

import com.penghk.learn.domain.Menu;
import com.penghk.learn.domain.Role;
import com.penghk.learn.service.MenuService;
import com.penghk.learn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;
    /**
     * 角色权限分配页面
     * @param model
     * @param role
     * @return
     */
    @RequestMapping("/role/toRoleAllocateMenuPage.htm")
    public String allocateMenuPage(Model model , Role role){
        List<Menu> menus = menuService.getAllMenu();
        model.addAttribute("menus" , menus);
        try {
            String roleName = new String(role.getRoleName().getBytes("iso8859-1"),"utf-8");
            role.setRoleName(roleName);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            role.setRoleName("");
        }

        model.addAttribute("role" ,role);
        return "role/roleAllocateMenu";
    }

    /**
     * 给角色分配权限菜单
     * @param model
     * @param roleId
     * @param roleName
     * @param mids
     * @return
     */
    @RequestMapping("role/allocateRoleMenu.htm")
    public String allocateRoleMenu(Model model , int roleId,String roleName,int[] mids){
        roleService.allocateRoleMenu(roleId ,mids);
        return "common/success";
    }

}
