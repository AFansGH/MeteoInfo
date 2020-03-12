/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.laboratory.gui;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.l2fprod.common.swing.JFontChooser;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.fife.ui.rsyntaxtextarea.Theme;

/**
 *
 * @author yaqiang
 */
public class FrmSetting extends javax.swing.JDialog {
    
    private FrmMain parent;

    /**
     * Creates new form FrmSetting
     */
    public FrmSetting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = (FrmMain)parent;
        
        initComponents();
        
        //Look & feel
        UIManager.LookAndFeelInfo[] lnfs = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lnf : lnfs) {
            this.jComboBox_LookFeel.addItem(lnf.getName());
        }
        this.jComboBox_LookFeel.addItem("FlatLightLaf");
        this.jComboBox_LookFeel.addItem("FlatDarkLaf");
        this.jComboBox_LookFeel.addItem("FlatDarculaLaf");
        this.jComboBox_LookFeel.addItem("FlatIntelliJLaf");
        this.jComboBox_LookFeel.setSelectedItem(this.parent.getOptions().getLookFeel());
        
        //Editor font
        TextEditor textEditor = this.parent.getEditorDock().getActiveTextEditor();
        Font font = textEditor.getTextArea().getFont();
        this.jTextField_Font.setText(font.getFontName() + "  " + String.valueOf(font.getSize()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_Appearance = new javax.swing.JPanel();
        jLabel_LookFeel = new javax.swing.JLabel();
        jComboBox_LookFeel = new javax.swing.JComboBox<>();
        jButton_Apply = new javax.swing.JButton();
        jLabel_Font = new javax.swing.JLabel();
        jTextField_Font = new javax.swing.JTextField();
        jButton_Font = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Setting");

        jLabel_LookFeel.setText("Look&Feel:");

        jComboBox_LookFeel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LookFeelActionPerformed(evt);
            }
        });

        jButton_Apply.setText("Apply");
        jButton_Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApplyActionPerformed(evt);
            }
        });

        jLabel_Font.setText("Font:");

        jTextField_Font.setEditable(false);

        jButton_Font.setText("...");
        jButton_Font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FontActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AppearanceLayout = new javax.swing.GroupLayout(jPanel_Appearance);
        jPanel_Appearance.setLayout(jPanel_AppearanceLayout);
        jPanel_AppearanceLayout.setHorizontalGroup(
            jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AppearanceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton_Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel_AppearanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LookFeel)
                    .addComponent(jLabel_Font))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AppearanceLayout.createSequentialGroup()
                        .addComponent(jTextField_Font)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Font, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox_LookFeel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AppearanceLayout.setVerticalGroup(
            jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AppearanceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_LookFeel)
                    .addComponent(jComboBox_LookFeel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AppearanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Font)
                    .addComponent(jTextField_Font, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Font))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton_Apply)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Appearance", jPanel_Appearance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApplyActionPerformed
        // TODO add your handling code here:
        
        //Look and feel
        String laf = this.jComboBox_LookFeel.getSelectedItem().toString();
        String lafName = UIManager.getLookAndFeel().getClass().getName();
        switch (laf) {
            case "CDE/Motif":
                lafName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
                break;
            case "Metal":
                lafName = "javax.swing.plaf.metal.MetalLookAndFeel";
                break;
            case "Windows":
                lafName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
                break;
            case "Windows Classic":
                lafName = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
                break;
            case "Nimbus":  
                lafName = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
                break;
            case "Mac":
                lafName = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
                break;
            case "GTK":
                lafName = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
                break;
            case "FlatLightLaf":
            case "FlatDarkLaf":
            case "FlatDarculaLaf":
            case "FlatIntelliJLaf":
                lafName = laf;
                break;
            default:
                lafName = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
                break;
        }
        
        try {
                JFrame.setDefaultLookAndFeelDecorated(true);
                if (lafName.equals("FlatLightLaf")) {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                    this.changeStyleViaThemeXml("default");
                } else if (lafName.equals("FlatIntelliJLaf")) {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                    this.changeStyleViaThemeXml("default");
                } else if (lafName.equals("FlatDarculaLaf")) {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                    this.changeStyleViaThemeXml("dark");
                } else if (lafName.equals("FlatDarkLaf")) {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                    this.changeStyleViaThemeXml("dark");
                } else {
                    UIManager.setLookAndFeel(lafName);
                    this.changeStyleViaThemeXml("default");
                }
                SwingUtilities.updateComponentTreeUI(this);
                SwingUtilities.updateComponentTreeUI(this.parent);
                this.parent.getOptions().setLookFeel(laf);
                this.parent.getConsoleDockable().setLookFeel(laf);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrmSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FrmSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FrmSetting.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(FrmSetting.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_ApplyActionPerformed

    private void jComboBox_LookFeelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LookFeelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox_LookFeelActionPerformed

    private void jButton_FontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FontActionPerformed
        // TODO add your handling code here:
        TextEditor textEditor = this.parent.getEditorDock().getActiveTextEditor();
        Font tFont = JFontChooser.showDialog(this, null, textEditor.getTextArea().getFont());
        if (tFont != null) {
            this.parent.getEditorDock().setTextFont(tFont);
            this.parent.getConsoleDockable().getConsole().setFont(tFont);
            this.parent.getOptions().setTextFont(tFont);
            this.jTextField_Font.setText(tFont.getFontName() + "  " + String.valueOf(tFont.getSize()));
        }
    }//GEN-LAST:event_jButton_FontActionPerformed

    /**
    * Changes the styles used by the editor via an XML file specification. This
    * method is preferred because of its ease and modularity.
    */
   private void changeStyleViaThemeXml(String themeName) {
      try {
         Theme theme = Theme.load(getClass().getResourceAsStream(
               "/org/fife/ui/rsyntaxtextarea/themes/" +  themeName + ".xml"));
         for (TextEditor textEditor : this.parent.getEditorDock().getAllTextEditor())
            theme.apply(textEditor.getTextArea());
      } catch (IOException ioe) { // Never happens
         ioe.printStackTrace();
      }
   }
    
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
            java.util.logging.Logger.getLogger(FrmSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmSetting dialog = new FrmSetting(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Apply;
    private javax.swing.JButton jButton_Font;
    private javax.swing.JComboBox<String> jComboBox_LookFeel;
    private javax.swing.JLabel jLabel_Font;
    private javax.swing.JLabel jLabel_LookFeel;
    private javax.swing.JPanel jPanel_Appearance;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_Font;
    // End of variables declaration//GEN-END:variables
}
