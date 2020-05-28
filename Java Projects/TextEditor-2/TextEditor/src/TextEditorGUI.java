/*
 * TextEditorGUI.java
 *
 * Created on 1 wrzesień 2008, 22:00
 */

import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author  pawel
 */
public class TextEditorGUI extends javax.swing.JFrame {

    
    private File fileName = new File("noname");
    
    
    /** Creates new form TextEditorGUI */
    public TextEditorGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editPane = new javax.swing.JEditorPane();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        selectAllButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        wwwButton = new javax.swing.JButton();
        urlTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copyMenu = new javax.swing.JMenuItem();
        cutMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();
        selectAllMenu = new javax.swing.JMenuItem();
        clearMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        exampleTextMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Text Editor");
        setName("mainFrame"); // NOI18N

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        editPane.setBackground(new java.awt.Color(233, 228, 242));
        editPane.setMargin(new java.awt.Insets(3, 20, 3, 20));
        jScrollPane1.setViewportView(editPane);

        cutButton.setText("Cut");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });

        pasteButton.setText("Paste");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        selectAllButton.setText("Select All");
        selectAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        wwwButton.setText("WWW");
        wwwButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wwwButtonActionPerformed(evt);
            }
        });

        urlTextField.setText("http://diavel.ovh.org");
        urlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextFieldActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadMenu.setText("Open");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        saveAsMenu.setText("Save as...");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveAsMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        jMenu2.add(copyMenu);

        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cutMenu);

        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        jMenu2.add(pasteMenu);

        selectAllMenu.setText("Select All");
        selectAllMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllMenuActionPerformed(evt);
            }
        });
        jMenu2.add(selectAllMenu);

        clearMenu.setText("Clear");
        clearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuActionPerformed(evt);
            }
        });
        jMenu2.add(clearMenu);
        jMenu2.add(jSeparator1);

        exampleTextMenu.setText("Example Text");
        exampleTextMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampleTextMenuActionPerformed(evt);
            }
        });
        jMenu2.add(exampleTextMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(wwwButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(urlTextField))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(copyButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cutButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasteButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectAllButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearButton))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyButton)
                    .addComponent(cutButton)
                    .addComponent(pasteButton)
                    .addComponent(selectAllButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wwwButton)
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
    this.editPane.copy();
}//GEN-LAST:event_copyButtonActionPerformed

private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
    this.editPane.cut();
}//GEN-LAST:event_cutButtonActionPerformed

private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
    this.editPane.paste();
}//GEN-LAST:event_pasteButtonActionPerformed

private void selectAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllButtonActionPerformed
    this.editPane.selectAll();
}//GEN-LAST:event_selectAllButtonActionPerformed

private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed
    this.editPane.copy();
}//GEN-LAST:event_copyMenuActionPerformed

private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed
    this.editPane.cut();
}//GEN-LAST:event_cutMenuActionPerformed

private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed
    this.editPane.paste();
}//GEN-LAST:event_pasteMenuActionPerformed

private void selectAllMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllMenuActionPerformed
    this.editPane.selectAll();
}//GEN-LAST:event_selectAllMenuActionPerformed

private void exampleTextMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampleTextMenuActionPerformed
    this.editPane.setText("Hello, World!!!");
}//GEN-LAST:event_exampleTextMenuActionPerformed

private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
    BufferedWriter writer;
    try {
        writer = new BufferedWriter(new FileWriter(this.fileName));
        writer.write(this.editPane.getText());
        writer.close();
    }
    catch (IOException ioe) {
        this.editPane.setText("Pardon. Can't write file. Please contact with: pkrawczak@gmail.com");
    }
}//GEN-LAST:event_saveMenuActionPerformed

private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

        BufferedReader reader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
            while (reader.ready()) {
                stringBuilder.append(reader.readLine() + "\n");
            }
            reader.close();
            this.editPane.setText(stringBuilder.toString());
            this.fileName = fileChooser.getSelectedFile();
        }
        catch (IOException ioe) {
            this.editPane.setText("Pardon. Can't open file. Please contact with: pkrawczak@gmail.com");
        }
    }
}//GEN-LAST:event_loadMenuActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    this.editPane.setText("");
}//GEN-LAST:event_clearButtonActionPerformed

private void clearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuActionPerformed
    this.editPane.setText("");
}//GEN-LAST:event_clearMenuActionPerformed

private void wwwButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wwwButtonActionPerformed
    URLGet urlTest = new URLGet();
    
    String url = urlTextField.getText();
    
    this.editPane.setText(urlTest.getSite(url));
}//GEN-LAST:event_wwwButtonActionPerformed

private void urlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextFieldActionPerformed

    URLGet urlTest = new URLGet();
    
    String url = urlTextField.getText();
    
    this.editPane.setText(urlTest.getSite(url));
}//GEN-LAST:event_urlTextFieldActionPerformed

private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
    JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
            writer.write(this.editPane.getText());
            writer.close();
        }
        catch (IOException ioe) {
            this.editPane.setText("Pardon. Can't write file. Please contact with: pkrawczak@gmail.com");
        }
    }
}//GEN-LAST:event_saveAsMenuActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuItem clearMenu;
    private javax.swing.JButton copyButton;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JButton cutButton;
    private javax.swing.JMenuItem cutMenu;
    private javax.swing.JEditorPane editPane;
    private javax.swing.JMenuItem exampleTextMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JButton pasteButton;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JButton selectAllButton;
    private javax.swing.JMenuItem selectAllMenu;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JButton wwwButton;
    // End of variables declaration//GEN-END:variables

}
