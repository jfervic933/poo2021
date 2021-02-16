/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import programa.Cliente;
import programa.Vehiculo;
import programa.VehiculoAlquilado;

/**
 *
 * @author LauraBandera
 */
public class EmpresaAlquilerVehiculos {
// Atributos de la empresa

    private String cif;
    private String nombre;
    private String paginaWeb;

    //No son static por cada empresa necesita sus
    // clintes, vehiculos y alquileres si pusiesemos static
    // al ser de clase todas las empresas que creamos compartirían
    // las listas tanto de clietnes, vehiculos y alquileres
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<VehiculoAlquilado> alquileres;
    private ArrayList<VehiculoAlquilado> alquileresTerminados;

    //Scanner s = new Scanner(System.in);

    EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.alquileres = new ArrayList<>();
        this.alquileresTerminados = new ArrayList<>();
    }

    public void registrarCliente(Cliente nuevo) {
        this.clientes.add(nuevo);
    }

    private void ordenarPorNif() {
        Comparator<Cliente> criterio = (o1, o2) -> o1.getNif().compareTo(o2.getNif());
        Collections.sort(clientes, criterio);
    }

    public int buscarClientePorNIF(Cliente aBuscar) {
        this.ordenarPorNif();
        System.out.println("Hemos ordenado por NIF");
        Comparator<Cliente> criterio = (o1, o2) -> o1.getNif().compareTo(o2.getNif());
        return Collections.binarySearch(clientes, aBuscar, criterio);
    }
    
    public int buscarClientePorNIFSecuencial(Cliente aBuscar) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNif().equalsIgnoreCase(aBuscar.getNif())){
                return i;
            }
        }
        return -1;
    }

    //METODO NUEVO
    public void ordenarPorNombre() {
        // (c1,c2)->c1.getApellidos().compareTo(c2.getApellidos())
        Comparator<Cliente> criterio = Comparator.comparing(Cliente::getApellidos)
                                                    .thenComparing(Cliente::getNombre);
        
        Comparator<Cliente> criterio2 = (c1,c2)->{
            if (c1.getApellidos().compareTo(c2.getApellidos()) == 0){
                return c1.getNombre().compareTo(c2.getNombre());
            }
            return c1.getApellidos().compareTo(c2.getApellidos());
        };
        
        Collections.sort(clientes, criterio);
    }

    public int buscarClientePorNombre(Cliente aBuscar) {
        this.ordenarPorNombre();
        System.out.println("Hemos ordenado por Nombre");
        Comparator<Cliente> criterio = (o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        return Collections.binarySearch(clientes, aBuscar, criterio);
    }

    public void imprimirClientes() {
        clientes.forEach(item -> System.out.print(item.getNif() + "\t" + item.getNombre()+ "\n"));
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        vehiculos.add(nuevo);
    }

    public void ordenarPorMatricula() {
        Comparator<Vehiculo> criterio = (v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula());
        Collections.sort(vehiculos, criterio);
    }

    public void ordenarPorTarifa() {
        //Ponemos el cast de int porque solo nos interesa saber si es número positivo, negativo o 0
        Comparator<Vehiculo> criterio = (v1, v2) -> (int) (v1.getTarifa() - v2.getTarifa());
        Collections.sort(vehiculos, criterio);
    }

    public int buscarVehiculoPorTarifa(Vehiculo v) {
        this.ordenarPorTarifa();
        System.out.println("Hemos ordenado por matrícula");
        Comparator<Vehiculo> criterio = (v1, v2) -> (int) (v1.getTarifa() - v2.getTarifa());
        return Collections.binarySearch(vehiculos, v, criterio);
    }

    public int buscarVehiculoPorMatricula(Vehiculo v) {
        this.ordenarPorMatricula();
        System.out.println("Hemos ordenado por matrícula");
        Comparator<Vehiculo> criterio = (v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula());
        return Collections.binarySearch(vehiculos, v, criterio);
    }

    public void imprimirVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public boolean alquilarVehiculo(Cliente c, Vehiculo v, int dias, LocalDate fecha) {
        // busca el cliente a partir del nif

        int cliente = buscarClientePorNIF(c);
        // busca el vehículo a partir de la matrícula
        int vehiculo = buscarVehiculoPorMatricula(v);
        
        if (cliente >= 0 && vehiculo >= 0) {
            if (v.isDisponible()) {
                //lo dejamos como alquilado para evitar posibles conflictos
                v.setDisponible(false);
                alquileres.add(new VehiculoAlquilado(c, v, fecha, dias));

                return true;
            }
        }
        
        return false;
    }

    public void recibirVehiculo(Vehiculo v) {

        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        int recibir = buscarVehiculoPorMatricula(v);

        if (recibir < 0) {
            v.setDisponible(true);
        }

    }

    public void ordenarAlquilerFecha() {
        //Ponemos el cast de int porque solo nos interesa saber si es número positivo, negativo o 0
        Comparator<VehiculoAlquilado> criterio = (v1, v2) -> v1.getFechaAlquiler().compareTo(v2.getFechaAlquiler());
        Collections.sort(alquileres, criterio);
    }

    public void ordenarAlquilerNif() {
        //Ponemos el cast de int porque solo nos interesa saber si es número positivo, negativo o 0
        Comparator<VehiculoAlquilado> criterio = (v1, v2) -> v1.getCliente().getNif().compareTo(v2.getCliente().getNif());
        Collections.sort(alquileres, criterio);
    }

    public void ordenarAlquilerMatricula() {
        //Ponemos el cast de int porque solo nos interesa saber si es número positivo, negativo o 0
        Comparator<VehiculoAlquilado> criterio = (v1, v2) -> v1.getVehiculo().getMatricula().compareTo(v2.getVehiculo().getMatricula());
        Collections.sort(alquileres, criterio);
    }

    public ArrayList busquedaAlquileresClientesNIF(Cliente c) {
        ArrayList<VehiculoAlquilado> listaClienteNIF = new ArrayList<>();
        for (VehiculoAlquilado va  : alquileres) {
            if (va.getCliente().getNif().equals(c.getNif())) {
                listaClienteNIF.add(va);
            }
        }

        return listaClienteNIF;
    }

    public void imprimirMatriculaFecha() {
        for (int i = 0; i < alquileres.size(); i++) {
            System.out.println("El vehículo con mátricula " + alquileres.get(i).getVehiculo().getMatricula()
                    + " debe entregarse con fecha de " + entregaVehiculos(alquileres.get(i)));
        }
    }

    //Metodo para averiguar la fecha que hay que devolver el vehiculo
    public LocalDate entregaVehiculos(VehiculoAlquilado v) {
        LocalDate fechaAlquiler = v.getFechaAlquiler().plus(v.getTotalDiasAlquiler(), ChronoUnit.DAYS);
        return fechaAlquiler;
    }

    //METODO NUEVO
    public void finalizarAlquiler(VehiculoAlquilado alquiler) {
        // Comprobar alquiler existe en lista de activos
        alquileres.remove(alquiler);
        alquileresTerminados.add(alquiler);
        
        //this.recibirVehiculo(alquiler.getVehiculo());
        alquiler.getVehiculo().setDisponible(true);
        
        // Calcular los días reales
        
    }

    //METODO NUEVO
    public void imprimirAlquileresFinalizado() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        alquileresTerminados.forEach(item -> System.out.print(item.getCliente().getNif()
                + "**" + item.getVehiculo().getMatricula() + "**Desde /" + item.getFechaAlquiler().format(formato)
                + " hasta " + item.getFechaAlquiler().plus(item.getTotalDiasAlquiler(), ChronoUnit.DAYS).format(formato) + ". ** \n"
                + "Ganancia: " + this.ganancia(item) + " euros.\n"));
    }
    
    //METODO NUEVO
    public void imprimirAlquileres() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        alquileres.forEach(item -> System.out.print(item.getCliente().getNif()
                + "**" + item.getVehiculo().getMatricula() + "**Desde /" + item.getFechaAlquiler().format(formato)
                + " hasta " + item.getFechaAlquiler().plus(item.getTotalDiasAlquiler(), ChronoUnit.DAYS).format(formato) + "\n"));
    }

    public double ganancia(VehiculoAlquilado va) {
        return va.getVehiculo().getTarifa() * va.getTotalDiasAlquiler();
    }

    // incluir métodos ‘get’,‘set’ 
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<VehiculoAlquilado> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<VehiculoAlquilado> alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cif);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.paginaWeb);
        hash = 67 * hash + Objects.hashCode(this.clientes);
        hash = 67 * hash + Objects.hashCode(this.vehiculos);
        hash = 67 * hash + Objects.hashCode(this.alquileres);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpresaAlquilerVehiculos other = (EmpresaAlquilerVehiculos) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.paginaWeb, other.paginaWeb)) {
            return false;
        }
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        if (!Objects.equals(this.vehiculos, other.vehiculos)) {
            return false;
        }
        if (!Objects.equals(this.alquileres, other.alquileres)) {
            return false;
        }
        return true;
    }

}
