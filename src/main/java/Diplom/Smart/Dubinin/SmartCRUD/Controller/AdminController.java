package Diplom.Smart.Dubinin.SmartCRUD.Controller;

import Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService.UserService;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/")
public class AdminController {


    @Autowired
    @Qualifier("UserServiceImpl")
    UserService userService;

    @GetMapping(value = "/admin/main")
    public String inbox(Model model, Principal principal) {
        User user = userService.getByMail(principal.getName());
        model.addAttribute("user", user);

//        Tables.values()[0].name();
        model.addAttribute("tables", Tables.values());

        return "admin";


    }




}
