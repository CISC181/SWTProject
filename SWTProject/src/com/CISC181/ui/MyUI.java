package com.CISC181.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MyUI {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyUI window = new MyUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(593, 476);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.NONE);
		mntmFile.setText("File");
		
		MenuItem mntmPlay_1 = new MenuItem(menu, SWT.CASCADE);
		mntmPlay_1.setText("Play");
		
		Menu menu_1 = new Menu(mntmPlay_1);
		mntmPlay_1.setMenu(menu_1);
		
		MenuItem mntmShuffle = new MenuItem(menu_1, SWT.NONE);
		mntmShuffle.setText("Shuffle");
		
		Group group = new Group(shell, SWT.NONE);
		FormData fd_group = new FormData();
		fd_group.top = new FormAttachment(0, 10);
		fd_group.left = new FormAttachment(0, 10);
		fd_group.bottom = new FormAttachment(0, 126);
		fd_group.right = new FormAttachment(0, 232);
		group.setLayoutData(fd_group);
		
		text = new Text(group, SWT.BORDER);
		text.addTouchListener(new TouchListener() {
			public void touch(TouchEvent e) {
			}
		});
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		text.setBounds(88, 27, 111, 21);
		
		Label label = new Label(group, SWT.NONE);
		label.setText("First Name");
		label.setBounds(25, 30, 57, 15);
		
		Button btnMale = new Button(group, SWT.RADIO);
		btnMale.setBounds(88, 54, 47, 16);
		btnMale.setText("Male");
		
		Button btnFemale = new Button(group, SWT.RADIO);
		btnFemale.setBounds(141, 54, 57, 16);
		btnFemale.setText("Female");
		
		Group group_1 = new Group(shell, SWT.NONE);
		FormData fd_group_1 = new FormData();
		fd_group_1.top = new FormAttachment(group, 39);
		fd_group_1.right = new FormAttachment(100, -33);
		fd_group_1.bottom = new FormAttachment(100, -64);
		fd_group_1.left = new FormAttachment(100, -537);
		group_1.setLayoutData(fd_group_1);
		
		Button btnUndergradate = new Button(group_1, SWT.RADIO);
		btnUndergradate.setBounds(70, 53, 90, 16);
		btnUndergradate.setText("Undergradate");
		
		Button btnGraduate = new Button(group_1, SWT.RADIO);
		btnGraduate.setBounds(176, 53, 90, 16);
		btnGraduate.setText("Graduate");
		
		Combo combo = new Combo(group_1, SWT.NONE);
		String[] comboBoxArray = {"item1","item2","item3"};
		combo.setBounds(175, 87, 91, 23);
		
		combo.setItems(comboBoxArray);
		


	}
}
