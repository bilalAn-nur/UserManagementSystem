/**
 * Kelas ini merepresentasikan seorang pengguna dalam sistem.
 * Menyimpan data pribadi pengguna seperti ID dan nama.
 *
 * @author John Doe
 * @version 1.0
 * @since 2024-11-07
 */
public class User {
    private int id;
    private String name;

    /**
     * Konstruktor untuk membuat objek pengguna dengan ID dan nama.
     *
     * @param id ID pengguna.
     * @param name Nama pengguna.
     */
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Mendapatkan ID pengguna.
     *
     * @return ID pengguna.
     */
    public int getId() {
        return id;
    }

    /**
     * Mendapatkan nama pengguna.
     *
     * @return Nama pengguna.
     */
    public String getName() {
        return name;
    }

    /**
     * Memeriksa apakah data pengguna valid.
     *
     * @return True jika pengguna valid (id > 0 dan nama tidak kosong), false sebaliknya.
     */
    public boolean isValid() {
        return id > 0 && name != null && !name.isEmpty();
    }
}