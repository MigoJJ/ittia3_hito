package ros_comm;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Ros_JRadioButton {
  public static void main(String args[]) {
    TableModel model = new AbstractTableModel() {
      Icon icon1 = new ImageIcon("TreeCollapsed.gif");
      Icon icon2 = new ImageIcon("TreeExpanded.gif");

      Object rowData[][] = {
          { new Integer(1), "ichi", Boolean.TRUE,
              new Date("01/01/2000"), icon1 },
          { new Integer(2), "ni", Boolean.TRUE,
              new Date("04/15/1999"), icon2 },
          { new Integer(3), "san", Boolean.FALSE,
              new Date("12/07/1941"), icon2 },
          { new Integer(4), "shi", Boolean.TRUE,
              new Date("02/29/2000"), icon1 },
          { new Integer(5), "go", Boolean.FALSE,
              new Date("05/23/1995"), icon1 }, };

      String columnNames[] = { "English", "Japanese", "Boolean", "Date",
          "ImageIcon" };

      public int getColumnCount() {
        return columnNames.length;
      }

      public String getColumnName(int column) {
        return columnNames[column];
      }

      public int getRowCount() {
        return rowData.length;
      }

      public Object getValueAt(int row, int column) {
        return rowData[row][column];
      }

      public Class getColumnClass(int column) {
        return (getValueAt(0, column).getClass());
      }

      public void setValueAt(Object value, int row, int column) {
        rowData[row][column] = value;
      }

      public boolean isCellEditable(int row, int column) {
        return (column != 4);
      }
    };

    JFrame frame = new JFrame("Column Renderer Table");
    JTable table = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(table);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.setSize(400, 150);
    frame.setVisible(true);
  }
}