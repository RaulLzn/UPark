package co.edu.upb.upark;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class SelectTypeOfLicensePlate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectTypeOfLicensePlate frame = new SelectTypeOfLicensePlate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectTypeOfLicensePlate() {

		this.setResizable(false); // Disable the maximize window option

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the operation that will be performed when the window is closed
		setBounds(100, 100, 1286, 660); // Size and position of the frame

		// Creating a new JPanel and setting its properties:
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); // Set the content pane of the frame to the new JPanel
		contentPane.setLayout(null); // Set the layout of the panel to null


		// Creation of the black JPanel, located at the bottom of the window:
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 594, 1287, 29);
		contentPane.add(panel_1);

		// Creation of a JLabel with the Logo of the University:
		JLabel lblUpbLogo = new JLabel("");
		lblUpbLogo.setBounds(10, 10, 343, 132);
		contentPane.add(lblUpbLogo);
		lblUpbLogo.setIcon(new ImageIcon("Media\\logo-upb-blanco1.png"));

		// Creation of a JLabel containing the text: "Tipo de Placa":
		JLabel lblTipoPlaca = new JLabel("Tipo de Placa");
		lblTipoPlaca.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 80));
		lblTipoPlaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoPlaca.setBounds(411, 52, 774, 90);
		contentPane.add(lblTipoPlaca);

		JPanel panel = new JPanel();
		panel.setBounds(86, 372, 399, 110);
		contentPane.add(panel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(86, 171, 399, 110);
		contentPane.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(786, 372, 399, 110);
		contentPane.add(panel_3);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(786, 171, 399, 110);
		contentPane.add(panel_3_1);

		JLabel lblNewLabel = new JLabel("Vehículo Particular");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(86, 291, 399, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblVehculoPblico = new JLabel("Vehículo Público");
		lblVehculoPblico.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehculoPblico.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
		lblVehculoPblico.setBounds(786, 291, 399, 39);
		contentPane.add(lblVehculoPblico);
		
		JLabel lblVehculoAntiguoYo = new JLabel("Vehículo Antiguo y Clásico");
		lblVehculoAntiguoYo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehculoAntiguoYo.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
		lblVehculoAntiguoYo.setBounds(786, 492, 399, 39);
		contentPane.add(lblVehculoAntiguoYo);
		
		JLabel lblVehculoDiplomticaConsular = new JLabel("Vehículo Diplomática, Consular y");
		lblVehculoDiplomticaConsular.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehculoDiplomticaConsular.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
		lblVehculoDiplomticaConsular.setBounds(48, 492, 475, 39);
		contentPane.add(lblVehculoDiplomticaConsular);
		
		JLabel lblDeMisionesEspeciales = new JLabel("de Misiones Especiales");
		lblDeMisionesEspeciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeMisionesEspeciales.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 30));
		lblDeMisionesEspeciales.setBounds(86, 526, 399, 39);
		contentPane.add(lblDeMisionesEspeciales);



	} // public SelectTypeOfLicensePlate()
	
} // public class SelectTypeOfLicensePlate extends JFrame 
