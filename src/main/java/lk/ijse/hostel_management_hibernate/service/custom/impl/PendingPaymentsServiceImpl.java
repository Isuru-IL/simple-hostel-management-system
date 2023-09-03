package lk.ijse.hostel_management_hibernate.service.custom.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.hostel_management_hibernate.config.SessionFactoryConfig;
import lk.ijse.hostel_management_hibernate.projection.CustomProjection;
import lk.ijse.hostel_management_hibernate.repository.RepositoryFactory;
import lk.ijse.hostel_management_hibernate.repository.custom.QueryRepository;
import lk.ijse.hostel_management_hibernate.service.custom.PendingPaymentsService;
import org.hibernate.Session;

import java.util.List;

public class PendingPaymentsServiceImpl implements PendingPaymentsService {
    private QueryRepository queryRepository = RepositoryFactory.getRepositoryFactory().getRepository(RepositoryFactory.RepositoryTypes.QUERY);
    @Override
    public ObservableList<CustomProjection> getDetailsToTableView() {
        Session session = SessionFactoryConfig.getInstance().getSession();

        try{
            queryRepository.setSession(session);
            List<CustomProjection> list = queryRepository.getDetailsOfStudentsWithoutKeyMoney();
            ObservableList<CustomProjection> obList = FXCollections.observableArrayList(list);

            session.close();
            return obList;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("getDetailsToPendingPaymentTable = "+e);
            session.close();
            return null;
        }
    }
}
