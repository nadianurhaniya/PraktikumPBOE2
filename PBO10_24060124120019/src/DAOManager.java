/*
 * File     : DAOManager.java
 * Deskripsi: pengelola DAO dalam program
 * Pembuat  : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal  : 20 Mei 2026
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}