import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Git");
		int i;
		i=20;
		System.out.println("Hello java");
		 
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setSize(50, 100);
		
		System.out.println("·¹ÀÌ¾Æ¿ô Ãß°¡Àü");
		j.setLayout(null);
		
		mkFunc();
		
		
		j.add(setButton("txt changed"));
	}
	static void mkFunc(){
		JTextArea Area = new JTextArea("¾È³ç");
	}
	static JButton setButton(String str){
		JButton button1 = new JButton(str);
		
		return button1;
	}
}
