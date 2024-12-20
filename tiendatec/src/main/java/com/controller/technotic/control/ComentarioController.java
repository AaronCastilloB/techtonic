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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioRepository comentarioRepository;

    public ComentarioController(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    @GetMapping("/centro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("comentario", new Comentario());
        return "centro_comentarios"; 
    }

    @PostMapping("/enviar")
    public String enviarComentario(@ModelAttribute Comentario comentario, Model model) {
        comentarioRepository.save(comentario); 
        model.addAttribute("mensaje", "Gracias por enviar tu comentario.");
        return "centro_comentarios"; 
    }
}
