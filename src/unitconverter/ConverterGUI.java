package unitconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ConverterGUI extends JFrame {

    private JComboBox<String> categoryBox;
    private JComboBox<String> conversionBox;
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton historyButton;
    private JButton convertButton;

    private ArrayList<String> history = new ArrayList<>();
    private DefaultListModel<String> historyModel = new DefaultListModel<>();

    public ConverterGUI() {
        setTitle("Unit Converter");
        setSize(450, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        add(buildHeader(), BorderLayout.NORTH);
        add(buildForm(), BorderLayout.CENTER);
        add(buildResult(), BorderLayout.SOUTH);

        setVisible(true);
    }