
package d11102022;

public class VentanaExC extends javax.swing.JFrame {
     public VentanaExC() {
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setSize(480, 320);
        super.setTitle("Empleado Por Comision");
        super.setLocationRelativeTo(VentanaExC.this);

        //super.setLayout---te asigna la posicion
        super.setLayout(null);

        id = new javax.swing.JLabel("id");
        txtid = new javax.swing.JTextField(10);

        lblNombre = new javax.swing.JLabel("Nombre");
        txtNombre = new javax.swing.JTextField(10);

        ape = new javax.swing.JLabel("Apellido");
        txtape = new javax.swing.JTextField(10);

        vt = new javax.swing.JLabel("Ventas totales");
        txtvt = new javax.swing.JTextField(10);

        tc = new javax.swing.JLabel("Tarifa de comision");
        txttc = new javax.swing.JTextField(10);

        btnGuardar = new javax.swing.JButton("Guardar");
        btncerrar = new javax.swing.JButton("Cerrar");
//-------------------------------------------------------------------------------------------
        btnGuardar.setBounds(150, 230, 80, 30);
        btncerrar.setBounds(250, 230, 80, 30);

        id.setBounds(50, 30, 80, 30);
        txtid.setBounds(150, 30, 150, 30);

        lblNombre.setBounds(60, 40, 90, 40);
        txtNombre.setBounds(160, 40, 160, 40);

        ape.setBounds(70, 50, 100, 50);
        txtape.setBounds(170, 50, 170, 50);

        vt.setBounds(80, 60, 110, 60);
        txtvt.setBounds(180, 60, 180, 60);

        tc.setBounds(90, 70, 120, 70);
        txttc.setBounds(190, 70, 190, 70);
        
        super.add(id);
        super.add(txtid);
        super.add(lblNombre);
        super.add(txtNombre);
        super.add(ape);
        super.add(txtape);
        super.add(vt);
        super.add(txtvt);
        super.add(tc);
        super.add(txttc);
        super.add(btnGuardar);
        super.add(btncerrar);

    }
    private javax.swing.JLabel id;
    private javax.swing.JTextField txtid;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel ape;
    private javax.swing.JTextField txtape;
    private javax.swing.JLabel vt;
    private javax.swing.JTextField txtvt;
    private javax.swing.JLabel tc;
    private javax.swing.JTextField txttc;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btncerrar;

}