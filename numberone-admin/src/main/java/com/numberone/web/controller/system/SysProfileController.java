package com.numberone.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.numberone.common.annotation.Log;
import com.numberone.common.base.AjaxResult;
import com.numberone.common.config.Global;
import com.numberone.common.enums.BusinessType;
import com.numberone.common.page.TableDataInfo;
import com.numberone.common.utils.StringUtils;
import com.numberone.common.utils.file.FileUploadUtils;
import com.numberone.framework.shiro.service.SysPasswordService;
import com.numberone.framework.util.ShiroUtils;
import com.numberone.system.domain.SysConfig;
import com.numberone.system.domain.SysUser;
import com.numberone.system.service.ISysDictDataService;
import com.numberone.system.service.ISysUserService;
import com.numberone.web.controller.entity.Norm;
import com.numberone.framework.web.base.BaseController;

/**
 * 个人信息 业务处理
 * 
 * @author numberone
 */
@Controller
@RequestMapping("/system/user/profile")
public class SysProfileController extends BaseController
{
    private static final Logger log = LoggerFactory.getLogger(SysProfileController.class);

    private String prefix = "system/user/profile";

    @Autowired
    private ISysUserService userService;
    
    @Autowired
    private SysPasswordService passwordService;

    @Autowired
    private ISysDictDataService dictDataService;

    /**
     *  首页数据查询
     */
    @ResponseBody
    @PostMapping("/mergeCellData")
    public List<Norm> mergeCellData(){
      List<Norm> list = new ArrayList<>();
      Norm norm1 = new Norm();
      norm1.setPhysicalTestId_year("2020");
      norm1.setPhysicalTestId_name("跳高");
      norm1.setPeople_name("张三");
      norm1.setPeople_sex("男");
      norm1.setAge("20");
      norm1.setPeople_unit_name("单位1");
      norm1.setPeople_position("高管");
      norm1.setPhysicalTestItemId_name("跳远");
      norm1.setIsReplace("false");
      norm1.setTestResult("100");
      
      Norm norm2 = new Norm();
      norm2.setPhysicalTestId_year("2020");
      norm2.setPhysicalTestId_name("跳高");
      norm2.setPeople_name("张三");
      norm2.setPeople_sex("男");
      norm2.setAge("20");
      norm2.setPeople_unit_name("单位1");
      norm2.setPeople_position("高管");
      norm2.setPhysicalTestItemId_name("跳远");
      norm2.setIsReplace("false");
      norm2.setTestResult("100");
      
      Norm norm3 = new Norm();
      norm3.setPhysicalTestId_year("2020");
      norm3.setPhysicalTestId_name("跳高");
      norm3.setPeople_name("张三");
      norm3.setPeople_sex("男");
      norm2.setAge("20");
      norm2.setPeople_unit_name("单位1");
      norm2.setPeople_position("高管");
      norm2.setPhysicalTestItemId_name("跳远");
      norm3.setIsReplace("false");
      norm3.setTestResult("100");
      
      Norm norm4 = new Norm();
      norm4.setPhysicalTestId_year("2020");
      norm4.setPhysicalTestId_name("蹦极");
      norm4.setPeople_name("张三");
      norm4.setPeople_sex("男");
      norm4.setAge("20");
      norm4.setPeople_unit_name("单位1");
      norm4.setPeople_position("高管");
      norm4.setPhysicalTestItemId_name("跳远");
      norm4.setIsReplace("false");
      norm4.setTestResult("100");
      
      Norm norm5 = new Norm();
      norm5.setPhysicalTestId_year("2021");
      norm5.setPhysicalTestId_name("蹦极");
      norm5.setPeople_name("张三");
      norm5.setPeople_sex("男");
      norm5.setAge("20");
      norm5.setPeople_unit_name("单位1");
      norm5.setPeople_position("高管");
      norm5.setPhysicalTestItemId_name("跳远");
      norm5.setIsReplace("false");
      norm5.setTestResult("100");
      
      Norm norm6 = new Norm();
      norm6.setPhysicalTestId_year("2021");
      norm6.setPhysicalTestId_name("蹦极");
      norm6.setPeople_name("张三");
      norm6.setPeople_sex("男");
      norm6.setAge("20");
      norm6.setPeople_unit_name("单位1");
      norm6.setPeople_position("高管");
      norm6.setPhysicalTestItemId_name("跳远");
      norm6.setIsReplace("false");
      norm4.setTestResult("100");
      
      Norm norm7 = new Norm();
      norm7.setPhysicalTestId_year("2021");
      norm7.setPhysicalTestId_name("跳蹦");
      norm7.setPeople_name("张三");
      norm7.setPeople_sex("男");
      norm7.setAge("20");
      norm7.setPeople_unit_name("单位1");
      norm7.setPeople_position("高管");
      norm7.setPhysicalTestItemId_name("跳远");
      norm7.setIsReplace("false");
      norm7.setTestResult("100");
      
      Norm norm8 = new Norm();
      norm8.setPhysicalTestId_year("2021");
      norm8.setPhysicalTestId_name("跳高");
      norm8.setPeople_name("张三");
      norm8.setPeople_sex("男");
      norm8.setAge("20");
      norm8.setPeople_unit_name("单位1");
      norm8.setPeople_position("高管");
      norm8.setPhysicalTestItemId_name("跳远");
      norm8.setIsReplace("false");
      norm8.setTestResult("100");
      
      
   
      list.add(norm1);
      list.add(norm2);
      list.add(norm3);
      list.add(norm4);
      list.add(norm5);
      list.add(norm6);
      list.add(norm7);
      list.add(norm8);
     
   
      return list;
    }
    
    /**
     * 个人信息
     */
    @GetMapping()
    public String profile(ModelMap mmap)
    {
        SysUser user = getSysUser();
        user.setSex(dictDataService.selectDictLabel("sys_user_sex", user.getSex()));
        mmap.put("user", user);
        mmap.put("roleGroup", userService.selectUserRoleGroup(user.getUserId()));
        mmap.put("postGroup", userService.selectUserPostGroup(user.getUserId()));
        return prefix + "/profile";
    }

    @GetMapping("/checkPassword")
    @ResponseBody
    public boolean checkPassword(String password)
    {
        SysUser user = getSysUser();
        if (passwordService.matches(user, password))
        {
            return true;
        }
        return false;
    }

    @GetMapping("/resetPwd")
    public String resetPwd(ModelMap mmap)
    {
        SysUser user = getSysUser();
        mmap.put("user", userService.selectUserById(user.getUserId()));
        return prefix + "/resetPwd";
    }

    @Log(title = "重置密码", businessType = BusinessType.UPDATE)
    @PostMapping("/resetPwd")
    @ResponseBody
    public AjaxResult resetPwd(String oldPassword, String newPassword)
    {
        SysUser user = getSysUser();
        if (StringUtils.isNotEmpty(newPassword) && passwordService.matches(user, oldPassword))
        {
            user.setSalt(ShiroUtils.randomSalt());
            user.setPassword(passwordService.encryptPassword(user.getLoginName(), newPassword, user.getSalt()));
            if (userService.resetUserPwd(user) > 0)
            {
                setSysUser(userService.selectUserById(user.getUserId()));
                return success();
            }
            return error();
        }
        else
        {
            return error("修改密码失败，旧密码错误");
        }
    }

    /**
     * 修改用户
     */
    @GetMapping("/edit")
    public String edit(ModelMap mmap)
    {
        SysUser user = getSysUser();
        mmap.put("user", userService.selectUserById(user.getUserId()));
        return prefix + "/edit";
    }

    /**
     * 修改头像
     */
    @GetMapping("/avatar")
    public String avatar(ModelMap mmap)
    {
        SysUser user = getSysUser();
        mmap.put("user", userService.selectUserById(user.getUserId()));
        return prefix + "/avatar";
    }

    /**
     * 修改用户
     */
    @Log(title = "个人信息", businessType = BusinessType.UPDATE)
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(SysUser user)
    {
        SysUser currentUser = getSysUser();
        currentUser.setUserName(user.getUserName());
        currentUser.setEmail(user.getEmail());
        currentUser.setPhonenumber(user.getPhonenumber());
        currentUser.setSex(user.getSex());
        if (userService.updateUserInfo(currentUser) > 0)
        {
            setSysUser(userService.selectUserById(currentUser.getUserId()));
            return success();
        }
        return error();
    }

    /**
     * 保存头像
     */
    @Log(title = "个人信息", businessType = BusinessType.UPDATE)
    @PostMapping("/updateAvatar")
    @ResponseBody
    public AjaxResult updateAvatar(@RequestParam("avatarfile") MultipartFile file)
    {
        SysUser currentUser = getSysUser();
        try
        {
            if (!file.isEmpty())
            {
                String avatar = FileUploadUtils.upload(Global.getAvatarPath(), file);
                currentUser.setAvatar(avatar);
                if (userService.updateUserInfo(currentUser) > 0)
                {
                    setSysUser(userService.selectUserById(currentUser.getUserId()));
                    return success();
                }
            }
            return error();
        }
        catch (Exception e)
        {
            log.error("修改头像失败！", e);
            return error(e.getMessage());
        }
    }
}
