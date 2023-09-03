package lk.ijse.hostel_management_hibernate.repository.custom.impl;

import lk.ijse.hostel_management_hibernate.projection.CustomProjection;
import lk.ijse.hostel_management_hibernate.repository.custom.QueryRepository;
import org.hibernate.Session;

import java.util.List;

public class QueryRepositoryImpl implements QueryRepository {
    private Session session;
    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public List<CustomProjection> getDetailsOfStudentsWithoutKeyMoney() {
        return null;
    }
}
