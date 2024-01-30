package newpackage;

import EgyEast.com.roundedpanal.*;
import javax.swing.*;

public class RoundedPanel extends JPanel {
    private int borderRadius ; // Adjust the border radius as needed
   
    public RoundedPanel() {
        this(50); 
    }
     public RoundedPanel(int borderRadius ) {
         this.borderRadius=borderRadius;
        setOpaque(false); // Make the panel transparent
        
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        // Draw rounded border
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
    }}
    