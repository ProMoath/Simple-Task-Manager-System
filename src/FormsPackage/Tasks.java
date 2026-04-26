package FormsPackage;

import ClassesPackage.DataStore;
import ClassesPackage.TaskClass;
import ClassesPackage.UserClass;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tasks extends javax.swing.JFrame {

    /**
     * Creates new form Tasks
     */
    public Tasks() {
        initComponents();
        loadAssignees();
        Id.setEditable(false);
        refreshTable();
        setInterfaceState("VIEW");
    }

    private void setInterfaceState(String state) {
        boolean isEditing = state.equals("EDIT") || state.equals("ADD");
        TextTitle.setEnabled(isEditing);
        TaskDesc.setEnabled(isEditing);
        jComboBox1.setEnabled(isEditing);
        jComboBox2.setEnabled(isEditing);
        
        AddTask1.setVisible(state.equals("ADD"));
        UpdateTask.setVisible(state.equals("EDIT"));
        canceltask.setVisible(isEditing);
        
        NewTask.setVisible(!isEditing);
        Update.setVisible(!isEditing);
        DeleteTask.setVisible(!isEditing);
        showtask0.setVisible(!isEditing);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
    private void initComponents() {

        NewTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        TextTitle = new javax.swing.JTextField();
        TaskDesc = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        DeleteTask = new javax.swing.JButton();
        UpdateTask = new javax.swing.JButton();
        canceltask = new javax.swing.JButton();
        TaskSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showtask = new javax.swing.JTable();
        Id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddTask1 = new javax.swing.JButton();
        showtask0 = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tasks Management");

        NewTask.setText("New Task");
        NewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskActionPerformed(evt);
            }
        });

        jLabel1.setText("Task Title");

        jLabel2.setText("Task Description");

        jLabel3.setText("Priority");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CRITICAL", "MAJOR", "MINOR" }));

        jLabel4.setText("Assign To");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unassigned" }));

        DeleteTask.setText("Delete");
        DeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTaskActionPerformed(evt);
            }
        });

        UpdateTask.setText("Update");
        UpdateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTaskActionPerformed(evt);
            }
        });

        canceltask.setText("Cancel");
        canceltask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFields();
                setInterfaceState("VIEW");
            }
        });

        jLabel5.setText("Search");

        showtask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Title", "Description", "Priority", "Assignee"
            }
        ));
        
        showtask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showtaskMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showtask);

        jLabel6.setText("Id");

        AddTask1.setText("Add");
        AddTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTask1ActionPerformed(evt);
            }
        });

        showtask0.setText("Refresh List");
        showtask0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtask0ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TaskDesc)
                            .addComponent(TextTitle)
                            .addComponent(jComboBox1, 0, 94, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewTask)
                        .addGap(205, 205, 205))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(canceltask)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(UpdateTask)
                                    .addGap(285, 285, 285))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TaskSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9))
                                        .addComponent(DeleteTask, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(169, 169, 169)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddTask1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showtask0)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TaskDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(118, 118, 118)
                                .addComponent(canceltask))
                            .addComponent(AddTask1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(NewTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TaskSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteTask)
                            .addComponent(UpdateTask))
                        .addGap(41, 41, 41)
                        .addComponent(showtask0)
                        .addGap(62, 62, 62)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Update)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>                        

    private void NextId() {
        int nextId = 1;
        if (!DataStore.tasksList.isEmpty()) {
            nextId = DataStore.tasksList.get(DataStore.tasksList.size() - 1).getId() + 1;
        }
        Id.setText(String.valueOf(nextId));
    }
    private void AddTask1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            if ( TextTitle.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill required fields (Id, Title)");
                return;
            }
            if(Id.getText().isEmpty()) {
                NextId();
            }

            int id = Integer.parseInt(Id.getText());
            String title = TextTitle.getText();
            String description = TaskDesc.getText();
            
            TaskClass.Priority priority = TaskClass.Priority.valueOf(jComboBox1.getSelectedItem().toString().toUpperCase());
            String assignee = jComboBox2.getSelectedItem().toString();

            TaskClass newTask = new TaskClass(id, title, description, priority, assignee);
            ClassesPackage.DataStore.tasksList.add(newTask);

            JOptionPane.showMessageDialog(this, "Task Added Successfully");
            refreshTable();
            clearFields();
            setInterfaceState("VIEW");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }                                        

    private void UpdateTaskActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            if (Id.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Task ID to update");
                return;
            }

            int currentId = Integer.parseInt(Id.getText());
            boolean found = false;

            for (int i = 0; i < DataStore.tasksList.size(); i++) {
                if (DataStore.tasksList.get(i).getId() == currentId) {

                    String newTitle = TextTitle.getText();
                    String newDesc = TaskDesc.getText();
                    TaskClass.Priority newPriority = TaskClass.Priority.valueOf(jComboBox1.getSelectedItem().toString().toUpperCase());
                    String newAssignee = jComboBox2.getSelectedItem().toString();

                    TaskClass updatedTask = new TaskClass(currentId, newTitle, newDesc, newPriority, newAssignee);
                    DataStore.tasksList.set(i, updatedTask);

                    found = true;
                    break;
                }
            }
            
            if (found) {
                JOptionPane.showMessageDialog(this, "Task Updated Successfully!");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            } else {
                JOptionPane.showMessageDialog(this, "Task ID not found!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID format");
        }
    }                                          

    private void DeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int selectedRow = showtask.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a task from the table");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this task?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int idToDelete = Integer.parseInt(showtask.getValueAt(selectedRow, 0).toString());

                for (int i = 0; i < DataStore.tasksList.size(); i++) {
                    if (DataStore.tasksList.get(i).getId() == idToDelete) {
                        DataStore.tasksList.remove(i);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "Task Deleted");
                refreshTable();
                clearFields();
                setInterfaceState("VIEW");
            }
        }
    }                                          

    private void NewTaskActionPerformed(java.awt.event.ActionEvent evt) {                                        
        clearFields();
        setInterfaceState("ADD");
        NextId();
        TextTitle.requestFocus();
    }                                       

    private void showtask0ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        DefaultTableModel model = (DefaultTableModel) showtask.getModel();
        model.setRowCount(0);
        String searchText = TaskSearch.getText().trim();
        boolean found = false;

        for (TaskClass task : DataStore.tasksList) {
            if (searchText.isEmpty() || task.getName().toLowerCase().contains(searchText.toLowerCase())) {
                Object[] row = {
                    task.getId(),
                    task.getName(),
                    task.getDescription(),
                    task.getPriority(),
                    task.getAssigneeName()
                };
                model.addRow(row);
                found = true;
            }
        }
        if (!found && !searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No task found with this name!");
        }
    }                                         

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int selectedRow = showtask.getSelectedRow();
        if (selectedRow != -1) {
            Id.setText(showtask.getValueAt(selectedRow, 0).toString());
            TextTitle.setText(showtask.getValueAt(selectedRow, 1).toString());
            TaskDesc.setText(showtask.getValueAt(selectedRow, 2).toString());
            
            String priorityVal = showtask.getValueAt(selectedRow, 3).toString();
            jComboBox1.setSelectedItem(priorityVal); 
            
            String assigneeVal = showtask.getValueAt(selectedRow, 4).toString();
            jComboBox2.setSelectedItem(assigneeVal);
            setInterfaceState("EDIT");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first!");
        }
    }                                      

    private void showtaskMouseClicked(java.awt.event.MouseEvent evt) {
         UpdateActionPerformed(null);
    }

    private void clearFields() {
        Id.setText("");
        TextTitle.setText("");
        TaskDesc.setText("");
        if(jComboBox2.getItemCount() > 0) jComboBox2.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
    }

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) showtask.getModel();
        model.setRowCount(0);

        for (TaskClass task : DataStore.tasksList) {
            Object[] row = {
                task.getId(),
                task.getName(),
                task.getDescription(),
                task.getPriority(),
                task.getAssigneeName()
            };
            model.addRow(row);
        }
    }
    
    private void loadAssignees() {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Unassigned");
        for(UserClass user : DataStore.usersList) {
            jComboBox2.addItem(user.getName());
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tasks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddTask1;
    private javax.swing.JButton DeleteTask;
    private javax.swing.JTextField Id;
    private javax.swing.JButton NewTask;
    private javax.swing.JTextField TaskDesc;
    private javax.swing.JTextField TaskSearch;
    private javax.swing.JTextField TextTitle;
    private javax.swing.JButton Update;
    private javax.swing.JButton UpdateTask;
    private javax.swing.JButton canceltask;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable showtask;
    private javax.swing.JButton showtask0;
    // End of variables declaration                   
}