package projectHHFromLeonid.tracker.dao.impl;

import org.springframework.stereotype.Service;
import projectHHFromLeonid.tracker.dao.interfaces.SalaryDataBaseRepo;

@Service
public class SalaryRepoImplMongo implements SalaryDataBaseRepo {


    @Override
    public void putToDatabase() {
        System.out.println("Кладем Монго");
    }


}
