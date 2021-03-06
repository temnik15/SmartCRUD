package Diplom.Smart.Dubinin.SmartCRUD.Controller.Rest;

import Diplom.Smart.Dubinin.SmartCRUD.Controller.Tables;
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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.header.Header;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RestAdmin {


    @Autowired
    @Qualifier("AuthoritiesServiceImpl")
    AuthoritiesService authoritiesService;

    @Autowired
    @Qualifier("EDOsUserServiceImpl")
    EDOsUserService edOsUserService;


    @Autowired
    @Qualifier("LogsClassServiceImpl")
    LogsClassService logsClassService;


    @Autowired
    @Qualifier("RoleServiceImpl")
    RoleService roleService;


    @Autowired
    @Qualifier("StatusSmartContractServiceImpl")
    StatusSmartContractService statusSmartContractService;


    @Autowired
    @Qualifier("SmartContractsServiceImpl")
    SmartContractsService smartContractService;


    @Autowired
    @Qualifier("UserServiceImpl")
    UserService userService;


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
    @Qualifier("TemplateSmartContractServiceImpl")
    TemplateSmartContractService templateSmartContractService;





//    @GetMapping(value = "/admin/??????????_??????????????")
//    public ResponseEntity<List<Authorities>> authorities() {
//        return new ResponseEntity<>(authoritiesService.getList(), HttpStatus.OK);
//    }


    @GetMapping(value = "/admin/????????????????????????_??????")
    public ResponseEntity<List<EDOsUser>> edoUser() {
        return new ResponseEntity<>(edOsUserService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????????_??????????????????????")
    public ResponseEntity<List<LogsClass>> logClass() {
        return new ResponseEntity<>(logsClassService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????")
    public ResponseEntity<List<Role>> role() {
        return new ResponseEntity<>(roleService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/??????????_??????????????????")
    public ResponseEntity<List<SmartContracts>> smartContract() {
        return new ResponseEntity<>(smartContractService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/??????????????_??????????_????????????????????")
    public ResponseEntity<List<StatusSmartContract>> statusSmart() {
        return new ResponseEntity<>(statusSmartContractService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????????????????????")
    public ResponseEntity<List<User>> user() {
        return new ResponseEntity<>(userService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????????????????????")
    public ResponseEntity<List<Documentation>> doc() {
        return new ResponseEntity<>(documentationService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????")
    public ResponseEntity<List<Logs>> logs() {
        return new ResponseEntity<>(logsService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/????????????")
    public ResponseEntity<List<Report>> report() {
        return new ResponseEntity<>(reportService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/??????????????_??????????_????????????????????")
    public ResponseEntity<List<TemplateSmartContract>> template() {
        return new ResponseEntity<>(templateSmartContractService.getList(), HttpStatus.OK);
    }


    @PostMapping(value = "/admin/getHeaders")
    public ResponseEntity<List<String>> nameTables(@RequestBody Tables name) {

        return new ResponseEntity<>(Arrays.asList(name.tables), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/getTables")
    public ResponseEntity<List<String>> getTables() {
        return new ResponseEntity<>(Arrays.stream(Tables.values()).map(Enum::name).collect(Collectors.toList()), HttpStatus.OK);
    }


    @PostMapping(value = "/admin/????????????????????????/add")
    public ResponseEntity<User> actionAdd(@RequestBody User user) {
        List<Role> roles = new ArrayList<>(user.getRole());
        HashSet<Role> result = new HashSet<>();
        for (int i = 0; i != roles.size(); i++) {
            result.add(roleService.getByName(roles.get(i).getName()));
        }
        user.setRole(result);
        userService.add(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PostMapping(value = "/admin/????????????????????????/edit")
    public ResponseEntity editUser(@RequestBody User user) {
        List<Role> roles = new ArrayList<>(user.getRole());
        HashSet<Role> result = new HashSet<>();
        for (int i = 0; i != roles.size(); i++) {
            result.add(roleService.getByName(roles.get(i).getName()));
        }
        user.setRole(result);
        userService.edit(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}