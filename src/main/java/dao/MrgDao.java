package dao;

import models.Mgr;

import java.sql.SQLException;
import java.util.List;

public interface MrgDao {
    List<Mgr> getAllMgr() throws SQLException;
    Mgr getMgrByID(int mgrID)throws SQLException;
    boolean addMgr(Mgr mgr)throws SQLException;
    boolean updateMgr(Mgr mrg)throws SQLException;
    boolean deleteMgr(Mgr mgr)throws SQLException;

   // void registerMgr(Mgr mgr);
   // void login(String email, String password);
}
