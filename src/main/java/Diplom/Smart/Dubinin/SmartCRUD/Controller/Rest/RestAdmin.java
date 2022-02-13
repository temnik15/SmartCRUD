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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import javax.print.Doc;
import java.util.Arrays;
import java.util.List;

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


//    @GetMapping(value = "/admin/Права_Доступа")
//    public ResponseEntity<List<Authorities>> authorities() {
//        return new ResponseEntity<>(authoritiesService.getList(), HttpStatus.OK);
//    }


    @GetMapping(value = "/admin/Пользователи_эдо")
    public ResponseEntity<List<EDOsUser>> edoUser() {
        return new ResponseEntity<>(edOsUserService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Классы_Логирования")
    public ResponseEntity<List<LogsClass>> logClass() {
        return new ResponseEntity<>(logsClassService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Роли")
    public ResponseEntity<List<Role>> role() {
        return new ResponseEntity<>(roleService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Смарт_контракты")
    public ResponseEntity<List<SmartContracts>> smartContract() {
        return new ResponseEntity<>(smartContractService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Статусы_Смарт_Контрактов")
    public ResponseEntity<List<StatusSmartContract>> statusSmart() {
        return new ResponseEntity<>(statusSmartContractService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Пользователи")
    public ResponseEntity<List<User>> user() {
        return new ResponseEntity<>(userService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Документация")
    public ResponseEntity<List<Documentation>> doc() {
        return new ResponseEntity<>(documentationService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Логи")
    public ResponseEntity<List<Logs>> logs() {
        return new ResponseEntity<>(logsService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Отчеты")
    public ResponseEntity<List<Report>> report() {
        return new ResponseEntity<>(reportService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/admin/Шаблоны_Смарт_контрактов")
    public ResponseEntity<List<TemplateSmartContract>> template() {
        return new ResponseEntity<>(templateSmartContractService.getList(), HttpStatus.OK);
    }


    @PostMapping(value = "/admin/getHeaders")
    public ResponseEntity<List<String>> nameTables(@RequestBody Tables name) {

        return new ResponseEntity<>(Arrays.asList(name.tables), HttpStatus.OK);
}

}