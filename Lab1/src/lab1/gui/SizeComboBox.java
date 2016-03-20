package lab1.gui;

import javax.swing.JComboBox;

public class SizeComboBox extends JComboBox
{
  public SizeComboBox()
  {
    addItem("small");
    addItem("medium");
    addItem("large");
    addItem("grand");
    setSelectedItem("small");
  }
}