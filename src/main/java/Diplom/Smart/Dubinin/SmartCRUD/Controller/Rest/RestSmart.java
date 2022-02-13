package Diplom.Smart.Dubinin.SmartCRUD.Controller.Rest;

import Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService.SmartContractsService;
import Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService.UserService;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.EDOsUser;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.SmartContracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestSmart {

    @Autowired
    @Qualifier("UserServiceImpl")
    UserService userService;

    @Autowired
    @Qualifier("SmartContractsServiceImpl")
    SmartContractsService smartContractService;


    @GetMapping(value = "/admin/smart/allContracts")
    public ResponseEntity<List<SmartContracts>> edoUser() {
        return new ResponseEntity<>(smartContractService.getList(), HttpStatus.OK);
    }
}
