import javax.comm.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 * JModem - simple communications program.
 * @author    Ian F. Darwin, ian@darwinsys.com
 * @version   $Id$
 */
public class JModem extends javax.swing.JFrame {

  /** Initializes the Form */
  public JModem() {
    initComponents();
  finishConstructor();
    pack();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the FormEditor.
   */
  private void initComponents () {//GEN-BEGIN:initComponents
    addWindowListener (new java.awt.event.WindowAdapter () {
        public void windowClosing (java.awt.event.WindowEvent evt) {
          exitForm (evt);
        }
      }
    );
    getContentPane ().setLayout (new java.awt.BorderLayout ());

    jMenuBar1 = new javax.swing.JMenuBar ();
      fileMenu = new javax.swing.JMenu ();
      fileMenu.setText ("File");
        exitMenuItem = new javax.swing.JMenuItem ();
        exitMenuItem.setText ("Exit");
        exitMenuItem.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              exitMenuItemActionPerformed (evt);
            }
          }
        );
        fileMenu.add(exitMenuItem);

      jMenuBar1.add(fileMenu);

      helpMenu = new javax.swing.JMenu ();
      helpMenu.setText ("Help");
        helpAboutMenuItem = new javax.swing.JMenuItem ();
        helpAboutMenuItem.setText ("Item");
        helpAboutMenuItem.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              helpAboutMenuItemActionPerformed (evt);
            }
          }
        );
        helpMenu.add(helpAboutMenuItem);

      jMenuBar1.add(helpMenu);


    setJMenuBar(jMenuBar1);
    connectPanel = new javax.swing.JPanel ();
    connectPanel.setLayout (new java.awt.FlowLayout ());

      connectPanelLabel = new javax.swing.JLabel ();
      connectPanelLabel.setText ("Connection");
      connectPanelLabel.setForeground (java.awt.Color.red);
      connectPanel.add (connectPanelLabel);

      portLabel = new javax.swing.JLabel ();
      portLabel.setText ("Port:");
      connectPanel.add (portLabel);

      portsComboBox = new javax.swing.JComboBox ();
      portsComboBox.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            portsComboBoxActionPerformed (evt);
          }
        }
      );
      connectPanel.add (portsComboBox);

      buadLabel = new javax.swing.JLabel ();
      buadLabel.setText ("Speed");
      connectPanel.add (buadLabel);

      baudComboBox = new javax.swing.JComboBox ();
      baudComboBox.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            baudComboBoxActionPerformed (evt);
          }
        }
      );
      connectPanel.add (baudComboBox);

      databitsPanel = new javax.swing.JPanel ();
      databitsPanel.setPreferredSize (new java.awt.Dimension(50, 50));
      databitsPanel.setMinimumSize (new java.awt.Dimension(0, 0));
      databitsPanel.setLayout (new javax.swing.BoxLayout (databitsPanel, 1));

        d7RadioButton = new javax.swing.JRadioButton ();
        d7RadioButton.setText ("7");
        databitsPanel.add (d7RadioButton);

        d8radioButton = new javax.swing.JRadioButton ();
        d8radioButton.setText ("8");
        databitsPanel.add (d8radioButton);

      connectPanel.add (databitsPanel);

      parityPanel = new javax.swing.JPanel ();
      parityPanel.setPreferredSize (new java.awt.Dimension(50, 50));
      parityPanel.setLayout (new javax.swing.BoxLayout (parityPanel, 1));

        pEvenRadioButton = new javax.swing.JRadioButton ();
        pEvenRadioButton.setText ("Even");
        pEvenRadioButton.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              evenRadioButtonActionPerformed (evt);
            }
          }
        );
        parityPanel.add (pEvenRadioButton);

        pOddRadioButton = new javax.swing.JRadioButton ();
        pOddRadioButton.setText ("Odd");
        pOddRadioButton.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              oddRadioButtonActionPerformed (evt);
            }
          }
        );
        parityPanel.add (pOddRadioButton);

        pNoneRadioButton = new javax.swing.JRadioButton ();
        pNoneRadioButton.setText ("None");
        pNoneRadioButton.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              pNoneRadioButtonActionPerformed (evt);
            }
          }
        );
        parityPanel.add (pNoneRadioButton);

      connectPanel.add (parityPanel);

      sysTypeLabel = new javax.swing.JLabel ();
      sysTypeLabel.setText ("Remote:");
      connectPanel.add (sysTypeLabel);

      sysTypeComboBox = new javax.swing.JComboBox ();
      sysTypeComboBox.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            sysTypeComboBoxActionPerformed (evt);
          }
        }
      );
      connectPanel.add (sysTypeComboBox);

      connectButton = new javax.swing.JButton ();
      connectButton.setText ("Connect");
      connectButton.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            connectButtonActionPerformed (evt);
          }
        }
      );
      connectPanel.add (connectButton);

    getContentPane ().add (connectPanel, "North");

    xferPanel = new javax.swing.JPanel ();
    xferPanel.setLayout (new java.awt.FlowLayout ());

      xferPanelLabel = new javax.swing.JLabel ();
      xferPanelLabel.setText ("File Transfer");
      xferPanelLabel.setForeground (java.awt.Color.red);
      xferPanel.add (xferPanelLabel);

      jPanel6 = new javax.swing.JPanel ();
      jPanel6.setLayout (new javax.swing.BoxLayout (jPanel6, 1));

        sendRadioButton = new javax.swing.JRadioButton ();
        sendRadioButton.setText ("Send");
        sendRadioButton.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              sendRadioButtonActionPerformed (evt);
            }
          }
        );
        jPanel6.add (sendRadioButton);

        recvRadioButton = new javax.swing.JRadioButton ();
        recvRadioButton.setText ("Receive");
        recvRadioButton.addActionListener (new java.awt.event.ActionListener () {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
              recvRadioButtonActionPerformed (evt);
            }
          }
        );
        jPanel6.add (recvRadioButton);

      xferPanel.add (jPanel6);

      xferFilenameLabel = new javax.swing.JLabel ();
      xferFilenameLabel.setText ("Filename:");
      xferPanel.add (xferFilenameLabel);

      xferFileNameTF = new javax.swing.JTextField ();
      xferFileNameTF.setPreferredSize (new java.awt.Dimension(100, 20));
      xferPanel.add (xferFileNameTF);

      jPanel7 = new javax.swing.JPanel ();
      jPanel7.setLayout (new javax.swing.BoxLayout (jPanel7, 1));

        xferModeTextRadioButton = new javax.swing.JRadioButton ();
        xferModeTextRadioButton.setText ("Text");
        jPanel7.add (xferModeTextRadioButton);

        xferModeBinRadioButton = new javax.swing.JRadioButton ();
        xferModeBinRadioButton.setText ("Binary");
        jPanel7.add (xferModeBinRadioButton);

      xferPanel.add (jPanel7);

      xferButton = new javax.swing.JButton ();
      xferButton.setText ("Transfer");
      xferButton.addActionListener (new java.awt.event.ActionListener () {
          public void actionPerformed (java.awt.event.ActionEvent evt) {
            xferButtonActionPerformed (evt);
          }
        }
      );
      xferPanel.add (xferButton);

    getContentPane ().add (xferPanel, "South");

    theTextArea = new javax.swing.JTextArea ();
    theTextArea.setColumns (80);
    theTextArea.setRows (15);
    getContentPane ().add (theTextArea, "Center");

  }//GEN-END:initComponents

  private void helpAboutMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpAboutMenuItemActionPerformed
    JOptionPane.showMessageDialog(this,
      "JModem 0.0 (c) 2000 Ian F. Darwin\nian@darwinsys.com",
      "About JModem", JOptionPane.INFORMATION_MESSAGE);
  }//GEN-LAST:event_helpAboutMenuItemActionPerformed

  private void baudComboBoxActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portsComboBoxActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_portsComboBoxActionPerformed

  private void portsComboBoxActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portsComboBoxActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_portsComboBoxActionPerformed

  private int[] baudot = { 9600, 19200, 38400, 57600, 115200 };
  private String sysTypes[] = { "Unix", "DOS", "Other" };

  private HashMap portsIDmap = new HashMap();

  /** Finish the initializations. */
  private void finishConstructor() {

    // get list of ports available on this particular computer,
    // by calling static method in CommPortIdentifier.
    Enumeration pList = CommPortIdentifier.getPortIdentifiers();

    // Process the list of ports, putting serial ports into ComboBox
    while (pList.hasMoreElements()) {
      CommPortIdentifier cpi = (CommPortIdentifier)pList.nextElement();
      if (cpi.getPortType() == CommPortIdentifier.PORT_SERIAL) {
        portsComboBox.addItem(cpi.getName());
		portsIDmap.put(cpi.getName(), cpi);
      }
    }
	portsComboBox.setSelectedIndex(0);

	// Load up the baud-rate combo box
	for (int i=0; i<baudot.length; i++) {
		baudComboBox.addItem(Integer.toString(baudot[i]));
	}
	baudComboBox.setSelectedIndex(0);

	// Load up the System Type combo box
	for (int i=0; i<sysTypes.length; i++) {
		sysTypeComboBox.addItem(sysTypes[i]);
	}
	sysTypeComboBox.setSelectedIndex(0);

	// put radio buttons into groups to enforce single-selection
	ButtonGroup b1 = new ButtonGroup();
	b1.add(d7RadioButton);
	b1.add(d8radioButton);

	ButtonGroup b2 = new ButtonGroup();
	b2.add(pNoneRadioButton);
	b2.add(pEvenRadioButton);
	b2.add(pOddRadioButton);

	ButtonGroup b3 = new ButtonGroup();
	b3.add(sendRadioButton);
	b3.add(recvRadioButton);

	ButtonGroup b4 = new ButtonGroup();
	b4.add(xferModeTextRadioButton);
	b4.add(xferModeBinRadioButton);
  }

  private int M_RECEIVE = -1, M_SEND = +1;
  private int xferDirection = M_RECEIVE;

  private void recvRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recvRadioButtonActionPerformed
    xferDirection = M_RECEIVE;
  }//GEN-LAST:event_recvRadioButtonActionPerformed

  private void sendRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRadioButtonActionPerformed
    xferDirection = M_SEND;
  }//GEN-LAST:event_sendRadioButtonActionPerformed

  private void exitMenuItemActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
    System.exit(0);
  }//GEN-LAST:event_exitMenuItemActionPerformed

  private void sysTypeComboBoxActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysTypeComboBoxActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_sysTypeComboBoxActionPerformed

  private void pNoneRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNoneRadioButtonActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_pNoneRadioButtonActionPerformed

  private void oddRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddRadioButtonActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_oddRadioButtonActionPerformed

  private void evenRadioButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evenRadioButtonActionPerformed
    // Add your handling code here:
  }//GEN-LAST:event_evenRadioButtonActionPerformed

  private void xferButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xferButtonActionPerformed
    // Do the transfer, using TModem class.
  }//GEN-LAST:event_xferButtonActionPerformed

  private int S_DISCONNECTED = 0, S_CONNECTED = 1;
  private int state = S_DISCONNECTED;
  private int S_INTERACT = 0, S_XFER = 1;
  private int submode = S_INTERACT;

  private void connectButtonActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
	if (state == S_CONNECTED) {
		disconnect();
		connectButton.setText("Connect");
	} else {
		try {
			connect();
		} catch (PortInUseException pue) {
			err("Port in use: close other app, or use different port.");
			return;
		} catch (UnsupportedCommOperationException uoe) {
			err("Unsupported options error: try different settings");
			return;
		}
		connectButton.setText("Disconnect");
	}
  }

  protected void err(String s) {
	JOptionPane.showMessageDialog(this,
	  "Port in use: close other app, or use different port.",
	  "JModem Error", JOptionPane.ERROR_MESSAGE);
	return;
  }

  private SerialPort thePort;

  private InputStream serialInput;
  private PrintWriter serialOutput;

  private void connect() throws PortInUseException, 
  		UnsupportedCommOperationException {

    // Open the specified serial port
	CommPortIdentifier cpi = (CommPortIdentifier)portsIDmap.get(
		portsComboBox.getSelectedItem());
	thePort = (SerialPort)cpi.open("JModem", 15*1000);

	// Set the serial port parameters.
	int parity = 0;
	if (pNoneRadioButton.isSelected()) parity = SerialPort.PARITY_NONE;
	if (pEvenRadioButton.isSelected()) parity = SerialPort.PARITY_EVEN;
	if (pOddRadioButton.isSelected())  parity = SerialPort.PARITY_ODD;
	thePort.setSerialPortParams(
		baudot[portsComboBox.getSelectedIndex()],		// baud
		d7RadioButton.isSelected() ?					// data bits
			SerialPort.DATABITS_7 : SerialPort.DATABITS_8,
		SerialPort.STOPBITS_1,							// stop bits
		parity);										// parity

	// Get the streams
	try {
		serialInput = thePort.getInputStream();
	} catch (IOException e) {
		err("Error getting input stream:\n" + e.toString());
		return;
	}
	try {
		serialOutput = new PrintWriter(thePort.getOutputStream());
	} catch (IOException e) {
		err("Error getting output stream:\n" + e.toString());
		return;
	}

	state = S_CONNECTED;

  }//GEN-LAST:event_connectButtonActionPerformed

  private void disconnect() {
  	System.out.println("Disconnecting!");
	// Tell java.io we are done with the input and output
	try {
		serialInput.close();
		serialOutput.close();
	} catch (IOException e) {
		err("IO Exception closing port:\n" + e.toString());
	}
	// Tell javax.comm we are done with the port.
	thePort.close();
	// Tell rest of program we are no longer online.
	state = S_DISCONNECTED;
  }

  private void sendChar() {
  }

  /** Exit the Application */
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
    System.exit (0);
  }//GEN-LAST:event_exitForm


// Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel connectPanel;
  private javax.swing.JPanel xferPanel;
  private javax.swing.JTextArea theTextArea;
  private javax.swing.JLabel connectPanelLabel;
  private javax.swing.JLabel buadLabel;
  private javax.swing.JComboBox baudComboBox;
  private javax.swing.JPanel databitsPanel;
  private javax.swing.JPanel parityPanel;
  private javax.swing.JComboBox sysTypeComboBox;
  private javax.swing.JButton connectButton;
  private javax.swing.JRadioButton d7RadioButton;
  private javax.swing.JRadioButton d8radioButton;
  private javax.swing.JRadioButton pEvenRadioButton;
  private javax.swing.JRadioButton pOddRadioButton;
  private javax.swing.JRadioButton pNoneRadioButton;
  private javax.swing.JLabel xferPanelLabel;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JLabel xferFilenameLabel;
  private javax.swing.JTextField xferFileNameTF;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JButton xferButton;
  private javax.swing.JRadioButton sendRadioButton;
  private javax.swing.JRadioButton recvRadioButton;
  private javax.swing.JRadioButton xferModeTextRadioButton;
  private javax.swing.JRadioButton xferModeBinRadioButton;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JComboBox portsComboBox;
  private javax.swing.JLabel portLabel;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JMenuItem helpAboutMenuItem;
  private javax.swing.JLabel sysTypeLabel;
// End of variables declaration//GEN-END:variables


  public static void main(java.lang.String[] args) {
    new JModem ().show ();
  }

}
