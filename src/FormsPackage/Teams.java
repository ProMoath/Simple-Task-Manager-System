package FormsPackage;

import ClassesPackage.DataStore;
import ClassesPackage.TeamClass;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Teams extends javax.swing.JFrame {

    /**
     * Creates new form Teams
     */
    public Teams() {
        initComponents();
        setTitle("Teams Management");
       teamid.setEditable(false);
        refreshTable();
        setInterfaceState("VIEW");
    }

    private void setInterfaceState(String state) {
        boolean isEditing = state.equals("EDIT") || state.equals("ADD");
        teamname.setEnabled(isEditing);
        teamslug.setEnabled(isEditing);
        
        Addteam.setVisible(state.equals("ADD"));
        Updateteam.setVisible(state.equals("EDIT"));
        cancelteam.setVisible(isEditing);
        
        Newteam.setVisible(!isEditing);
        Update.setVisible(!isEditing);
        Deleteteam.setVisible(!isEditing);
        showteam0.setVisible(!isEditing);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teamid = new javax.swing.JTextField();
        teamslug = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        teamname = new javax.swing.JTextField();
        cancelteam = new javax.swing.JButton();
        Addteam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showteam = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Updateteam = new javax.swing.JButton();
        Deleteteam = new javax.swing.JButton();
        teamSearch = new javax.swing.JTextField();
        Newteam = new javax.swing.JButton();
        showteam0 = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teams Management");

        jLabel1.setText("Team Name");

        jLabel2.setText("Team Slug");

        jLabel3.setText("Team ID");

        cancelteam.setText("Cancel");
        cancelteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFields();
                setInterfaceState("VIEW");
            }
        });

        Addteam.setText("Add");
        Addteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddteamActionPerformed(evt);
            }
        });

        showteam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Name", "Slug"
            }
        ));
        
        showteam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showteamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showteam);

        jLabel5.setText("Search");

        Updateteam.setText("Update");
        Updateteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateteamActionPerformed(evt);
            }
        });

        Deleteteam.setText("Delete");
        Deleteteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteteamActionPerformed(evt);
            }
        });

        Newteam.setText("New Team");
        Newteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewteamActionPerformed(evt);
            }
        });

        showteam0.setText("Refresh List");
        showteam0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showteam0ActionPerformed(evt);
            }
        });
        Update.setText("Edit Selected");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teamid)
                            .addComponent(teamslug, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamname))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Newteam)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Addteam)
                .addGap(50, 50, 50)
                .addComponent(cancelteam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Updateteam)
                        .addGap(47, 47, 47)
                        .addComponent(Deleteteam))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showteam0)
                        .addGap(64, 64, 64)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(teamSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Newteam))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(teamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(teamslug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(teamSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addteam)
                            .addComponent(cancelteam))
                        .addGap(33, 33, 33)
                        .addComponent(Update)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deleteteam)
                            .addComponent(Updateteam))
                        .addGap(37, 37, 37)
                        .addComponent(showteam0)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        

    private void NextId() {
        int nextId = 1;
        if (!DataStore.teamsList.isEmpty()) {
            nextId = DataStore.teamsList.get(DataStore.teamsList.size() - 1).getId() + 1;
        }
        teamid.setText(String.valueOf(nextId));
    }
    private void AddteamActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            if (teamname.getText().isEmpty() || teamslug.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }
            if(teamid.getText().isEmpty()) {
                 NextId();
            }

            int id = Integer.parseInt(teamid.getText());
            String name = teamname.getText();
            String slug = teamslug.getText();

            TeamClass newTeam = new TeamClass(id, name, slug);
            DataStore.teamsList.add(newTeam);

            JOptionPane.showMessageDialog(this, "Team Added Successfully");
            refreshTable();
            clearFields();
            setInterfaceState("VIEW");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }                                       

    
    private void UpdateteamActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            if (teamid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Team ID to update");
                return;
            }

            int id = Integer.parseInt(teamid.getText());
            boolean found = false;

            for (int i = 0; i < DataStore.teamsList.size(); i++) {
                if (DataStore.teamsList.get(i).getId() == id) {
                    
                    String newName = teamname.getText();
                    String newSlug = teamslug.getText();
                    
                    
                    TeamClass updatedTeam = new TeamClass(id, newName, newSlug);
                    DataStore.teamsList.set(i, updatedTeam);
                    
                    found = true;
                    break;
                }
            }

            if (found) {
                JOptionPane.showMessageDialog(this, "Team Updated Successfully");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            } else {
                JOptionPane.showMessageDialog(this, "Team ID not found!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID Format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    
    private void DeleteteamActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int selectedRow = showteam.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a team from the table");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this team?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int idToDelete = Integer.parseInt(showteam.getValueAt(selectedRow, 0).toString());

                for (int i = 0; i < DataStore.teamsList.size(); i++) {
                    if (DataStore.teamsList.get(i).getId() == idToDelete) {
                        DataStore.teamsList.remove(i);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "Team Deleted");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            }
        }
    }                                          

    
    private void NewteamActionPerformed(java.awt.event.ActionEvent evt) {                                        
        clearFields();
        setInterfaceState("ADD");
        NextId();
        teamname.requestFocus();
    }                                       

    
    private void showteam0ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        DefaultTableModel model = (DefaultTableModel) showteam.getModel();
        model.setRowCount(0);
        String searchText = teamSearch.getText().trim();
        boolean found = false;

        for (TeamClass team : DataStore.teamsList) {
            if (searchText.isEmpty() || team.getName().toLowerCase().contains(searchText.toLowerCase())) {
                Object[] row = {
                    team.getId(),
                    team.getName(),
                    team.getDescription() 
                };
                model.addRow(row);
                found = true;
            }
        }
        if (!found && !searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No team found with this name!");
        }
    }                                         

    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int selectedRow = showteam.getSelectedRow();
        if (selectedRow != -1) {
            teamid.setText(showteam.getValueAt(selectedRow, 0).toString());
            teamname.setText(showteam.getValueAt(selectedRow, 1).toString());
            teamslug.setText(showteam.getValueAt(selectedRow, 2).toString());
            setInterfaceState("EDIT");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first!");
        }
    }                                      

    
    private void showteamMouseClicked(java.awt.event.MouseEvent evt) {
        UpdateActionPerformed(null);
    }

    

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) showteam.getModel();
        model.setRowCount(0);

        for (TeamClass team : DataStore.teamsList) {
            Object[] row = {
                team.getId(),
                team.getName(),
                team.getDescription() 
            };
            model.addRow(row);
        }
    }

    private void clearFields() {
        teamid.setText("");
        teamname.setText("");
        teamslug.setText("");
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Addteam;
    private javax.swing.JButton Deleteteam;
    private javax.swing.JButton Newteam;
    private javax.swing.JButton Update;
    private javax.swing.JButton Updateteam;
    private javax.swing.JButton cancelteam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable showteam;
    private javax.swing.JButton showteam0;
    private javax.swing.JTextField teamSearch;
    private javax.swing.JTextField teamid;
    private javax.swing.JTextField teamname;
    private javax.swing.JTextField teamslug;
    // End of variables declaration                   
}