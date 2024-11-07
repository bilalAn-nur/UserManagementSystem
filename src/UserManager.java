import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini mengelola data pengguna dalam aplikasi.
 * Menyediakan fungsionalitas untuk menambahkan, mengambil, dan mengupdate pengguna.
 *
 * @author John Doe
 * @version 1.0
 * @since 2024-11-07
 */
public class UserManager {
    private List<User> users;

    /**
     * Konstruktor untuk membuat objek UserManager yang berisi daftar pengguna kosong.
     */
    public UserManager() {
        this.users = new ArrayList<>();
    }

    /**
     * Menambahkan pengguna baru ke dalam daftar pengguna.
     *
     * @param user Objek pengguna yang akan ditambahkan ke dalam daftar.
     * @return True jika pengguna berhasil ditambahkan, False jika tidak valid.
     * @throws IllegalArgumentException Jika data pengguna tidak valid.
     */
    public boolean addUser(User user) throws IllegalArgumentException {
        if (user == null || !user.isValid()) {
            throw new IllegalArgumentException("Data pengguna tidak valid");
        }
        users.add(user);
        return true;
    }

    /**
     * Mengambil pengguna berdasarkan ID.
     *
     * @param userId ID pengguna yang ingin diambil.
     * @return Pengguna dengan ID yang sesuai, atau null jika tidak ditemukan.
     */
    public User getUser(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }
    /**
     * Mengupdate nama pengguna berdasarkan ID.
     *
     * @param userId ID pengguna yang datanya akan diupdate.
     * @param newName Nama baru yang akan diberikan kepada pengguna.
     * @return True jika update berhasil, False jika pengguna tidak ditemukan.
     */
    public boolean updateUser(int userId, String newName) {
        User user = getUser(userId);
        if (user != null) {
            user = new User(userId, newName); // Membuat pengguna baru dengan nama yang diupdate
            return true;
        }
        return false;
    }
}