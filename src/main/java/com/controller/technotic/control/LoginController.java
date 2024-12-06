/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller.technotic.control;

/**
 *
 * @author sasuk
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "layout/index";  
    }

    @GetMapping("/registro")
    public String registro() {
        return "layout/registro";  
    }

    @GetMapping("/home")
    public String home() {
        return "layout/home"; 
    }

    @GetMapping("/comentarios")
    public String comentarios() {
        return "layout/comentarios"; 
              
    }
    

    @GetMapping("/componentes")
    public String componentes() {
        return "layout/componentes"; 
    }
    
    
    @GetMapping("/computadoras")
    public String computadoras() {
        return "layout/computadoras"; 
    }

    @GetMapping("/accesorios")
    public String accesorios() {
        return "layout/accesorios"; 
    }

    @GetMapping("/perifericos")
    public String perifericos() {
        return "layout/perifericos"; 
        
        
    }
    
    
      @GetMapping("/carrito")
    public String verCarrito() {
        return "layout/carrito";  
    }
         @GetMapping("/pagar")
    public String pagar() {
        return "layout/pagar";  
    }
}

