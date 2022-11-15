package d11102022;

public class VentanaExH extends javax.swing.JFrame {

    public VentanaExH() {
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setSize(480, 320);
        super.setTitle("Empleado Por Hora");
        super.setLocationRelativeTo(VentanaExH.this);

        //super.setLayout---te asigna la posicion
        super.setLayout(null);

        id = new javax.swing.JLabel("id");
        txtid = new javax.swing.JTextField(10);

        lblNombre = new javax.swing.JLabel("Nombre");
        txtNombre = new javax.swing.JTextField(10);

        ape = new javax.swing.JLabel("Apellido");
        txtape = new javax.swing.JTextField(10);

        ht = new javax.swing.JLabel("Horas Trabajadas");
        txtht = new javax.swing.JTextField(10);

        ph = new javax.swing.JLabel("Pago por Hora");
        txtph = new javax.swing.JTextField(10);

        btnGuardar = new javax.swing.JButton("Guardar");
        btncerrar = new javax.swing.JButton("Cerrar");

        btnGuardar.setBounds(150, 230, 80, 30);
        btncerrar.setBounds(250, 230, 80, 30);

        id.setBounds(50, 30, 80, 30);
        txtid.setBounds(150, 30, 150, 30);

        lblNombre.setBounds(60, 40, 90, 40);
        txtNombre.setBounds(160, 40, 160, 40);

        ape.setBounds(70, 50, 100, 50);
        txtape.setBounds(170, 50, 170, 50);

        ht.setBounds(80, 60, 110, 60);
        txtht.setBounds(180, 60, 180, 60);

        ph.setBounds(90, 70, 120, 70);
        txtph.setBounds(190, 70, 190, 70);

        //btnGuardar.setSize(80, 30);
        //btnGuardar.setLocation(50, 50);

        super.add(id);
        super.add(txtid);
        super.add(lblNombre);
        super.add(txtNombre);
        super.add(ape);
        super.add(txtape);
        super.add(ht);
        super.add(txtht);
        super.add(ph);
        super.add(txtph);
        super.add(btnGuardar);
        super.add(btncerrar);

    }
    private javax.swing.JLabel id;
    private javax.swing.JTextField txtid;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel ape;
    private javax.swing.JTextField txtape;
    private javax.swing.JLabel ht;
    private javax.swing.JTextField txtht;
    private javax.swing.JLabel ph;
    private javax.swing.JTextField txtph;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btncerrar;

}
