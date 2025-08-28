import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Se crea la clase.
public class FRMbingo extends JFrame{

    private String[] columnas= {"Tittle 1", "Tittle 2", "Tittle 3", "Tittle 4"};
    private String[][] filas = new String[15][columnas.length];
    private String[][] filas1 = new String[5][columnas.length]; 
    private String[] opciones =  {"Item 1","Item 2"};
// Se crea el metodo constructor con identación.
    public FRMbingo(){

    //Inicio interfaz
        JFrame ventana = new JFrame(); // Se crea ventana vacía 
        setTitle("JUEGO DE BINGO. "); // Se le da nombre a la ventana
        setSize(600, 430); // Se le da el tamaño a la ventana 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para cerrar bien el programa
        setLayout(null);

        JLabel lbltabla1 = new JLabel(" Total tablas: "); 
        lbltabla1.setBounds(420, 20, 200, 30);
        lbltabla1.setFont(new Font("Times new roman", 1, 12));
        lbltabla1.setForeground(new Color(33, 33, 33));  // Gris oscuro casi negro
        getContentPane().add(lbltabla1);
        

        JLabel lbltabla = new JLabel("TABLA");
        lbltabla.setBounds(300, 120, 120, 20);
        lbltabla.setFont(new Font("Times new roman", 1, 11));
        lbltabla.setForeground(new Color(33, 33, 33));  // Gris oscuro casi negro
        getContentPane().add(lbltabla);
        
        
        JTextField txttabla1 = new JTextField();
        txttabla1.setBounds(500,20,50,30);
        getContentPane().add(txttabla1);

        JButton btniniciar = new JButton("Iniciar");
        btniniciar.setBounds(300,20,80,20);
        btniniciar.setFont(new Font("Times new roman", 1, 12));
        btniniciar.setBackground(new Color(76, 175, 80));
        btniniciar.setForeground(Color.WHITE);
        getContentPane().add(btniniciar);


        JButton btnsacarbaloto = new JButton("Sacar balota");
        btnsacarbaloto.setBounds(300, 50, 100, 20 );
        btnsacarbaloto.setFont(new Font("Times new roman", 1, 12));
        btnsacarbaloto.setEnabled(false);
        btnsacarbaloto.setBackground(new Color(33, 150, 243));
        btnsacarbaloto.setForeground(Color.WHITE);
        getContentPane().add(btnsacarbaloto);


        JComboBox<String> cmbitem1 = new JComboBox<>(opciones);
        cmbitem1.setBounds(350, 120, 200, 20);
        cmbitem1.setFont(new Font("Times new roman", 1, 12));
        getContentPane().add(cmbitem1);


        JTable tbltable = new JTable(); 
        tbltable.setSize(500, 300);
        tbltable.getTableHeader().setFont(new Font("Times new roman", 1, 12));
        tbltable.setEnabled(false);
        JScrollPane sptable = new JScrollPane(tbltable);
        sptable.setBounds(20, 10, 250, 350);
        getContentPane().add(sptable);

        DefaultTableModel dmttable = new DefaultTableModel(filas, columnas);
        tbltable.setModel(dmttable);

        // Aplicación del color Tabla #1
        tbltable.setBackground(Color.WHITE);
        tbltable.setForeground(Color.BLACK);
        tbltable.getTableHeader().setBackground(new Color(224, 224, 224)); // Gris claro

        JTable tbltablabingo = new JTable();
        tbltablabingo.setSize(400, 200);
        tbltablabingo.getTableHeader().setFont(new Font("Times new roman", 1, 12));
        tbltablabingo.setEnabled(false);
        JScrollPane sptablabingo = new JScrollPane(tbltablabingo);
        sptablabingo.setBounds(300,150,250,180);
        getContentPane().add(sptablabingo);

        DefaultTableModel dmttablabingo = new DefaultTableModel(filas1, columnas);
        tbltablabingo.setModel(dmttablabingo);

        //Aplicación de color tabla #2
        tbltablabingo.setBackground(Color.WHITE);
        tbltablabingo.setForeground(Color.BLACK);
        tbltablabingo.getTableHeader().setBackground(new Color(224, 224, 224)); // Gris claro

        // Color ventana
        getContentPane().setBackground(new Color(240, 248, 255));
        setVisible(true);
    // Termino interfaz.

    }

public class Tabla{
    
    private Random numeroAleatorio;
    private int[][] tabla;

    public Tabla(int numero){
        numeroAleatorio = new Random(System.currentTimeMillis() * numero);

        tabla = new int[5][5];
        for(int columna = 0; columna < 5; columna++){
            for(int fila = 0; fila < 5; fila ++){
                tabla [fila][columna] = 0;
                
            
            }
        }

    }

}

}
