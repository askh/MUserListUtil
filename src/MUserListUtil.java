import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MUserListUtil {
	
	private static final String APP_NAME = "Утилита для обработки файлов пользователей Moodle";
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 600;
	
	private static void createGUI() {
		JFrame frame = new JFrame(APP_NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(createMenuBar());
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
	}
	
	private static JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar(); 
		menuBar.add(createFileMenu());
		menuBar.add(createHelpMenu());		
		return menuBar;
	}
	
	private static JMenu createFileMenu() {
		JMenu file_menu = new JMenu("Файл");
		JMenuItem open_item = new JMenuItem("Открыть");
		open_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		file_menu.add(open_item);
		
		JMenuItem exit_item = new JMenuItem("Выход");
		exit_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		file_menu.add(exit_item);
		
		return file_menu;
	}

	private static JMenu createHelpMenu() {
		JMenu help_menu = new JMenu("Помощь");
		JMenuItem about_item = new JMenuItem("О программе");
		about_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		help_menu.add(about_item);
		return help_menu;
	}
	
	private MUserListUtil() {
		createGUI();
	}

	public static void main(String[] args) {
		MUserListUtil app = new MUserListUtil(); 

	}

}
