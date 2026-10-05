# Navigation Compose Practicum - Android Studio & Jetpack Compose

Repository ini berisi implementasi praktikum **Navigation Compose** pada aplikasi Android berbasis **Jetpack Compose**. Aplikasi ini mengimplementasikan alur navigasi multi-halaman (*multi-screen*) menggunakan konsep **`NavController`**, **`NavHost`**, **`Routes`**, **`Data Class`**, serta manajemen **`Back Stack`**.

---

## 🚀 Fitur Utama & Struktur Halaman

Aplikasi terdiri dari **4 Halaman (Destinations)** utama:
1. **Home Screen (`startDestination`)**: Halaman utama yang berfungsi sebagai entri awal aplikasi. Berisi opsi navigasi untuk berpindah ke halaman Detail, Profile, maupun About.
2. **Detail Screen**: Halaman yang menampilkan **properti NIM & IPK** dari objek **`Student`** (menggunakan *Data Class*).
3. **Profile Screen**: Halaman profil pengguna yang menyajikan informasi nama mahasiswa dan deskripsi lainnya.
4. **About Screen**: Halaman informasi aplikasi / *about page* dengan tampilan UI yang telah dipercantik (*aesthetic finishing touch*).

---

## 🧠 Konsep & Fitur Navigasi

### 1. Model Data Class (`Student`)
- Menggunakan Kotlin **`data class`** untuk memodelkan struktur data `Student` (seperti `nama`, `nim`, dll.), sehingga pengelolaan properti dan behavior data objek mahasiswa terstruktur dengan rapi.

### 2. Manajemen Back Stack (`popBackStack`)
- Aplikasi **tidak menggunakan `Activity` terpisah** untuk setiap halaman. Seluruh alur navigasi berada di dalam satu `MainActivity` menggunakan **Navigation Compose**.
- Tombol *Kembali* (Back Button) pada setiap halaman dikelola dengan pemanggilan callback `navController.popBackStack()`.
- **Perilaku Back Stack**: Navigasi selalu mengembalikan pengguna ke halaman/stack sebelumnya (*last stack*) sesuai riwayat navigasi (contoh: `Home` → `Detail` → `Profile` → *Back* ke `Detail` → *Back* ke `Home`), dan bukan me-reset atau *hardcode* kembali ke `Home`.

---

## 📁 Struktur Proyek

```text
com.example.navigationlab/
├── MainActivity.kt               # Entry point aplikasi
├── NavigationLabApp.kt           # Setup NavHost, NavController, dan Navigation Graph
├── Routes.kt                     # Definisi konstanta Route & helper function
├── model/
│   └── Student.kt                # Data Class & Model Objek Student
└── ui/
    └── screen/
        ├── HomeScreen.kt         # UI Halaman Utama
        ├── DetailScreen.kt       # UI Halaman Detail (Menerima argument & Objek Student)
        ├── ProfileScreen.kt      # UI Halaman Profil
        └── AboutScreen.kt        # UI Halaman About
