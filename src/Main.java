/**
 * Kelas utama untuk menjalankan aplikasi manajemen pengguna.
 * Menggunakan UserManager untuk menambahkan dan mengambil pengguna.
 *
 * @author John Doe
 * @version 1.0
 * @since 2024-11-07
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek UserManager
        UserManager userManager = new UserManager();

        // Menambahkan pengguna baru
        try {
            User user1 = new User(1, "Alice");
            userManager.addUser(user1);
            System.out.println("Pengguna berhasil ditambahkan: " + user1.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan pengguna: " + e.getMessage());
        }

        // Mengambil pengguna berdasarkan ID
        User foundUser = userManager.getUser(1);
        if (foundUser != null) {
            System.out.println("Pengguna ditemukan: " + foundUser.getName());
        } else {
            System.out.println("Pengguna tidak ditemukan.");
        }

        // Mengupdate nama pengguna
        boolean updated = userManager.updateUser(1, "Bob");
        if (updated) {
            System.out.println("Nama pengguna berhasil diperbarui.");
        } else {
            System.out.println("Pengguna tidak ditemukan untuk diperbarui.");
        }
    }
}