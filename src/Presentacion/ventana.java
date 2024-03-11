package Presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ventana extends javax.swing.JFrame {

    private File selectedFile;

    public ventana() {
        initComponents();
        this.setTitle("Editor de Texto Simple");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();
        autorLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAbrir = new javax.swing.JMenu();
        MenuGuardar = new javax.swing.JMenu();
        MenuGuardarComo = new javax.swing.JMenu();
        MenuImprimir = new javax.swing.JMenu();
        MenuZoom = new javax.swing.JMenu();
        MenuZoomMas = new javax.swing.JMenuItem();
        MenuZoomMenos = new javax.swing.JMenuItem();
        MenuModo = new javax.swing.JMenu();
        MenuClaro = new javax.swing.JMenuItem();
        MenuOscuro = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        JTextArea.setColumns(20);
        JTextArea.setRows(5);
        jScrollPane1.setViewportView(JTextArea);

        autorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autorLabel.setText("© Santiago Badiola");
        autorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(autorLabel)
                .addGap(479, 479, 479))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autorLabel))
        );

        MenuAbrir.setText("Abrir");
        MenuAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAbrirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuAbrir);

        MenuGuardar.setText("Guardar");
        MenuGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuGuardarMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuGuardar);

        MenuGuardarComo.setText("Guardar Como");
        MenuGuardarComo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuGuardarComoMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuGuardarComo);

        MenuImprimir.setText("Imprimir");
        MenuImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuImprimirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuImprimir);

        MenuZoom.setText("Zoom");

        MenuZoomMas.setText("Zoom +");
        MenuZoomMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuZoomMasActionPerformed(evt);
            }
        });
        MenuZoom.add(MenuZoomMas);

        MenuZoomMenos.setText("Zoom -");
        MenuZoomMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuZoomMenosActionPerformed(evt);
            }
        });
        MenuZoom.add(MenuZoomMenos);

        jMenuBar1.add(MenuZoom);

        MenuModo.setText("Modo");

        MenuClaro.setText("Claro");
        MenuClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClaroActionPerformed(evt);
            }
        });
        MenuModo.add(MenuClaro);

        MenuOscuro.setText("Oscuro");
        MenuOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOscuroActionPerformed(evt);
            }
        });
        MenuModo.add(MenuOscuro);

        jMenuBar1.add(MenuModo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAbrirMouseClicked

        // Crear un JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Mostrar el diálogo de selección de archivo
        int result = fileChooser.showOpenDialog(null);

        // Verificar si se seleccionó un archivo
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile(); //Referencia al archivo seleccionado
            try {
                // Abrir el archivo seleccionado
                FileReader fileReader = new FileReader(selectedFile);
                BufferedReader reader = new BufferedReader(fileReader);

                // Leer el contenido del archivo línea por línea
                StringBuilder text = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line).append("\n");
                }

                // Cerrar el BufferedReader
                reader.close();

                // Mostrar el contenido del archivo en el JTextArea
                JTextArea.setText(text.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
    }//GEN-LAST:event_MenuAbrirMouseClicked

    private void MenuGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuGuardarMouseClicked
        if (selectedFile != null) {
            try {
                FileWriter fileWriter = new FileWriter(selectedFile);
                fileWriter.write(JTextArea.getText());
                fileWriter.close();
                JOptionPane.showMessageDialog(this, "Cambios guardados correctamente.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún archivo para guardar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_MenuGuardarMouseClicked

    private void MenuGuardarComoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuGuardarComoMouseClicked
        String text = JTextArea.getText();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Archivo");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Obtener el nombre actual del archivo
            String nombreArchivo = fileToSave.getName();

            // Agregar la extensión ".txt" al nombre del archivo si no la tiene ya
            if (!nombreArchivo.toLowerCase().endsWith(".txt")) {
                nombreArchivo += ".txt";
                // Crear un nuevo objeto File con el nuevo nombre
                fileToSave = new File(fileToSave.getParent(), nombreArchivo);
            }

            // Obtener la ruta absoluta del archivo
            String filePath = fileToSave.getAbsolutePath();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(text);
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_MenuGuardarComoMouseClicked

    private void MenuImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuImprimirMouseClicked
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(new Printable() {
            public int print(java.awt.Graphics graphics, java.awt.print.PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                JTextArea.printAll(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_MenuImprimirMouseClicked

    private void MenuZoomMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuZoomMasActionPerformed
        Font font = JTextArea.getFont();
        float newSize = font.getSize() + 4; // Aumentar el tamaño de la fuente
        JTextArea.setFont(font.deriveFont(newSize));
    }//GEN-LAST:event_MenuZoomMasActionPerformed

    private void MenuZoomMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuZoomMenosActionPerformed
        Font font = JTextArea.getFont();
        float newSize = font.getSize() - 4; // Aumenta el tamaño de la fuente en 2 puntos
        JTextArea.setFont(font.deriveFont(newSize));
    }//GEN-LAST:event_MenuZoomMenosActionPerformed

    private void MenuClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClaroActionPerformed
         Color colorPanel = new Color(102, 102, 102);
         Color colorTextArea = new Color(255, 255, 255);
         jPanel1.setBackground(colorPanel);
         JTextArea.setBackground(colorTextArea);
         JTextArea.setForeground(Color.BLACK);
    }//GEN-LAST:event_MenuClaroActionPerformed

    private void MenuOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOscuroActionPerformed
        Color colorPanel = new Color(0, 0, 51);
        Color colorTextArea = new Color(30, 30, 30);
        jPanel1.setBackground(colorPanel);
        JTextArea.setBackground(colorTextArea);
        JTextArea.setForeground(Color.WHITE);
    }//GEN-LAST:event_MenuOscuroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JMenu MenuAbrir;
    private javax.swing.JMenuItem MenuClaro;
    private javax.swing.JMenu MenuGuardar;
    private javax.swing.JMenu MenuGuardarComo;
    private javax.swing.JMenu MenuImprimir;
    private javax.swing.JMenu MenuModo;
    private javax.swing.JMenuItem MenuOscuro;
    private javax.swing.JMenu MenuZoom;
    private javax.swing.JMenuItem MenuZoomMas;
    private javax.swing.JMenuItem MenuZoomMenos;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
