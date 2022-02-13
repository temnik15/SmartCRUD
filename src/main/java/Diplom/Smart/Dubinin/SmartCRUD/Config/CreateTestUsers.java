package Diplom.Smart.Dubinin.SmartCRUD.Config;


import Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService.DocumentationService;
import Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService.LogsService;
import Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService.ReportService;
import Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService.TemplateSmartContractService;
import Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService.*;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Documentation;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Logs;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Report;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.TemplateSmartContract;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class CreateTestUsers {

    @Autowired
    @Qualifier("UserServiceImpl")
    UserService userService;

    @Autowired
    @Qualifier("RoleServiceImpl")
    RoleService roleService;


    @Autowired
    @Qualifier("TemplateSmartContractServiceImpl")
    TemplateSmartContractService templateSmartContractService;


    @Autowired
    @Qualifier("DocumentationServiceImpl")
    DocumentationService documentationService;


    @Autowired
    @Qualifier("LogsServiceImpl")
    LogsService logsService;


    @Autowired
    @Qualifier("ReportServiceImpl")
    ReportService reportService;


    @Autowired
    @Qualifier("EDOsUserServiceImpl")
    EDOsUserService edOsUserService;

    @Autowired
    @Qualifier("SmartContractsServiceImpl")
    SmartContractsService smartContractService;

    @Autowired
    @Qualifier("StatusSmartContractServiceImpl")
    StatusSmartContractService statusSmartContractService;


    @PostConstruct
    void create() {
        Set<Role> userRole = new HashSet<>();
        Role role = new Role("ROLE_ADMIN");
        roleService.add(role);
        userRole.add(role);


        User user = new User(userRole, "spell", "1", "andrey");


        userService.add(user);

        templateSmartContractService.add(new TemplateSmartContract(1L, "hello"));
        documentationService.add(new Documentation(1L, "hello"));
        logsService.add(new Logs(1L,
                new LogsClass("users"), "login", new Date()
        ));

        reportService.add(new Report(1L, user, "msgs"));


        EDOsUser edOsUser = new EDOsUser(user, "2343");
        edOsUserService.add(edOsUser);
        StatusSmartContract statusSmartContract = new StatusSmartContract("loading");
        statusSmartContractService.add(statusSmartContract);

        smartContractService.add(new SmartContracts(1L,edOsUser,statusSmartContract, edOsUser ));



    }
}
