## 5 Komponen Utama GUI yang Digunakan

1. **Top-level Container Class**
   * **Kelas/Interface:** `javax.swing.JFrame`
   * **Penjelasan:** Digunakan sebagai jendela utama aplikasi (`frame`) yang menaungi seluruh komponen visual.

2. **Intermediate Container Class**
   * **Kelas/Interface:** `javax.swing.JPanel`
   * **Penjelasan:** Digunakan sebagai wadah perantara (`panel`) untuk mengelompokkan komponen-komponen di dalam frame.

3. **Atomic Component Class**
   * **Kelas/Interface:** `javax.swing.JLabel` & `javax.swing.JButton`
   * **Penjelasan:** `JLabel` (`label`) digunakan untuk menampilkan teks, sedangkan `JButton` (`button`) digunakan sebagai tombol interaktif.

4. **Layout Classes**
   * **Kelas/Interface:** `java.awt.BorderLayout` & `java.awt.FlowLayout`
   * **Penjelasan:** 
     * `BorderLayout` digunakan untuk mengatur tata letak pada `JFrame`.
     * `FlowLayout` digunakan untuk mengatur tata letak komponen secara berurutan di dalam `JPanel`.

5. **Event Listener**
   * **Kelas/Interface:** `java.awt.event.ActionListener`
   * **Penjelasan:** Mengimplementasikan method override `actionPerformed` untuk menangani aksi klik pada tombol agar mengubah teks pada label.

---

## Screenshot Program
![](./ss/Screenshot%202026-11-17%20151045.png)