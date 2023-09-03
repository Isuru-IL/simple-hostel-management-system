package lk.ijse.hostel_management_hibernate.repository.custom.impl;

import lk.ijse.hostel_management_hibernate.entity.Room;
import lk.ijse.hostel_management_hibernate.projection.RoomProjection;
import lk.ijse.hostel_management_hibernate.repository.custom.RoomRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class RoomRepositoryImpl implements RoomRepository {
    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public List<String> loadRoomTypeIds() {
        return null;
    }


    @Override
    public void save(Room entity) {
        session.save(entity);
    }

    @Override
    public void update(Room entity) {
        session.update(entity);
    }

    @Override
    public void delete(Room entity) {
        session.delete(entity);
    }

    @Override
    public Room getById(String s) {
        return null;
    }

    @Override
    public List<Room> getDetailsToTableView() {
        String sql = "SELECT C FROM Room AS C";
        Query query = session.createQuery(sql);
        List<Room> roomList = query.list();
        return roomList;
    }

    @Override
    public List<RoomProjection> getDetailsForRoomAvailabily() {
        return null;
    }
}