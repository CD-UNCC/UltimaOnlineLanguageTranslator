package my.Trans;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.Scanner;//for creating a scanner for keyboard input
import java.io.*;//for IOExceptions in the get ascii and get mores methods
// @author Scott "Cear Dragon" Clark
public class transUI extends javax.swing.JFrame {

    public transUI() {
        setIcon();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gargBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commonBox = new javax.swing.JTextArea();
        transButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        topBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ultima Online Translation Software");
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jLabel1.setText("Common to Gargoyle Translator by Cear Dragon");

        jLabel2.setText("Sentence to Translate");

        gargBox.setColumns(20);
        gargBox.setLineWrap(true);
        gargBox.setRows(5);
        gargBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(gargBox);

        jLabel3.setText("In Gargish");

        commonBox.setColumns(20);
        commonBox.setLineWrap(true);
        commonBox.setRows(5);
        commonBox.setWrapStyleWord(true);
        commonBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commonBoxKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(commonBox);

        transButton.setText("TRANSLATE");
        transButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Results automatically placed on clipboard");

        jLabel5.setText("Always on top");

        topBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(topBox))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addComponent(transButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Translate basic english to Britannian Gargish. For use in Ultima Online");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transButtonActionPerformed
        convert(commonBox.getText());

    }//GEN-LAST:event_transButtonActionPerformed

    private void topBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topBoxActionPerformed
        if (topBox.isSelected() == true) {
            this.setAlwaysOnTop(rootPaneCheckingEnabled);
        } else {
            this.setAlwaysOnTop(false);
        }
    }//GEN-LAST:event_topBoxActionPerformed

    private void commonBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commonBoxKeyPressed
    }//GEN-LAST:event_commonBoxKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(transUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new transUI().setVisible(true);
            }
        });
        //START
        getCommon();
        getGarg();
        showGarg();
        showCommon();
    }
    private static String[] common = new String[1000];//array to hold engligh words from garg.txt
    private static String[] garg = new String[1000];//array to hold gargish from garg.txt
    private static String[] common2 = new String[1000];
    private static String[] temp;

    public static void getCommon() throws java.io.IOException//method to load the common array and catch exceptions
    {
        InputStream stream = transUI.class.getResourceAsStream("text/garg.txt");
        //File openFile = new File(stream);//create file instance and pass it the file we will use to load the array
        Scanner readFile = new Scanner(stream);//create scanner object to read the file object
        for (int i = 0; i < 1000; i++) {
            readFile.next();//this loop skips the gargoyle chars and reads the english strings, loading them into the common array
            common[i] = readFile.nextLine();
            System.out.print(common[i]);
        }
        readFile.close();
    }

    public static void getGarg() throws java.io.IOException//method to load the morse code array and catch exceptions
    {
        InputStream stream = transUI.class.getResourceAsStream("text/garg.txt");
        //File openFile = new File("garg.txt");//create file instance and pass it the file we will use to load the arrays
        Scanner readFile = new Scanner(stream);//scanner object created to read the file object
        for (int i = 0; i < 1000; i++) {
            garg[i] = readFile.next();//this for loop loads the gargoyle chars into the garg array and skips over the next common chars
            readFile.nextLine();

        }
        readFile.close();//were done, close the file stream 
    }

    public static void showGarg() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(garg[i]);
        }
    }

    public static void showCommon() {
        for (int i = 0; i < 1000; i++) {
            common2[i] = common[i].trim();
            System.out.println(common2[i]);
        }
    }

    public static void convert(String s) {
        if (!s.equalsIgnoreCase("0") && !s.equalsIgnoreCase("")) {
            s = s.replaceAll(",", " Z1");
            s = s.replaceAll("!", " X2");
            s = s.replaceAll("\\?", " M3");
            s = s.replaceAll("\\.", " V4");
            s = s.replaceAll("\\\"", " J5 ");
            s = s.replaceAll(";", " L7");
            s = s.replaceAll("'s", " K2");
            System.out.print(s);
            String newString = "";
            String parse = (" ");
            temp = s.split(parse);

            for (int ii = 0; ii < temp.length; ii++) {
                for (int i = 0; i < 1000; i++) {
                    if (temp[ii].equalsIgnoreCase(common2[i])) {
                        temp[ii] = garg[i];
                    }
                }
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i] + " ");
                newString += (temp[i] + " ");
            }
            newString = newString.replaceAll(" Z1", ",");
            newString = newString.replaceAll(" X2", "!");
            newString = newString.replaceAll(" M3", "\\?");
            newString = newString.replaceAll(" V4", "\\.");
            newString = newString.replaceAll(" J5 ", "''");
            newString = newString.replaceAll(" L7", ";");
            newString = newString.replaceAll(" K2", "'s");

            gargBox.setText(newString);
            StringSelection ss = new StringSelection(newString);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commonBox;
    private static javax.swing.JTextArea gargBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox topBox;
    private javax.swing.JButton transButton;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("wisp.png")));
    }

  /*  private void toCommon(String s) {
        if (!s.equalsIgnoreCase("0") && !s.equalsIgnoreCase("")) {
            s = s.replaceAll(",", " Z1");
            s = s.replaceAll("!", " X2");
            s = s.replaceAll("\\?", " M3");
            s = s.replaceAll("\\.", " V4");
            s = s.replaceAll("\\\"", " J5 ");
            s = s.replaceAll(";", " L7");
            s = s.replaceAll("'s", " K2");
            System.out.print(s);
            String newString = "";
            String parse = (" ");
            temp = s.split(parse);

            for (int ii = 0; ii < temp.length; ii++) {
                for (int i = 0; i < 1000; i++) {
                    if (temp[ii].equalsIgnoreCase(garg[i])) {
                        temp[ii] = common2[i];
                    }
                }
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i] + " ");
                newString += (temp[i] + " ");
            }
            newString = newString.replaceAll(" Z1", ",");
            newString = newString.replaceAll(" X2", "!");
            newString = newString.replaceAll(" M3", "\\?");
            newString = newString.replaceAll(" V4", "\\.");
            newString = newString.replaceAll(" J5 ", "''");
            newString = newString.replaceAll(" L7", ";");
            newString = newString.replaceAll(" K2", "'s");

            commonBox.setText(newString);
            StringSelection ss = new StringSelection(newString);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        }
    }*/
}

	

