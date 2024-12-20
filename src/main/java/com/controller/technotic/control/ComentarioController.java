package com.controller.technotic.control;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @PostMapping
    public ResponseEntity<Map<String, Object>> guardarComentario(@RequestBody ComentarioRequest request) {
        Map<String, Object> response = new HashMap<>();

        if (request.getNombreCompleto() == null || request.getCedula() == null || request.getCorreo() == null || request.getTexto() == null) {
            response.put("success", false);
            response.put("message", "Todos los campos son obligatorios.");
            return ResponseEntity.badRequest().body(response);
        }

        Comentario comentario = new Comentario();
        comentario.setNombreCompleto(request.getNombreCompleto());
        comentario.setCedula(request.getCedula());
        comentario.setCorreo(request.getCorreo());
        comentario.setTexto(request.getTexto());
        comentarioRepository.save(comentario);

        response.put("success", true);
        response.put("message", "Comentario guardado exitosamente.");
        return ResponseEntity.ok(response);
    }
}

