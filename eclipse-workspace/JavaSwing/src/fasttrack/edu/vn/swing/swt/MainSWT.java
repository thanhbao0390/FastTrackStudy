package fasttrack.edu.vn.swing.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class MainSWT {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txt;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainSWT window = new MainSWT();
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
		shell.setSize(681, 555);
		shell.setText("SWT Application");
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem menuItem1 = new MenuItem(menu, SWT.NONE);
		
		menuItem1.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				txt.setText("www");
			}
		});
		menuItem1.setText("New Item 1");
		
		MenuItem menuItem2 = new MenuItem(menu, SWT.NONE);
		menuItem2.setText("New Item 2");
		
		MenuItem menuItem3 = new MenuItem(menu, SWT.NONE);
		menuItem3.setText("New Item 3");
		
		
		
		Tree tree = formToolkit.createTree(shell, SWT.NONE);
		tree.setBounds(10, 33, 163, 347);
		formToolkit.paintBordersFor(tree);
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(179, 33, 455, 347);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		
		txt = new Text(composite, SWT.BORDER);
		txt.setText("asdasdasd");
		txt.setBounds(85, 68, 72, 24);
		formToolkit.adapt(txt, true, true);

	}
}
