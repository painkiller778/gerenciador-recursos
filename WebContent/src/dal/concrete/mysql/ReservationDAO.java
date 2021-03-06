package dal.concrete.mysql;

import dal._abstract.mysql.AbstractDAO;

import pojo.Reservation;
import pojo.Resource;
import pojo.User;

public class ReservationDAO extends AbstractDAO<Reservation> {
	private static ReservationDAO instance;

	public ReservationDAO() {
		super(Reservation.class);
	}

	public static ReservationDAO getInstance() {
		if (instance == null)
			instance = new ReservationDAO();
		return instance;
	}
}
