package com.backend.controles;

import com.backend.entidades.Ctrgestiones;
import com.backend.repositorios.repoctrgestion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhoan
 */

@RestController
@Service
@EnableJpaRepositories("com.backend.repositorios")
public class Controlctrgestion {
    
    @Autowired
    repoctrgestion rpg;
    
    @RequestMapping(
            value = "controlgestion/all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<Ctrgestiones> getall(){
        List<Ctrgestiones> result = (List<Ctrgestiones>)rpg.findAll();
        
        return result;
    }
}
