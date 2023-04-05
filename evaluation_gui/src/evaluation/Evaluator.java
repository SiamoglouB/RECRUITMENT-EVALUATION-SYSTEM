package evaluation;

import com.github.lgooddatepicker.components.DatePicker;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Evaluator {
    private JPanel panelEvaluator;
    private JTabbedPane tabbedPaneEvaluator;
    private JPanel panelPersonal;
    private JTextField textFieldUsername;
    private JPasswordField passwordFieldPassword;
    private JTextField textFieldName;
    private JTextField textFieldSurname;
    private JTextField textFieldEmail;
    private JButton buttonUpdate;
    private JLabel labelPassword;
    private JLabel labelPSurname;
    private JLabel labelEmail;
    private JLabel labelUsername;
    private JLabel labelName;
    private JPanel panelJobs;
    private JPanel panelActivityAdd;
    private JTextField textFieldActivityTitle;
    private JScrollPane scrollPaneActivityDescription;
    private JTextArea textAreaActivityDescription;
    private JLabel labelActivityTitle;
    private JLabel labelActivityParent;
    private JComboBox comboBoxActivityParent;
    private JButton buttonActivityAdd;
    private JPanel panelJobEdit;
    private JPanel panelEvaluations;
    private JTable tableJobsForeign;
    private JTable tableJobEdit;
    private JScrollPane scrollPaneJobsForeign;
    private JScrollPane scrollPaneJobEdit;
    private JButton buttonJobEdit;
    private JButton buttonJobAddUpdate;
    private JTextField textFieldJobID;
    private JComboBox comboBoxJobActivity;
    private JTextField textFieldJobDate;
    private JTextField textFieldJobSalary;
    private JTextField textFieldJobPosition;
    private JTextField textFieldJobLocation;
    private JLabel labelJobID;
    private JLabel labelJobStartDate;
    private JLabel labelJobSubmissionDate;
    private JLabel labelJobDate;
    private JLabel labelJobSalary;
    private JLabel labelJobPosition;
    private JLabel labelJobLocation;
    private JLabel labelJobActivity;
    private DatePicker datePickerJobStartDate;
    private DatePicker datePickerJobSubmissionDate;
    private JScrollPane scrollPaneEvaluationsForeign;
    private JTable tableEvaluationsForeign;
    private JPanel panelEditEvaluations;
    private JComboBox comboBoxEditEvaluationsJob;
    private JTextField textFieldEditEvaluationsNumRequests;
    private JScrollPane scrollPaneEditEvaluations;
    private JTable tableEditEvaluations;
    private JButton buttonEditEvaluationsUpdate;
    private JLabel labelEditEvaluationsJob;
    private JLabel labelEditEvaluationsNumRequests;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelEvaluator = new JPanel();
        panelEvaluator.setLayout(new GridBagLayout());
        tabbedPaneEvaluator = new JTabbedPane();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelEvaluator.add(tabbedPaneEvaluator, gbc);
        panelPersonal = new JPanel();
        panelPersonal.setLayout(new GridBagLayout());
        tabbedPaneEvaluator.addTab("Personal", panelPersonal);
        textFieldUsername = new JTextField();
        textFieldUsername.setEditable(false);
        textFieldUsername.setEnabled(true);
        textFieldUsername.setMinimumSize(new Dimension(150, 30));
        textFieldUsername.setOpaque(false);
        textFieldUsername.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(textFieldUsername, gbc);
        passwordFieldPassword = new JPasswordField();
        passwordFieldPassword.setMinimumSize(new Dimension(150, 30));
        passwordFieldPassword.setOpaque(false);
        passwordFieldPassword.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(passwordFieldPassword, gbc);
        textFieldName = new JTextField();
        textFieldName.setMinimumSize(new Dimension(150, 30));
        textFieldName.setOpaque(false);
        textFieldName.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(textFieldName, gbc);
        textFieldSurname = new JTextField();
        textFieldSurname.setMinimumSize(new Dimension(150, 30));
        textFieldSurname.setOpaque(false);
        textFieldSurname.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(textFieldSurname, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelPersonal.add(spacer1, gbc);
        labelPassword = new JLabel();
        labelPassword.setText("Password:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelPersonal.add(labelPassword, gbc);
        labelPSurname = new JLabel();
        labelPSurname.setText("Surname:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelPersonal.add(labelPSurname, gbc);
        labelUsername = new JLabel();
        labelUsername.setText("Username:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelPersonal.add(labelUsername, gbc);
        labelName = new JLabel();
        labelName.setText("Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelPersonal.add(labelName, gbc);
        labelEmail = new JLabel();
        labelEmail.setText("Email:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelPersonal.add(labelEmail, gbc);
        textFieldEmail = new JTextField();
        textFieldEmail.setMinimumSize(new Dimension(150, 30));
        textFieldEmail.setOpaque(false);
        textFieldEmail.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(textFieldEmail, gbc);
        buttonUpdate = new JButton();
        buttonUpdate.setText("Update");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(buttonUpdate, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelPersonal.add(spacer2, gbc);
        panelJobs = new JPanel();
        panelJobs.setLayout(new GridBagLayout());
        tabbedPaneEvaluator.addTab("Jobs", panelJobs);
        scrollPaneJobsForeign = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelJobs.add(scrollPaneJobsForeign, gbc);
        tableJobsForeign = new JTable();
        tableJobsForeign.setFillsViewportHeight(true);
        tableJobsForeign.setPreferredScrollableViewportSize(new Dimension(450, 200));
        scrollPaneJobsForeign.setViewportView(tableJobsForeign);
        panelJobEdit = new JPanel();
        panelJobEdit.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelJobs.add(panelJobEdit, gbc);
        panelJobEdit.setBorder(BorderFactory.createTitledBorder(null, "Edit Jobs", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        scrollPaneJobEdit = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelJobEdit.add(scrollPaneJobEdit, gbc);
        scrollPaneJobEdit.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        tableJobEdit = new JTable();
        tableJobEdit.setDragEnabled(false);
        tableJobEdit.setFillsViewportHeight(true);
        tableJobEdit.setPreferredScrollableViewportSize(new Dimension(450, 200));
        scrollPaneJobEdit.setViewportView(tableJobEdit);
        buttonJobEdit = new JButton();
        buttonJobEdit.setText("Edit");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(buttonJobEdit, gbc);
        labelJobID = new JLabel();
        labelJobID.setText("ID:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobID, gbc);
        labelJobSalary = new JLabel();
        labelJobSalary.setText("Salary:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobSalary, gbc);
        labelJobLocation = new JLabel();
        labelJobLocation.setText("Location:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobLocation, gbc);
        labelJobStartDate = new JLabel();
        labelJobStartDate.setText("Start Date:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobStartDate, gbc);
        buttonJobAddUpdate = new JButton();
        buttonJobAddUpdate.setText("Add/Update");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(buttonJobAddUpdate, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(spacer3, gbc);
        textFieldJobID = new JTextField();
        textFieldJobID.setEditable(false);
        textFieldJobID.setMinimumSize(new Dimension(150, 30));
        textFieldJobID.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(textFieldJobID, gbc);
        labelJobDate = new JLabel();
        labelJobDate.setText("Date:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobDate, gbc);
        textFieldJobDate = new JTextField();
        textFieldJobDate.setEditable(false);
        textFieldJobDate.setMinimumSize(new Dimension(150, 30));
        textFieldJobDate.setPreferredSize(new Dimension(150, 30));
        textFieldJobDate.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(textFieldJobDate, gbc);
        datePickerJobStartDate = new DatePicker();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(datePickerJobStartDate, gbc);
        textFieldJobLocation = new JTextField();
        textFieldJobLocation.setMinimumSize(new Dimension(150, 30));
        textFieldJobLocation.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(textFieldJobLocation, gbc);
        labelJobPosition = new JLabel();
        labelJobPosition.setText("Position:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobPosition, gbc);
        labelJobActivity = new JLabel();
        labelJobActivity.setText("Activity:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobActivity, gbc);
        textFieldJobPosition = new JTextField();
        textFieldJobPosition.setMinimumSize(new Dimension(150, 30));
        textFieldJobPosition.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(textFieldJobPosition, gbc);
        comboBoxJobActivity = new JComboBox();
        comboBoxJobActivity.setMinimumSize(new Dimension(150, 30));
        comboBoxJobActivity.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(comboBoxJobActivity, gbc);
        textFieldJobSalary = new JTextField();
        textFieldJobSalary.setMinimumSize(new Dimension(150, 30));
        textFieldJobSalary.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelJobEdit.add(textFieldJobSalary, gbc);
        datePickerJobSubmissionDate = new DatePicker();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(datePickerJobSubmissionDate, gbc);
        labelJobSubmissionDate = new JLabel();
        labelJobSubmissionDate.setText("Deadline:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panelJobEdit.add(labelJobSubmissionDate, gbc);
        panelActivityAdd = new JPanel();
        panelActivityAdd.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.7;
        gbc.fill = GridBagConstraints.BOTH;
        panelJobs.add(panelActivityAdd, gbc);
        panelActivityAdd.setBorder(BorderFactory.createTitledBorder(null, "Activities", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textFieldActivityTitle = new JTextField();
        textFieldActivityTitle.setMinimumSize(new Dimension(150, 30));
        textFieldActivityTitle.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(textFieldActivityTitle, gbc);
        scrollPaneActivityDescription = new JScrollPane();
        scrollPaneActivityDescription.setMinimumSize(new Dimension(400, 60));
        scrollPaneActivityDescription.setPreferredSize(new Dimension(11, 60));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelActivityAdd.add(scrollPaneActivityDescription, gbc);
        scrollPaneActivityDescription.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textAreaActivityDescription = new JTextArea();
        scrollPaneActivityDescription.setViewportView(textAreaActivityDescription);
        labelActivityTitle = new JLabel();
        labelActivityTitle.setText("Title:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelActivityAdd.add(labelActivityTitle, gbc);
        labelActivityParent = new JLabel();
        labelActivityParent.setText("Parent:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelActivityAdd.add(labelActivityParent, gbc);
        comboBoxActivityParent = new JComboBox();
        comboBoxActivityParent.setMinimumSize(new Dimension(150, 30));
        comboBoxActivityParent.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(comboBoxActivityParent, gbc);
        buttonActivityAdd = new JButton();
        buttonActivityAdd.setText("Add");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(buttonActivityAdd, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelActivityAdd.add(spacer4, gbc);
        panelEvaluations = new JPanel();
        panelEvaluations.setLayout(new GridBagLayout());
        tabbedPaneEvaluator.addTab("Evaluations", panelEvaluations);
        scrollPaneEvaluationsForeign = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelEvaluations.add(scrollPaneEvaluationsForeign, gbc);
        tableEvaluationsForeign = new JTable();
        tableEvaluationsForeign.setFillsViewportHeight(true);
        tableEvaluationsForeign.setPreferredScrollableViewportSize(new Dimension(450, 200));
        scrollPaneEvaluationsForeign.setViewportView(tableEvaluationsForeign);
        panelEditEvaluations = new JPanel();
        panelEditEvaluations.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelEvaluations.add(panelEditEvaluations, gbc);
        panelEditEvaluations.setBorder(BorderFactory.createTitledBorder(null, "Edit Evaluations", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        scrollPaneEditEvaluations = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panelEditEvaluations.add(scrollPaneEditEvaluations, gbc);
        scrollPaneEditEvaluations.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        tableEditEvaluations = new JTable();
        tableEditEvaluations.setDragEnabled(false);
        tableEditEvaluations.setFillsViewportHeight(true);
        tableEditEvaluations.setPreferredScrollableViewportSize(new Dimension(450, 200));
        scrollPaneEditEvaluations.setViewportView(tableEditEvaluations);
        buttonEditEvaluationsUpdate = new JButton();
        buttonEditEvaluationsUpdate.setText("Update");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEditEvaluations.add(buttonEditEvaluationsUpdate, gbc);
        labelEditEvaluationsJob = new JLabel();
        labelEditEvaluationsJob.setText("Job:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelEditEvaluations.add(labelEditEvaluationsJob, gbc);
        comboBoxEditEvaluationsJob = new JComboBox();
        comboBoxEditEvaluationsJob.setMinimumSize(new Dimension(150, 30));
        comboBoxEditEvaluationsJob.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEditEvaluations.add(comboBoxEditEvaluationsJob, gbc);
        labelEditEvaluationsNumRequests = new JLabel();
        labelEditEvaluationsNumRequests.setText("# of Requests:");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelEditEvaluations.add(labelEditEvaluationsNumRequests, gbc);
        textFieldEditEvaluationsNumRequests = new JTextField();
        textFieldEditEvaluationsNumRequests.setEditable(false);
        textFieldEditEvaluationsNumRequests.setMinimumSize(new Dimension(150, 30));
        textFieldEditEvaluationsNumRequests.setPreferredSize(new Dimension(150, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEditEvaluations.add(textFieldEditEvaluationsNumRequests, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelEditEvaluations.add(spacer5, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelEvaluator;
    }

    public static void show() {
        JFrame frame = new JFrame("Evaluator");
        frame.setContentPane(new Evaluator().panelEvaluator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}