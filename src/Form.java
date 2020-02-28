import javax.swing.*;

public class Form extends JFrame{
    JLabel title, nama, nim, jenis_k, agama, alamat;
    JTextField nama_tf, nim_tf;
    JRadioButton laki, perempuan;
    JTextArea alamat_ta;
    JComboBox agama_cb; 
    JButton done;
    
    public void tampil(){
        title = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        nim = new JLabel("NIM");
        jenis_k = new JLabel("Jenis Kelamin");
        agama = new JLabel("Agama");
        alamat = new JLabel("Alamat");
        nama_tf = new JTextField();
        nim_tf = new JTextField();
        alamat_ta = new JTextArea(200,100);
        done = new JButton("Simpan");
        
        ButtonGroup group = new ButtonGroup();
        laki = new JRadioButton("L");
        perempuan = new JRadioButton("P");
        group.add(laki);
        group.add(perempuan);
        
        agama_cb = new JComboBox();
        agama_cb.addItem("Islam");
        agama_cb.addItem("Kristen");
        agama_cb.addItem("Katolik");
        agama_cb.addItem("Hindu");
        agama_cb.addItem("Buddha");
        agama_cb.addItem("Kong Hu Cu");
        
        setLayout(null);
        add(title);
        add(nama);
        add(nama_tf);
        add(nim);
        add(nim_tf);
        add(jenis_k);
        add(laki);
        add(perempuan);
        add(agama);
        add(agama_cb);
        add(alamat);
        add(alamat_ta);
        add(done);
        
        title.setBounds(178, 20, 200, 20);
        nama.setBounds(100, 80, 150, 20);
        nama_tf.setBounds(240, 80, 200, 20);
        nim.setBounds(100, 120, 150, 20);
        nim_tf.setBounds(240, 120, 200, 20);
        jenis_k.setBounds(100, 160, 150, 20);
        laki.setBounds(240, 160, 50, 20);
        perempuan.setBounds(290, 160, 50, 20);
        agama.setBounds(100, 200, 150, 20);
        agama_cb.setBounds(240, 200, 100, 20);
        alamat.setBounds(100, 240, 150, 20);
        alamat_ta.setBounds(240, 240, 200, 100);
        done.setBounds(200, 380, 80, 20);
      
        setSize(500,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
