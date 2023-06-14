/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbofinal.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pbofinal.config.MyConfig;
import pbofinal.models.Produk;
/**
 *
 * @author adria
 */


public class DbController extends MyConfig {

    public static List<Produk> getDatabase() {
        connection();
        List<Produk> dataList = new ArrayList<>();
        try {
            // query = "SELECT nama, harga, stok FROM tb_barang ORDER BY ID DESC";
            query = "SELECT ID, Nama, Harga, Jumlah FROM tb_barang"; //tb_barang

            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nama = resultSet.getString("Nama");
                int harga = resultSet.getInt("Harga");
                int jumlah = resultSet.getInt("Jumlah");
                
                Produk data = new Produk(id, nama,harga,jumlah);
                dataList.add(data);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataList;
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
                produk = new Produk(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getInt("harga"), resultSet.getInt("jumlah"));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produk;
    }

    public static boolean insertData(String nama, int harga, int jumlah) {
        connection();
        query = "INSERT INTO tb_barang (Nama, Harga, Jumlah) VALUES (?, ?, ?)";
        try {
            statement = connect.prepareStatement(query);
            statement.setString(1, nama);
            statement.setInt(2, harga);
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

    public static void updateHarga(int id, int harga) {
        connection();
        query = "UPDATE tb_barang SET Harga=? WHERE ID=?";
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

    public static boolean deleteData(int ID) {
        connection();
        query = "DELETE FROM tb_barang WHERE ID=?";
        try {
            statement = connect.prepareStatement(query);
            statement.setInt(1, ID);
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
