package com.horyu1234.husuabieventlotteryapply.controller.admin;

import com.horyu1234.husuabieventlotteryapply.constant.ModelAttributeNames;
import com.horyu1234.husuabieventlotteryapply.constant.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by horyu on 2018-04-14
 */
@RequestMapping("/admin/register")
@Controller
public class RegisterController {
    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public String register(Model model,
                           @PathVariable String uuid) {
        System.out.println("uuid: " + uuid);

        model.addAttribute(ModelAttributeNames.VIEW_NAME, View.ADMIN_REGISTER.toView());

        return View.LAYOUT.getTemplateName();
    }
}
