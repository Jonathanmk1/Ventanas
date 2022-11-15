
package d11102022;

public class Ventana extends javax.swing.JFrame {
//pago por hora
//pago por comision
//pedir los datos
    public Ventana() {
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setSize(480, 320);
        super.setTitle("Mi primer programa");
        super.setLocationRelativeTo(Ventana.this);
        
        //super.setLayout(new java.awt.FlowLayout()); te asigna la posicion
        super.setLayout(null);
        lblNombre = new javax.swing.JLabel ("Nombre");
        txtNombre = new javax.swing.JTextField(10);
        
        btnGuardar = new javax.swing.JButton("Guardar");
        btncerrar = new javax.swing.JButton("Cerrar");
        
        btnGuardar.setBounds(150, 230, 80, 30);
        btncerrar.setBounds(250, 230, 80, 30);
        lblNombre.setBounds(50, 30, 80, 30);
        txtNombre.setBounds(150, 30, 150, 30);
        //btnGuardar.setSize(80, 30);
        //btnGuardar.setLocation(50, 50);
        
        super.add(lblNombre);
        super.add(txtNombre);
        super.add(btnGuardar);
        super.add(btncerrar);
        
    }
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton btnGuardar;
    private  javax.swing.JButton btncerrar;
    
}
