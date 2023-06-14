package controllers;

import java.sql.SQLException;

import com.config.MyConfig;
import models.Produk;

public class DbController extends MyConfig {

    public static void getDatabase() {
        connection();;
        try {
            // query = "SELECT nama, harga, stok FROM tb_barang ORDER BY ID DESC";
            query = "SELECT Nama, Harga, Jumlah FROM tb_barang"; //tb_barang

            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                System.out.println(
                    String.format("%s - Rp.%d - Stok %d", resultSet.getString("nama"), resultSet.getInt("harga"), resultSet.getInt("jumlah"))
                );
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Produk getProdukByNama(String nama) {
        Produk produk = null;
        connection();
        query = "SELECT * FROM tb_barang WHERE NAMA=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setString(1, nama);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                produk = new Produk(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getLong("harga"), resultSet.getInt("jumlah"));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produk;
    }

    public static boolean insertData(String nama, long harga, int jumlah) {
        connection();
        query = "INSERT INTO tb_barang (Nama, Harga, Jumlah) VALUES (?, ?, ?)";
        try {
            statement = connect.prepareStatement(query);
            statement.setString(1, nama);
            statement.setLong(2, harga);
            statement.setInt(3, jumlah);
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void updateNama(int id, String nama) {
        connection();
        query = "UPDATE tb_barang SET Nama=? WHERE ID=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setString(1, nama);
            statement.setInt(2, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateHarga(int id, long harga) {
        connection();
        query = "UPDATE tb_barang Harga=? WHERE ID=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setLong(1, harga);
            statement.setInt(2, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateJumlah(int id, int jumlah) {
        connection();
        query = "UPDATE tb_barang SET Jumlah=? WHERE ID=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setInt(1, jumlah);
            statement.setInt(2, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteData(String nama) {
        connection();
        query = "DELETE FROM tb_barang WHERE NAMA=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setString(1, nama);
            int affectedRowDelete = statement.executeUpdate();
            if (affectedRowDelete > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
