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
		j.setSize(50, 100);
		
		System.out.println("���̾ƿ� �߰���");
		
		mkFunc();
		j.add(setButton("txt changed"));
		j.setVisible(true);
	}
	static void mkFunc(){
		JTextArea Area = new JTextArea("�ȳ�");
	}
	static JButton setButton(String str){
		JButton button1 = new JButton(str);
		return button1;
	}
}
