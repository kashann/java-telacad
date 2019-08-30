/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Student;
import service.MainService;

/**
 *
 * @author student
 */
public class MainFrame extends javax.swing.JFrame {
    private DefaultListModel model = null;
    
    public MainFrame() {
        initComponents();
        
        model = new DefaultListModel<>();
        studList.setModel(model);
        
        afisareStudenti();
        jButton1.addActionListener(ev -> adaugaStudent());
        studList.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent ev){
                if(ev.getClickCount() == 2){
                    Student stud = studList.getSelectedValue();
                    MainService.getInstance().stergeStudent(stud.getId());
                    afisareStudenti();
                }
            }
        });
        
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Students");
    }
    
    private void adaugaStudent(){
        String nume = numeTF.getText();
        String prenume = prenumeTF.getText();
        String cnp = cnpTF.getText();
        Student s = new Student(nume, prenume, cnp);
        MainService.getInstance().adaugaStudent(s);
        afisareStudenti();
        JOptionPane.showMessageDialog(null, "Studentul a fost adaugat!");
        numeTF.setText(null);
        prenumeTF.setText(null);
        cnpTF.setText(null);
    }
    
    private void afisareStudenti(){
        List<Student> studenti = MainService.getInstance().getAllStudents();
        model.clear();
        studenti.forEach(model::addElement);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        studList = new javax.swing.JList<>();
        numeTF = new javax.swing.JTextField();
        cnpTF = new javax.swing.JTextField();
        prenumeTF = new javax.swing.JTextField();
        numeLabel = new javax.swing.JLabel();
        prenumeLabel = new javax.swing.JLabel();
        cnpLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studList.setToolTipText("");
        jScrollPane2.setViewportView(studList);

        numeTF.setToolTipText("");

        cnpTF.setToolTipText("");

        prenumeTF.setToolTipText("");

        numeLabel.setText("Nume:");

        prenumeLabel.setText("Prenume:");

        cnpLabel.setText("CNP:");

        jButton1.setText("Add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numeLabel)
                            .addComponent(cnpLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(prenumeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prenumeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cnpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(69, 69, 69)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenumeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeLabel)
                    .addComponent(prenumeLabel))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpLabel)
                    .addComponent(cnpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnpLabel;
    private javax.swing.JTextField cnpTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numeLabel;
    private javax.swing.JTextField numeTF;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JTextField prenumeTF;
    private javax.swing.JList<model.Student> studList;
    // End of variables declaration//GEN-END:variables
}
