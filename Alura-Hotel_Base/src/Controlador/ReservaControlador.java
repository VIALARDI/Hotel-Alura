package Controlador;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import Crud.ReservaCrud;
import factory.ConexionBase;
import modelo.Reserva;

public class ReservaControlador {
	private ReservaCrud reservas;
	
	public ReservaControlador() {
		Connection con = new ConexionBase().ConexionBase();
		this.reservas = new ReservaCrud(con);	
	}
	
	public void guardar (Reserva res) {
		this.reservas.guardar(res);
	}
	
	public List<Reserva> buscar(){
		return this.reservas.buscar();
	}
	public List<Reserva> buscarId(String id){
		return this.reservas.buscarId(id);
	}
		
	public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
		this.reservas.Actualizar(fechaE, fechaS, valor,formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservas.Eliminar(id);
	}
}
