
	package SwingPrac;


	import javax.swing.*;

	public class MySwingEx extends javax.swing.JFrame {

	    
	    public MySwingEx() {
	        initComponents();
	        
	         
	        
	    }

	                              
	    private void initComponents() {

	        jTextField1 = new javax.swing.JTextField();
	        jLabel1 = new javax.swing.JLabel();
	        jt1 = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jl1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jComboBox1 = new javax.swing.JComboBox<>();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        jRadioButton2 = new javax.swing.JRadioButton();

	        jTextField1.setText("jTextField1");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("PJB_Galaxy");
	        setBackground(new java.awt.Color(51, 255, 51));
	        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        setForeground(new java.awt.Color(102, 204, 0));
	        setResizable(false);
	        setType(java.awt.Window.Type.POPUP);

	        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
	        jLabel1.setText("Enter your Text ---->");

	        jt1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jt1ActionPerformed(evt);
	            }
	        });

	        jButton1.setBackground(new java.awt.Color(255, 255, 255));
	        jButton1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
	        jButton1.setForeground(new java.awt.Color(51, 51, 255));
	        jButton1.setText("CLICK HERE");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jl1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N

	        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
	        jLabel2.setText("Your Entered Text is as below--->");

	        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
	        jLabel3.setText("MNP TECH CREATION");
	        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

	        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "Adv Java", "Android", "Dot Net" }));

	        jButton2.setText("Course");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        jButton3.setText("Save To MNP DB");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jLabel4.setText("You have Selected for the course :");

	        jRadioButton1.setText("Like");
	        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton1ActionPerformed(evt);
	            }
	        });

	        jRadioButton2.setText("Dislike");
	        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton2ActionPerformed(evt);
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
	                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jt1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(20, 20, 20)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(44, 44, 44)
	                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap())
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(110, 110, 110)
	                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(65, 65, 65)
	                        .addComponent(jRadioButton2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(0, 10, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jRadioButton2)
	                            .addComponent(jRadioButton1))))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(7, 7, 7))
	        );

	        pack();
	    }                       

	    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
	        
	    }                                   

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

	        String s=jt1.getText(); 
	jl1.setText("You have Entered ---->"+s);
	    }                                        

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        
	        JOptionPane.showMessageDialog(null,jComboBox1.getSelectedItem().toString());
	       // jLabel5.setText(jComboBox1.getSelectedItem().toString());
	    }                                        

	    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        
	        
	        if(jRadioButton1.isSelected())
	            jRadioButton2.setSelected(false);
	        JOptionPane.showMessageDialog(null, "You Have Liked ..ThankYou");
	    }                                             

	    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        
	        if(jRadioButton2.isSelected())
	            jRadioButton1.setSelected(false);
	        JOptionPane.showMessageDialog(null, "You Have Disliked .. We will try  to improve.. Thank You");
	    }                                             

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	      
	        JOptionPane.showMessageDialog(null, "You Are Going To save The Data To Database....");
	        String  s1,s2;
			//if (jRadioButton2.isSelected())
	        	// s1="Like";
			//else if(jRadioButton2.isSelected()
	        //s2="Dislike";
			//else;
	    }                                        

	    
	    public static void main(String args[]) {
	        
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MySwingEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MySwingEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MySwingEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MySwingEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new MySwingEx().setVisible(true);
	            }
	        });
	    }

	                       
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JComboBox<String> jComboBox1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JLabel jl1;
	    private javax.swing.JTextField jt1;
	                     
	}

