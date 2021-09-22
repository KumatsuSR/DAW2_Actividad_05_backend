package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.entity.Disponibilidad;
import com.empresa.service.DisponibilidadService;
import com.empresa.util.Constantes;

@RestController
@RequestMapping("rest/disponibilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {
	
	@Autowired
	DisponibilidadService servicio;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Disponibilidad>> listado(){
		List<Disponibilidad> tempDisponibilidad = servicio.listadoDisponibilidad();
		return ResponseEntity.ok(tempDisponibilidad);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String,Object>> guardar(@RequestBody Disponibilidad obj){
		Map<String,Object> tempOut = new HashMap<>();
		try {
			Disponibilidad disponibilidadOut =servicio.guardarDisponibilidad(obj);
			if(disponibilidadOut == null) {
				tempOut.put("message", Constantes.MENSAJE_REG_ERROR);
			}else {
				tempOut.put("message", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			tempOut.put("message", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(tempOut);
	} 
}
