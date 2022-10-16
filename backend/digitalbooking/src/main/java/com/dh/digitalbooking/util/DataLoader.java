package com.dh.digitalbooking.util;

import com.dh.digitalbooking.model.*;
import com.dh.digitalbooking.repository.IRol;
import com.dh.digitalbooking.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CaracteristicaService caracteristicaService;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private ImagenService imagenService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        try{
            Categoria categoria1 = new Categoria("Hosteles", "Hosteles de la zona", "https://media-cdn.tripadvisor.com/media/photo-s/21/91/1a/75/exterior.jpg");
            Categoria categoria2 = new Categoria("Hoteles","Hoteles de la zona","https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1");
            Categoria categoria3 = new Categoria("Departamentos","Hoteles de la zona","https://www.inmuebles24.com/noticias/wp-content/uploads/2020/01/departamentos-de-lujo-2.jpeg");
            Categoria categoria4 = new Categoria("Bed and breakfast","Hoteles de la zona","https://static.hosteltur.com/app/public/uploads/img/articles/2015/08/01/L_5b14fe49e7f2c_breakfast.jpg");

            categoriaService.agregarCategoria(categoria1);
            categoriaService.agregarCategoria(categoria2);
            categoriaService.agregarCategoria(categoria3);
            categoriaService.agregarCategoria(categoria4);


            Ciudad ciudad1 = new Ciudad("Cordoba","Cordoba","Argentina","https://www.google.com.ar/maps/place/C%C3%B3rdoba/@-31.3994342,-64.2643842,12z/data=!3m1!4b1!4m5!3m4!1s0x9432985f478f5b69:0xb0a24f9a5366b092!8m2!3d-31.4200833!4d-64.1887761?hl=es-419");
            Ciudad ciudad2 = new Ciudad("Rosario","Santa Fe","Argentina","https://www.google.com.ar/maps/place/C%C3%B3rdoba/@-31.3994342,-64.2643842,12z/data=!3m1!4b1!4m5!3m4!1s0x9432985f478f5b69:0xb0a24f9a5366b092!8m2!3d-31.4200833!4d-64.1887761?hl=es-419");
            Ciudad ciudad3 = new Ciudad("Ciudad de Santa Fe","Santa Fe","Argentina","https://www.google.com.ar/maps/place/C%C3%B3rdoba/@-31.3994342,-64.2643842,12z/data=!3m1!4b1!4m5!3m4!1s0x9432985f478f5b69:0xb0a24f9a5366b092!8m2!3d-31.4200833!4d-64.1887761?hl=es-419");
            Ciudad ciudad4 = new Ciudad("La Quiaca","Jujuy","Argentina","https://www.google.com.ar/maps/place/C%C3%B3rdoba/@-31.3994342,-64.2643842,12z/data=!3m1!4b1!4m5!3m4!1s0x9432985f478f5b69:0xb0a24f9a5366b092!8m2!3d-31.4200833!4d-64.1887761?hl=es-419");
            Ciudad silentCity = new Ciudad("Desconocido","Desconocido","Estados Unidos","https://www.konami.com/games/eu/es/products/sho/");

            ciudadService.agregarCiudad(ciudad1);
            ciudadService.agregarCiudad(ciudad2);
            ciudadService.agregarCiudad(ciudad3);
            ciudadService.agregarCiudad(ciudad4);
            ciudadService.agregarCiudad(silentCity);

            Caracteristica caracteristica1= new Caracteristica("Wifi","fas fa-wifi");
            Caracteristica caracteristica2= new Caracteristica("Pileta","fas fa-swimmer");
            Caracteristica caracteristica3= new Caracteristica("Parrilla","fas fa-fire");
            Caracteristica caracteristica4= new Caracteristica("Mascotas","fas fa-dog");
            Caracteristica caracteristica5= new Caracteristica("Amazon","fab fa-amazon-pay");
            Caracteristica caracteristica6= new Caracteristica("Ambulancia", "fas fa-ambulance");


            caracteristicaService.agregarCaracteristica(caracteristica1);
            caracteristicaService.agregarCaracteristica(caracteristica2);
            caracteristicaService.agregarCaracteristica(caracteristica3);

            List <Caracteristica> listaCaracteristicas1 = new ArrayList<>();
            listaCaracteristicas1.add(caracteristica1);
            listaCaracteristicas1.add(caracteristica2);
            listaCaracteristicas1.add(caracteristica3);

            List <Caracteristica> listaCaracteristicas2 = new ArrayList<>();
            listaCaracteristicas2.add(caracteristica3);

            List <Caracteristica> listaCaracteristicas3 = new ArrayList<>();
            listaCaracteristicas3.add(caracteristica1);
            listaCaracteristicas3.add(caracteristica2);

            List <Caracteristica> listaCaracteristicas4 = new ArrayList<>();
            listaCaracteristicas4.add(caracteristica1);

            Imagen imagen1 = new Imagen("Hotel De Cordoba 1","https://media-cdn.tripadvisor.com/media/photo-s/16/1a/ea/54/hotel-presidente-4s.jpg");
            Imagen imagen2 = new Imagen("Hotel De Cordoba 2","https://cf.bstatic.com/xdata/images/hotel/max1024x768/263391552.jpg?k=77c466bf3439a93b0c2a4fe5660e23e1add5e5b940b0eff35eaa224b461d95a3&o=&hp=1");
            Imagen imagen3 = new Imagen("Hotel De Cordoba 3","https://imgcy.trivago.com/c_limit,d_dummy.jpeg,f_auto,h_1300,q_auto,w_2000/itemimages/77/61/77615_v3.jpeg");
            Imagen imagen4 = new Imagen("Hotel De Cordoba 4","https://imagenescityexpress.scdn6.secure.raxcdn.com/sites/default/files/2017-03/hotel-leon-city-express-fachada-noche.jpg");
            Imagen imagen5 = new Imagen("Hotel De Cordoba 5","https://content.r9cdn.net/himg/9a/22/37/leonardo-1103824-0004_CR-Veracruz-1-Aereas_0296_O-816247.jpg");
            Imagen imagen6 = new Imagen("Hotel De Cordoba 6","https://pbs.twimg.com/media/EpGaIJqWMAAlgNn?format=jpg&name=4096x4096");


            Imagen pepi = new Imagen("Pepi Golf","http://ranelaghgolfclub.com/wp-content/uploads/golf3.jpg");

            imagenService.subirImagen(imagen1);
            imagenService.subirImagen(imagen2);
            imagenService.subirImagen(imagen3);
            imagenService.subirImagen(imagen4);
            imagenService.subirImagen(imagen5);
            imagenService.subirImagen(imagen6);
            imagenService.subirImagen(pepi);

            List <Imagen> listaImagenes1 = new ArrayList<>();
            List <Imagen> listaImagenes2 = new ArrayList<>();
            List <Imagen> listaImagenes3 = new ArrayList<>();
            List <Imagen> listaImagenes4 = new ArrayList<>();
            List <Imagen> listaImagenes5 = new ArrayList<>();
            List <Imagen> listaImagenes6 = new ArrayList<>();

            List <Imagen> pepiImagen= new ArrayList<>();

            pepiImagen.add(pepi);

            String tituloDescripcion="Alojate en el corazón de Argentina";

            listaImagenes1.add(imagen1);
            listaImagenes2.add(imagen2);
            listaImagenes3.add(imagen3);
            listaImagenes4.add(imagen4);
            listaImagenes5.add(imagen5);
            listaImagenes6.add(imagen6);

            String descripcion = "En el corazón de San Telmo, disfruta de un albergue inspirado en las pasiones de Buenos Aires";
            String pepiDescripcion= "Veni a jugar al golf con pepi. En el corazon de San Isidro, en el campo de Golf de Pepi";
            String normas = "Check-out 10:00 \n\nNo se permiten fiestas \n\nNo fumar";
            String seguridad = "Se aplican las pautas de distanciamiento social y otras normas relacionadas con el coronavirus\n\nDetector de humo\n\nDeposito de seguridad";
            String cancelacion = "Agregá las fechas de tu viaje para obtener los detalles de cancelación de esta estadía. \n\nEl incumplimiento de alguna de las normas resultara en la cancelacion inmediata";


            Producto producto1 = new Producto("Punta bella",tituloDescripcion,descripcion, categoria1, ciudad1,listaImagenes1, listaCaracteristicas1,normas,seguridad,cancelacion);
            Producto producto2 = new Producto("El gatito",tituloDescripcion,descripcion, categoria2, ciudad2,listaImagenes2, listaCaracteristicas4,normas,seguridad,cancelacion);
            Producto producto3 = new Producto("El perrito",tituloDescripcion,descripcion, categoria3, ciudad3,listaImagenes3, listaCaracteristicas3,normas,seguridad,cancelacion);
            Producto producto4 = new Producto("El hamster",tituloDescripcion,descripcion, categoria4, ciudad4,listaImagenes4, listaCaracteristicas2,normas,seguridad,cancelacion);
            Producto producto5 = new Producto("El caballo",tituloDescripcion,descripcion, categoria1, ciudad4,listaImagenes5, listaCaracteristicas2,normas,seguridad,cancelacion);
            Producto producto6 = new Producto("Silent Hill","Veni a pasar un buen rato en Silent hill",descripcion, categoria2, silentCity,listaImagenes6, listaCaracteristicas1,normas,seguridad,cancelacion);
            Producto producto7 = new Producto("Sheraton hotel & resort",tituloDescripcion,descripcion, categoria3, ciudad1,listaImagenes3, listaCaracteristicas4,normas,seguridad,cancelacion);
            Producto producto8 = new Producto("PepiGolf","Veni a jugar al golf con Pepi",pepiDescripcion, categoria4, ciudad4,pepiImagen, listaCaracteristicas3,normas,seguridad,cancelacion);

            productoService.agregarProducto(producto1);
            productoService.agregarProducto(producto2);
            productoService.agregarProducto(producto3);
            productoService.agregarProducto(producto4);
            productoService.agregarProducto(producto5);
            productoService.agregarProducto(producto6);
            productoService.agregarProducto(producto7);
            productoService.agregarProducto(producto8);

            SQLUtil sqlUtil = new SQLUtil();

            Date diaYHoraInicio1 = new Date();
            Date diaYhoraFin1 = new Date(122,5,25,20,40);
            Date diaYHoraInicio2 = new Date(122,6,1,13,30);
            Date diaYhoraFin2 = new Date(122,6,8,14,20);
            Date diaYHoraInicio3 = new Date();
            Date diaYhoraFin3 = new Date(122,6,8,14,20);
            Date diaYHora4 = new Date(122,5,27,13,30);

            Time time = new Time(17,18,30);

            Rol rol1 = new Rol("ADMIN");
            Rol rol2 = new Rol("USER");

            rolService.crearRol(rol1);
            rolService.crearRol(rol2);

            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            String contra = passwordEncoder.encode("hola123");

            Usuario user1 = new Usuario("Andre","Alvarez","hola@mail.com", contra,"Bs As",rol1);
            Usuario user2 = new Usuario("Erik","Alvarez","hola2@mail.com",contra,"Cordoba",rol2);

            usuarioService.crearUsuario(user1);
            usuarioService.crearUsuario(user2);

            Reserva reserva1 = new Reserva(time,diaYHoraInicio1,diaYhoraFin1,producto1,user1);
            Reserva reserva2 = new Reserva(time,diaYHoraInicio2,diaYhoraFin2,producto3,user2);
            Reserva reserva3 = new Reserva(time,diaYHoraInicio3,diaYhoraFin3,producto2,user2);
            Reserva reserva4 = new Reserva(time,diaYHora4,diaYHora4,producto3,user1);

            reservaService.crearReserva(reserva1);
            reservaService.crearReserva(reserva2);
            reservaService.crearReserva(reserva3);
            reservaService.crearReserva(reserva4);


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}


/*

            https://media-cdn.tripadvisor.com/media/photo-s/21/91/1a/75/exterior.jpg

            https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1

            https://www.inmuebles24.com/noticias/wp-content/uploads/2020/01/departamentos-de-lujo-2.jpeg

            https://static.hosteltur.com/app/public/uploads/img/articles/2015/08/01/L_5b14fe49e7f2c_breakfast.jpg

            https://media-cdn.tripadvisor.com/media/photo-s/16/1a/ea/54/hotel-presidente-4s.jpg


 */