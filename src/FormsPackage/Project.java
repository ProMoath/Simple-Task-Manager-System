package FormsPackage;

import ClassesPackage.DataStore;
import ClassesPackage.TeamClass;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Project extends javax.swing.JFrame {

    /**
     * Creates new form Project
     */
    public Project() {
        initComponents();
        projectid.setEditable(false);
        refreshTable();
        setInterfaceState("VIEW");
    }
    
    private void setInterfaceState(String state) {
        boolean isEditing = state.equals("EDIT") || state.equals("ADD");
        projectname.setEnabled(isEditing);
        projectslug.setEnabled(isEditing);
        
        Addproject.setVisible(state.equals("ADD"));
        Updateproject.setVisible(state.equals("EDIT"));
        cancelproject.setVisible(isEditing);
        
        Newproject.setVisible(!isEditing);
        Update.setVisible(!isEditing);
        DeleteTask.setVisible(!isEditing);
        showproject0.setVisible(!isEditing);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        showproject = new javax.swing.JTable();
        Addproject = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        projectslug = new javax.swing.JTextField();
        projectid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Updateproject = new javax.swing.JButton();
        cancelproject = new javax.swing.JButton();
        DeleteTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        projectSearch = new javax.swing.JTextField();
        projectname = new javax.swing.JTextField();
        Newproject = new javax.swing.JButton();
        showproject0 = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Management");

        showproject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Id", "Name", "Slug"
            }
        ));
              
        showproject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showprojectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showproject);

        Addproject.setText("Add");
        Addproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddprojectActionPerformed(evt);
            }
        });

        jLabel5.setText("Search");

        jLabel2.setText("Project Slug");

        jLabel1.setText("Project Name");

        Updateproject.setText("Update");
        Updateproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateprojectActionPerformed(evt);
            }
        });

        cancelproject.setText("Cancel");
        cancelproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFields();
                setInterfaceState("VIEW");
            }
        });

        DeleteTask.setText("Delete");
        DeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTaskActionPerformed(evt);
            }
        });

        jLabel3.setText("Project ID");

        Newproject.setText("New Project");
        Newproject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewprojectActionPerformed(evt);
            }
        });

        showproject0.setText("Refresh List");
        showproject0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showproject0ActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Addproject)
                        .addGap(78, 78, 78)
                        .addComponent(cancelproject)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(projectid)
                                    .addComponent(projectslug, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projectname))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Newproject)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(projectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Updateproject)
                        .addGap(38, 38, 38)
                        .addComponent(DeleteTask)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showproject0)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Newproject))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(projectname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(projectslug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(projectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addproject)
                    .addComponent(cancelproject))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteTask)
                    .addComponent(Updateproject))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showproject0)
                    .addComponent(Update))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>                        

    private void NextId() {
        int nextId = 1;
        if (!DataStore.teamsList.isEmpty()) {
            nextId = DataStore.teamsList.get(DataStore.teamsList.size() - 1).getId() + 1;
        }
        projectid.setText(String.valueOf(nextId));
    }
    private void AddprojectActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            if( projectname.getText().isEmpty() || projectslug.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }

            int id = Integer.parseInt(projectid.getText());
            String name = projectname.getText();
            String slug = projectslug.getText();

            TeamClass newProject = new TeamClass(id, name, slug);
            DataStore.teamsList.add(newProject);

            JOptionPane.showMessageDialog(this, "Project Added Successfully");
            refreshTable();
            clearFields();
            setInterfaceState("VIEW");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                          

    private void UpdateprojectActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            if(projectid.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter Project ID to update");
                return;
            }

            int idToUpdate = Integer.parseInt(projectid.getText());
            boolean found = false;

            for (int i = 0; i < DataStore.teamsList.size(); i++) {
                if (DataStore.teamsList.get(i).getId() == idToUpdate) {
                    
                    String newName = projectname.getText();
                    String newSlug = projectslug.getText();
                    
                    TeamClass updatedProject = new TeamClass(idToUpdate, newName, newSlug);
                    DataStore.teamsList.set(i, updatedProject);
                    
                    found = true;
                    break;
                }
            }

            if (found) {
                JOptionPane.showMessageDialog(this, "Project Updated Successfully");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            } else {
                JOptionPane.showMessageDialog(this, "Project ID not found!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                             

    private void DeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int selectedRow = showproject.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a project from the table to delete");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this project?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int idToDelete = Integer.parseInt(showproject.getValueAt(selectedRow, 0).toString());
                for (int i = 0; i < DataStore.teamsList.size(); i++) {
                    if (DataStore.teamsList.get(i).getId() == idToDelete) {
                        DataStore.teamsList.remove(i);
                        break;
                    }
                }
                
                JOptionPane.showMessageDialog(this, "Project Deleted");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            }
        }
    }                                          

    private void NewprojectActionPerformed(java.awt.event.ActionEvent evt) {                                           
        clearFields();
        setInterfaceState("ADD");
        NextId();
        projectname.requestFocus();
    }                                          

    private void showproject0ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DefaultTableModel model = (DefaultTableModel) showproject.getModel();
        model.setRowCount(0);
        String searchText = projectSearch.getText().trim();
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
            JOptionPane.showMessageDialog(this, "No project found with this name!");
        }
    }                                            

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int selectedRow = showproject.getSelectedRow();
        if (selectedRow != -1) {
            projectid.setText(showproject.getValueAt(selectedRow, 0).toString());
            projectname.setText(showproject.getValueAt(selectedRow, 1).toString());
            projectslug.setText(showproject.getValueAt(selectedRow, 2).toString());
            setInterfaceState("EDIT");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first!");
        }
    }                                      

    private void showprojectMouseClicked(java.awt.event.MouseEvent evt) {                                         
        UpdateActionPerformed(null); 
    }


    private void clearFields() {
        projectid.setText("");
        projectname.setText("");
        projectslug.setText("");
    }

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) showproject.getModel();
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

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Addproject;
    private javax.swing.JButton DeleteTask;
    private javax.swing.JButton Newproject;
    private javax.swing.JButton Update;
    private javax.swing.JButton Updateproject;
    private javax.swing.JButton cancelproject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField projectSearch;
    private javax.swing.JTextField projectid;
    private javax.swing.JTextField projectname;
    private javax.swing.JTextField projectslug;
    private javax.swing.JTable showproject;
    private javax.swing.JButton showproject0;
    // End of variables declaration                   
}