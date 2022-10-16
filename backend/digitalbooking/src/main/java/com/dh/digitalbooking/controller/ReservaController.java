package com.dh.digitalbooking.controller;


import com.dh.digitalbooking.model.Producto;
import com.dh.digitalbooking.model.Reserva;
import com.dh.digitalbooking.security.JWTUtil;
import com.dh.digitalbooking.service.ReservaService;
import com.dh.digitalbooking.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity <Reserva> guardarReserva(@RequestBody Reserva reserva, @RequestHeader (name="Authorization") String token){

        return new ResponseEntity<>(reservaService.crearReserva(reserva),HttpStatus.CREATED);
    }

    @GetMapping()
    public List <Reserva> obtenerReservas(){
        return reservaService.obtenerReservas();
    }

    @GetMapping("/producto/{id}")
    public List <Reserva> obtenerReservasSegunProducto(@PathVariable Long id){
        return reservaService.reservasSegunProducto(id);
    }

    @GetMapping("/usuario/{id}")
    public List <Producto> obtenerReservasSegunUsuario(@PathVariable Long id){
        return reservaService.reservasSegunUsuario(id);
    }

}
