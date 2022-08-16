package View;

import Controller.ActionsListener;
import Models.Header;
import Models.HeaderTable;
import Models.Items;
import Models.ItemsTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class test extends JFrame {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem loadMenuItem;
    private JMenuItem saveMenuItem;


    private JPanel Main;
    private JTable table1;


    private JButton createNewInvoiceButton;
    private JButton deleteInvoiceButton;
    private JTextField txtInvoiceDate;
    private JButton cancelButton;
    private JButton saveButton;
    private JTextField txtCustomerName;
    private JTable table2;

    private test app;
    private ArrayList<Header> headerArrayList;
    private ArrayList<Items> itemsArrayList;
    private HeaderTable headerTable = new HeaderTable();
    private JTable invoicesTable;
    private JTable invoiceItemsTable;
    private JLabel invoiceNoValueLabel;
    private JTextField customerNameTextField;
    private JTextField invoiceDateTextField;
    private JLabel invoiceNumerValueLabel;
    private JLabel customerNameValueLabel;
    private JLabel invoiceDateValueLabel;
    private JLabel invoiceTotalValueLabel;
    private JTextField itemNameTextField;
    private JTextField itemPriceTextField;
    private JTextField countTextField;
    private ItemsTable itemsTable = new ItemsTable();

    private ActionsListener actionsListener = new ActionsListener(this);


    public test() {


        menuBar = new JMenuBar();
        loadMenuItem = new JMenuItem("Load File", 'L');
        saveMenuItem = new JMenuItem("Save File", 'S');
        loadMenuItem.setAccelerator(KeyStroke.getKeyStroke('L', KeyEvent.ALT_DOWN_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.ALT_DOWN_MASK));
        ButtonGroup group = new ButtonGroup();
        fileMenu = new JMenu("File");
        fileMenu.add(loadMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        loadMenuItem.addActionListener(actionsListener);
        saveMenuItem.addActionListener(actionsListener);
        deleteInvoiceButton.addActionListener(actionsListener);
        createNewInvoiceButton.addActionListener(actionsListener);
        saveButton.addActionListener(actionsListener);
        cancelButton.addActionListener(actionsListener);



        createTable1();

        createTable2();
    }
    public ActionsListener getActionsListener() {
        return actionsListener;
    }
    public void setActionsListener(ActionsListener actionsListener) {
        this.actionsListener = actionsListener;
    }

    private void createTable1() {
        String[][] Invoice_Table = {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""}
        };
        table1.setModel(new DefaultTableModel(Invoice_Table,
                new String[]{"NO.", "Date", "Customer", "Total"}
        ));

    }

    private void createTable2() {
        String[][] Invoice_Items = {
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""}
        };
        table2.setModel(new DefaultTableModel(Invoice_Items,
                new String[]{"NO.", "Item Name", "Item Price", "Count", "Item Total"}
        ));

    }


    public static void main(String[] args) throws IOException {

        test j = new test();
        j.setContentPane(new test().Main);
        j.setSize(800, 600);
        j.setLocation(200, 50);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();



    }
    public void setHeaderArrayList(ArrayList<Header> headerArrayList) {
        this.headerArrayList = headerArrayList;
    }
    public Header getNo(int no){
        for (Header header : headerArrayList){
            if (header.getInvoiceNumber() == no) {
                return header;
            }
        }
        return null;
    }
    public void setItemsArrayList(ArrayList<Items> itemsArrayList) {
        this.itemsArrayList = itemsArrayList;
    }
    public void setHeaderTable(HeaderTable headerTable) {
        this.headerTable = headerTable;
    }
    public JTable getInvoicesTable() {
        return invoicesTable;
    }
    public JTable getInvoiceItemsTable() {
        return invoiceItemsTable;
    }
    public ArrayList<Header> getHeaderArrayList() {
        return headerArrayList;
    }
    public JLabel getInvoiceNoValueLabel() {
        return invoiceNoValueLabel;
    }
    public JTextField getCustomerNameTextField() {
        return customerNameTextField;
    }
    public JTextField getInvoiceDateTextField() {
        return invoiceDateTextField;
    }
    public HeaderTable getHeaderTable() {
        return headerTable;

    }
    public JLabel getInvoiceNumerValueLabel() {
        return invoiceNumerValueLabel;
    }
    public JLabel getCustomerNameValueLabel() {
        return customerNameValueLabel;
    }
    public JLabel getInvoiceDateValueLabel() {
        return invoiceDateValueLabel;
    }
    public JLabel getInvoiceTotalValueLabel() {
        return invoiceTotalValueLabel;
    }
    public JTextField getItemNameTextField() {
        return itemNameTextField;
    }
    public JTextField getItemPriceTextField() {
        return itemPriceTextField;
    }
    public JTextField getCountTextField() {
        return countTextField;
    }
    public ArrayList<Items> getItemsArrayList() {
        return itemsArrayList;
    }
    public ItemsTable getItemsTable() {
        return itemsTable;
    }











}



