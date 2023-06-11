package views;

import controllers.HoTieuThuController;

/**
 *
 * @author duato
 */
public class HoTieuThuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoTieuThuJPanel
     */
    public HoTieuThuJPanel() {
        initComponents();
        HoTieuThuController controller = new HoTieuThuController(jpnView, btnAdd, jtfSearch);
        controller.setDataToTable();
        controller.setEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnViewHoTieuThu = new javax.swing.JPanel();
        jpnHoTieuThuTitle = new javax.swing.JPanel();
        jlbHoTieuThuTitle = new javax.swing.JLabel();
        jpnHoTieuThuMain = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jpnView = new javax.swing.JPanel();

        jpnHoTieuThuTitle.setBackground(new java.awt.Color(0, 153, 255));

        jlbHoTieuThuTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbHoTieuThuTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoTieuThuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHoTieuThuTitle.setText("THÔNG TIN HỘ TIÊU THỤ ĐIỆN");

        javax.swing.GroupLayout jpnHoTieuThuTitleLayout = new javax.swing.GroupLayout(jpnHoTieuThuTitle);
        jpnHoTieuThuTitle.setLayout(jpnHoTieuThuTitleLayout);
        jpnHoTieuThuTitleLayout.setHorizontalGroup(
            jpnHoTieuThuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoTieuThuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
        );
        jpnHoTieuThuTitleLayout.setVerticalGroup(
            jpnHoTieuThuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoTieuThuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        btnAdd.setBackground(new java.awt.Color(0, 204, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.setText("Thêm mới");

        jtfSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnHoTieuThuMainLayout = new javax.swing.GroupLayout(jpnHoTieuThuMain);
        jpnHoTieuThuMain.setLayout(jpnHoTieuThuMainLayout);
        jpnHoTieuThuMainLayout.setHorizontalGroup(
            jpnHoTieuThuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoTieuThuMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoTieuThuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnHoTieuThuMainLayout.createSequentialGroup()
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnHoTieuThuMainLayout.setVerticalGroup(
            jpnHoTieuThuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoTieuThuMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoTieuThuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnViewHoTieuThuLayout = new javax.swing.GroupLayout(jpnViewHoTieuThu);
        jpnViewHoTieuThu.setLayout(jpnViewHoTieuThuLayout);
        jpnViewHoTieuThuLayout.setHorizontalGroup(
            jpnViewHoTieuThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHoTieuThuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHoTieuThuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnViewHoTieuThuLayout.setVerticalGroup(
            jpnViewHoTieuThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewHoTieuThuLayout.createSequentialGroup()
                .addComponent(jpnHoTieuThuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoTieuThuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnViewHoTieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnViewHoTieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jlbHoTieuThuTitle;
    private javax.swing.JPanel jpnHoTieuThuMain;
    private javax.swing.JPanel jpnHoTieuThuTitle;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnViewHoTieuThu;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
