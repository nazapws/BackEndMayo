/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.nazaguia.Security.Service;

import com.portafolio.nazaguia.Security.Entity.Rol;
import com.portafolio.nazaguia.Security.Enums.RolNombre;
import com.portafolio.nazaguia.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */

@Service
@Transactional
public class RolService {
    
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepository.findByRolNombre(rolNombre);
    
    }
    public void save(Rol rol){
    irolRepository.save(rol);
    }
    
}
