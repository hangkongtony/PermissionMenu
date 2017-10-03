package com.penghk.learn.controller;


import com.penghk.learn.domain.Member;
import com.penghk.learn.service.MemberService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 会员控制器
 * @author penghk
 */
@Controller
public class MemberController {

    private static String SUCCESS_PAGE = "common/success";
    private static String FAIL_PAGE = "common/error";
    @Autowired
    private MemberService memberService;

    @RequestMapping("/member/do_member_edit")
    public String doEdit(Model model, MultipartFile file,Member member) throws IOException {
        //头像保存
        if(StringUtils.isNotBlank(file.getOriginalFilename())){
            File headFile = new File("E:/upload/photos/"+file.getOriginalFilename());
            if(!headFile.exists()){
                headFile.createNewFile();
            }
            file.transferTo(headFile);
            String path = headFile.getAbsolutePath();
            member.setPhoto(path);
        }
        boolean isSuccess = memberService.updateMember(member);
        if(isSuccess){
            model.addAttribute("msg" ,"添加会员成功");
            return SUCCESS_PAGE;
        }else {
            model.addAttribute("msg" ,"添加会员失败");
            return FAIL_PAGE;
        }
    }


    /**
     * 会员修改页面
     * @param model
     * @param member
     * @return
     */
    @RequestMapping("member/edit")
    public String editPage(Model model , Member member){
        List<Member> members = memberService.getQueryMember(member);
        model.addAttribute("result",members.get(0));
        return "member/edit";
    }


    /**
     * 会员详情
     * @param model
     * @param member
     * @return
     */
    @RequestMapping("member/detail")
    public String getMemberDetail(Model model , Member member){
        List<Member> members = memberService.getQueryMember(member);
        model.addAttribute("result",members.get(0));
        return "member/detail";
    }
    /**
     * 根据条件查询会员
     * @param model
     * @param member
     * @return
     */
    @RequestMapping("member/queryMember.htm")
    public String getQueryMember(Model model, Member member){
        List<Member> members = memberService.getQueryMember(member);
        model.addAttribute("members" , members);
        model.addAttribute("member" ,member);
        return "member/memberList";
    }

    /**
     * 根据条件删除会员
     * @param member
     * @return
     */
    @RequestMapping("member/deleteMember.htm")
    public String deleteMember(Member member,Model model){
        boolean isDelete = memberService.deleteMember(member);
        if(isDelete){
            return SUCCESS_PAGE;
        }else {
            model.addAttribute("msg" ,"删除异常，请联系管理员！");
            return FAIL_PAGE;
        }
    }
}
