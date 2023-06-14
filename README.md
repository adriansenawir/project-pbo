# App.java

`App.java` adalah kelas yang berisi metode `main` untuk menjalankan aplikasi.

## Metode

- `main(String[] args)`: Metode utama yang menjalankan `Menu.showMenu();` untuk memulai aplikasi.

# config

terdapat 1 class pada file ini yaitu `MyConfig.java`

## MyConfig.java

`MyConfig.java` adalah kelas yang bertanggung jawab untuk membuat koneksi ke database menggunakan JDBC.

### Metode

```java
- `connection()`: Membuat koneksi dengan database menggunakan URL, username, dan password yang telah ditentukan.
```

# controllers

terdapat 1 class pada file ini yaitu `DbController.java`

## DbController.java

`DbController.java` Sebagai pengontrol akses ke database dengan menyediakan beberapa method untuk melakukan operasi seperti mengambil data, memasukkan data, memperbarui data, dan menghapus data

### Metode

```java
- `getDatabase()` : Memiliki fungsi untuk mendapatkan data dari database dan menampilkannya ke layar.
- `getProdukByNama(String nama)` : Memiliki fungsi untuk mendapatkan data produk dari database berdasarkan nama produk yang diberikan.
- `insertData(String nama, long harga, int jumlah)` : Memiliki fungsi untuk memasukkan data baru ke dalam database.
- `updateNama(int id, String nama)` : Memiliki fungsi untuk memperbarui nama produk dalam database berdasarkan Nama produk yang diberikan.
- `updateHarga(int id, long harga)` : Memiliki fungsi untuk memperbarui harga produk dalam database berdasarkan harga yang diberikan.
- `updateJumlah(int id, int jumlah)` : Memiliki fungsi untuk memperbarui jumlah produk dalam database berdasarkan jumlah yang diberikan.
- `deleteData(String nama)` : Memiliki fungsi untuk menghapus data produk dalam database berdasarkan Nama yang diberikan.
```
# layout

terdapat 5 class pada file ini yaitu `Delete.java`, `Edit.java`, `Insert.java`, `Menu.java`, `Read.java`

## Delete.java

`Delete.java` Berfungsi sebagai tampilan untuk menghapus data produk dari tabel tb_barang.

### Metode

```java
- `showDeleteData()` : berfungsi sebagai antarmuka pengguna untuk menghapus data dari database.
```

## Edit.java

`Edit.java` Berfungsi sebagai class untuk mengedit data dalam database

### Metode

```java
- `showEditData(String nama)` : Berfungsi untuk menampilkan antarmuka pengguna untuk memilih data yang ingin diedit.
- `showEditNama(String nama)` : Berfungsi untuk menampilkan antarmuka pengguna untuk mengedit nama produk.
- `showEditHarga(String nama)` : Berfungsi untuk menampilkan antarmuka pengguna untuk mengedit harga produk.
- `showEditJumlah(String nama)` : Berfungsi untuk menampilkan antarmuka pengguna untuk mengedit jumlah produk.
```

## Insert.java

`Insert.java` Berfungsi untuk menyisipkan data baru ke dalam database

### Metode

```java
- `showInsertData()` : Berfungsi untuk menampilkan antarmuka pengguna untuk memasukkan data baru ke dalam database.
```

## Menu.java

`Menu.java` Berfungsi untuk menampilkan antarmuka menu utama untuk pengguna.

### Metode

```java
- `showMenu()`: Berfungsi untuk menampilkan antarmuka menu utama kepada pengguna.
- `selectMenu()` : Berfungsi untuk membaca input dari pengguna untuk memilih opsi menu. 
```

## Read.java

`Read.java` Berfungsi untuk menampilkan data produk dari database kepada pengguna.

### Metode

```java
- `showReadData()` : Berfungsi untuk menampilkan data produk dari database kepada pengguna.
```

# models

terdapat 1 class pada file ini yaitu `Produk.java`

## Produk.java

`Produk.java` adalah kelas yang merepresentasikan objek produk dalam aplikasi.

### Atribut

```java
- `id`: Menyimpan ID produk.
- `name`: Menyimpan Nama produk.
- `harga`: Menyimpan Harga produk.
- `jumlah`:Menyimpan Jumlah produk.
```

### Metode

- Metode setter dan getter untuk mengakses dan mengubah nilai atribut id, nama, harga, dan jumlah.
