package UserInterfaceD.Forms;

import javax.swing.*;

import BusinessLogic.Entities.UserLoginBL;
import DataAccess.DTO.UserLoginDTO;
import UserInterfaceD.DuckStyle;
import UserInterfaceD.CustomerControl.DuckButton;
import UserInterfaceD.CustomerControl.DuckLabel;
import UserInterfaceD.CustomerControl.DuckTextBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ScoreForm extends JPanel implements ActionListener{
    private Integer rowNum = 0, idRowMaxScore=0;
    private UserLoginBL  scoreBL  = new UserLoginBL();
    private UserLoginDTO scoreDAO = null;

    public ScoreForm() {
        try {
            customizeComponent();
            loadRow();
            showRow();
            showTable();

            btnRowIni.addActionListener(this);
            btnRowAnt.addActionListener(this);
            btnRowSig.addActionListener(this);
            btnRowFin.addActionListener(this);
            
            btnEliminar.addActionListener(  e -> btnEliminarClick());
            btnCancelar.addActionListener(  e -> btnCancelarClick());
        } catch (Exception e) {
            DuckStyle.showMsg(e.getMessage());
        }
    }

    private void loadRow()  {
        try {
            rowNum          = 1;
            scoreDAO        = scoreBL.getBy(rowNum);
            idRowMaxScore   = scoreBL.getRowCount();
        } catch (Exception e) {
            DuckStyle.showMsg(e.getMessage());
        }
    }

    private void showRow() {
        boolean scoreNull = (scoreDAO == null);
        txtrowNum.setText((scoreNull) ? " " : scoreDAO.getIdUserLogin().toString());
        txtNombre.setText((scoreNull) ? " " : scoreDAO.getNombre());
        lblTotalReg.setText(rowNum.toString() + " de " + idRowMaxScore.toString());
    }


    private void btnEliminarClick() {
        try {
            if (DuckStyle.showConfirmYesNo("Seguro que desea Eliminar?")) {

                if (!scoreBL.delete(scoreDAO.getIdUserLogin()))
                    throw new Exception("Error al eliminar...!");
    
                loadRow();
                showRow();
                showTable();
            }
        } catch (Exception e) {
            DuckStyle.showMsgError(e.getMessage());
        }
    }

    private void btnCancelarClick() {
        try {
            if(scoreDAO == null)
                loadRow();
            showRow();
        } catch (Exception e) {}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRowIni)
            rowNum = 1;
        if (e.getSource() == btnRowAnt && (rowNum > 1))
            rowNum--;
        if (e.getSource() == btnRowSig && (rowNum < idRowMaxScore))
            rowNum++;
        if (e.getSource() == btnRowFin)
            rowNum = idRowMaxScore;
        try {
            scoreDAO   = scoreBL.getBy(rowNum);  
            showRow(); 
        } catch (Exception ex) {}
    }

    private void showTable() throws Exception {
        String[] header = {"rowNum","Nivel", "Nombre", "Puntaje", "Tiempo", "Estado"};
        Object[][] data = new Object[scoreBL.getAll().size()][6];
        int index = 0;
        for (UserLoginDTO u : scoreBL.getAll()) {
            data[index][0] = u.getRowNum();
            data[index][1] = u.getIdNivel();
            data[index][2] = u.getNombre();
            data[index][3] = u.getPuntaje();
            data[index][4] = u.getTiempo();
            data[index][5] = u.getEstado();
            index++;
        }

        JTable table = new JTable(data, header);
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.lightGray);
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(false);

        table.setPreferredScrollableViewportSize(new Dimension(450, 150));
        table.setFillsViewportHeight(true);

        pnlTabla.removeAll();
        pnlTabla.add(new JScrollPane(table));

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int col = table.columnAtPoint(e.getPoint());
                if (row >= 0 && col >= 0) {
                    String strrowNum = table.getModel().getValueAt(row, 0).toString();
                    rowNum = Integer.parseInt(strrowNum);
                    try {
                        scoreDAO = scoreBL.getBy(rowNum);
                        showRow();
                    } catch (Exception ignored) {
                    }
                    System.out.println("Tabla.Selected: " + strrowNum);
                }
            }
        });
    }

    private DuckLabel 
            lblTitulo   = new DuckLabel("Score"),
            lblrowNum   = new DuckLabel("ID USER:      "),
            lblNombre   = new DuckLabel("*NOMBRE: "),
            lblTotalReg = new DuckLabel(" 0 de 0 ");
    private DuckTextBox 
            txtrowNum   = new DuckTextBox(),
            txtNombre   = new DuckTextBox();
    private DuckButton 
            btnPageIni  = new DuckButton(" |< "),
            btnPageAnt  = new DuckButton(" << "),
            btnPageSig  = new DuckButton(" >> "),
            btnPageFin  = new DuckButton(" >| "),

            btnRowIni   = new DuckButton(" |< "),
            btnRowAnt   = new DuckButton(" << "),
            btnRowSig   = new DuckButton(" >> "),
            btnRowFin   = new DuckButton(" >| "),

            btnCancelar = new DuckButton("Cancelar"),
            btnEliminar = new DuckButton("Eliminar");
    private JPanel 
            pnlTabla    = new JPanel(),
            pnlBtnRow   = new JPanel(new FlowLayout()),
            pnlBtnPage  = new JPanel(new FlowLayout()),
            pnlBtnCRUD  = new JPanel(new FlowLayout());

    public void customizeComponent() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        txtrowNum.setEnabled(false);
        txtrowNum.setBorderLine();
        txtNombre.setBorderLine();

        pnlBtnPage.add(btnPageIni);
        pnlBtnPage.add(btnPageAnt);
        pnlBtnPage.add(new DuckLabel(" Page:( "));
        pnlBtnPage.add(lblTotalReg); //cambiar
        pnlBtnPage.add(new DuckLabel(" ) "));
        pnlBtnPage.add(btnPageSig);
        pnlBtnPage.add(btnPageFin);

        pnlBtnRow.add(btnRowIni);
        pnlBtnRow.add(btnRowAnt);
        pnlBtnRow.add(lblTotalReg);
        pnlBtnRow.add(btnRowSig);
        pnlBtnRow.add(btnRowFin);

        pnlBtnCRUD.add(btnCancelar);
        pnlBtnCRUD.add(btnEliminar);
        pnlBtnCRUD.setBorder(DuckStyle.createBorderRect());

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new JLabel("■ Sección de datos: "), gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        add(pnlBtnPage, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.ipady = 150;
        gbc.ipadx = 450;
        pnlTabla.add(new Label("Loading data..."));
        add(pnlTabla, gbc);

        gbc.ipady = 1;
        gbc.ipadx = 1;

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(50, 0, 0, 0);  // Ajusta el valor superior a 50
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Box.createRigidArea(new Dimension(0, 0)), gbc);

        gbc.insets = new Insets(10, 0, 0, 0);  

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        add(new JLabel("■ Sección de registro: "), gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(pnlBtnRow, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        add(lblrowNum, gbc);
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtrowNum, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        add(lblNombre, gbc);
        gbc.gridy = 6;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Indica que este componente ocupa toda la fila
        add(txtNombre, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(30, 0, 0, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pnlBtnCRUD, gbc);
    }
}
