package lk.ijse.hostel_management_hibernate.repository.custom.impl;

import lk.ijse.hostel_management_hibernate.entity.Reservation;
import lk.ijse.hostel_management_hibernate.repository.custom.ReservationRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ReservationRepositoryImpl implements ReservationRepository {
    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(Reservation entity) {
        session.save(entity);
    }

    @Override
    public void update(Reservation entity) {
        session.update(entity);
    }

    @Override
    public void delete(Reservation entity) {
        session.delete(entity);
    }

    @Override
    public Reservation getById(String id) {
        String sql = "SELECT C FROM Reservation AS C WHERE C.reservationId = :res_id";
        Query query = session.createQuery(sql);
        query.setParameter("res_id", id);
        Reservation reservation = (Reservation) query.getSingleResult();
        return reservation;
    }

    @Override
    public List<Reservation> getDetailsToTableView() {
        String sql = "SELECT C FROM Reservation AS C";
        Query query = session.createQuery(sql);
        List<Reservation> list = query.list();
        return list;
    }

    @Override
    public int getReservationCount(String roomTypeId) {
        return 0;
    }

    @Override
    public List getMaxPersonsPerRoom(String roomTypeId) {
        return null;
    }

    @Override
    public void updateAvailableRooms(int available_rooms, String roomTypeId) {

    }
}
