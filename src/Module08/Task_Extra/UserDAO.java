package Module8.Task_Extra;

public class UserDAO extends AbstractDAOimpl {
   private long id;
   private String name;

    public UserDAO() {
        super();
    }

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDAO userDAO = (UserDAO) o;

        if (id != userDAO.id) return false;
        return name != null ? name.equals(userDAO.name) : userDAO.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
