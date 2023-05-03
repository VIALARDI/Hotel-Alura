package Controlador;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import Crud.HuespedesCrud;
import factory.ConexionBase;
import modelo.Huespedes;

public class HuespedesControlador {
	private HuespedesCrud huespedesCrud;
	
	
	public HuespedesControlador() {
		Connection connection = new ConexionBase().ConexionBase();
		this.huespedesCrud = new HuespedesCrud(connection);
	}
	
	public void guardar(Huespedes huespedes) {
		this.huespedesCrud.guardar(huespedes);
	}
	
	public  List<Huespedes> buscarHuespedes(){
		return this.huespedesCrud.buscar();
	}
	
	public  List<Huespedes> buscarHuespedesId(String id){
		return this.huespedesCrud.buscarId(id);
	}
	
	public void actualizar(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono,Integer id_reserva) {
		this.huespedesCrud.Actualizar(nombre, apellido, fechaNacimiento, nacionalidad, telefono,id_reserva);
	}
	 
	public void Eliminar(Integer idReserva) {
		this.huespedesCrud.Eliminar(idReserva);
	}
	
	
}
