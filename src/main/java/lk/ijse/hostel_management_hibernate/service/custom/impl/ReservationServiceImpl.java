package lk.ijse.hostel_management_hibernate.service.custom.impl;

import javafx.collections.ObservableList;
import lk.ijse.hostel_management_hibernate.dto.ReservationDTO;
import lk.ijse.hostel_management_hibernate.service.custom.ReservationService;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    @Override
    public List<String> loadStudentIds() {
        return null;
    }

    @Override
    public List<String> loadRoomTypeIds() {
        return null;
    }

    @Override
    public boolean saveReservation(ReservationDTO reservationDTO) {
        return false;
    }

    @Override
    public boolean updateReservation(ReservationDTO reservationDTO) {
        return false;
    }

    @Override
    public boolean deleteReservation(ReservationDTO reservationDTO) {
        return false;
    }

    @Override
    public ObservableList<ReservationDTO> getDetailsToTableView() {
        return null;
    }

    @Override
    public ReservationDTO searchByResId(String id) {
        return null;
    }
}
