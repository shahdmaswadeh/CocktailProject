/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graphical;
import containers.Blender;
import exceptions.BlenderOverFlowException;
import fruits.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * @author ASUS
 */
public class FruitMenu extends javax.swing.JFrame {
   private Blender blender;
    /**
     * Creates new form FruitMenu
     */
    public FruitMenu() {
        initComponents();
        blender= new Blender();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ContinueButton = new javax.swing.JButton();
        AppleButton = new javax.swing.JToggleButton();
        PineappleButton = new javax.swing.JToggleButton();
        StrawberryButton = new javax.swing.JToggleButton();
        RoseberryButton = new javax.swing.JToggleButton();
        BananaButton = new javax.swing.JToggleButton();
        BlueberryButton = new javax.swing.JToggleButton();
        DatesButton = new javax.swing.JToggleButton();
        GrapefruitButton = new javax.swing.JToggleButton();
        OrangeButton = new javax.swing.JToggleButton();
        MangoButton = new javax.swing.JToggleButton();
        WatermelonButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(218, 192, 203));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(69, 66, 66));

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 80, 148));
        jLabel2.setText("Fruits Menu");

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("Strawberry");

        ContinueButton.setBackground(new java.awt.Color(236, 80, 148));
        ContinueButton.setFont(new java.awt.Font("Script MT Bold", 0, 29)); // NOI18N
        ContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        ContinueButton.setText("Continue");
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });

        AppleButton.setBackground(new java.awt.Color(218, 192, 203));
        AppleButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AppleButton.setForeground(new java.awt.Color(69, 66, 66));
        AppleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/appleIcon.png"))); // NOI18N
        AppleButton.setText("Apple");
        AppleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PineappleButton.setBackground(new java.awt.Color(218, 192, 203));
        PineappleButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        PineappleButton.setForeground(new java.awt.Color(69, 66, 66));
        PineappleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/pineapple.png"))); // NOI18N
        PineappleButton.setText("Pineapple");
        PineappleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        StrawberryButton.setBackground(new java.awt.Color(218, 192, 203));
        StrawberryButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        StrawberryButton.setForeground(new java.awt.Color(69, 66, 66));
        StrawberryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/strawberryIcon.png"))); // NOI18N
        StrawberryButton.setText("Strawberry");
        StrawberryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RoseberryButton.setBackground(new java.awt.Color(218, 192, 203));
        RoseberryButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        RoseberryButton.setForeground(new java.awt.Color(69, 66, 66));
        RoseberryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/roseberry.png"))); // NOI18N
        RoseberryButton.setText("Roseberry");
        RoseberryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BananaButton.setBackground(new java.awt.Color(218, 192, 203));
        BananaButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BananaButton.setForeground(new java.awt.Color(69, 66, 66));
        BananaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/banana.png"))); // NOI18N
        BananaButton.setText("Banana");
        BananaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BlueberryButton.setBackground(new java.awt.Color(218, 192, 203));
        BlueberryButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BlueberryButton.setForeground(new java.awt.Color(69, 66, 66));
        BlueberryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/blueberry.png"))); // NOI18N
        BlueberryButton.setText("Blueberry");
        BlueberryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DatesButton.setBackground(new java.awt.Color(218, 192, 203));
        DatesButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        DatesButton.setForeground(new java.awt.Color(69, 66, 66));
        DatesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/dates.png"))); // NOI18N
        DatesButton.setText("Dates");
        DatesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GrapefruitButton.setBackground(new java.awt.Color(218, 192, 203));
        GrapefruitButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        GrapefruitButton.setForeground(new java.awt.Color(69, 66, 66));
        GrapefruitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/grapefruit.png"))); // NOI18N
        GrapefruitButton.setText("Grapefruit");
        GrapefruitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OrangeButton.setBackground(new java.awt.Color(218, 192, 203));
        OrangeButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        OrangeButton.setForeground(new java.awt.Color(69, 66, 66));
        OrangeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/orange.png"))); // NOI18N
        OrangeButton.setText("Orange");
        OrangeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MangoButton.setBackground(new java.awt.Color(218, 192, 203));
        MangoButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        MangoButton.setForeground(new java.awt.Color(69, 66, 66));
        MangoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/mango.png"))); // NOI18N
        MangoButton.setText("Mango");
        MangoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MangoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangoButtonActionPerformed(evt);
            }
        });

        WatermelonButton.setBackground(new java.awt.Color(218, 192, 203));
        WatermelonButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        WatermelonButton.setForeground(new java.awt.Color(69, 66, 66));
        WatermelonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fruitassets/watermelon.png"))); // NOI18N
        WatermelonButton.setText("Watermelon");
        WatermelonButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BananaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BlueberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoseberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GrapefruitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MangoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StrawberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PineappleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(WatermelonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GrapefruitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BananaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MangoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StrawberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoseberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PineappleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(WatermelonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
         
        if (AppleButton.isSelected()){
            try {
                blender.addIngredient(new Apple(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (BananaButton.isSelected()){
            try {
                blender.addIngredient(new Banana(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (GrapefruitButton.isSelected()){
            try {
                blender.addIngredient(new Grapefruits(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (BlueberryButton.isSelected()){
            try {
                blender.addIngredient(new Blueberry(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (DatesButton.isSelected()){
            try {
                blender.addIngredient(new Dates(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else if (MangoButton.isSelected()){
            try {
                blender.addIngredient(new Mango(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (OrangeButton.isSelected()){
            try {
                blender.addIngredient(new Orange(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (PineappleButton.isSelected()){
            try {
                blender.addIngredient(new Pineapple(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (RoseberryButton.isSelected()){
            try {
                blender.addIngredient(new Raspberry(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (StrawberryButton.isSelected()){
            try {
                blender.addIngredient(new Strawberry(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (WatermelonButton.isSelected()){
            try {
                blender.addIngredient(new Watermelon(2));
                // blender.addIgredient(new Apple(2));
            } catch (BlenderOverFlowException ex) {
                Logger.getLogger(FruitMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
        LiquidsGUI liquid=new LiquidsGUI(blender);
        liquid.show();
        dispose();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_ContinueButtonActionPerformed

    private void MangoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MangoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FruitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AppleButton;
    private javax.swing.JToggleButton BananaButton;
    private javax.swing.JToggleButton BlueberryButton;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JToggleButton DatesButton;
    private javax.swing.JToggleButton GrapefruitButton;
    private javax.swing.JToggleButton MangoButton;
    private javax.swing.JToggleButton OrangeButton;
    private javax.swing.JToggleButton PineappleButton;
    private javax.swing.JToggleButton RoseberryButton;
    private javax.swing.JToggleButton StrawberryButton;
    private javax.swing.JToggleButton WatermelonButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
