package lk.ijse.hostel_management_hibernate.repository.custom.impl;

import lk.ijse.hostel_management_hibernate.entity.Reservation;
import lk.ijse.hostel_management_hibernate.repository.custom.ReservationRepository;
import org.hibernate.Session;

import java.util.List;

public class ReservationRepositoryImpl implements ReservationRepository {
    @Override
    public void save(Reservation entity) {

    }

    @Override
    public void update(Reservation entity) {

    }

    @Override
    public void delete(Reservation entity) {

    }

    @Override
    public Reservation getById(String s) {
        return null;
    }

    @Override
    public List<Reservation> getDetailsToTableView() {
        return null;
    }

    @Override
    public void setSession(Session session) {

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
