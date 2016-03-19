package lab1.gui;

import javax.swing.JComboBox;

public class size extends JComboBox
{
  public size()
  {
    addItem("small");
    addItem("medium");
    addItem("large");
    addItem("grand");
    setSelectedItem("small");
  }
}